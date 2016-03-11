package com.makingdevs.specifications

import spock.lang.Specification

class ConvertionServiceSpec extends Specification {

  ConvertionService convertionService = new ConvertionService()

  @Unroll
  void "should convert fahrenheit to celcius"(){
  expect:"We convert fahrenheit"
    Float result = convertionService.convert(fahrenheit)
  where:"We have following values"
    fahrenheit || result
    100        || 34
  }

}
