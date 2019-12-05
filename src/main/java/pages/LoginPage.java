package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    @FindBy(xpath = ".//input[@id='UserName']")
    private WebElement loginField;
    @FindBy(xpath = ".//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = ".//div[@id='mainFormLogin']//div[3]//button[@class='Rectangle-19 col-xs-5']")
    private WebElement button;
    @FindBy(xpath = ".//a[@class='register-btn col-xs-5 col-xs-offset-2']")
    private WebElement registerNewUserButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterLogin(String login) {
        actionsWithOurElements.enterTextInToField(loginField, login);
    }

    public void openPage() {
        try {
            webDriver.get("https://my.hideez.com/Account/Login/?ReturnUrl=%2F");
        } catch (Exception e) {
            Assert.fail("Can't work with browser");
        }
    }

    public void enterPassword(String password) {
        actionsWithOurElements.enterTextInToField(passwordField, password);
    }

    public void pressLogInButton() {
        actionsWithOurElements.clickOnButton(button);
    }

    public void clickOnRegisterButton() {
        actionsWithOurElements.clickOnButton(registerNewUserButton);
    }
}

