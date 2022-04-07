package com.ruoyi.system.vo;

/**
 * @ClassName MerchantParam
 * @Description TODO
 * @CreateTime 2022/3/29 15:27
 **/
public class MerchantEditParam extends MerchantParam {

  /**
   * 流水号
   */
  private String id;


  /**
   * 更新商户余额
   */
  private String withdrawableAmount;

  /**
   * 资金密码
   */
  private String moneyPwd;

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

  public String getWithdrawableAmount() {
    return withdrawableAmount;
  }

  /**
   * Sets the withdrawableAmount.
   *
   * <p>You can use getWithdrawableAmount() to get the value of withdrawableAmount</p>
   *
   * @param withdrawableAmount withdrawableAmount
   */
  public void setWithdrawableAmount(String withdrawableAmount) {
    this.withdrawableAmount = withdrawableAmount;
  }
}
