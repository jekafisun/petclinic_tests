package com.epam.petclinic;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PetclinicTests {

    @Test
    public void test1() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        URL hubUrl = new URL("http://localhost:4444/wd/hub/");

       RemoteWebDriver driver = new RemoteWebDriver(hubUrl, capabilities);
        driver.get("http://localhost:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isTrue();
    }

}
