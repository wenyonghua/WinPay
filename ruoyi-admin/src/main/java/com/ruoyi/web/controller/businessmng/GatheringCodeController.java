package com.ruoyi.web.controller.businessmng;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.service.IGatheringCodeService;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import com.ruoyi.system.vo.GatheringCodeUsageVO;
import java.util.Collection;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName GatheringCode
 * @Description TODO
 * @CreateTime 2022/3/16 23:10
 **/
@Controller
@RequestMapping("/businessMng/gatheringCode")
public class GatheringCodeController extends BaseController {

  private String prefix = "/businessMng/gatheringCode";


  @Autowired
  private IGatheringCodeService gatheringCodeService;


  @RequiresPermissions("businessMng:gatheringCode:view")
  @GetMapping()
  public String operlog() {
    return prefix + "/gatheringCode";
  }


  @RequiresPermissions("businessMng:gatheringCode:list")
  @PostMapping("/list")
  @ResponseBody
  public TableDataInfo list(GatheringCodeQueryCondParam gatheringCodeQueryCondParam) {
    startPage();
    List<GatheringCodeUsage> list = gatheringCodeService.findGatheringCodeUsageByPage(gatheringCodeQueryCondParam);
    TableDataInfo tableDataInfo = getDataTable(list);
    tableDataInfo.setRows(GatheringCodeUsageVO.convertFor((Collection<GatheringCodeUsage>) tableDataInfo.getRows()));
    return tableDataInfo;
  }

}
