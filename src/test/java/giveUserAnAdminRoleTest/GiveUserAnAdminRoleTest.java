package giveUserAnAdminRoleTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {

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
        usersPage.enterUserEmaila(getUserValidLogin());
        checkExpectedResult("User is still not an administrator", usersPage.isUserBecameAdmin());
    }
}
