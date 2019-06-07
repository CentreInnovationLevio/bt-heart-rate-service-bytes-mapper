package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.fatburnheartratelowerlimit.FatBurnHeartRateLowerLimit;
import com.levio.lab.bt.utils.ByteUtils;

class FatBurnHeartRateLowerLimitBytesMapper {

  static FatBurnHeartRateLowerLimit mapBytesToFatBurnHeartRateLowerLimit(byte[] bytes) {

    FatBurnHeartRateLowerLimit fatBurnLower = new FatBurnHeartRateLowerLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int lowerLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    fatBurnLower.setFatBurnHeartRateLowerLimit(lowerLimitValue);

    return fatBurnLower;
  }

}
