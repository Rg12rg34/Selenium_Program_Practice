package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelecter_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'u_7_b_')]")).sendKeys("rahul");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with9@id,'u_7_d_')]")).sendKeys("gupta");
        Thread.sleep(2000);
    }
}
