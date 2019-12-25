package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RegisterPage extends ParentPage {
    @FindBy(xpath = ".//div[@class='form-group'][1]/div/input[@id='Name']")
    private WebElement firstNameField;
    @FindBy(xpath = ".//div[1]/form[@class='form-horizontal']")
    private WebElement registeringFormVisible;
    @FindBy (xpath = ".//input[@id='Surname']")
    private WebElement lastNameField;
    @FindBy (xpath = ".//input[@id='Email']")
    private WebElement userEmailField;
    @FindBy(xpath = ".//input[@id='Password']")
    private WebElement passwordField;
    @FindBy(xpath = ".//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordField;
    @FindBy(xpath = ".//button[@class='Rectangle-19']")
    private WebElement submitButton;
    @FindBy(xpath = ".//body/main[@class='page']/div[@id='mainDiv']/h3")
    private WebElement message;
    @FindBy(xpath = ".//li[@class='has-children account']//a")
    private WebElement accountName;
    @FindBy(xpath = ".//button[@class='logOff']")
    private WebElement logOutButton;

    public RegisterPage(WebDriver webDriver) {
        super(webDriver, "Account/Register?returnurl=%2F");
    }

    public void inputFirstName(String firstName) {
        actionsWithWebElements.inputText(firstNameField,firstName,registeringFormVisible);
    }

    public void inputLastName(String lastName) {
        actionsWithWebElements.inputText(lastNameField,lastName);
    }

    public void inputEmail(String newRegisterUserEmail) {
        actionsWithWebElements.inputText(userEmailField,newRegisterUserEmail);
    }

    public void inputPassword(String password) {
        actionsWithWebElements.inputText(passwordField,password);
    }

    public void confirmPassword(String password) {
        actionsWithWebElements.inputText(confirmPasswordField,password);
    }

    public void clickSubmitButton() {
        actionsWithWebElements.clickOnElemenet(submitButton);
    }

    public boolean ifMessageAppeared() {
        return actionsWithWebElements.isElementDisplayed(message);
    }
    public void clickLogOutButton() {
        actionsWithWebElements.clickOnElemenet(accountName);
        actionsWithWebElements.clickOnElemenet(logOutButton);
    }
}
