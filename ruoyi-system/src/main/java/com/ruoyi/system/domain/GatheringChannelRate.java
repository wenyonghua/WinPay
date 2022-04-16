package com.ruoyi.system.domain;

import java.util.Date;

/**
 * @ClassName GatheringChannelRate
 * @Description TODO
 * @CreateTime 2022/4/16 15:49
 **/
public class GatheringChannelRate {


  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * 主键id
   */
  private String id;

  /**
   * 费率
   */
  private Double rate;

  /**
   * 是否启用
   */
  private Boolean enabled;


  /**
   * 通道id
   */
  private String channelId;

  /**
   * 商户id
   */
  private String merchantId;

  /**
   * 创建时间
   */
  private Date createTime;

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

  public Double getRate() {
    return rate;
  }

  /**
   * Sets the rate.
   *
   * <p>You can use getRate() to get the value of rate</p>
   *
   * @param rate rate
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Sets the enabled.
   *
   * <p>You can use getEnabled() to get the value of enabled</p>
   *
   * @param enabled enabled
   */
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public String getChannelId() {
    return channelId;
  }

  /**
   * Sets the channelId.
   *
   * <p>You can use getChannelId() to get the value of channelId</p>
   *
   * @param channelId channelId
   */
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public String getMerchantId() {
    return merchantId;
  }

  /**
   * Sets the merchantId.
   *
   * <p>You can use getMerchantId() to get the value of merchantId</p>
   *
   * @param merchantId merchantId
   */
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
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
}
