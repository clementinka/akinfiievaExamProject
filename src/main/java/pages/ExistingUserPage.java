package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;
import java.util.concurrent.TimeUnit;

public class ExistingUserPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='tab']//button[@id='DevicesTab']")
    private WebElement devicesTab;
    @FindBy (xpath=".//button[@class='tablinks col-md-4 col-xs-4 col-sm-4']")
    private WebElement rolesButton;
    @FindBy (xpath=".//i[@class='ios-checkbox-item ios-contrast']")
    private WebElement adminTab;
    @FindBy (xpath = ".//div[@class='form-group']//div//input[@class='confirmButton']")
    private WebElement saveButton;

    public ExistingUserPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void handleCurrentTab() {
        String handleHost;
        handleHost = webDriver.getWindowHandle();
        for (String handle : webDriver.getWindowHandles()) {
            if (handle != handleHost) {
                webDriver.switchTo().window(handle);
                webDriver.switchTo().activeElement();
            }
        }
    }

    public void clickRolesTab() {
        actionsWithOurElements.clickOnButton(rolesButton);
    }

    public void checkAsAdmin() {
        actionsWithOurElements.clickOnButton(adminTab);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnButton(saveButton);
    }
}
