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
    private WebElement someElement;


    public AccountManagementPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String changeFirstName(String firstName) {
        actionsWithWebElements.inputText(firstNameField, firstName);
        return firstName;
    }

    public String changeLastName(String lastName) {
        actionsWithWebElements.inputText(lastNameField, lastName);
        return lastName;
    }

    public void clickSaveButton() {
        actionsWithWebElements.clickOnElemenet(saveButton);
    }

    public boolean checkTheName(String firstName, String lastName) {
        final String greetings = someElement.getText();
        boolean isContainsFirsName = greetings.contains(firstName);
        boolean isContainsLastName = greetings.contains(lastName);
        return isContainsFirsName && isContainsLastName;
    }
}
