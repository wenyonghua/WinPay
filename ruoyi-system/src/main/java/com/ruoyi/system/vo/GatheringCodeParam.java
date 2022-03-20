package com.ruoyi.system.vo;

import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.system.domain.GatheringCode;
import java.util.Date;

/**
 * @ClassName GatheringCodeParam
 * @Description TODO
 **/
public class GatheringCodeParam {


  /**
   * 主键id
   */
  private String id;

  /**
   * 收款通道id
   */
  private String gatheringChannelId;
  //
  ///**
  // * 收款金额
  // */
  //private Double gatheringAmount;

  /**
   * 收款人
   */
  private String payee;


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
   * 银行卡提现额度限制
   */
  private String bankReflect;

  /**
   * 卡用途 1.存款卡，2.付款卡，3.备用金卡，
   */
  private String cardUse;
  /**
   * 银行卡总额度
   */
  private String bankTotalAmount;

  /**
   * 卡状态 1是启用，0是停用
   *
   * @param userAccountId
   * @return
   */
  private String inUse;

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

  public String getBankReflect() {
    return bankReflect;
  }

  /**
   * Sets the bankReflect.
   *
   * <p>You can use getBankReflect() to get the value of bankReflect</p>
   *
   * @param bankReflect bankReflect
   */
  public void setBankReflect(String bankReflect) {
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

  public String getBankTotalAmount() {
    return bankTotalAmount;
  }

  /**
   * Sets the bankTotalAmount.
   *
   * <p>You can use getBankTotalAmount() to get the value of bankTotalAmount</p>
   *
   * @param bankTotalAmount bankTotalAmount
   */
  public void setBankTotalAmount(String bankTotalAmount) {
    this.bankTotalAmount = bankTotalAmount;
  }

  public String getInUse() {
    return inUse;
  }

  /**
   * Sets the inUse.
   *
   * <p>You can use getInUse() to get the value of inUse</p>
   *
   * @param inUse inUse
   */
  public void setInUse(String inUse) {
    this.inUse = inUse;
  }

  public GatheringCode convertToPo() {
    GatheringCode po = new GatheringCode();
    po.setId(IdUtils.getId());
    po.setPayee(this.getPayee());
    po.setInUse(this.getInUse().equals("1") ? true : false);
    po.setCreateTime(new Date());
    po.setBankTotalAmount(Double.valueOf(this.getBankTotalAmount()));
    po.setBankReflect(Double.valueOf(this.getBankReflect()));
    po.setGatheringChannelId(this.getGatheringChannelId());
    po.setBankCode(this.getBankCode());
    po.setBankAddress(this.getBankAddress());
    po.setBankUsername(this.getBankUsername());
    po.setCardUse(this.getCardUse());
    return po;
  }

}
