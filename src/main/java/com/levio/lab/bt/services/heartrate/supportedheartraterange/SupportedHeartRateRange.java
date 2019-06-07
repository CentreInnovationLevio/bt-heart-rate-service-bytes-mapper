package com.levio.lab.bt.services.heartrate.supportedheartraterange;

public class SupportedHeartRateRange {

  private int minimumHeartRate;
  private int maximumHeartRate;
  private int minimumIncrement;

  public SupportedHeartRateRange() {

  }

  public int getMinimumHeartRate() {
    return minimumHeartRate;
  }

  public void setMinimumHeartRate(int minimumHeartRate) {
    this.minimumHeartRate = minimumHeartRate;
  }

  public int getMaximumHeartRate() {
    return maximumHeartRate;
  }

  public void setMaximumHeartRate(int maximumHeartRate) {
    this.maximumHeartRate = maximumHeartRate;
  }

  public int getMinimumIncrement() {
    return minimumIncrement;
  }

  public void setMinimumIncrement(int minimumIncrement) {
    this.minimumIncrement = minimumIncrement;
  }

}
