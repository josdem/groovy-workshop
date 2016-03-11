package com.makingdevs.practice1

class FizzBuzzTest extends GroovyTestCase {

  FizzBuzz fizzBuzz = new FizzBuzz()

  void testAcceptAValidNumber(){
    Integer n = 2
    assertEquals([], fizzBuzz.serie(n))
  }

}
