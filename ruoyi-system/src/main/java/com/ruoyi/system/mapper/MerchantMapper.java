package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Merchant;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName GatheringCodeMapper
 * @Description TODO
 * @CreateTime 2022/3/17 00:08
 **/
public interface MerchantMapper {


  /**
   * 分页查询
   *
   * @param merchantName 查询条件
   * @return 数据集合
   */
  List<Merchant> selectMerchantByPage(String merchantName);

  /**
   * @param userName
   * @param id       排除ID
   * @return
   */
  int countUserName(@Param("userName") String userName, @Param("id") String id);


  /**
   * @param merchantNum
   * @param id          排除ID
   * @return
   */
  int countMerchantNum(@Param("merchantNum") String merchantNum, @Param("id") String id);

  /**
   * @param merchantName
   * @param id           排除ID
   * @return
   */
  int countMerchantName(@Param("merchantName") String merchantName, @Param("id") String id);


  /**
   * @param merchant
   * @return
   */
  int insertMerchant(Merchant merchant);


  /**
   * @param merchant
   * @return
   */
  int delMerchant(Merchant merchant);


  /**
   * 根据id查询详情
   *
   * @param id
   * @return
   */
  Merchant selectMerchantById(String id);

  /**
   * 根据id查询详情,加锁
   *
   * @param id
   * @return
   */
  Merchant selectMerchantByIdForUpdate(String id);


  /**
  *
  * @param merchant
  * @return
  */
  int updateMerchant(Merchant merchant);

  /**
   *
   * @param merchant
   * @return
   */
  int updatePwd(Merchant merchant);
  //
  ///**
  // * 删除付款码
  // *
  // * @param id
  // * @return
  // */
  //int deleteGatheringCodeById(String id);
  //
  ///**
  // * 更新状态
  // *
  // * @param gatheringCode
  // * @return
  // */
  //int changeStatus(GatheringCode gatheringCode);
}
