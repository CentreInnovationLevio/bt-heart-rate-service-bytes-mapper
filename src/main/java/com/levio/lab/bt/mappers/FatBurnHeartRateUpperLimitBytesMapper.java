package com.levio.lab.bt.mappers;

import com.levio.lab.bt.services.heartrate.fatburnheartrateupperlimit.FatBurnHeartRateUpperLimit;
import com.levio.lab.bt.utils.ByteUtils;

class FatBurnHeartRateUpperLimitBytesMapper {

  static FatBurnHeartRateUpperLimit mapBytesToFatBurnHeartRateUpperLimit(byte[] bytes) {

    FatBurnHeartRateUpperLimit fatBurnUpper = new FatBurnHeartRateUpperLimit();

    String raw8Bits = ByteUtils.byteToBinaryString(bytes, 0);
    int UpperLimitValue = ByteUtils.binaryStringToInt(raw8Bits);
    fatBurnUpper.setFatBurnHeartRateUpperLimit(UpperLimitValue);

    return fatBurnUpper;
  }

}
