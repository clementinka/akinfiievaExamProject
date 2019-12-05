package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentPage.ParentPage;

public class UsersPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='e-filterdiv e-searchinputdiv']//input[@id='SyncGrid_searchbar']")
    private WebElement searchUserField;
    @FindBy(xpath = ".//a[@class='e-searchitem e-toolbaricons e-disabletool e-icon e-searchfind']")
    private WebElement searchButton;
    @FindBy(xpath = ".//li[@id='SyncGrid_EditItem']")
    private WebElement editButton;
    @FindBy(xpath = ".//div[@class='text-section popup-question1']")
    private WebElement popUpMessage;
    @FindBy(xpath = ".//div[@class='modal-content']//*[contains(text(),'OK')]")
    private WebElement okButton;

    WebDriverWait webDriverWait_40;

    @FindBy(xpath = ".//*[contains(text(),'HideezAdministrator')]")
    private WebElement adminRoleText;
    @FindBy(xpath = ".//*[contains(text(),'HideezUser')]")
    private WebElement userRoleText;


    public UsersPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait_40 = new WebDriverWait(webDriver, 40);
    }

    public void enterUserEmail(String userEmail) {
        actionsWithOurElements.enterTextInToField(searchUserField, userEmail);
        searchUserField.sendKeys(Keys.ENTER);
        webDriverWait_40.until(ExpectedConditions.visibilityOf(userRoleText));

    }

    public void clickOnUser(String neededUser) {
        WebElement newUser;
        webDriverWait_40.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//td[@class='e-rowcell e-gridtooltip e-gridellipsis' and contains(text(),'" + neededUser + "')]")));
        newUser = webDriver.findElement(By.xpath(".//td[@class='e-rowcell e-gridtooltip e-gridellipsis' and contains(text(),'" + neededUser + "')]"));
        newUser.click();
    }

    public void clickOkButton() {
        actionsWithOurElements.clickOnButton(okButton);
    }

    public boolean isUserBecameAdmin() {
        return actionsWithOurElements.checkIfItemDisplayed(adminRoleText);
    }

    public void enterUserEmaila(String userEmail) {
        actionsWithOurElements.enterTextInToField(searchUserField, userEmail);
        searchUserField.sendKeys(Keys.ENTER);
        webDriverWait_40.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(".//*[contains(text(),'"+userEmail+"')]"))));

    }
}
