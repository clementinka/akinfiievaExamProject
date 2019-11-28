package abstractParentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected AdminPage adminPage;
    protected UsersPage usersPage;
    protected ExistingUserPage existingUserPage;

    private String userValidLogin = "test@testtt.tt.12";
    private String userValidPassword = "10101010";
    private String adminLogin = "clementine.letto@gmail.com";
    private String adminPassword = "17uipAeRw";

    public String getUserValidLogin() {
        return userValidLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userValidLogin = userLogin;
    }

    public String getUserValidPassword() {
        return userValidPassword;
    }

    public String getAdminLogin() {
        return adminLogin;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        registerPage = new RegisterPage(webDriver);
        adminPage = new AdminPage(webDriver);
        usersPage = new UsersPage(webDriver);
        existingUserPage = new ExistingUserPage(webDriver);


    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);

    }
}
