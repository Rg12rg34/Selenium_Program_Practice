package com.bridgelabz.javascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("rg12rg34@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Ramramji@78");
        driver.findElement(By.linkText("Log In")).click();
    }
}
