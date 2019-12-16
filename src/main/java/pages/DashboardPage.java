package pages;

import org.openqa.selenium.WebDriver;
import parentPage.ParentPage;

public class DashboardPage extends ParentPage {
    public DashboardPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void checkIfDashboardPageOpened() {
        actionsWithWebElements.ifPageLoaded("https://my.hideez.com/Dashboard");
    }
}
