package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.threezonesheartratelimits.ThreeZonesHeartRateLimits;
import com.levio.lab.bt.utils.ByteUtils;

class ThreeZonesHeartRateLimitsBytesMapper {

  static ThreeZonesHeartRateLimits mapBytesToThreeZonesHeartRateLimits(byte[] bytes) {
    ThreeZonesHeartRateLimits limit = new ThreeZonesHeartRateLimits();

    setLightModerateLimit(bytes, limit);
    setModerateHardLimit(bytes, limit);

    return limit;
  }

  private static void setModerateHardLimit(byte[] bytes, ThreeZonesHeartRateLimits limit) {
    String raw8Bits;
    raw8Bits = ByteUtils.byteToBinaryString(bytes, 1);
    int moderateHard = ByteUtils.binaryStringToInt(raw8Bits);
    limit.setModerateHardLimit(moderateHard);
  }

  private static void setLightModerateLimit(byte[] bytes, ThreeZonesHeartRateLimits limit) {
    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int lightModerate = ByteUtils.binaryStringToInt(raw8Bits);
    limit.setLightModerateLimit(lightModerate);
  }
}
