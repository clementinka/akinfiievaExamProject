package accountManagementTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AccountManagementTest extends AbstractParentTest {

    @Test
    public void changeNameTest() {
        String expectedFirstName = "Clementine";
        String expectedLastName = "Letto";
        loginPage.logInSystemWithValidCredentials(adminLogin, adminPassword);
        homePage.clickAccountManagement();
        accountManagementPage.changeFirstName(expectedFirstName);
        accountManagementPage.changeLastName(expectedLastName);
        accountManagementPage.clickSaveButton();
        checkExpectedResult("The name haven't changed", accountManagementPage.checkTheName(expectedFirstName, expectedLastName));

        //return to old name
        accountManagementPage.changeFirstName("Anastasiya");
        accountManagementPage.changeLastName("Akinfiieva");
        accountManagementPage.clickSaveButton();
    }

    @Test
    public void changePasswordTest() {
        String login = "clementine.letto@gmail.com";
        String oldPassword = "17uipAeRw";
        String newPassword = "17uipAeRw17uipAeRw";
        loginPage.logInSystemWithValidCredentials(login, oldPassword);
        homePage.checkCurrentUrl();
        homePage.clickAccountManagement();
        accountManagementPage.checkCurrentUrl();
        accountManagementPage.enterOldPassWord(oldPassword);
        accountManagementPage.enterNewPassword(newPassword);
        accountManagementPage.confirmNewPassword(newPassword);
        accountManagementPage.clickChangePassword();
        checkExpectedResult("Changes haven't saved",accountManagementPage.ifMessageAppeared());

        //return to old password:
        accountManagementPage.enterOldPassWord(newPassword);
        accountManagementPage.enterNewPassword(oldPassword);
        accountManagementPage.confirmNewPassword(oldPassword);
        accountManagementPage.clickChangePassword();
    }
}
