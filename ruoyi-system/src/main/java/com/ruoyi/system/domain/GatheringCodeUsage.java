package com.ruoyi.system.domain;

import java.util.Date;

/**
 * @ClassName GatheringCodeUsage
 * @Description TODO
 **/
public class GatheringCodeUsage {

  /**
   * 主键id
   */
  private String id;

  /**
   * 状态,启用:1;禁用:0
   */
  private String state;

  private Boolean fixedGatheringAmount;

  /**
   * 收款金额
   */
  private Double gatheringAmount;

  /**
   * 收款人
   */
  private String payee;

  /**
   * 使用中
   */
  private Boolean inUse;

  /**
   * 发起审核时间
   */
  private Date initiateAuditTime;

  /**
   * 审核类型
   */
  private String auditType;

  /**
   * 创建时间
   */
  private Date createTime;

  private String storageId;

  private String gatheringChannelId;

  private String gatheringChannel;

  /**
   * 用户账号id
   */
  private String userAccountId;

  /**
   * 银行卡总数据
   */
  private Double bankTotalAmount;
  /**
   * 收款卡额度限制
   */
  private Double bankReflect;

  /**
   * 卡用途 1.存款卡，2.付款卡，3.备用金卡，
   * @param userAccountId
   * @return
   */
  private String cardUse;


  /**
   * 累计收款金额
   */
  private Double totalTradeAmount;

  /**
   * 收款次数
   */
  private Long totalPaidOrderNum;

  /**
   * 收款次数
   */
  private Long totalOrderNum;

  /**
   *
   */
  private Double totalSuccessRate;

  /**
   * 今日收款今日收款金额
   */
  private Double todayTradeAmount;

  /**
   * 今日
   */
  private Long todayPaidOrderNum;

  /**
   *
   */
  private Long todayOrderNum;


  /**
   * 今日成功率
   */
  private Double todaySuccessRate;

  /**
   * 银行卡号
   */
  private String bankCode;

  /**
   * 开户行
   */
  private String bankAddress;

  /**
   * 卡户主
   */

  private String bankUsername;

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

  public Boolean getFixedGatheringAmount() {
    return fixedGatheringAmount;
  }

  /**
   * Sets the fixedGatheringAmount.
   *
   * <p>You can use getFixedGatheringAmount() to get the value of fixedGatheringAmount</p>
   *
   * @param fixedGatheringAmount fixedGatheringAmount
   */
  public void setFixedGatheringAmount(Boolean fixedGatheringAmount) {
    this.fixedGatheringAmount = fixedGatheringAmount;
  }

  public Double getGatheringAmount() {
    return gatheringAmount;
  }

  /**
   * Sets the gatheringAmount.
   *
   * <p>You can use getGatheringAmount() to get the value of gatheringAmount</p>
   *
   * @param gatheringAmount gatheringAmount
   */
  public void setGatheringAmount(Double gatheringAmount) {
    this.gatheringAmount = gatheringAmount;
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

  public Date getInitiateAuditTime() {
    return initiateAuditTime;
  }

  /**
   * Sets the initiateAuditTime.
   *
   * <p>You can use getInitiateAuditTime() to get the value of initiateAuditTime</p>
   *
   * @param initiateAuditTime initiateAuditTime
   */
  public void setInitiateAuditTime(Date initiateAuditTime) {
    this.initiateAuditTime = initiateAuditTime;
  }

  public String getAuditType() {
    return auditType;
  }

  /**
   * Sets the auditType.
   *
   * <p>You can use getAuditType() to get the value of auditType</p>
   *
   * @param auditType auditType
   */
  public void setAuditType(String auditType) {
    this.auditType = auditType;
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

  public String getStorageId() {
    return storageId;
  }

  /**
   * Sets the storageId.
   *
   * <p>You can use getStorageId() to get the value of storageId</p>
   *
   * @param storageId storageId
   */
  public void setStorageId(String storageId) {
    this.storageId = storageId;
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

  public String getGatheringChannel() {
    return gatheringChannel;
  }

  /**
   * Sets the gatheringChannel.
   *
   * <p>You can use getGatheringChannel() to get the value of gatheringChannel</p>
   *
   * @param gatheringChannel gatheringChannel
   */
  public void setGatheringChannel(String gatheringChannel) {
    this.gatheringChannel = gatheringChannel;
  }

  public String getUserAccountId() {
    return userAccountId;
  }

  /**
   * Sets the userAccountId.
   *
   * <p>You can use getUserAccountId() to get the value of userAccountId</p>
   *
   * @param userAccountId userAccountId
   */
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
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

  public Double getTotalTradeAmount() {
    return totalTradeAmount;
  }

  /**
   * Sets the totalTradeAmount.
   *
   * <p>You can use getTotalTradeAmount() to get the value of totalTradeAmount</p>
   *
   * @param totalTradeAmount totalTradeAmount
   */
  public void setTotalTradeAmount(Double totalTradeAmount) {
    this.totalTradeAmount = totalTradeAmount;
  }

  public Long getTotalPaidOrderNum() {
    return totalPaidOrderNum;
  }

  /**
   * Sets the totalPaidOrderNum.
   *
   * <p>You can use getTotalPaidOrderNum() to get the value of totalPaidOrderNum</p>
   *
   * @param totalPaidOrderNum totalPaidOrderNum
   */
  public void setTotalPaidOrderNum(Long totalPaidOrderNum) {
    this.totalPaidOrderNum = totalPaidOrderNum;
  }

  public Long getTotalOrderNum() {
    return totalOrderNum;
  }

  /**
   * Sets the totalOrderNum.
   *
   * <p>You can use getTotalOrderNum() to get the value of totalOrderNum</p>
   *
   * @param totalOrderNum totalOrderNum
   */
  public void setTotalOrderNum(Long totalOrderNum) {
    this.totalOrderNum = totalOrderNum;
  }

  public Double getTotalSuccessRate() {
    return totalSuccessRate;
  }

  /**
   * Sets the totalSuccessRate.
   *
   * <p>You can use getTotalSuccessRate() to get the value of totalSuccessRate</p>
   *
   * @param totalSuccessRate totalSuccessRate
   */
  public void setTotalSuccessRate(Double totalSuccessRate) {
    this.totalSuccessRate = totalSuccessRate;
  }

  public Double getTodayTradeAmount() {
    return todayTradeAmount;
  }

  /**
   * Sets the todayTradeAmount.
   *
   * <p>You can use getTodayTradeAmount() to get the value of todayTradeAmount</p>
   *
   * @param todayTradeAmount todayTradeAmount
   */
  public void setTodayTradeAmount(Double todayTradeAmount) {
    this.todayTradeAmount = todayTradeAmount;
  }

  public Long getTodayPaidOrderNum() {
    return todayPaidOrderNum;
  }

  /**
   * Sets the todayPaidOrderNum.
   *
   * <p>You can use getTodayPaidOrderNum() to get the value of todayPaidOrderNum</p>
   *
   * @param todayPaidOrderNum todayPaidOrderNum
   */
  public void setTodayPaidOrderNum(Long todayPaidOrderNum) {
    this.todayPaidOrderNum = todayPaidOrderNum;
  }

  public Long getTodayOrderNum() {
    return todayOrderNum;
  }

  /**
   * Sets the todayOrderNum.
   *
   * <p>You can use getTodayOrderNum() to get the value of todayOrderNum</p>
   *
   * @param todayOrderNum todayOrderNum
   */
  public void setTodayOrderNum(Long todayOrderNum) {
    this.todayOrderNum = todayOrderNum;
  }

  public Double getTodaySuccessRate() {
    return todaySuccessRate;
  }

  /**
   * Sets the todaySuccessRate.
   *
   * <p>You can use getTodaySuccessRate() to get the value of todaySuccessRate</p>
   *
   * @param todaySuccessRate todaySuccessRate
   */
  public void setTodaySuccessRate(Double todaySuccessRate) {
    this.todaySuccessRate = todaySuccessRate;
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
}
