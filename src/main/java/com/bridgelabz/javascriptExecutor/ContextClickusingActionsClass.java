package com.bridgelabz.javascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickusingActionsClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//right click (context click) on actitime link
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(3000);
//press 'w' from the keyboard for opening in a new window
        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
    }
}
