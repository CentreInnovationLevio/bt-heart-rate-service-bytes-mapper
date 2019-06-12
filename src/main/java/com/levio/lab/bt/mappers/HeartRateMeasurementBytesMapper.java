package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.heartratemeasurement.HeartRateMeasurement;
import com.levio.lab.bt.services.heartrate.heartratemeasurement.HeartRateMeasurementFlags;
import com.levio.lab.bt.utils.ByteUtils;

public class HeartRateMeasurementBytesMapper {

  public static HeartRateMeasurement mapHeartRateMeasurementBytesToReadableData(byte[] bytes) {
    HeartRateMeasurement hrm = new HeartRateMeasurement();
    HeartRateMeasurementFlags flags = setFlagsFromRawData(bytes);
    hrm.setFlags(flags);
    int bitNumber = setHeartRateValueFromRawData(bytes, hrm);
    bitNumber = setEnergyExpended(bytes, hrm, bitNumber);
    setRRInterval(bytes, hrm, bitNumber);
    return hrm;
  }

  private static void setRRInterval(byte[] bytes, HeartRateMeasurement hrm, int bitNumber) {
    if (hrm.getFlags().isRRIntervalValuePresent()) {

      String raw16Bits = ByteUtils.byteToBinaryString(bytes, bitNumber) + ByteUtils
          .byteToBinaryString(bytes, bitNumber + 1);
      int rrInterval = ByteUtils.binaryStringToInt(raw16Bits);
      hrm.setRrInterval(rrInterval);
    }
  }

  private static int setEnergyExpended(byte[] bytes, HeartRateMeasurement hrm, int bitNumber) {
    if (hrm.getFlags().isEnergyExpendedStatusPresent()) {

      String raw16Bits = ByteUtils.byteToBinaryString(bytes, bitNumber) + ByteUtils
          .byteToBinaryString(bytes, bitNumber + 1);
      int energyExpended = ByteUtils.binaryStringToInt(raw16Bits);
      hrm.setEnergyExpended(energyExpended);
      bitNumber = bitNumber + 2;
    }
    return bitNumber;
  }

  private static int setHeartRateValueFromRawData(byte[] bytes, HeartRateMeasurement hrm) {
    int bitNumber = 1;

    if (hrm.getFlags().isHeartRateValueFormat16Bits()) {
      String raw16Bits = ByteUtils.byteToBinaryString(bytes, bitNumber) + ByteUtils
          .byteToBinaryString(bytes, bitNumber + 1);
      int heartRateValue = ByteUtils.binaryStringToInt(raw16Bits);
      hrm.setHeartRateMeasurementValue(heartRateValue);
      bitNumber = bitNumber + 2;

    } else {
      String raw8Bits = ByteUtils.byteToBinaryString(bytes, bitNumber);
      int heartRateValue = ByteUtils.binaryStringToInt(raw8Bits);
      hrm.setHeartRateMeasurementValue(heartRateValue);
      bitNumber++;
    }

    return bitNumber;
  }

  private static HeartRateMeasurementFlags setFlagsFromRawData(byte[] bytes) {

    HeartRateMeasurementFlags flags = new HeartRateMeasurementFlags();

    String rawFlagsBits = ByteUtils.byteToBinaryString(bytes, 0);
    rawFlagsBits = new StringBuilder(rawFlagsBits).reverse().toString();
    int bitCount = 0;
    String sensorContactStatusBits = "";

    for (char bit : rawFlagsBits.toCharArray()) {
      switch (bitCount) {
        case 0:
          flags.setHeartRateValueFormat16Bits(ByteUtils.binaryCharToBoolean(bit));
          break;
        case 1:
          sensorContactStatusBits += bit;
          break;
        case 2:
          sensorContactStatusBits += bit;
          setSensorStatusBitsFromTwoBits(flags, sensorContactStatusBits);
          break;
        case 3:
          flags.setEnergyExpendedStatusPresent(ByteUtils.binaryCharToBoolean(bit));
          break;
        case 4:
          flags.setRRIntervalValuePresent(ByteUtils.binaryCharToBoolean(bit));
          break;
        default:
          break;
      }
      bitCount++;
    }
    return flags;
  }

  private static void setSensorStatusBitsFromTwoBits(HeartRateMeasurementFlags flags,
      String sensorContactStatusBits) {
    switch (ByteUtils.binaryStringToInt(sensorContactStatusBits)) {
      case 0:
      case 1:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is not supported in the current connection");
        break;
      case 2:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is supported, but contact is not detected");
        break;
      case 3:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is supported and contact is detected");
        break;
    }
  }

}
