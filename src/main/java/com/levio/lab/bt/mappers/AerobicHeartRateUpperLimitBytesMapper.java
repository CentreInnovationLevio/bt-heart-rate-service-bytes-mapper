package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.aerobicheartrateupperlimit.AerobicHeartRateUpperLimit;
import com.levio.lab.bt.utils.ByteUtils;

class AerobicHeartRateUpperLimitBytesMapper {

  static AerobicHeartRateUpperLimit mapBytesToAerobicHeartRateUpperLimit(byte[] bytes) {

    AerobicHeartRateUpperLimit aerobicUpper = new AerobicHeartRateUpperLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int upperLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    aerobicUpper.setAerobicHeartRateUpperLimit(upperLimitValue);

    return aerobicUpper;
  }

}
