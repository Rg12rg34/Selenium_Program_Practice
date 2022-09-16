package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diff_ways_of_Clicking_on_a_Button {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.vtiger.com");
        String xp = "//button[.='Sign in']";
//1. using click() method
        driver.findElement(By.xpath(xp)).click();
//2. using sendkeys
        driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
//3. using submit() method
       // this method will work only and only if if the element has an attribute called type= 'submit'/
                driver.findElement(By.xpath(xp)).submit();
    }

}
