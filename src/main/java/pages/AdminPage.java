package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AdminPage extends ParentPage {
    @FindBy (xpath = ".//li[@class='users']//a[@id='usersPage']")
    private WebElement usersButton;

    public AdminPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnUsersButton() {
        actionsWithOurElements.clickOnButton(usersButton);
    }
}
