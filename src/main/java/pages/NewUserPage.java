package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class NewUserPage extends ParentPage {
    @FindBy(xpath = ".//div/input[@id='confirmEmail']")
    private WebElement confirmEmailButton;
    @FindBy(xpath = ".//button[@class='tablinks col-md-4 col-xs-4 col-sm-4'][1]")
    private WebElement rolesTab;
    @FindBy(xpath = ".//label//i[@class='ios-checkbox-item ios-contrast']")
    private WebElement adminRoleSwitcher;
    @FindBy(xpath = ".//div/input[@class='confirmButton']")
    private WebElement saveButton;

    public NewUserPage(WebDriver webDriver) {
        super(webDriver, "Users/Edit?Id=ac1c3bec-c4b0-493a-8be0-8421351a6936");
    }

    public void clickConfirmEmail() {
        actionsWithWebElements.clickOnElemenet(confirmEmailButton);
    }

    public void clickRolesTab() {
        actionsWithWebElements.clickOnElemenet(rolesTab);
    }

    public void clickAdminRoleSwitcher() {
        actionsWithWebElements.clickOnElemenet(adminRoleSwitcher);
    }

    public void clickSaveButton() {
        actionsWithWebElements.clickOnElemenet(saveButton);
    }

    public void switchToPreviousTab(){
        actionsWithWebElements.switchToPreviousTab();
    }
}

