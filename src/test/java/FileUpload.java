import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUpload {
    public static WebDriver driver;
    @BeforeTest
    public void launch() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rahul/OneDrive/Desktop/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void autoIt_UploadFile() throws InterruptedException, IOException {
        driver.get("https://www.freepdfconvert.com");
        //driver.manage().window().maximize();
        driver.findElement(By.linkText("Choose file")).click();
        Thread.sleep(2000);
        // Runtime.getRuntime().exec("C:\\Selenium\\AutoIt\\uploadScript.exe");
        Runtime.getRuntime().exec("C:\\Users\\Rahul\\Downloads\\autoit-v3\\install\\Aut2Exe");
    }

    public void file_Upload() throws InterruptedException {
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("file:///C:/Users/Rahul/Downloads/ravi%20ITI.pdf");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@ng-click=\\\"item.upload()\\\"]")).click();
        //Thread.sleep(2000);
    }
}
