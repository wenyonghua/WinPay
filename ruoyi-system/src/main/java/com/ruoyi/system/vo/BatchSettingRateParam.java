package com.ruoyi.system.vo;

import java.util.List;

/**
 * @ClassName BatchSettingRateParam
 * @Description TODO
 * @CreateTime 2022/4/16 21:50
 **/
public class BatchSettingRateParam {

  private String merchantId;

  private List<GatheringChannelRateParam> channelRates;

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

  public List<GatheringChannelRateParam> getChannelRates() {
    return channelRates;
  }

  /**
   * Sets the channelRates.
   *
   * <p>You can use getChannelRates() to get the value of channelRates</p>
   *
   * @param channelRates channelRates
   */
  public void setChannelRates(List<GatheringChannelRateParam> channelRates) {
    this.channelRates = channelRates;
  }
}
