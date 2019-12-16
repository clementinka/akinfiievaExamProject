package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LoginTest extends AbstractParentTest {
    @Test
    public void ValidLogin() {
        loginPage.openPage();
        loginPage.enterLogin("clementine.letto@gmail.com");
        loginPage.enterPassword("17uipAeRw");
        loginPage.clickLogInButton();
        checkExpectedResult("Management system is not present", homePage.ifManagementSystemDisplayed());
    }
}
