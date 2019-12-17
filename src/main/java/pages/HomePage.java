package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//a[@class='managementSystemTwoLine']")
    private WebElement managemetSystem;
    @FindBy(xpath = ".//a[@class='managementSystemTwoLine']//form//button")
    private WebElement defaultGroup;
    @FindBy (xpath = ".//a[@id='link-settings']")
    private WebElement accountManagementButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver,"Home/Cabinet");
    }

    public boolean ifManagementSystemDisplayed() {
        return actionsWithWebElements.isElementDisplayed(managemetSystem);
    }

    public void checkIfManagementPanelDisplayed() {
        Assert.assertTrue("Management panel is not displayed",ifManagementSystemDisplayed());
    }

    public void clickOnManagementButton() {
        actionsWithWebElements.clickOnElemenet(defaultGroup);
    }

    public void clickAccountManagement() {
        actionsWithWebElements.clickOnElemenet(accountManagementButton);
    }
}
