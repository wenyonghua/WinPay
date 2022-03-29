package com.ruoyi.system.service;

import com.ruoyi.system.domain.Merchant;
import com.ruoyi.system.vo.MerchantEditParam;
import com.ruoyi.system.vo.MerchantParam;
import com.ruoyi.system.vo.MerchantVo;
import java.util.List;

/**
 * @InterfaceName IMerchantService
 * @Description TODO
 * @CreateTime 2022/3/16 23:35
 **/
public interface IMerchantService {


  /**
   * 分页查询
   *
   * @param merchantName
   * @return
   */
  List<Merchant> findMerchantByPage(String merchantName);

  /**
   * @param merchantParam
   * @return
   */
  int add(MerchantParam merchantParam);

  /**
   * @param merchantId
   * @return
   */
  int remove(String merchantId);

  /**
   * @param id
   * @return
   */
  MerchantVo queryMerchant(String id);

  /**
   * @param merchantParam
   * @return
   */
  int update(MerchantEditParam merchantParam);

  //
  ///**
  // * 查询收款码详情
  // *
  // * @param id
  // * @return
  // */
  //GatheringCodeVo queryGatheringCode(String id);
  //
  ///**
  // * 删除付款码
  // *
  // * @param param
  // * @return
  // */
  //int remove(GatheringCodeParam param);
  //
  ///**
  // * 修改状态
  // *
  // * @param param
  // * @return
  // */
  //int changeStatus(GatheringCodeParam param);
}
