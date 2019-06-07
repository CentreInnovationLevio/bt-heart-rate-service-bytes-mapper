package com.levio.lab.bt.services.heartrate.heartratemeasurement;

public class HeartRateMeasurement {

  private HeartRateMeasurementFlags flags;
  private int heartRateMeasurementValue;
  private int energyExpended;
  private int rrInterval;

  public HeartRateMeasurement() {

  }

  public HeartRateMeasurementFlags getFlags() {
    return flags;
  }

  public void setFlags(HeartRateMeasurementFlags flags) {
    this.flags = flags;
  }

  public int getHeartRateMeasurementValue() {
    return heartRateMeasurementValue;
  }

  public void setHeartRateMeasurementValue(int heartRateMeasurementValue) {
    this.heartRateMeasurementValue = heartRateMeasurementValue;
  }

  public int getEnergyExpended() {
    return energyExpended;
  }

  public void setEnergyExpended(int energyExpended) {
    this.energyExpended = energyExpended;
  }

  public int getRrInterval() {
    return rrInterval;
  }

  public void setRrInterval(int rrInterval) {
    this.rrInterval = rrInterval;
  }

}
