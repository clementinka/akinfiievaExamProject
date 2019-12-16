package parentPage;

import libs.ActionsWithWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    protected WebDriver webDriver;
    protected ActionsWithWebElements actionsWithWebElements;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
        actionsWithWebElements = new ActionsWithWebElements(webDriver);
    }


}
