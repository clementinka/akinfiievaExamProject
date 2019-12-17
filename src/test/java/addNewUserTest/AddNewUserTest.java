package addNewUserTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddNewUserTest extends AbstractParentTest {
    private final String newUserEmail = "testuser" + Utils.getDateAndTimeFormated()+"@gmail.com";
    WebDriver webDriver;

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

    }
}
