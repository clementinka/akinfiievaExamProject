package giveUserAnAdminRoleTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class GiveUserAnAdminRoleTest extends AbstractParentTest {
    @Test
    public void registerNewUser(){
        loginPage.logInSystemWithValidCredentials("clementine.letto@gmail.com","17uipAeRw");
        homePage.checkIfManagementPanelDisplayed();
        homePage.clickOnManagementButton();
        dashboardPage.checkIfDashboardPageOpened();
    }
}
