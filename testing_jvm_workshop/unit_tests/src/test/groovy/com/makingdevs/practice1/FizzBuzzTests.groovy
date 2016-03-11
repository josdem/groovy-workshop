package com.makingdevs.practice1;

class FizzBuzzTests extends GroovyTestCase {

  FizzBuzz fizzBuzz = new FizzBuzz()

  void shouldAcceptAValidNumber(){
    Integer n = 2
    assertArrayEquals([], fizzBuzz.serie(n))
  }

}
