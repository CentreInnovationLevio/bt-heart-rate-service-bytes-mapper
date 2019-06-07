package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.anaerobicheartrateupperlimit.AnaerobicHeartRateUpperLimit;
import com.levio.lab.bt.utils.ByteUtils;

class AnaerobicHeartRateUpperLimitBytesMapper {

  static AnaerobicHeartRateUpperLimit mapBytesToAnaerobicHeartRateUpperLimit(byte[] bytes) {

    AnaerobicHeartRateUpperLimit anaerobicUpper = new AnaerobicHeartRateUpperLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int upperLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    anaerobicUpper.setAnaerobicHeartRateUpperLimit(upperLimitValue);

    return anaerobicUpper;
  }

}
