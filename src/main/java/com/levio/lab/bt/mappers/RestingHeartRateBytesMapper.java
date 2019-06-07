package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.restingheartrate.RestingHeartRate;
import com.levio.lab.bt.utils.ByteUtils;

class RestingHeartRateBytesMapper {

  static RestingHeartRate mapBytesToRestingHeartRate(byte[] bytes) {

    RestingHeartRate heartRate = new RestingHeartRate();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int heartRateValue = ByteUtils.binaryStringToInt(raw8Bits);
    heartRate.setRestingHeartRate(heartRateValue);

    return heartRate;
  }

}
