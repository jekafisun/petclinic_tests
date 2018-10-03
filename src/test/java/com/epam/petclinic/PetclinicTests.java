package com.epam.petclinic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;

public class PetclinicTests extends BaseTest {

    @Test
    public void veterinariansTest() {
        driver.get("http://10.23.26.9:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isTrue();
    }

    @Test
    public void failingVeterinariansTest() {
        driver.get("http://10.23.26.9:8888/");
        driver.findElement(By.cssSelector("[href='\\/vets\\.html']")).click();
        assertThat(driver.findElement(By.cssSelector("#vets")).isDisplayed()).isFalse();
    }

    @Test
    public void addOwnerTest() {
        driver.get("http://10.23.26.9:8888/");
        driver.findElement(By.cssSelector("a[title='find owners']")).click();
        driver.findElement(By.cssSelector("a.btn")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("TestFirstName");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("TestLastName");
        driver.findElement(By.cssSelector("input#address")).sendKeys("address");
        driver.findElement(By.cssSelector("input#city")).sendKeys("city");
        driver.findElement(By.cssSelector("input#telephone")).sendKeys("9379992");
        driver.findElement(By.cssSelector(".btn-default")).click();
        assertThat(driver.findElement(By.xpath("//h2[contains(text(),'Owner Information')]")).isDisplayed()).isTrue();
    }
}
