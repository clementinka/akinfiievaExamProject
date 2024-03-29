package abstractParentTest;

import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AdminDashboardPage adminDashboardPage;
    protected AccountManagementPage accountManagementPage;
    protected UsersPage usersPage;
    protected CreateUserPage createUserPage;
    protected NewUserPage newUserPage;
    protected RegisterPage registerPage;
    protected String validAdminLogin = "clementine.letto@gmail.com";
    protected String validAdminPassword = "17uipAeRw";
    protected final String newUserEmail = "testuser" + Utils.getDateFormated()+"@gmail.com";
    protected final String newRegisterUserEmail = "register.new.user.test2"+Utils.getDateFormated()+"@gmail.com";

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        adminDashboardPage = new AdminDashboardPage(webDriver);
        accountManagementPage = new AccountManagementPage(webDriver);
        usersPage = new UsersPage(webDriver);
        createUserPage = new CreateUserPage(webDriver);
        newUserPage = new NewUserPage(webDriver);
        registerPage = new RegisterPage(webDriver);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }
}
