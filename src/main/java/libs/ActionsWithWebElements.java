package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsWithWebElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void inputText(WebElement fieldForInput, String textForInput) {
        try {
            fieldForInput.clear();
            fieldForInput.sendKeys(textForInput);
            logger.info(textForInput + "was inputed");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    private void stopTestAndPrintMessage() {
        logger.error("Can't work with element");
        Assert.fail("Can't work with element");
    }

    public void clickOnElemenet(WebElement elementForClick) {
        try {
            elementForClick.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public boolean isElementDisplayed(WebElement elementToFind) {
        try {
            boolean state = elementToFind.isDisplayed();
            logger.info("Is element displayed -> " + state);
            return state;
        } catch (Exception e) {
            logger.info("Is element displayed -> false");
            return false;

        }
    }

    public boolean ifPageLoaded(String url) {
        try {
            String currentUrl = webDriver.getCurrentUrl();
            logger.info(currentUrl);
            if (currentUrl.equals(url)) {
                logger.info("Page loaded");
                return true;
            } else {
                logger.info(" Page wasn't loaded");
                return false;
            }

        } catch (Exception e) {
            logger.error("Can't get current url");
            return false;
        }
    }

    public boolean ifMessageContainsTextElements(WebElement message, String firstElement, String secondElement) {
        try {
            final String greetings = message.getText();
            boolean isContainsFirsElement = greetings.contains(firstElement);
            boolean isContainsSecondElement = greetings.contains(secondElement);
            boolean state;
            state =  isContainsFirsElement && isContainsSecondElement;
            logger.info("If the message contains data -> " + state);
            return state;
        } catch (Exception e) {
            logger.info("Can't work with data or can't parse message");
            return false;
        }
    }

}
