package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.heartratecontrolpoint.HeartRateControlPoint;

class HeartRateControlPointMapper {

  static HeartRateControlPoint mapBytesToHeartRateControlPoint(byte[] bytes) {
    HeartRateControlPoint heartRate = new HeartRateControlPoint();

    if (bytes[0] == 1) {
      heartRate.setResetEnergyExpended(true);
    } else {
      heartRate.setResetEnergyExpended(false);
    }

    return heartRate;
  }
}
