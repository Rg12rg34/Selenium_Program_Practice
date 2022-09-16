package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_XPath_login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rg12rg34@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Ramramji@78");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
        Thread.sleep(2000);

//		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
        driver.findElement(By.xpath("//a[starts-with(text(),'F')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id ='identify_email']")).sendKeys("rg12rg34@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
        Thread.sleep(2000);
    }
}
