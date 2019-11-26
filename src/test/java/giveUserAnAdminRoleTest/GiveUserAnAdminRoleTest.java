package giveUserAnAdminRoleTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {

    @Test
    public void giveUserAnAdminRole(){
        loginPage.openPage();
        loginPage.enterLogin(getAdminLogin());
        loginPage.enterPassword(getAdminPassword());
        loginPage.pressLogInButton();
        homePage.clickOnDefaultGroupButton();
        adminPage.clickOnUsersButton();
        usersPage.enterUserEmail(getUserValidLogin());
        usersPage.clickOnUser(getUserValidLogin());
       // existingUserPage.clickRolesButton();
    }
}
