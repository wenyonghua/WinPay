package com.ruoyi.system.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.system.domain.GatheringChannelRate;
import com.ruoyi.system.domain.Merchant;
import com.ruoyi.system.mapper.GatheringChannelRateMapper;
import com.ruoyi.system.mapper.MerchantMapper;
import com.ruoyi.system.service.IMerchantService;
import com.ruoyi.system.vo.BatchSettingRateParam;
import com.ruoyi.system.vo.GatheringChannelRateParam;
import com.ruoyi.system.vo.MerchantEditParam;
import com.ruoyi.system.vo.MerchantParam;
import com.ruoyi.system.vo.MerchantVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MerchantServiceImpl
 * @Description TODO
 * @CreateTime 2022/3/17 00:02
 **/
@Service
public class MerchantServiceImpl implements IMerchantService {

  private static final Logger log = LoggerFactory.getLogger(MerchantServiceImpl.class);

  @Autowired
  MerchantMapper merchantMapper;

  @Autowired
  GatheringChannelRateMapper gatheringChannelRateMapper;

  @Override
  @Transactional(readOnly = true)
  public List<Merchant> findMerchantByPage(String merchantName) {
    return merchantMapper.selectMerchantByPage(merchantName);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public int add(MerchantParam merchantParam) {

    //重复性校验
    int count = 0;
    count = merchantMapper.countUserName(merchantParam.getUserName(), "");
    if (count > 0) {
      throw new ServiceException("用户名已使用");
    }
    count = merchantMapper.countMerchantNum(merchantParam.getMerchantNum(), "");
    if (count > 0) {
      throw new ServiceException("商户号已使用");
    }
    count = merchantMapper.countMerchantName(merchantParam.getMerchantName(), "");
    if (count > 0) {
      throw new ServiceException("商户名称已使用");
    }
    //加密密码
    merchantParam.setLoginPwd(new BCryptPasswordEncoder().encode(merchantParam.getLoginPwd()));
    Merchant merchant = merchantParam.convertToPo();
    return merchantMapper.insertMerchant(merchant);
  }


  @Override
  @Transactional(rollbackFor = Exception.class)
  public int remove(String merchantId) {

    Merchant merchant = merchantMapper.selectMerchantByIdForUpdate(merchantId);

    if (merchant == null || merchant.getDeletedFlag()) {
      return 1;
    }

    merchant.setDeletedFlag(true);
    return merchantMapper.delMerchant(merchant);
  }


  @Override
  @Transactional(readOnly = true)
  public MerchantVo queryMerchant(String id) {
    Merchant merchant = merchantMapper.selectMerchantById(id);
    if (merchant == null) {
      throw new ServiceException("商户不存在,请刷新页面");
    }
    return MerchantVo.convertFor(merchant);
  }


  @Override
  @Transactional(rollbackFor = Exception.class)
  public int update(MerchantEditParam merchantParam) {
    Merchant merchant = merchantMapper.selectMerchantByIdForUpdate(merchantParam.getId());
    if (merchant == null) {
      throw new ServiceException("商户不存在,请刷新页面");
    }

    //重复性校验
    int count = 0;
    count = merchantMapper.countUserName(merchantParam.getUserName(), merchant.getId());
    if (count > 0) {
      throw new ServiceException("用户名已使用");
    }
    count = merchantMapper.countMerchantNum(merchantParam.getMerchantNum(), merchant.getId());
    if (count > 0) {
      throw new ServiceException("商户号已使用");
    }
    count = merchantMapper.countMerchantName(merchantParam.getMerchantName(), merchant.getId());
    if (count > 0) {
      throw new ServiceException("商户名称已使用");
    }

    this.setUpdateData(merchant, merchantParam);
    return merchantMapper.updateMerchant(merchant);
  }

  /**
   * @param merchant
   * @param merchantParam
   */
  private void setUpdateData(Merchant merchant, MerchantEditParam merchantParam) {
    merchant.setUserName(merchantParam.getUserName());
    merchant.setMerchantNum(merchantParam.getMerchantNum());
    merchant.setMerchantName(merchantParam.getMerchantName());
    merchant.setState(merchantParam.getState());
    merchant.setSecretKey(merchantParam.getSecretKey());
    merchant.setNotifyUrl(merchantParam.getNotifyUrl());
    merchant.setReturnUrl(merchantParam.getReturnUrl());
    merchant.setIpWhitelist(merchantParam.getIpWhitelist());
    merchant.setWithdrawableAmount(Double.valueOf(merchantParam.getWithdrawableAmount()));
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public int updatePwd(MerchantEditParam merchantParam) {

    Merchant merchant = merchantMapper.selectMerchantByIdForUpdate(merchantParam.getId());
    if (merchant == null) {
      throw new ServiceException("商户不存在,请刷新页面");
    }

    merchant.setLoginPwd(new BCryptPasswordEncoder().encode(merchantParam.getLoginPwd()));
    merchant.setMoneyPwd(new BCryptPasswordEncoder().encode(merchantParam.getMoneyPwd()));

    return merchantMapper.updatePwd(merchant);
  }

  @Override
  @Transactional(readOnly = true)
  public List<GatheringChannelRate> editGatheringChannelRate(MerchantVo merchant) {
    if (merchant == null) {
      throw new ServiceException("商户不存在,请刷新页面");
    }
    List<GatheringChannelRate> gatheringChannelRates = gatheringChannelRateMapper.selectByMerchantId(merchant.getId());

    return gatheringChannelRates;
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public int updateEditGatheringChannelRate(BatchSettingRateParam param) {

    Merchant merchant = merchantMapper.selectMerchantByIdForUpdate(param.getMerchantId());
    if (merchant == null) {
      throw new ServiceException("商户不存在,请刷新页面");
    }

    if (param.getChannelRates().isEmpty()) {
      throw new ServiceException("没有可用的接单通道设置");
    }

    Map<String, String> map = new HashMap();
    for (GatheringChannelRateParam channelRateParam : param.getChannelRates()) {
      if (map.get(channelRateParam.getChannelId()) != null) {
        throw new ServiceException("不能设置重复的接单通道");
      }
      map.put(channelRateParam.getChannelId(), channelRateParam.getChannelId());
    }

    gatheringChannelRateMapper.deleteByMerchantId(param.getMerchantId());
    for (GatheringChannelRateParam channelRateParam : param.getChannelRates()) {
      GatheringChannelRate rate = channelRateParam.convertToPo(param.getMerchantId());
      gatheringChannelRateMapper.insertGatheringChannelRate(rate);
    }

    return 1;
  }

  //
  //
  // @Override
  // @Transactional(rollbackFor = Exception.class)
  // public int remove(GatheringCodeParam param) {
  //  GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeByIdForUpdate(param.getId());
  //  if (gatheringCode == null) {
  //    return 1;
  //  }
  //
  //  if (gatheringCode.getBankCode().equals(param.getBankCode())) {
  //    return gatheringCodeMapper.deleteGatheringCodeById(gatheringCode.getId());
  //  } else {
  //    throw new ServiceException("输入的银行卡号与当前记录不匹配");
  //  }
  // }
  //
  // @Override
  // @Transactional(rollbackFor = Exception.class)
  // public int changeStatus(GatheringCodeParam param) {
  //
  //  GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeByIdForUpdate(param.getId());
  //  if (gatheringCode == null) {
  //    return 1;
  //  }
  //
  //  //启用
  //  boolean inUse = false;
  //  if (param.getInUse().equals("1")) {
  //    inUse = true;
  //  }
  //
  //  //设置卡的状态
  //  gatheringCode.setInUse(inUse);
  //
  //  return gatheringCodeMapper.changeStatus(gatheringCode);
  // }
}
