package registerNewUserTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class RegisterNewUserTest extends AbstractParentTest {

    @Test
    public void registerNewValidUser() {
        loginPage.openPage();
        loginPage.clickRegisterUser();
        registerPage.inputFirstName("Earl");
        registerPage.inputLastName("Grey");
        registerPage.inputEmail(newRegisterUserEmail);
        registerPage.inputPassword("12345678");
        registerPage.confirmPassword("12345678");
        registerPage.clickSubmitButton();
        checkExpectedResult("Button submit doesn't work",registerPage.ifMessageAppeared());
    }
}
