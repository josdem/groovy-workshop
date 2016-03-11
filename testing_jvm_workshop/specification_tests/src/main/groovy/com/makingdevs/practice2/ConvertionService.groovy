package com.makingdevs.practice2

import java.math.RoundingMode

class ConvertionService {

  WeatherWebService weatherWebService
  CacheService cacheService

  BigDecimal convert(BigDecimal fahrenheit){
    ((fahrenheit -32) * 5 / 9).setScale(2, RoundingMode.HALF_UP)
  }

	BigDecimal retrieveWeatherInCelsiusFromCountryAndCity(String country, String city){
    try{
      if(cacheService.existValueFromCountryAndCity(country, city)){
        BigDecimal fahrenheit = cacheService.retrieveWeatherInFarenheitFromCountryAndCity(country, city)
		    return convert(fahrenheit)
      } else {
        BigDecimal fahrenheit = weatherWebService.retrieveWeatherInFarenheitFromCountryAndCity(country, city)
        cacheService.storeCountryAndCity(country, city, fahrenheit)
	  	  return convert(fahrenheit)
      }
    } catch(RuntimeException rte){
      throw new ConverterException("Timeout")
    }
	}

}
