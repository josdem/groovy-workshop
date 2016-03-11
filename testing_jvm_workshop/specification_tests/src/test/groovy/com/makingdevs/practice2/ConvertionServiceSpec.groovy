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
    def weatherWebServiceStub = Stub(WeatherWebService)
    service.weatherWebService = weatherWebServiceStub
  when:"we obtain weather"
    weatherWebServiceStub.retrieveWeatherInFarenheitFromCountryAndCity(_,_) >> 53
    BigDecimal result = service.retrieveWeatherInCelsiusFromCountryAndCity(country, city)
  then:"We expect celcius weather"
    result == 11.67
 }

}
