package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class UsersPage extends ParentPage {
    @FindBy(xpath = ".//div[@class='e-filterdiv e-searchinputdiv']//input[@id='SyncGrid_searchbar']")
    private WebElement searchUserField;
    @FindBy (xpath = ".//a[@class='e-searchitem e-toolbaricons e-disabletool e-icon e-searchfind']")
    private WebElement searchButton;
    @FindBy (xpath = ".//li[@id='SyncGrid_EditItem']")
    private WebElement editButton;

    public UsersPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterUserEmail(String userEmail) {
        actionsWithOurElements.enterTextInToField(searchUserField, userEmail);
        searchUserField.sendKeys(Keys.ENTER);
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void clickOnUser(String neededUser) {
        WebElement newUser;
        newUser = webDriver.findElement(By.xpath(".//td[@class='e-rowcell e-gridtooltip e-gridellipsis' and contains(text(),'" + neededUser + "')]"));
        newUser.click();
    }
}
