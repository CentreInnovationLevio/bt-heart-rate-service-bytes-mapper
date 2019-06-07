package com.levio.lab.bt.services.heartrate.fivezonesheartratelimits;

public class FiveZonesHeartRateLimits {

  private int veryLightLimit;
  private int lightLimit;
  private int moderateLimit;
  private int hardLimit;

  public FiveZonesHeartRateLimits() {

  }

  public int getVeryLightLimit() {
    return veryLightLimit;
  }

  public void setVeryLightLimit(int veryLightLimit) {
    this.veryLightLimit = veryLightLimit;
  }

  public int getLightLimit() {
    return lightLimit;
  }

  public void setLightLimit(int lightLimit) {
    this.lightLimit = lightLimit;
  }

  public int getModerateLimit() {
    return moderateLimit;
  }

  public void setModerateLimit(int moderateLimit) {
    this.moderateLimit = moderateLimit;
  }

  public int getHardLimit() {
    return hardLimit;
  }

  public void setHardLimit(int hardLimit) {
    this.hardLimit = hardLimit;
  }

}
