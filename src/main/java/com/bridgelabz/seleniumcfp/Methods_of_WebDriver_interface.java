package com.bridgelabz.seleniumcfp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Methods_of_WebDriver_interface {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();                                   // manage

        driver.get("https://www.facebook.com/");                               //get
        Thread.sleep(2000);

        driver.findElement(By.linkText("Create New Account")).click();       // findelement

        String j = driver.getTitle();                                        // getTitle
        System.out.println("Your page title Is : " + j);

        String strUrl = driver.getCurrentUrl();                               // getCurrentUrl
        System.out.println("Current Url is:" + strUrl);

        driver.navigate().to("https://plgworks.com");                      // navigate

        String pageSource = driver.getPageSource();                              //getPageSource
        System.out.println("the source code of the page is :" + pageSource);
        Thread.sleep(2000);

        //driver.close();                   // close
         driver.quit();                  // quit
    }
}
