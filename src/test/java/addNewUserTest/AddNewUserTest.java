package addNewUserTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AddNewUserTest extends AbstractParentTest {

    @Test
    public void inviteNewUser() {
        loginPage.logInSystemWithValidCredentials(adminLogin, adminPassword);
        homePage.clickOnManagementButton();
        adminDashboardPage.clickUsers();
        usersPage.clickAddNewUserButton();
        createUserPage.typeUserEmail(newUserEmail);
        createUserPage.clickSubmitButton();
        checkExpectedResult("Message haven't appeared", createUserPage.ifMessageAppeared());
        adminDashboardPage.clickUsers();
        checkExpectedResult("User haven't appeared in base", usersPage.ifNewUserAppeared(newUserEmail));
    }

    @Test
    public void confirmNewUser() {
        loginPage.logInSystemWithValidCredentials(adminLogin, adminPassword);
        homePage.clickOnManagementButton();
        adminDashboardPage.clickUsers();
        usersPage.enterNewUserEmail(newUserEmail);
        usersPage.clickSearchButton();
        usersPage.clickOnNewUser();
        newUserPage.clickConfirmEmail();
        checkExpectedResult("Can't confirm email",newUserPage.ifConfirmationButtonDisappeared());
    }
}
