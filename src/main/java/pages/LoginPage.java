package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;


public class LoginPage extends ParentPage {
    @FindBy(xpath = ".//input[@id='UserName']")
    private WebElement inputLogin;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(xpath = ".//button[@class='Rectangle-19 col-xs-5']")
    private WebElement logInButton;
    @FindBy(xpath = ".//div[3]/a[@class='register-btn col-xs-5 col-xs-offset-2']")
    private WebElement registrationButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "Account/Login/?ReturnUrl=%2F");
    }

    public void openPage() {
        String url = "http://my.hideez.com";
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("Can't work with browser");
        }
    }

    public void enterLogin(String login) {
        actionsWithWebElements.inputText(inputLogin, login);
    }

    public void enterPassword(String password) {
        actionsWithWebElements.inputText(inputPassword, password);
    }

    public void clickLogInButton() {
        actionsWithWebElements.clickOnElemenet(logInButton);
    }

    public void fillLoginAndPassAndSubmit(String login, String password) {
        openPage();
        enterLogin(login);
        enterPassword(password);
        clickLogInButton();
    }

    public void clickRegisterUser() {
        actionsWithWebElements.clickOnElemenet(registrationButton);
    }
}
