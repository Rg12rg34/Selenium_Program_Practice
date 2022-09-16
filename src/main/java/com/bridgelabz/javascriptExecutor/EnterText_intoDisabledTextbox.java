package com.bridgelabz.javascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_intoDisabledTextbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C://Users/Rahul/OneDrive/Desktop/selenium/DisabledTextBox_prog3.html");
//Typecast the driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
//enter "admin" in first textbox using javascript
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);
//clear the value in second textbox using javascript
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);
//enter "manager" in second textbox using javascript
        js.executeScript("document.getElementById('t2').value='manager'");
        Thread.sleep(2000);
//change the second text box to button type using Javascript
        js.executeScript("document.getElementById('t2').type='button'");

    }
}
