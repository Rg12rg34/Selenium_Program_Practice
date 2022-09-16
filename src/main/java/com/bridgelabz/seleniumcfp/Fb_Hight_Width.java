package com.bridgelabz.seleniumcfp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Hight_Width {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //find the email field
        WebElement unTB = driver.findElement(By.id("email"));
        //store the height of email
        int email_height = unTB.getSize().getHeight();
        //store the width of email
        int email_width = unTB.getSize().getWidth();
        System.out.println(email_height);
        System.out.println(email_width);
        //find the password field
        WebElement pwdTB = driver.findElement(By.name("pass"));
        //store the height of password
        int password_height = pwdTB.getSize().getHeight();
        //store the width of password
        int password_width = pwdTB.getSize().getWidth();
        System.out.println(password_height);
        System.out.println(password_width);
        //check the height and width of email and password fields are same
        if (email_height==password_height && email_width==password_width) {
            System.out.println("email and password fields are aligned");
        }
        else{
            System.out.println("email and password fields are NOT aligned");
        }
    }
}
