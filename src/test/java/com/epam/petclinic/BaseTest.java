package com.epam.petclinic;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        try {
            driver = new RemoteWebDriver(URI.create("http://127.0.0.1:4444/wd/hub").toURL(), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
