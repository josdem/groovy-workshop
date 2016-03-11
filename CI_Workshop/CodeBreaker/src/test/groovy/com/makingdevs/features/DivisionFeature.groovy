package com.makingdevs.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = [ "classpath:features/division.feature" ], strict = true, plugin = [ "html:build/test-report" ])
class DivisionFeature {

}
