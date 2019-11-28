package giveUserAnAdminRoleTest;
import abstractParentTest.AbstractParentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {
    WebDriver webDriver;


    @Test
    public void giveUserAnAdminRole() {

        loginPage.openPage();
        loginPage.enterLogin(getAdminLogin());
        loginPage.enterPassword(getAdminPassword());
        loginPage.pressLogInButton();
        homePage.clickOnDefaultGroupButton();
        adminPage.clickOnUsersButton();
        usersPage.enterUserEmail(getUserValidLogin());
        usersPage.clickOnUser(getUserValidLogin());
        existingUserPage.handleCurrentTab();
        existingUserPage.clickRolesTab();
        existingUserPage.checkAsAdmin();
        usersPage.clickOkButton();

    }
}
