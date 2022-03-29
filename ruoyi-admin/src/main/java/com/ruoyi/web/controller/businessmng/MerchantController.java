package com.ruoyi.web.controller.businessmng;

import cn.hutool.core.lang.UUID;
import cn.hutool.crypto.SecureUtil;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Merchant;
import com.ruoyi.system.service.IMerchantService;
import com.ruoyi.system.vo.MerchantEditParam;
import com.ruoyi.system.vo.MerchantParam;
import com.ruoyi.system.vo.MerchantVo;
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
 * @ClassName MerchantController
 * @Description TODO
 * @CreateTime 2022/3/29 10:43
 **/
@Controller
@RequestMapping("/businessMng/merchant")
public class MerchantController extends BaseController {

  private String prefix = "/businessMng/merchant";

  @Autowired
  private IMerchantService iMerchantService;


  @RequiresPermissions("businessMng:merchant:view")
  @GetMapping()
  public String operlog(ModelMap mmap) {
    return prefix + "/merchant";
  }


  @RequiresPermissions("businessMng:merchant:list")
  @PostMapping("/list")
  @ResponseBody
  public TableDataInfo list(String merchantName) {
    startPage();
    List<Merchant> list = iMerchantService.findMerchantByPage(merchantName);
    TableDataInfo tableDataInfo = getDataTable(list);
    tableDataInfo.setRows(MerchantVo.convertFor((Collection<Merchant>) tableDataInfo.getRows()));
    return tableDataInfo;
  }

  /**
   * 生成秘钥
   *
   * @return
   */
  @GetMapping("/generateSecretKey")
  @ResponseBody
  public AjaxResult generateSecretKey() {
    AjaxResult ajax = AjaxResult.success();
    ajax.put("secretKey", SecureUtil.md5(UUID.fastUUID().toString()));
    return ajax;
  }

  @RequiresPermissions("businessMng:merchant:add")
  @GetMapping("/add")
  public String add() {
    return prefix + "/add";
  }


  @RequiresPermissions("businessMng:merchant:add")
  @Log(title = "商户管理", businessType = BusinessType.INSERT)
  @PostMapping("/add")
  @ResponseBody
  public AjaxResult add(@Validated MerchantParam MerchantParam) {
    return toAjax(iMerchantService.add(MerchantParam));
  }


  @RequiresPermissions("businessMng:merchant:remove")
  @Log(title = "商户管理", businessType = BusinessType.DELETE)
  @PostMapping("/remove/{id}")
  @ResponseBody
  public AjaxResult remove(@PathVariable("id") String id) {
    return toAjax(iMerchantService.remove(id));
  }


  @RequiresPermissions("businessMng:merchant:edit")
  @GetMapping("/edit/{id}")
  public String edit(@PathVariable("id") String id, ModelMap mmap) {
    MerchantVo merchant = iMerchantService.queryMerchant(id);
    mmap.put("merchant", merchant);
    return prefix + "/edit";
  }

  @RequiresPermissions("businessMng:merchant:edit")
  @Log(title = "收款码管理", businessType = BusinessType.UPDATE)
  @PostMapping("/update")
  @ResponseBody
  public AjaxResult update(@Validated MerchantEditParam merchantParam) {
    merchantParam.setWithdrawableAmount(merchantParam.getWithdrawableAmount().replace(",", ""));
    return toAjax(iMerchantService.update(merchantParam));
  }

}
