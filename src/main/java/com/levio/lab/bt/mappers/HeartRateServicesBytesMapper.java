package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.aerobicheartratelowerlimit.AerobicHeartRateLowerLimit;
import com.levio.lab.bt.services.heartrate.aerobicheartrateupperlimit.AerobicHeartRateUpperLimit;
import com.levio.lab.bt.services.heartrate.anaerobicheartratelowerlimit.AnaerobicHeartRateLowerLimit;
import com.levio.lab.bt.services.heartrate.anaerobicheartrateupperlimit.AnaerobicHeartRateUpperLimit;
import com.levio.lab.bt.services.heartrate.fatburnheartratelowerlimit.FatBurnHeartRateLowerLimit;
import com.levio.lab.bt.services.heartrate.fatburnheartrateupperlimit.FatBurnHeartRateUpperLimit;
import com.levio.lab.bt.services.heartrate.fivezonesheartratelimits.FiveZonesHeartRateLimits;
import com.levio.lab.bt.services.heartrate.heartratecontrolpoint.HeartRateControlPoint;
import com.levio.lab.bt.services.heartrate.heartratemax.HeartRateMax;
import com.levio.lab.bt.services.heartrate.maximumrecommendedheartrate.MaximumRecommendedHeartRate;
import com.levio.lab.bt.services.heartrate.restingheartrate.RestingHeartRate;
import com.levio.lab.bt.services.heartrate.supportedheartraterange.SupportedHeartRateRange;
import com.levio.lab.bt.services.heartrate.threezonesheartratelimits.ThreeZonesHeartRateLimits;
import com.levio.lab.bt.services.heartrate.twozonesheartratelimit.TwoZonesHeartRateLimit;

public class HeartRateServicesBytesMapper {

  public static AerobicHeartRateLowerLimit mapBytesToAerobicLowerLimit(byte[] bytes) {
    return AerobicHeartRateLowerLimitBytesMapper.mapBytesToAerobicLowerLimit(bytes);
  }

  public static AerobicHeartRateUpperLimit mapBytesToAerobicHeartRateUpperLimit(byte[] bytes) {
    return AerobicHeartRateUpperLimitBytesMapper.mapBytesToAerobicHeartRateUpperLimit(bytes);
  }

  public static AnaerobicHeartRateLowerLimit mapBytesToAnaerobicHeartRateLowerLimit(byte[] bytes) {
    return AnaerobicHeartRateLowerLimitBytesMapper.mapBytesToAnaerobicHeartRateLowerLimit(bytes);
  }

  public static AnaerobicHeartRateUpperLimit mapBytesToAnaerobicHeartRateUpperLimit(byte[] bytes) {
    return AnaerobicHeartRateUpperLimitBytesMapper.mapBytesToAnaerobicHeartRateUpperLimit(bytes);
  }

  public static FatBurnHeartRateLowerLimit mapBytesToFatBurnHeartRateLowerLimit(byte[] bytes) {
    return FatBurnHeartRateLowerLimitBytesMapper.mapBytesToFatBurnHeartRateLowerLimit(bytes);
  }

  public static FatBurnHeartRateUpperLimit mapBytesToFatBurnHeartRateUpperLimit(byte[] bytes) {
    return FatBurnHeartRateUpperLimitBytesMapper.mapBytesToFatBurnHeartRateUpperLimit(bytes);
  }

  public static FiveZonesHeartRateLimits mapBytesToFiveZonesHeartRateLimits(byte[] bytes) {
    return FiveZonesHeartRateLimitsMapper.mapBytesToFiveZonesHeartRateLimits(bytes);
  }

  public static HeartRateControlPoint mapBytesToHeartRateControlPoint(byte[] bytes) {
    return HeartRateControlPointMapper.mapBytesToHeartRateControlPoint(bytes);
  }

  public static HeartRateMax mapBytesToHeartRateMax(byte[] bytes) {
    return HeartRateMaxBytesMapper.mapBytesToHeartRateMax(bytes);
  }

  public static MaximumRecommendedHeartRate mapBytesToMaximumRecommendedHeartRate(byte[] bytes) {
    return MaximumRecommendedHeartRateBytesMapper.mapBytesToMaximumRecommendedHeartRate(bytes);
  }

  public static RestingHeartRate mapBytesToRestingHeartRate(byte[] bytes) {
    return RestingHeartRateBytesMapper.mapBytesToRestingHeartRate(bytes);
  }

  public static SupportedHeartRateRange mapBytesToSupportedHeartRateRange(byte[] bytes) {
    return SupportedHeartRateRangeBytesMapper.mapBytesToSupportedHeartRateRange(bytes);
  }

  public static ThreeZonesHeartRateLimits mapBytesToThreeZonesHeartRateLimits(byte[] bytes) {
    return ThreeZonesHeartRateLimitsBytesMapper.mapBytesToThreeZonesHeartRateLimits(bytes);
  }

  public static TwoZonesHeartRateLimit mapBytesToTwoZonesHeartRateLimit(byte[] bytes) {
    return TwoZonesHeartRateLimitsBytesMapper.mapBytesToTwoZonesHeartRateLimit(bytes);
  }
}
