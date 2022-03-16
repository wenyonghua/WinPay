package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import java.util.List;

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
}
