package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.supportedheartraterange.SupportedHeartRateRange;
import com.levio.lab.bt.utils.ByteUtils;

class SupportedHeartRateRangeBytesMapper {

  static SupportedHeartRateRange mapBytesToSupportedHeartRateRange(byte[] bytes) {

    SupportedHeartRateRange heartRateRange = new SupportedHeartRateRange();

    setMinimumRate(bytes, heartRateRange);
    setMaximumRate(bytes, heartRateRange);
    setMinimumIncrement(bytes, heartRateRange);

    return heartRateRange;
  }

  private static void setMinimumRate(byte[] bytes, SupportedHeartRateRange heartRateRange) {
    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int minRate = ByteUtils.binaryStringToInt(raw8Bits);
    heartRateRange.setMinimumHeartRate(minRate);
  }

  private static void setMaximumRate(byte[] bytes, SupportedHeartRateRange heartRateRange) {
    String raw8Bits;
    raw8Bits = ByteUtils.byteToBinaryString(bytes, 1);
    int maxRate = ByteUtils.binaryStringToInt(raw8Bits);
    heartRateRange.setMaximumHeartRate(maxRate);
  }

  private static void setMinimumIncrement(byte[] bytes, SupportedHeartRateRange heartRateRange) {
    String raw8Bits;
    raw8Bits = ByteUtils.byteToBinaryString(bytes, 2);
    int minIncrement = ByteUtils.binaryStringToInt(raw8Bits);
    heartRateRange.setMinimumIncrement(minIncrement);
  }
}
