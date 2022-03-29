package com.ruoyi.system.vo;

import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.system.domain.Merchant;
import java.util.Date;
import org.springframework.beans.BeanUtils;

/**
 * @ClassName MerchantParam
 * @Description TODO
 * @CreateTime 2022/3/29 15:27
 **/
public class MerchantParam {

  /**
   * 用户名
   */
  private String userName;

  /**
   * 登录密码
   */
  private String loginPwd;

  /**
   * 商户号
   */
  private String merchantNum;

  /**
   * 商户名称
   */
  private String merchantName;

  /**
   * 状态
   */
  private String state;

  /**
   * 接入密钥
   */
  private String secretKey;

  /**
   * 异步通知地址
   */
  private String notifyUrl;

  /**
   * 同步通知地址
   */
  private String returnUrl;

  /**
   * IP白名单列表
   */
  private String ipWhitelist;

  public Merchant convertToPo() {
    Merchant po = new Merchant();
    BeanUtils.copyProperties(this, po);
    po.setId(IdUtils.getId());
    po.setDeletedFlag(false);
    po.setCreateTime(new Date());
    po.setWithdrawableAmount(0D);
    po.setMoneyPwd(po.getLoginPwd());
    return po;
  }


  public String getUserName() {
    return userName;
  }

  /**
   * Sets the userName.
   *
   * <p>You can use getUserName() to get the value of userName</p>
   *
   * @param userName userName
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getLoginPwd() {
    return loginPwd;
  }

  /**
   * Sets the loginPwd.
   *
   * <p>You can use getLoginPwd() to get the value of loginPwd</p>
   *
   * @param loginPwd loginPwd
   */
  public void setLoginPwd(String loginPwd) {
    this.loginPwd = loginPwd;
  }

  public String getMerchantNum() {
    return merchantNum;
  }

  /**
   * Sets the merchantNum.
   *
   * <p>You can use getMerchantNum() to get the value of merchantNum</p>
   *
   * @param merchantNum merchantNum
   */
  public void setMerchantNum(String merchantNum) {
    this.merchantNum = merchantNum;
  }

  public String getMerchantName() {
    return merchantName;
  }

  /**
   * Sets the merchantName.
   *
   * <p>You can use getMerchantName() to get the value of merchantName</p>
   *
   * @param merchantName merchantName
   */
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public String getState() {
    return state;
  }

  /**
   * Sets the state.
   *
   * <p>You can use getState() to get the value of state</p>
   *
   * @param state state
   */
  public void setState(String state) {
    this.state = state;
  }

  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Sets the secretKey.
   *
   * <p>You can use getSecretKey() to get the value of secretKey</p>
   *
   * @param secretKey secretKey
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public String getNotifyUrl() {
    return notifyUrl;
  }

  /**
   * Sets the notifyUrl.
   *
   * <p>You can use getNotifyUrl() to get the value of notifyUrl</p>
   *
   * @param notifyUrl notifyUrl
   */
  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  public String getReturnUrl() {
    return returnUrl;
  }

  /**
   * Sets the returnUrl.
   *
   * <p>You can use getReturnUrl() to get the value of returnUrl</p>
   *
   * @param returnUrl returnUrl
   */
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public String getIpWhitelist() {
    return ipWhitelist;
  }

  /**
   * Sets the ipWhitelist.
   *
   * <p>You can use getIpWhitelist() to get the value of ipWhitelist</p>
   *
   * @param ipWhitelist ipWhitelist
   */
  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }

}
