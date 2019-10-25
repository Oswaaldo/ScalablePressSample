package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    //Wait visibility.
    public void waitVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Click on element.
    public void clickOnElement(WebElement element){
        waitVisibility(element);
        element.click();
    }

    //Send keys.
    public void sendKeys(WebElement element, String text){
        waitVisibility(element);
        element.clear();
        element.sendKeys(text);
    }
}
