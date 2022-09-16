package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/selenium/UN.html");
        // Used “id” locator to find USERNAME text box
        WebElement unTB = driver.findElement(By.id("user"));
//Clear the existing value present in the text box
        unTB.clear();
// Enter value into the USERNAME text box
        unTB.sendKeys("ajit.biswas@gmail.com");
        // Used “name” locator to find Password text box
        WebElement passTB = driver.findElement(By.name("n1"));
        //Clear the existing value present in the text box
        passTB.clear();
//Halt the program execution for 2 seconds
        Thread.sleep(2000);
// Enter value into the Password text box
        passTB.sendKeys("Qspiders123");
        // Find the address of ActiTIME Link and click
        driver.findElement(By.linkText("Click ActiTIME link")).click();
        Thread.sleep(2000);
    }
}
