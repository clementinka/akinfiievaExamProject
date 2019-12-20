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
        checkExpectedResult("New settings weren't saved", usersPage.ifMessageAppeared());
    }
    @Test
    public void enterWithNewAdminCredentials(){
        loginPage.logInSystemWithValidCredentials(newRegisterUserEmail,"12345678");
        checkExpectedResult("The user is still not admin",homePage.ifManagementSystemDisplayed());

    }
}
