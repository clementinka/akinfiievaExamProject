package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ExistingUserPage extends ParentPage {

    @FindBy (xpath = ".//div[@class='tab']//button[@id='DevicesTab']")
    private WebElement devicesTab;

    public ExistingUserPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void clickDevicesTab() {
//        actionsWithOurElements.clickOnButton(devicesTab);
        webDriver.findElement(By.id("DevicesTab")).click();
    }
}
