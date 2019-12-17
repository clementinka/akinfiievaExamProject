package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UsersPage extends ParentPage {
    @FindBy(id = "SyncGrid_AddItem")
    private WebElement addNewUserButton;

    public UsersPage(WebDriver webDriver) {
        super(webDriver,"Users");
    }

    public void clickAddNewUserButton() {
        actionsWithWebElements.clickOnElemenet(addNewUserButton);
    }

    public boolean ifNewUserAppeared(String newUserEmail) {
        WebElement newUser = webDriver.findElement(By.xpath(".//*[contains(text(),'"+newUserEmail+"')]"));
        return actionsWithWebElements.isElementDisplayed(newUser);
    }
}
