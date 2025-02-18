package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForExpectedUrlDisplay(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public void waitForSeconds(int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(d -> false);
    }
    public void waitForVisibilityOfElementLocated (By element){
    wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public void enterText(WebElement element, String text) {
        waitForElementVisibility(element);
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getTextFromElement(WebElement element){
        return element.getText();
    }
}
