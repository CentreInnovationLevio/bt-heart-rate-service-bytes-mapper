package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.fivezonesheartratelimits.FiveZonesHeartRateLimits;
import com.levio.lab.bt.utils.ByteUtils;

class FiveZonesHeartRateLimitsMapper {

  static FiveZonesHeartRateLimits mapBytesToFiveZonesHeartRateLimits(byte[] bytes) {

    FiveZonesHeartRateLimits mappedZones = new FiveZonesHeartRateLimits();

    mappedZones
        .setVeryLightLimit(ByteUtils.binaryStringToInt(ByteUtils.byteToBinaryString(bytes, 0)));
    mappedZones.setLightLimit(ByteUtils.binaryStringToInt(ByteUtils.byteToBinaryString(bytes, 1)));
    mappedZones
        .setModerateLimit(ByteUtils.binaryStringToInt(ByteUtils.byteToBinaryString(bytes, 2)));
    mappedZones.setHardLimit(ByteUtils.binaryStringToInt(ByteUtils.byteToBinaryString(bytes, 3)));

    return mappedZones;
  }

}
