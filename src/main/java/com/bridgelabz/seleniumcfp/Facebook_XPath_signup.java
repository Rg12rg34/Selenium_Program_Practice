package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_XPath_signup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rahul");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gupta");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rg12rg34@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rg12rg34@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rahul123");
        Thread.sleep(2000);
        WebElement dateElement = driver.findElement(By.xpath("//select[@id='day']"));
        Thread.sleep(2000);
        WebElement monthElement = driver.findElement(By.xpath("//select[@id='month']"));
        Thread.sleep(2000);
        WebElement yearElement = driver.findElement(By.xpath("//*[@id='year']"));
        Thread.sleep(2000);

        Select dateDropdown = new Select(dateElement);
        Select monthDropdown = new Select(monthElement);
        Select yearDropdown = new Select(yearElement);

        dateDropdown.selectByVisibleText("15");
        monthDropdown.selectByVisibleText("Feb");
        yearDropdown.selectByVisibleText("1997");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
        Thread.sleep(2000);
    }
}
