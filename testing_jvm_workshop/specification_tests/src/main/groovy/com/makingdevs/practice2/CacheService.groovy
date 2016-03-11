package com.makingdevs.practice2

interface CacheService {
  Boolean existValueFromCountryAndCity(String country, String city)
  void storeCountryAndCity(String country, String city, BigDecimal fahrenheit)
  BigDecimal retrieveWeatherInFarenheitFromCountryAndCity(String country, String city)
}
