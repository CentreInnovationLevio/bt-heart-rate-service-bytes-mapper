package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.aerobicheartratelowerlimit.AerobicHeartRateLowerLimit;
import com.levio.lab.bt.utils.ByteUtils;

class AerobicHeartRateLowerLimitBytesMapper {

  static AerobicHeartRateLowerLimit mapBytesToAerobicLowerLimit(byte[] bytes) {

    AerobicHeartRateLowerLimit aerobicLower = new AerobicHeartRateLowerLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int lowerLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    aerobicLower.setAerobicHeartRateLowerLimit(lowerLimitValue);

    return aerobicLower;
  }

}
