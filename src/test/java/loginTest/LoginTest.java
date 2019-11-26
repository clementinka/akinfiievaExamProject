package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LoginTest extends AbstractParentTest {

    @Test
    public void ValidLogin(){
        loginPage.openPage();
        loginPage.enterLogin(getUserLogin());
        loginPage.enterPassword(getUserPassword());
        loginPage.pressLogInButton();

        checkExpectedResult("Greetings are not displayed", homePage.areGreetingsDisplayed());
    }
}
