package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.heartratemax.HeartRateMax;
import com.levio.lab.bt.utils.ByteUtils;

class HeartRateMaxBytesMapper {

  static HeartRateMax mapBytesToHeartRateMax(byte[] bytes) {
    HeartRateMax heartRate = new HeartRateMax();
    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int heartRateMaxValue = ByteUtils.binaryStringToInt(raw8Bits);
    heartRate.setHeartRateMax(heartRateMaxValue);

    return heartRate;
  }
}
