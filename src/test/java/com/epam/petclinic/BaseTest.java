package com.epam.petclinic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setUpTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("68.0");
        capabilities.setCapability("enableVNC", true);

        URL hubUrl = new URL("http://localhost:4444/wd/hub");

        driver = new RemoteWebDriver(hubUrl, capabilities);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
