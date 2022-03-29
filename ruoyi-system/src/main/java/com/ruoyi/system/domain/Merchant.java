package com.ruoyi.system.domain;

import java.util.Date;

/**
 * @ClassName Merchant
 * @Description TODO
 * @CreateTime 2022/3/29 10:47
 **/
public class Merchant {

  /**
   * 主键id
   */
  private String id;

  /**
   * 用户名
   */
  private String userName;

  /**
   * 商户号
   */
  private String merchantNum;

  /**
   * 接入商户名称
   */
  private String merchantName;

  /**
   * 密钥
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
   * 登录密码
   */
  private String loginPwd;

  /**
   * 资金密码
   */
  private String moneyPwd;

  /**
   * 可提现金额
   */
  private Double withdrawableAmount;

  /**
   * 状态
   */
  private String state;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 最近登录时间
   */
  private Date latelyLoginTime;

  /**
   * 逻辑删除
   */
  private Boolean deletedFlag;

  /**
   * 乐观锁版本号
   */
  private Long version;

  /**
   * ip白名单
   */
  private String ipWhitelist;


  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * <p>You can use getId() to get the value of id</p>
   *
   * @param id id
   */
  public void setId(String id) {
    this.id = id;
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

  public String getMoneyPwd() {
    return moneyPwd;
  }

  /**
   * Sets the moneyPwd.
   *
   * <p>You can use getMoneyPwd() to get the value of moneyPwd</p>
   *
   * @param moneyPwd moneyPwd
   */
  public void setMoneyPwd(String moneyPwd) {
    this.moneyPwd = moneyPwd;
  }

  public Double getWithdrawableAmount() {
    return withdrawableAmount;
  }

  /**
   * Sets the withdrawableAmount.
   *
   * <p>You can use getWithdrawableAmount() to get the value of withdrawableAmount</p>
   *
   * @param withdrawableAmount withdrawableAmount
   */
  public void setWithdrawableAmount(Double withdrawableAmount) {
    this.withdrawableAmount = withdrawableAmount;
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

  public Date getCreateTime() {
    return createTime;
  }

  /**
   * Sets the createTime.
   *
   * <p>You can use getCreateTime() to get the value of createTime</p>
   *
   * @param createTime createTime
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getLatelyLoginTime() {
    return latelyLoginTime;
  }

  /**
   * Sets the latelyLoginTime.
   *
   * <p>You can use getLatelyLoginTime() to get the value of latelyLoginTime</p>
   *
   * @param latelyLoginTime latelyLoginTime
   */
  public void setLatelyLoginTime(Date latelyLoginTime) {
    this.latelyLoginTime = latelyLoginTime;
  }

  public Boolean getDeletedFlag() {
    return deletedFlag;
  }

  /**
   * Sets the deletedFlag.
   *
   * <p>You can use getDeletedFlag() to get the value of deletedFlag</p>
   *
   * @param deletedFlag deletedFlag
   */
  public void setDeletedFlag(Boolean deletedFlag) {
    this.deletedFlag = deletedFlag;
  }

  public Long getVersion() {
    return version;
  }

  /**
   * Sets the version.
   *
   * <p>You can use getVersion() to get the value of version</p>
   *
   * @param version version
   */
  public void setVersion(Long version) {
    this.version = version;
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
