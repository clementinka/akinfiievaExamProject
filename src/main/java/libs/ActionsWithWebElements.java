package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ActionsWithWebElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait_10, webDriverWait_20, webDriverWait_100;

    public ActionsWithWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, 10);
        webDriverWait_20 = new WebDriverWait(webDriver, 20);
        webDriverWait_100 = new WebDriverWait(webDriver, 100);
    }


    public void inputText(WebElement fieldForInput, String textForInput) {
        try {
            fieldForInput.clear();
            fieldForInput.sendKeys(textForInput);
            logger.info(textForInput + " was inputed");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public void inputText(WebElement fieldForInput, String textForInput, WebElement elementForVisibility) {
        try {
            webDriverWait_100.until(ExpectedConditions.elementToBeClickable(elementForVisibility));
            fieldForInput.clear();
            fieldForInput.sendKeys(textForInput);
            logger.info(textForInput + " was inputed");
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
            webDriverWait_100.until(ExpectedConditions.elementToBeClickable(elementForClick));
            elementForClick.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public void clickOnElemenetVisible(WebElement elementForClick, WebElement elementForVisibility) {
        try {
            webDriverWait_100.until(ExpectedConditions.elementToBeClickable(elementForVisibility));
            elementForClick.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }
    public void clickOnElemenetInvisible(WebElement elementForClick, WebElement elementForInvisibility) {
        try {
            webDriverWait_100.until(ExpectedConditions.invisibilityOf(elementForInvisibility));
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
            state = isContainsFirsElement && isContainsSecondElement;
            logger.info("If the message contains data -> " + state);
            return state;
        } catch (Exception e) {
            logger.info("Can't work with data or can't parse message");
            return false;
        }
    }

    public void switchToNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        //webDriver.close();
      //  webDriver.switchTo().window(tabs2.get(0));
    }

    public void switchToPreviousTab() {
        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(0));
    }

    public boolean isElementNotDisplayed(WebElement webElement) {
        try {
            boolean state = !(webElement.isDisplayed());
            logger.info("Is element displayed -> " + state);
            return state;
        } catch (Exception e) {
            logger.info("Is element displayed -> true");
            return true;

        }
    }
}
