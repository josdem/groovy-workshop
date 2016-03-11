package com.makingdevs.practice2

import java.math.RoundingMode

class ConvertionService {

  WeatherWebService weatherWebService

  BigDecimal convert(BigDecimal fahrenheit){
    ((fahrenheit -32) * 5 / 9).setScale(2, RoundingMode.HALF_UP)
  }

	BigDecimal retrieveWeatherInCelsiusFromCountryAndCity(String country, String city){
    try {
      BigDecimal fahrenheit = weatherWebService.retrieveWeatherInFarenheitFromCountryAndCity(country, city)
		  return convert(fahrenheit)
    } catch (RuntimeException rte){
      throw new ConverterException()
    }
	}

}
