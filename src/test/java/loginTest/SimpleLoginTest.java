package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SimpleLoginTest {

    WebDriver webDriver;

    @Test
    public void simpleValidLogin() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://my.hideez.com");

        webDriver.findElement(By.id("UserName")).clear();
        webDriver.findElement(By.id("UserName")).sendKeys("clementine.letto@gmail.com");
        webDriver.findElement(By.id("password")).clear();
        webDriver.findElement(By.id("password")).sendKeys("17uipAeeRw");
        webDriver.findElement(By.xpath(".//button[@class='Rectangle-19 col-xs-5']")).click();

        Assert.assertTrue("Management system is not present", isManagementSystemPresent());

        webDriver.quit();
    }

    private boolean isManagementSystemPresent() {
        try {
            return webDriver.findElement(By.xpath(".//a[@class='managementSystemTwoLine']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}


