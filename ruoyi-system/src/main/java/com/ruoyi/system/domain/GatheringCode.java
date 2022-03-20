package com.ruoyi.system.domain;

import java.util.Date;

/**
 * @ClassName GatheringCode
 * @Description TODO
 **/
public class GatheringCode {

  /**
   * 主键ID
   */
  private String id;

  /**
   * 收款人2
   */
  private String payee;

  /**
   * 使用中 1是使用中
   */
  private Boolean inUse;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 银行卡总数据
   */
  private Double bankTotalAmount;
  /**
   * 收款卡额度限制
   */
  private Double bankReflect;

  /**
   * 通道
   * 银行卡,支付宝,微信,云闪付
   */
  private String gatheringChannelId;

  /**
   * 银行卡号
   */
  private String bankCode;

  /**
   * 开户行  银行名称
   */
  private String bankAddress;

  /**
   * 卡户主 姓名
   */

  private String bankUsername;

  /**
   * 卡用途
   * 卡用途 1.存款卡，2.付款卡，3.备用金卡
   *
   * @param auditType
   */
  private String cardUse;

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


  public String getPayee() {
    return payee;
  }

  /**
   * Sets the payee.
   *
   * <p>You can use getPayee() to get the value of payee</p>
   *
   * @param payee payee
   */
  public void setPayee(String payee) {
    this.payee = payee;
  }

  public Boolean getInUse() {
    return inUse;
  }

  /**
   * Sets the inUse.
   *
   * <p>You can use getInUse() to get the value of inUse</p>
   *
   * @param inUse inUse
   */
  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
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

  public Double getBankTotalAmount() {
    return bankTotalAmount;
  }

  /**
   * Sets the bankTotalAmount.
   *
   * <p>You can use getBankTotalAmount() to get the value of bankTotalAmount</p>
   *
   * @param bankTotalAmount bankTotalAmount
   */
  public void setBankTotalAmount(Double bankTotalAmount) {
    this.bankTotalAmount = bankTotalAmount;
  }

  public Double getBankReflect() {
    return bankReflect;
  }

  /**
   * Sets the bankReflect.
   *
   * <p>You can use getBankReflect() to get the value of bankReflect</p>
   *
   * @param bankReflect bankReflect
   */
  public void setBankReflect(Double bankReflect) {
    this.bankReflect = bankReflect;
  }

  public String getGatheringChannelId() {
    return gatheringChannelId;
  }

  /**
   * Sets the gatheringChannelId.
   *
   * <p>You can use getGatheringChannelId() to get the value of gatheringChannelId</p>
   *
   * @param gatheringChannelId gatheringChannelId
   */
  public void setGatheringChannelId(String gatheringChannelId) {
    this.gatheringChannelId = gatheringChannelId;
  }

  public String getBankCode() {
    return bankCode;
  }

  /**
   * Sets the bankCode.
   *
   * <p>You can use getBankCode() to get the value of bankCode</p>
   *
   * @param bankCode bankCode
   */
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public String getBankAddress() {
    return bankAddress;
  }

  /**
   * Sets the bankAddress.
   *
   * <p>You can use getBankAddress() to get the value of bankAddress</p>
   *
   * @param bankAddress bankAddress
   */
  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public String getBankUsername() {
    return bankUsername;
  }

  /**
   * Sets the bankUsername.
   *
   * <p>You can use getBankUsername() to get the value of bankUsername</p>
   *
   * @param bankUsername bankUsername
   */
  public void setBankUsername(String bankUsername) {
    this.bankUsername = bankUsername;
  }

  public String getCardUse() {
    return cardUse;
  }

  /**
   * Sets the cardUse.
   *
   * <p>You can use getCardUse() to get the value of cardUse</p>
   *
   * @param cardUse cardUse
   */
  public void setCardUse(String cardUse) {
    this.cardUse = cardUse;
  }
}
