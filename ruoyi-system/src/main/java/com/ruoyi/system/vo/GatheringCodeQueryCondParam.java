package com.ruoyi.system.vo;

/**
 * @ClassName GatheringCodeQueryCondParam
 * @Description TODO
 * @Author yuhanzhou
 * @CreateTime 2022/3/16 23:32
 **/
public class GatheringCodeQueryCondParam {

  /**
   *卡用途
   */
  private String cardUse;

  /**
   * 卡状态
   */
  private  String inUse;

  /**
   * 收款人
   */
  private String payee;

  /**
   * 所属账号
   */
  private String userName;

  /**
   * 银行卡号
   */
  private String bankCode;

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
}
