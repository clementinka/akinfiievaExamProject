package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LoginTest extends AbstractParentTest {
    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.enterLogin("clementine.letto@gmail.com");
        loginPage.enterPassword("17uipAeRw");
        loginPage.clickLogInButton();
        checkExpectedResult("Management system is not present", homePage.ifManagementSystemDisplayed());
    }
    @Test
    public void notValidLogin(){
        loginPage.openPage();
        loginPage.enterLogin("cleclementine.letto@gmail.com");
        loginPage.enterPassword("17uipAeRw");
        loginPage.clickLogInButton();
        checkExpectedResult("Logged in system with wrong credentials", homePage.areGreetingDisplayed());
    }
}
