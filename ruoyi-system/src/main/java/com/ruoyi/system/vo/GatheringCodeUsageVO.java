package com.ruoyi.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.utils.DecimalFormatUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

/**
 * @ClassName GatheringCodeUsageVO
 * @Description TODO
 * @CreateTime 2022/3/16 23:35
 **/
public class GatheringCodeUsageVO {


  /**
   * 主键id
   */
  private String id;

  private String gatheringChannelId;

  /**
   * 通道名称
   */
  private String gatheringChannelName;

  /**
   * 状态,启用:1;禁用:0
   */
  private String state;

  private String stateName;

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
  private Boolean  inUse;

  /**
   * 使用中名称
   */
  private String  inUseName;

  /**
   * 发起审核时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date initiateAuditTime;

  /**
   * 审核类型
   */
  private String auditType;

  private String auditTypeName;

  /**
   * 银行卡总数据 总余额
   */
  private Double bankTotalAmount;
  /**
   * 银行卡总数据 总余额 这个界面展示
   */
  private String bankTotalAmountView;
  /**
   * 银行卡总额度限制
   */
  private Double bankReflect;

  /**
   * 创建时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;

  private String storageId;

  private String userName;

  private Double totalTradeAmount;

  private Long totalPaidOrderNum;

  private Long totalOrderNum;

  private Double totalSuccessRate;

  private Double todayTradeAmount;

  private Long todayPaidOrderNum;

  private Long todayOrderNum;

  /**
   * 成功率
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


  /**
   * 卡用途 1.存款卡，2.付款卡，3.备用金卡，
   * @param userAccountId
   * @return
   */
  private String cardUse;
  /**
   * 卡用途 1.存款卡，2.付款卡，3.备用金卡，
   * @param userAccountId
   * @return
   */
  private String cardUseName;
  private String inUser;


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

  public String getGatheringChannelName() {
    return gatheringChannelName;
  }

  /**
   * Sets the gatheringChannelName.
   *
   * <p>You can use getGatheringChannelName() to get the value of gatheringChannelName</p>
   *
   * @param gatheringChannelName gatheringChannelName
   */
  public void setGatheringChannelName(String gatheringChannelName) {
    this.gatheringChannelName = gatheringChannelName;
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

  public String getStateName() {
    return stateName;
  }

  /**
   * Sets the stateName.
   *
   * <p>You can use getStateName() to get the value of stateName</p>
   *
   * @param stateName stateName
   */
  public void setStateName(String stateName) {
    this.stateName = stateName;
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

  public String getInUseName() {
    return inUseName;
  }

  /**
   * Sets the inUseName.
   *
   * <p>You can use getInUseName() to get the value of inUseName</p>
   *
   * @param inUseName inUseName
   */
  public void setInUseName(String inUseName) {
    this.inUseName = inUseName;
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

  public String getAuditTypeName() {
    return auditTypeName;
  }

  /**
   * Sets the auditTypeName.
   *
   * <p>You can use getAuditTypeName() to get the value of auditTypeName</p>
   *
   * @param auditTypeName auditTypeName
   */
  public void setAuditTypeName(String auditTypeName) {
    this.auditTypeName = auditTypeName;
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

  public String getBankTotalAmountView() {
    return bankTotalAmountView;
  }

  /**
   * Sets the bankTotalAmountView.
   *
   * <p>You can use getBankTotalAmountView() to get the value of bankTotalAmountView</p>
   *
   * @param bankTotalAmountView bankTotalAmountView
   */
  public void setBankTotalAmountView(String bankTotalAmountView) {
    this.bankTotalAmountView = bankTotalAmountView;
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

  public String getCardUseName() {
    return cardUseName;
  }

  /**
   * Sets the cardUseName.
   *
   * <p>You can use getCardUseName() to get the value of cardUseName</p>
   *
   * @param cardUseName cardUseName
   */
  public void setCardUseName(String cardUseName) {
    this.cardUseName = cardUseName;
  }

  public String getInUser() {
    return inUser;
  }

  /**
   * Sets the inUser.
   *
   * <p>You can use getInUser() to get the value of inUser</p>
   *
   * @param inUser inUser
   */
  public void setInUser(String inUser) {
    this.inUser = inUser;
  }

  public static List<GatheringCodeUsageVO> convertFor(Collection<GatheringCodeUsage> gatheringCodeUsages) {
    if (CollectionUtils.isEmpty(gatheringCodeUsages)) {
      return new ArrayList<>();
    }
    List<GatheringCodeUsageVO> vos = new ArrayList<>();
    for (GatheringCodeUsage gatheringCodeUsage : gatheringCodeUsages) {
      vos.add(convertFor(gatheringCodeUsage));
    }
    return vos;
  }

  public static GatheringCodeUsageVO convertFor(GatheringCodeUsage gatheringCodeUsage) {
    if (gatheringCodeUsage == null) {
      return null;
    }
    GatheringCodeUsageVO vo = new GatheringCodeUsageVO();
    BeanUtils.copyProperties(gatheringCodeUsage, vo);
    //vo.setStateName(DictHolder.getDictItemName("gatheringCodeState", vo.getState()));//1.正常,2.待审核
    //if (StrUtil.isNotBlank(vo.getAuditType())) {
    //  vo.setAuditTypeName(DictHolder.getDictItemName("gatheringCodeAuditType", vo.getAuditType()));
    //}
    //if (gatheringCodeUsage.getUserAccount() != null) {
    //  vo.setUserName(gatheringCodeUsage.getUserAccount().getUserName());
    //}
    if (gatheringCodeUsage.getGatheringChannel() != null) {
      vo.setGatheringChannelName(gatheringCodeUsage.getGatheringChannel());
    }
    //卡用途
    vo.setCardUseName(vo.getCardUse());
    String inuser="0";
    if(vo.getInUse()){//true
      inuser="1";//使用中
    }
    vo.setInUseName(inuser);//卡状态
    vo.setInUser(inuser);
    String vv= DecimalFormatUtil.formatString(new BigDecimal(vo.getBankTotalAmount()), null);
    vo.setBankTotalAmountView(vv);//银行卡总余额使用界面展示吧金额格式化了 "#,###.00";
    return vo;
  }
}
