package addNewUserTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.junit.Test;

public class AddNewUserTest extends AbstractParentTest {
    private final String newUserEmail = "testuser@gmail.com"+ Utils.getDateAndTimeFormated();
    @Test
    public void inviteNewUser(){
        loginPage.logInSystemWithValidCredentials(adminLogin,adminPassword);
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
    public void confirmNewUser(){

    }
}
