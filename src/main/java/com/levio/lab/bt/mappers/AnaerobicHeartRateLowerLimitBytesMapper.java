package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.anaerobicheartratelowerlimit.AnaerobicHeartRateLowerLimit;
import com.levio.lab.bt.utils.ByteUtils;

class AnaerobicHeartRateLowerLimitBytesMapper {

  static AnaerobicHeartRateLowerLimit mapBytesToAnaerobicHeartRateLowerLimit(byte[] bytes) {

    AnaerobicHeartRateLowerLimit anaerobicLower = new AnaerobicHeartRateLowerLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int lowerLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    anaerobicLower.setAnaerobicHeartRateLowerLimit(lowerLimitValue);

    return anaerobicLower;
  }

}
