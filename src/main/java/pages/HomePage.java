package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath=".//div[@id='mainDiv']//h2[@class='cabinetLabel']")
    private WebElement item;
    @FindBy (xpath = ".//a[@class='managementSystemTwoLine']//form//button")
    private WebElement defaulGroupButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean areGreetingsDisplayed() {
        return actionsWithOurElements.checkIfItemDisplayed(item);
    }

    public void clickOnDefaultGroupButton() {
        actionsWithOurElements.clickOnButton(defaulGroupButton);
    }
}
