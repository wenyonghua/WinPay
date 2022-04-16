package com.ruoyi.system.vo;

import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.system.domain.GatheringChannelRate;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @ClassName GatheringChannelRateParam
 * @Description TODO
 * @Author yuhanzhou
 * @CreateTime 2022/4/16 21:47
 **/
public class GatheringChannelRateParam {


  private String channelId;

  /**
   * 费率
   */
  private Double rate;

  /**
   * 是否启用
   */
  @NotNull
  private Boolean enabled;

  public GatheringChannelRate convertToPo(String merchantId) {
    GatheringChannelRate po = new GatheringChannelRate();
    po.setId(IdUtils.getId());
    po.setRate(rate);
    po.setEnabled(enabled);
    po.setChannelId(channelId);
    po.setMerchantId(merchantId);
    po.setCreateTime(new Date());
    return po;
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
}
