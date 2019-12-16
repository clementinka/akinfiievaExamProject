package accountManagementTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class AccountManagementTest extends AbstractParentTest {

    @Test
    public void changeNameTest() {
        String expectedFirstName = "Alice";
        String expectedLastName = "Letto";
        loginPage.logInSystemWithValidCredentials("clementine.letto@gmail.com", "17uipAeRw");
        homePage.clickAccountManagement();
        accountManagementPage.changeFirstName(expectedFirstName);
        accountManagementPage.changeLastName(expectedLastName);
        accountManagementPage.clickSaveButton();
        checkExpectedResult("The name haven't changed", accountManagementPage.checkTheName(expectedFirstName, expectedLastName));
    }

    @Test
    public void changePasswordTest() {
        String login = "clementine.letto@gmail.com";
        String oldPassword = "17uipAeRw";
        String newPassword = "18iopSrE";
        loginPage.logInSystemWithValidCredentials(login, oldPassword);
        homePage.clickAccountManagement();
        accountManagementPage.enterOldPassWord(oldPassword);
        accountManagementPage.enterNewPassword(newPassword);
        accountManagementPage.confirmNewPassword(newPassword);
        accountManagementPage.clickChangePassword();
        checkExpectedResult("Changes haven't saved",accountManagementPage.ifMessageAppeared());


    }
}
