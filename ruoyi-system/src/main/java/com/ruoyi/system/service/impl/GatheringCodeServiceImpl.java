package com.ruoyi.system.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DecimalFormatUtil;
import com.ruoyi.system.domain.GatheringCode;
import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.mapper.GatheringCodeMapper;
import com.ruoyi.system.service.IGatheringCodeService;
import com.ruoyi.system.vo.GatheringCodeParam;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import com.ruoyi.system.vo.GatheringCodeVo;
import java.math.BigDecimal;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName GatheringCodeServiceImpl
 * @Description TODO
 * @CreateTime 2022/3/17 00:02
 **/
@Service
public class GatheringCodeServiceImpl implements IGatheringCodeService {

  private static final Logger log = LoggerFactory.getLogger(GatheringCodeServiceImpl.class);

  @Autowired
  GatheringCodeMapper gatheringCodeMapper;

  @Override
  @Transactional(readOnly = true)
  public List<GatheringCodeUsage> findGatheringCodeUsageByPage(GatheringCodeQueryCondParam param) {
    return gatheringCodeMapper.selectGatheringCodeUsageByPage(param);
  }


  @Override
  @Transactional(rollbackFor = Exception.class)
  public int add(GatheringCodeParam param) {
    int count = gatheringCodeMapper.countBankCode(param.getBankCode(), "");
    if (count > 0) {
      throw new ServiceException("不能添加相同的收款卡");
    }
    GatheringCode gatheringCode = param.convertToPo();
    return gatheringCodeMapper.insertGatheringCode(gatheringCode);
  }

  @Override
  @Transactional(readOnly = true)
  public GatheringCodeVo queryGatheringCode(String id) {
    GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeById(id);
    GatheringCodeVo vo = new GatheringCodeVo();
    BeanUtils.copyProperties(gatheringCode, vo);
    vo.setBankTotalAmount(DecimalFormatUtil.formatString(new BigDecimal(gatheringCode.getBankTotalAmount()), null));
    vo.setBankReflect(DecimalFormatUtil.formatString(new BigDecimal(gatheringCode.getBankReflect()), null));
    return vo;
  }


  @Override
  @Transactional(rollbackFor = Exception.class)
  public int update(GatheringCodeParam param) {
    GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeByIdForUpdate(param.getId());
    if (gatheringCode == null) {
      throw new ServiceException("收款码不存在,请刷新页面");
    }

    int count = gatheringCodeMapper.countBankCode(param.getBankCode(), gatheringCode.getId());
    if (count > 0) {
      throw new ServiceException("收款卡重复");
    }

    //备用金卡，存款卡，2.付款卡需要添加一个最新的银行卡交易记录
    if (gatheringCode.getCardUse().equals("1") || gatheringCode.getCardUse().equals("2") || gatheringCode.getCardUse()
        .equals("3")) {

      BigDecimal data1 = new BigDecimal(gatheringCode.getBankTotalAmount());
      BigDecimal data2 = new BigDecimal(Double.valueOf(param.getBankTotalAmount()));
      if (data1.compareTo(data2) != 0) {

      }
    }

    this.setUpdateData(gatheringCode, param);
    return gatheringCodeMapper.updateGatheringCode(gatheringCode);
  }

  /**
   * 设置更新参数
   *
   * @param gatheringCode
   * @param param
   */
  private void setUpdateData(GatheringCode gatheringCode, GatheringCodeParam param) {
    //收款人
    gatheringCode.setPayee(param.getPayee());

    //启用
    boolean inUse = false;
    if (param.getInUse().equals("1")) {
      inUse = true;
    }

    //设置卡的状态
    gatheringCode.setInUse(inUse);

    //设置银行卡的限制额度
    gatheringCode.setBankReflect(Double.valueOf(param.getBankReflect()));

    //卡的总余额
    gatheringCode.setBankTotalAmount(Double.valueOf(param.getBankTotalAmount()));

    //通道
    gatheringCode.setGatheringChannelId(param.getGatheringChannelId());

    //卡号
    gatheringCode.setBankCode(param.getBankCode());

    //银行名称
    gatheringCode.setBankAddress(param.getBankAddress());

    //卡户主
    gatheringCode.setBankUsername(param.getBankUsername());

    //银行卡用途
    gatheringCode.setCardUse(param.getCardUse());
  }


  @Override
  @Transactional(rollbackFor = Exception.class)
  public int remove(GatheringCodeParam param) {
    GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeByIdForUpdate(param.getId());
    if (gatheringCode == null) {
      return 1;
    }

    if (gatheringCode.getBankCode().equals(param.getBankCode())) {
      return gatheringCodeMapper.deleteGatheringCodeById(gatheringCode.getId());
    } else {
      throw new ServiceException("输入的银行卡号与当前记录不匹配");
    }
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public int changeStatus(GatheringCodeParam param) {

    GatheringCode gatheringCode = gatheringCodeMapper.selectGatheringCodeByIdForUpdate(param.getId());
    if (gatheringCode == null) {
      return 1;
    }

    //启用
    boolean inUse = false;
    if (param.getInUse().equals("1")) {
      inUse = true;
    }

    //设置卡的状态
    gatheringCode.setInUse(inUse);

    return gatheringCodeMapper.changeStatus(gatheringCode);
  }
}
