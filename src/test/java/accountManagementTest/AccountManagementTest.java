package accountManagementTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AccountManagementTest extends AbstractParentTest {

    @Test
    public void changeNameTest() {
        String expectedFirstName = "Alice";
        String expectedLastName = "Letto";
        loginPage.logInSystemWithValidCredentials(adminLogin, adminPassword);
        homePage.clickAccountManagement();
        accountManagementPage.changeFirstName(expectedFirstName);
        accountManagementPage.changeLastName(expectedLastName);
        accountManagementPage.clickSaveButton();
        checkExpectedResult("The name haven't changed", accountManagementPage.checkTheName(expectedFirstName, expectedLastName));
    }

    @Test
    public void changePasswordTest() {
        String login = "clementine.letto@gmail.com";
        String oldPassword = "18iopSrE";
        String newPassword = "17uipAeRw";
        loginPage.logInSystemWithValidCredentials(login, oldPassword);
        homePage.checkCurrentUrl();
        homePage.clickAccountManagement();
        accountManagementPage.checkCurrentUrl();
        accountManagementPage.enterOldPassWord(oldPassword);
        accountManagementPage.enterNewPassword(newPassword);
        accountManagementPage.confirmNewPassword(newPassword);
        accountManagementPage.clickChangePassword();
        checkExpectedResult("Changes haven't saved",accountManagementPage.ifMessageAppeared());
    }
}
