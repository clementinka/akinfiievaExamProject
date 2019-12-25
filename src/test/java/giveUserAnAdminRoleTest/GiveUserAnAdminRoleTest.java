package giveUserAnAdminRoleTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {
    @Test
    public void giveUserAdminRole(){
        loginPage.fillLoginAndPassAndSubmit(validAdminLogin,validAdminPassword);
        homePage.clickOnManagementButton();
        adminDashboardPage.clickUsers();
        usersPage.enterNewUserEmail(newRegisterUserEmail);
        usersPage.clickSearchButton();
        usersPage.clickOnNewUser();
        newUserPage.clickRolesTab();
        newUserPage.clickAdminRoleSwitcher();
        newUserPage.clickSaveButton();
        checkExpectedResult("New settings weren't saved", usersPage.ifMessageAppeared());
        newUserPage.clickLogOutButton();
        loginPage.fillLoginAndPassAndSubmit(newRegisterUserEmail,"12345678");
        checkExpectedResult("The user is still not admin",homePage.ifManagementSystemDisplayed());
    }
}
