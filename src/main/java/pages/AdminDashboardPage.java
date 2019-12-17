package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AdminDashboardPage extends ParentPage {
    @FindBy(id = "usersPage")
    private WebElement usersButton;

    public AdminDashboardPage(WebDriver webDriver) {
        super(webDriver,"Dashboard");
    }

    public void clickUsers() {
        actionsWithWebElements.clickOnElemenet(usersButton);
    }
}
