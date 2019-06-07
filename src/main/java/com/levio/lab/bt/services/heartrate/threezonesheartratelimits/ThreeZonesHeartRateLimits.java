package com.levio.lab.bt.services.heartrate.threezonesheartratelimits;

public class ThreeZonesHeartRateLimits {

  private int lightModerateLimit;
  private int moderateHardLimit;

  public ThreeZonesHeartRateLimits() {

  }

  public int getLightModerateLimit() {
    return lightModerateLimit;
  }

  public void setLightModerateLimit(int lightModerateLimit) {
    this.lightModerateLimit = lightModerateLimit;
  }

  public int getModerateHardLimit() {
    return moderateHardLimit;
  }

  public void setModerateHardLimit(int moderateHardLimit) {
    this.moderateHardLimit = moderateHardLimit;
  }

}
