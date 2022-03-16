package com.ruoyi.system.service;

import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import java.util.List;

/**
 * @InterfaceName GatheringCodeService
 * @Description TODO
 * @CreateTime 2022/3/16 23:35
 **/
public interface IGatheringCodeService {


  /**
   * 查询收款码列表
   *
   * @param param
   * @return
   */
  List<GatheringCodeUsage> findGatheringCodeUsageByPage(GatheringCodeQueryCondParam param);

}
