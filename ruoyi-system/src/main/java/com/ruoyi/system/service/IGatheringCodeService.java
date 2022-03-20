package com.ruoyi.system.service;

import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.vo.GatheringCodeParam;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import com.ruoyi.system.vo.GatheringCodeVo;
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

  /**
   * 添加收款码
   *
   * @param param
   * @return
   */
  int add(GatheringCodeParam param);

  /**
   * 修改收款码
   *
   * @param param
   * @return
   */
  int update(GatheringCodeParam param);

  /**
   * 查询收款码详情
   *
   * @param id
   * @return
   */
  GatheringCodeVo queryGatheringCode(String id);

  /**
   * 删除付款码
   *
   * @param param
   * @return
   */
  int remove(GatheringCodeParam param);

  /**
   * 修改状态
   *
   * @param param
   * @return
   */
  int changeStatus(GatheringCodeParam param);
}
