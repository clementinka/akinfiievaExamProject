package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RegisterPage extends ParentPage {
    @FindBy (xpath = ".//input[@id='Name']")
    private WebElement nameField;
    @FindBy (xpath = ".//input[@id='Surname']")
    private WebElement lastNameField;
    @FindBy (xpath = ".//input[@id='Email']")
    private WebElement userEmail;
    @FindBy (xpath = ".//input[@id='Password']")
    private WebElement userPassword;
    @FindBy (xpath=".//input[@id='ConfirmPassword']")
    private WebElement userConfirmationPassword;
    @FindBy (xpath = ".//main[@class='page']/div[@id='mainDiv']/h3")
    private WebElement item;
    @FindBy (xpath = ".//div[@class='centerChildInparent']//button[@class='Rectangle-19']")
    private WebElement signUpButton;


    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterNewUserName(String newUserName) {
        actionsWithOurElements.enterTextInToField(nameField, newUserName);
    }

    public void enterNewUserLastName(String newUserLastName) {
        actionsWithOurElements.enterTextInToField(lastNameField,newUserLastName);
    }

    public void enterNewUserEmail(String newUserEmail) {
        actionsWithOurElements.enterTextInToField(userEmail,newUserEmail);
    }

    public void enterNewUserPassword(String newUserPassword) {
        actionsWithOurElements.enterTextInToField(userPassword,newUserPassword);
    }

    public void confirmNewUserPassword(String confirmUserPassword) {
        actionsWithOurElements.enterTextInToField(userConfirmationPassword,confirmUserPassword);
    }

    public boolean isConfirmationMessageAppeared() {
        return actionsWithOurElements.checkIfItemDisplayed(item);
    }

    public void clickSignUpButton() {
        actionsWithOurElements.clickOnButton(signUpButton);
    }
}
