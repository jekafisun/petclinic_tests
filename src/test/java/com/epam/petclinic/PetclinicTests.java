package com.epam.petclinic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;

public class PetclinicTests extends BaseTest {

    @Test
    public void test1() {
        driver.get("http://10.23.26.9:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isTrue();
        driver.quit();
    }

    @Test
    public void test2() {
        driver.get("http://10.23.26.9:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isFalse();
        driver.quit();
    }
}
