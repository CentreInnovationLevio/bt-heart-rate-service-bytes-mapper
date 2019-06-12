package com.levio.lab.bt.mapper;

import static org.junit.Assert.*;
import org.junit.Test;
import com.levio.lab.bt.mappers.HeartRateServicesBytesMapper;
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

public class HeartRateServicesBytesMapperTest {

  private byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9};

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToAerobicLowerLimit_thenCorrectFieldsAreMapped() {
    AerobicHeartRateLowerLimit result =
        HeartRateServicesBytesMapper.mapBytesToAerobicLowerLimit(bytes);

    assertTrue(result.getAerobicHeartRateLowerLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToAerobicUpperLimit_thenCorrectFieldsAreMapped() {
    AerobicHeartRateUpperLimit result =
        HeartRateServicesBytesMapper.mapBytesToAerobicHeartRateUpperLimit(bytes);

    assertTrue(result.getAerobicHeartRateUpperLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToAnaerobicHeartRateLowerLimit_thenCorrectFieldsAreMapped() {
    AnaerobicHeartRateLowerLimit result =
        HeartRateServicesBytesMapper.mapBytesToAnaerobicHeartRateLowerLimit(bytes);

    assertTrue(result.getAnaerobicHeartRateLowerLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToAnaerobicHeartRateUpperLimit_thenCorrectFieldsAreMapped() {
    AnaerobicHeartRateUpperLimit result =
        HeartRateServicesBytesMapper.mapBytesToAnaerobicHeartRateUpperLimit(bytes);

    assertTrue(result.getAnaerobicHeartRateUpperLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToFatBurnHeartRateLowerLimit_thenCorrectFieldsAreMapped() {
    FatBurnHeartRateLowerLimit result =
        HeartRateServicesBytesMapper.mapBytesToFatBurnHeartRateLowerLimit(bytes);

    assertTrue(result.getFatBurnHeartRateLowerLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToFatBurnHeartRateUpperLimit_thenCorrectFieldsAreMapped() {
    FatBurnHeartRateUpperLimit result =
        HeartRateServicesBytesMapper.mapBytesToFatBurnHeartRateUpperLimit(bytes);

    assertTrue(result.getFatBurnHeartRateUpperLimit() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToFiveZonesHeartRateLimits_thenCorrectFieldsAreMapped() {
    FiveZonesHeartRateLimits result =
        HeartRateServicesBytesMapper.mapBytesToFiveZonesHeartRateLimits(bytes);

    assertTrue(result.getVeryLightLimit() == 1);
    assertTrue(result.getLightLimit() == 2);
    assertTrue(result.getModerateLimit() == 3);
    assertTrue(result.getHardLimit() == 4);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToHeartRateControlPoint_thenCorrectFieldsAreMapped() {
    HeartRateControlPoint result =
        HeartRateServicesBytesMapper.mapBytesToHeartRateControlPoint(bytes);

    assertTrue(result.isResetEnergyExpended() == true);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToHeartRateMax_thenCorrectFieldsAreMapped() {
    HeartRateMax result = HeartRateServicesBytesMapper.mapBytesToHeartRateMax(bytes);

    assertTrue(result.getHeartRateMax() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToMaximumRecommendedHeartRate_thenCorrectFieldsAreMapped() {
    MaximumRecommendedHeartRate result =
        HeartRateServicesBytesMapper.mapBytesToMaximumRecommendedHeartRate(bytes);

    assertTrue(result.getMaximumRecommendedHeartRate() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToRestingHeartRate_thenCorrectFieldsAreMapped() {
    RestingHeartRate result = HeartRateServicesBytesMapper.mapBytesToRestingHeartRate(bytes);

    assertTrue(result.getRestingHeartRate() == 1);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToSupportedHeartRateRange_thenCorrectFieldsAreMapped() {
    SupportedHeartRateRange result =
        HeartRateServicesBytesMapper.mapBytesToSupportedHeartRateRange(bytes);

    assertTrue(result.getMinimumHeartRate() == 1);
    assertTrue(result.getMaximumHeartRate() == 2);
    assertTrue(result.getMinimumIncrement() == 3);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToThreeZonesHeartRateLimits_thenCorrectFieldsAreMapped() {
    ThreeZonesHeartRateLimits result =
        HeartRateServicesBytesMapper.mapBytesToThreeZonesHeartRateLimits(bytes);

    assertTrue(result.getLightModerateLimit() == 1);
    assertTrue(result.getModerateHardLimit() == 2);
  }

  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToTwoZonesHeartRateLimit_thenCorrectFieldsAreMapped() {
    TwoZonesHeartRateLimit result =
        HeartRateServicesBytesMapper.mapBytesToTwoZonesHeartRateLimit(bytes);

    assertTrue(result.getFatBurnFitnessLimit() == 1);
  }
}
