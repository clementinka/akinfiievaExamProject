package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class UsersPage extends ParentPage {
    @FindBy(xpath = ".//div[@class='content']//div[@id='SyncGrid']//div[@id='SyncGrid_toolbarItems']//ul[@class='e-ul e-horizontal'][2]//li[@id='SyncGrid_AddItem']")
    private WebElement addNewUserButton;
    @FindBy(xpath = ".//td[@class='e-rowcell e-gridtooltip e-gridellipsis'][1]")
    private WebElement elementVisible;

    public UsersPage(WebDriver webDriver) {
        super(webDriver, "Users");
    }

    public void clickAddNewUserButton() {
        actionsWithWebElements.clickOnElemenet(addNewUserButton, elementVisible);
    }

    public boolean ifNewUserAppeared(String newUserEmail) {
        WebElement newUser = webDriver.findElement(By.xpath(".//*[contains(text(),'" + newUserEmail + "')]"));
        return actionsWithWebElements.isElementDisplayed(newUser);
    }
}
