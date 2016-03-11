package com.makingdevs.practice2

import java.math.RoundingMode

class ConvertionService {

  BigDecimal convert(BigDecimal fahrenheit){
    ((fahrenheit -32) * 5 / 9).setScale(2, RoundingMode.HALF_UP)
  }

	Float retrieveWeatherInCelsiusFromCountryAndCity(String country, String city){
		return 0f
	}

}
