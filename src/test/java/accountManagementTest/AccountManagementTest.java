package accountManagementTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AccountManagementTest extends AbstractParentTest {

    @Test
    public void changeNameTest(){
        String expectedFirstName = "Alice";
        String expectedLastName = "Letto";
        loginPage.logInSystemWithValidCredentials("clementine.letto@gmail.com","17uipAeRw");
        homePage.clickAccountManagement();
        accountManagementPage.changeFirstName(expectedFirstName);
        accountManagementPage.changeLastName(expectedLastName);
        accountManagementPage.clickSaveButton();
        boolean isCorrectName = accountManagementPage.checkTheName(expectedFirstName, expectedLastName);
        System.out.println(isCorrectName);
    }



    @Test
    public void changePasswordTest(){

    }
}
