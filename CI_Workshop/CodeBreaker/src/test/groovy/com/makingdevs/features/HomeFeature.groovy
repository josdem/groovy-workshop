package com.makingdevs.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = [ "classpath:features/welcome.feature" ], strict = true, plugin = [ "html:build/test-report" ])
public class HomeFeature {

}
