package com.herokuapp;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, tags = {"@login"}, plugin = {
        "pretty", "html:target/reports/html",
        "junit:target/reports/junitReports.xml"})
public class CucumberRunnerTest {
}
  