package com.levio.lab.bt.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.levio.lab.bt.mappers.HeartRateMeasurementBytesMapper;
import com.levio.lab.bt.services.heartrate.heartratemeasurement.HeartRateMeasurement;

public class HeartRateMeasurementBytesMapperTest {

  private byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  
  @Test
  public void givenValidArrayOfBytes_whenMappingBytesToAerobicLowerLimit_thenCorrectFieldsAreMapped() {
    HeartRateMeasurement result =
        HeartRateMeasurementBytesMapper.mapHeartRateMeasurementBytesToReadableData(bytes);

    validateFlags(result);
    validateMeasurements(result);
  }

  private void validateMeasurements(HeartRateMeasurement result) {
    assertEquals(result.getHeartRateMeasurementValue(), 515);
    assertEquals(result.getEnergyExpended(), 0);
    assertEquals(result.getRrInterval(), 0);
  }

  private void validateFlags(HeartRateMeasurement result) {
    assertTrue(result.getFlags().isHeartRateValueFormat16Bits() == true);
    assertTrue(result.getFlags().getSensorContactStatusBit().equals("Sensor Contact feature is not supported in the current connection"));
    assertFalse(result.getFlags().isEnergyExpendedStatusPresent());
    assertFalse(result.getFlags().isRRIntervalValuePresent());
  }

}
