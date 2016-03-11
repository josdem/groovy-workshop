package com.makingdevs.practice2

import spock.lang.Specification
import spock.lang.Unroll

class ConvertionServiceSpec extends Specification {

  ConvertionService convertionService = new ConvertionService()

  @Unroll
  void "should convert fahrenheit to celcius"(){
  expect:"We convert fahrenheit"
    result == convertionService.convert(fahrenheit)
  where:"We have following values"
    fahrenheit || result
    100        || 37.78
  }

}
