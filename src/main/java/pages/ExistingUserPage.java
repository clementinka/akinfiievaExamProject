package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ExistingUserPage extends ParentPage {
    @FindBy (xpath = ".//*[contains(text(),'Roles')]")
    private WebElement rolesButton;

    public ExistingUserPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickRolesButton() {
        webDriver.findElement(By.xpath(".//*[contains(text(), 'Roles')]")).click();
    }
}
