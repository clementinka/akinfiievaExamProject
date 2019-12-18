package giveUserAnAdminRoleTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {
    @Test
    public void giveUserAdminRole(){
        loginPage.logInSystemWithValidCredentials(adminLogin,adminPassword);
        homePage.clickOnManagementButton();
        adminDashboardPage.clickUsers();
        usersPage.enterNewUserEmail(newRegisterUserEmail);
        usersPage.clickSearchButton();
        usersPage.clickOnNewUser();
        newUserPage.clickRolesTab();
        newUserPage.clickAdminRoleSwitcher();
        newUserPage.clickSaveButton();

    }
}
