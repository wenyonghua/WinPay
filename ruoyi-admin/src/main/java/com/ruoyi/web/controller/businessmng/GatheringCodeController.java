package com.ruoyi.web.controller.businessmng;

import cn.hutool.core.util.NumberUtil;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.framework.config.ShiroConfig;
import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.service.IGatheringCodeService;
import com.ruoyi.system.vo.GatheringCodeParam;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import com.ruoyi.system.vo.GatheringCodeUsageVO;
import com.ruoyi.system.vo.GatheringCodeVo;
import java.util.Collection;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  @Autowired
  private ShiroConfig shiroConfig;

  @RequiresPermissions("businessMng:gatheringCode:view")
  @GetMapping()
  public String operlog(ModelMap mmap) {
    mmap.put("currency", shiroConfig.getCurrency());
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


  @GetMapping("/add")
  public String add() {
    return prefix + "/add";
  }

  @RequiresPermissions("businessMng:gatheringCode:add")
  @Log(title = "收款码管理", businessType = BusinessType.INSERT)
  @PostMapping("/add")
  @ResponseBody
  public AjaxResult add(@Validated GatheringCodeParam gatheringCodeParam) {
    this.baseCheck(gatheringCodeParam);
    return toAjax(gatheringCodeService.add(gatheringCodeParam));
  }

  @RequiresPermissions("businessMng:gatheringCode:edit")
  @GetMapping("/edit/{id}")
  public String edit(@PathVariable("id") String id, ModelMap mmap) {
    GatheringCodeVo gatheringCode = gatheringCodeService.queryGatheringCode(id);
    if (gatheringCode == null) {
      throw new ServiceException("收款码不存在,请刷新页面");
    }
    mmap.put("gatheringCode", gatheringCode);
    return prefix + "/edit";
  }

  @RequiresPermissions("businessMng:gatheringCode:edit")
  @Log(title = "收款码管理", businessType = BusinessType.UPDATE)
  @PostMapping("/update")
  @ResponseBody
  public AjaxResult update(@Validated GatheringCodeParam gatheringCodeParam) {
    this.baseCheck(gatheringCodeParam);
    return toAjax(gatheringCodeService.update(gatheringCodeParam));
  }


  private void baseCheck(GatheringCodeParam gatheringCodeParam) {
    if (org.apache.commons.lang3.StringUtils.isBlank(gatheringCodeParam.getBankCode())) {
      throw new ServiceException("请输入正确的银行卡号");
    }

    if (org.apache.commons.lang3.StringUtils.isBlank(gatheringCodeParam.getBankReflect())) {
      throw new ServiceException("请输入正确的卡收款额度限制");
    }

    if (org.apache.commons.lang3.StringUtils.isBlank(gatheringCodeParam.getBankTotalAmount())) {
      throw new ServiceException("请输入正确的银行卡总额度");
    }

    if (org.apache.commons.lang3.StringUtils.isBlank(gatheringCodeParam.getCardUse())) {
      throw new ServiceException("请输入正确的卡用途");
    }

    if (NumberUtil.isDouble(gatheringCodeParam.getBankReflect())) {
      throw new ServiceException("请输入正确的银行卡提现额度限制");
    }

    if (NumberUtil.isDouble(gatheringCodeParam.getBankTotalAmount())) {
      throw new ServiceException("请输入正确的银行卡总额度");
    }

    //处理格式化的数据
    gatheringCodeParam.setBankTotalAmount(gatheringCodeParam.getBankTotalAmount().replace(",", ""));
    gatheringCodeParam.setBankReflect(gatheringCodeParam.getBankReflect().replace(",", ""));
  }


  @RequiresPermissions("businessMng:gatheringCode:remove")
  @GetMapping("/remove/{id}")
  public String remove(@PathVariable("id") String id, ModelMap mmap) {
    GatheringCodeVo gatheringCode = gatheringCodeService.queryGatheringCode(id);
    if (gatheringCode == null) {
      throw new ServiceException("收款码不存在,请刷新页面");
    }
    mmap.put("gatheringCode", gatheringCode);
    return prefix + "/del";
  }


  @RequiresPermissions("businessMng:gatheringCode:remove")
  @Log(title = "收款码管理", businessType = BusinessType.DELETE)
  @PostMapping("/del")
  @ResponseBody
  public AjaxResult delete(@Validated GatheringCodeParam gatheringCodeParam) {
    return toAjax(gatheringCodeService.remove(gatheringCodeParam));
  }


  @RequiresPermissions("businessMng:gatheringCode:detail")
  @GetMapping("/detail/{id}")
  public String detail(@PathVariable("id") String id, ModelMap mmap) {
    GatheringCodeVo gatheringCode = gatheringCodeService.queryGatheringCode(id);
    if (gatheringCode == null) {
      throw new ServiceException("收款码不存在,请刷新页面");
    }
    mmap.put("gatheringCode", gatheringCode);
    return prefix + "/detail";
  }


  @Log(title = "收款卡管理", businessType = BusinessType.UPDATE)
  @RequiresPermissions("businessMng:gatheringCode:edit")
  @PostMapping("/changeStatus")
  @ResponseBody
  public AjaxResult changeStatus(@Validated GatheringCodeParam gatheringCodeParam) {
    return toAjax(gatheringCodeService.changeStatus(gatheringCodeParam));
  }

}
