package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UsersPage extends ParentPage {
    @FindBy(xpath = ".//div[@class='content']//div[@id='SyncGrid']//div[@id='SyncGrid_toolbarItems']//ul[@class='e-ul e-horizontal'][2]//li[@id='SyncGrid_AddItem']")
    private WebElement addNewUserButton;
    @FindBy(xpath = ".//td[@class='e-rowcell e-gridtooltip e-gridellipsis'][1]")
    private WebElement elementVisible;
    @FindBy(xpath = ".//div[@class='e-filterdiv e-searchinputdiv']//input[@id='SyncGrid_searchbar']")
    private WebElement fieldFoeSearch;
    @FindBy(xpath = ".//a[@class='e-searchitem e-toolbaricons e-disabletool e-icon e-searchfind']")
    private WebElement searchButton;
    @FindBy(xpath = ".//td[@class='e-rowcell e-gridtooltip e-gridellipsis e-lastrowcell'][1]")
    private WebElement newUser;
    @FindBy(xpath = ".//a[@class='e-link e-numericitem e-spacing e-default'][2]")
    private WebElement elementInvisible;
    @FindBy(xpath = ".//td[@class='e-rowcell e-templatecell e-selectionbackground e-active'][1]//i[@class='fa fa-check']")
    private WebElement confirmedEmail;
    @FindBy (xpath = ".//div[@class='popup-controll']//div[@class='close1']//a[@id='close_window']")
    private WebElement message;

    public UsersPage(WebDriver webDriver) {
        super(webDriver, "Users");
    }

    public void clickAddNewUserButton() {
        actionsWithWebElements.clickOnElemenetVisible(addNewUserButton, elementVisible);
    }

    public boolean ifNewUserAppeared(String newUserEmail) {
        return actionsWithWebElements.isElementDisplayed(".//*[contains(text(),'" + newUserEmail + "')]");
    }

    public void enterNewUserEmail(String newUserEmail) {
        actionsWithWebElements.inputText(fieldFoeSearch,newUserEmail,elementVisible);
    }

    public void clickSearchButton() {
        actionsWithWebElements.clickOnElemenetVisible(searchButton,elementVisible);
    }

    public void clickOnNewUser() {
        actionsWithWebElements.clickOnElemenetInvisible(newUser, elementInvisible);
        actionsWithWebElements.switchToNewTab();
    }

    public boolean ifUserEmailConfirmed() {
       return actionsWithWebElements.isElementDisplayed(confirmedEmail);
    }


    public boolean ifMessageAppeared() {
        return actionsWithWebElements.isElementDisplayed(message);
    }


}
