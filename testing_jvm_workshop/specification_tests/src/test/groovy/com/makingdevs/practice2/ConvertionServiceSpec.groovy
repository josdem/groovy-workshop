package com.makingdevs.practice2

import spock.lang.Specification
import spock.lang.Unroll

class ConvertionServiceSpec extends Specification {

  ConvertionService service = new ConvertionService()

  @Unroll
  void "should convert fahrenheit to celcius"(){
  expect:"We convert fahrenheit"
    result == service.convert(fahrenheit)
  where:"We have following values"
    fahrenheit || result
    100        || 37.78
  }

 void "should obtain Paris, France weather in celcius"(){
  given:"A city and country"
    String country = "France"
    String city = "Paris"
  and:"An Stub"
    WeatherWebService weatherWebServiceStub = Stub(WeatherWebService)
    CacheService cacheServiceMock = Mock(CacheService)
    service.weatherWebService = weatherWebServiceStub
    service.cacheService = cacheServiceMock
  when:"we obtain weather"
    cacheServiceMock.existValueFromCountryAndCity(_,_) >> false
    weatherWebServiceStub.retrieveWeatherInFarenheitFromCountryAndCity(_,_) >> 53
    BigDecimal result = service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
  then:"We expect celcius weather"
    result == 11.67
 }

 void "should send an error when the web service is not responding after 5 seconds"(){
  given:"A city and country"
    String country = "France"
    String city = "Paris"
  and:"An Stub"
    WeatherWebService weatherWebServiceStub = Stub(WeatherWebService)
    CacheService cacheServiceMock = Mock(CacheService)
    service.weatherWebService = weatherWebServiceStub
    service.cacheService = cacheServiceMock
  when:"we obtain weather"
    cacheServiceMock.existValueFromCountryAndCity(_,_) >> false
    weatherWebServiceStub.retrieveWeatherInFarenheitFromCountryAndCity(_,_) >> {
      Thread.sleep(5001)
      throw new RuntimeException()
    }
    BigDecimal result = service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
  then:"We expect exception"
    ConverterException e = thrown()
    e.message == "Timeout"
 }

 void "should call 3 times the same city, and the second and third times are from cache"(){
  given:"A city and country"
    String country = "France"
    String city = "Paris"
  and:"An Stub"
    WeatherWebService weatherWebServiceMock = Mock(WeatherWebService)
    CacheService cacheServiceMock = Mock(CacheService)
    service.weatherWebService = weatherWebServiceMock
    service.cacheService = cacheServiceMock
  when:"we obtain weather"
    service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
    service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
    service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
  then:"We expect calling from right service"
    3 * cacheServiceMock.existValueFromCountryAndCity(country, city) >>> [false, true, true]
    1 * cacheServiceMock.storeCountryAndCity(country, city, 100)
    1 * weatherWebServiceMock.retrieveWeatherInFarenheitFromCountryAndCity(country, city) >> 100
    2 * cacheServiceMock.retrieveWeatherInFarenheitFromCountryAndCity(country, city) >> 100 >> 100
 }


}
