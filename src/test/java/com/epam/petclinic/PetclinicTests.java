package com.epam.petclinic;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PetclinicTests extends BaseTest {

    @Test
    public void test1() {
        driver.get("http://localhost:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isTrue();
    }

}
