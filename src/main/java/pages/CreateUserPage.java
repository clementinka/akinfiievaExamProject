package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateUserPage extends ParentPage {
    @FindBy(xpath = ".//textarea[@class='form-control createuserInputs']")
    private WebElement newUserEmailField;
    @FindBy(xpath = ".//input[@class='Rectangle-19']")
    private WebElement addNewUserButton;
    @FindBy (xpath = ".//div[@class='GrayColor'][1]")
    private WebElement newUserMessage;

    public CreateUserPage(WebDriver webDriver) {
        super(webDriver,"Users/Create");
    }

    public void typeUserEmail(String newUserEmail) {
        actionsWithWebElements.inputText(newUserEmailField,newUserEmail);
    }

    public void clickSubmitButton() {
        actionsWithWebElements.clickOnElemenet(addNewUserButton);
    }

    public boolean ifMessageAppeared() {
        return actionsWithWebElements.isElementDisplayed(newUserMessage);
    }
}
