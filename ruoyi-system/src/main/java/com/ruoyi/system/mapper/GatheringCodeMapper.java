package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.GatheringCode;
import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName GatheringCodeMapper
 * @Description TODO
 * @CreateTime 2022/3/17 00:08
 **/
public interface GatheringCodeMapper {


  /**
   * 分页查询收款码列表
   *
   * @param param 查询条件
   * @return 数据集合
   */
  List<GatheringCodeUsage> selectGatheringCodeUsageByPage(GatheringCodeQueryCondParam param);

  /**
   * 统计银行卡数量
   *
   * @param bankCode
   * @param id       排除ID 后的收款码信息
   * @return
   */
  int countBankCode(@Param("bankCode") String bankCode, @Param("id") String id);

  /**
   * 添加收款码
   *
   * @param gatheringCode
   * @return
   */
  int insertGatheringCode(GatheringCode gatheringCode);

  /**
   * 根据id查询详情
   *
   * @param id
   * @return
   */
  GatheringCode selectGatheringCodeById(String id);

  /**
   * 根据id查询详情,加锁
   *
   * @param id
   * @return
   */
  GatheringCode selectGatheringCodeByIdForUpdate(String id);


  /**
   * 更新收款码
   *
   * @param gatheringCode
   * @return
   */
  int updateGatheringCode(GatheringCode gatheringCode);

  /**
   * 删除付款码
   *
   * @param id
   * @return
   */
  int deleteGatheringCodeById(String id);

  /**
   * 更新状态
   *
   * @param gatheringCode
   * @return
   */
  int changeStatus(GatheringCode gatheringCode);
}
