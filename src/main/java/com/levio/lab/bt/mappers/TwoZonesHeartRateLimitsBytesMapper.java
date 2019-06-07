package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.twozonesheartratelimit.TwoZonesHeartRateLimit;
import com.levio.lab.bt.utils.ByteUtils;

class TwoZonesHeartRateLimitsBytesMapper {

  static TwoZonesHeartRateLimit mapBytesToTwoZonesHeartRateLimit(byte[] bytes) {
    TwoZonesHeartRateLimit heartRate = new TwoZonesHeartRateLimit();
    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int fatBurnFitnessLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    heartRate.setFatBurnFitnessLimit(fatBurnFitnessLimitValue);

    return heartRate;
  }
}
