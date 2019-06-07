package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.maximumrecommendedheartrate.MaximumRecommendedHeartRate;
import com.levio.lab.bt.utils.ByteUtils;

class MaximumRecommendedHeartRateBytesMapper {

  static MaximumRecommendedHeartRate mapBytesToMaximumRecommendedHeartRate(byte[] bytes) {
    MaximumRecommendedHeartRate heartRate = new MaximumRecommendedHeartRate();
    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int heartRateMaxValue = ByteUtils.binaryStringToInt(raw8Bits);
    heartRate.setMaximumRecommendedHeartRate(heartRateMaxValue);

    return heartRate;
  }
}
