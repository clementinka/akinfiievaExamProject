package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;


public class AccountManagementPage extends ParentPage {

    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = ".//div[@class='form-group'][1]//div[@class='inputCenter']//input[@class='form-control']")
    private WebElement firstNameField;
    @FindBy(xpath = ".//div[@class='form-group'][2]//div[@class='inputCenter']//input[@class='form-control']")
    private WebElement lastNameField;
    @FindBy(xpath = ".//div[@class='form-group'][3]//div[@class='inputCenter']//input[@class='Rectangle-19']")
    private WebElement saveButton;
    @FindBy(xpath = ".//h2[@class='cabinetLabel']")
    private WebElement accountName;
    @FindBy(xpath = ".//h2[@class='cabinetLabel']")
    private WebElement textMessage;
    @FindBy(id = "OldPassword")
    private WebElement currentPasswordField;
    @FindBy(id = "NewPassword")
    private WebElement newPasswordField;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirnNewPasswordField;
    @FindBy(xpath = ".//button[@class='Rectangle-19']")
    private WebElement changePasswordButton;
    @FindBy(xpath = ".//p[@class='text-success']")
    private WebElement messageThatPasswordChanged;


    public AccountManagementPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void changeFirstName(String firstName) {
        actionsWithWebElements.inputText(firstNameField, firstName);
    }

    public void changeLastName(String lastName) {
        actionsWithWebElements.inputText(lastNameField, lastName);
    }

    public void clickSaveButton() {
        actionsWithWebElements.clickOnElemenet(saveButton);
    }

    public boolean checkTheName(String firstName, String lastName) {
        return actionsWithWebElements.ifMessageContainsTextElements(textMessage, firstName, lastName);
    }

    public void enterOldPassWord(String oldPassword) {
        actionsWithWebElements.inputText(currentPasswordField, oldPassword);
    }

    public void enterNewPassword(String newPassword) {
        actionsWithWebElements.inputText(newPasswordField, newPassword);
    }

    public void confirmNewPassword(String newPassword) {
        actionsWithWebElements.inputText(confirnNewPasswordField, newPassword);
    }

    public void clickChangePassword() {
        actionsWithWebElements.clickOnElemenet(changePasswordButton);
    }

    public boolean ifMessageAppeared() {
        return actionsWithWebElements.isElementDisplayed(messageThatPasswordChanged);
    }
}
