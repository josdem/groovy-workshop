package com.makingdevs.practice2

interface WeatherWebService {
	BigDecimal retrieveWeatherInFarenheitFromCountryAndCity(String country, String city)
}
