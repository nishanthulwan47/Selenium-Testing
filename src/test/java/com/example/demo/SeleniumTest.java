package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/animal");
        WebElement inputField = driver.findElement(By.id("animalText"));
        inputField.sendKeys("Nishant");
        WebElement inputField1 = driver.findElement(By.id("adjective"));
        inputField1.sendKeys("vishnu");
        WebElement button = driver.findElement(By.id("adjective"));
        button.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}
