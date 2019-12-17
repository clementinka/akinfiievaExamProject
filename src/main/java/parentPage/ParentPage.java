package parentPage;

import libs.ActionsWithWebElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    protected WebDriver webDriver;
    protected ActionsWithWebElements actionsWithWebElements;
    Logger logger = Logger.getLogger(getClass());
    public ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    String baseUrl;
    String expectedUrl;


    public ParentPage(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;
        baseUrl = configProperties.base_url();
        PageFactory.initElements(webDriver,this);
        actionsWithWebElements = new ActionsWithWebElements(webDriver);
        expectedUrl = baseUrl + partUrl;
    }
    public void checkCurrentUrl(){
        try{
        Assert.assertEquals("",expectedUrl,webDriver.getCurrentUrl());
        }catch(Exception e){
            logger.error("Can't find url "+e);
            Assert.fail("Can't find url "+e);
        }
    }

}
