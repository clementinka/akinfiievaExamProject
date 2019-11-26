package registerTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class RegisterNewUserTest extends AbstractParentTest {
    @Test
    public void RegisterWithValidEmail() {
        loginPage.openPage();
        loginPage.clickOnRegisterButton();
        registerPage.enterNewUserName("test");
        registerPage.enterNewUserLastName("test");
        registerPage.enterNewUserEmail(getUserLogin());
        registerPage.enterNewUserPassword(getUserPassword());
        registerPage.confirmNewUserPassword(getUserPassword());
        registerPage.clickSignUpButton();
        checkExpectedResult("Confirmation message haven't appeared", registerPage.isConfirmationMessageAppeared());
    }
}
