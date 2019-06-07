package com.levio.lab.bt.services.heartrate.heartratemeasurement;

public class HeartRateMeasurementFlags {

  private boolean isHeartRateValueFormat16Bits;
  private String sensorContactStatusBit;
  private boolean isEnergyExpendedStatusPresent;
  private boolean isRRIntervalValuePresent;

  public HeartRateMeasurementFlags() {

  }

  public boolean isHeartRateValueFormat16Bits() {
    return isHeartRateValueFormat16Bits;
  }

  public void setHeartRateValueFormat16Bits(boolean isHeartRateValueFormat16Bits) {
    this.isHeartRateValueFormat16Bits = isHeartRateValueFormat16Bits;
  }

  public String getSensorContactStatusBit() {
    return sensorContactStatusBit;
  }

  public void setSensorContactStatusBit(String sensorContactStatusBit) {
    this.sensorContactStatusBit = sensorContactStatusBit;
  }

  public boolean isEnergyExpendedStatusPresent() {
    return isEnergyExpendedStatusPresent;
  }

  public void setEnergyExpendedStatusPresent(boolean isEnergyExpendedStatusPresent) {
    this.isEnergyExpendedStatusPresent = isEnergyExpendedStatusPresent;
  }

  public boolean isRRIntervalValuePresent() {
    return isRRIntervalValuePresent;
  }

  public void setRRIntervalValuePresent(boolean isRRIntervalValuePresent) {
    this.isRRIntervalValuePresent = isRRIntervalValuePresent;
  }

}
