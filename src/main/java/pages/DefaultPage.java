package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefaultPage extends  BasePage {

    public DefaultPage(WebDriver driver){
        super(driver);
    }

    //Elements.
    @FindBy(xpath = "//img[contains(@alt, 'Default Test Classic T-Shirt tile')]")
    WebElement classicT;

    @FindBy(xpath = "//div[contains(text(), 'M') and contains(@class, 'br ta-center fs-md cursor-pointer py-p75 bc-grey-400 bw-1')]")
    WebElement mSize;

    @FindBy(xpath = "//div[@class='flex-grow truncate fw-bold ta-right' and contains(text(), '1')]")
    WebElement selectQty;

    @FindBy(xpath = "//div[@class='minw-8' and contains(text(), '2')]")
    WebElement twoOpt;

    @FindBy(xpath = "//button[contains(@class, 'd-ib br fw-bold select-none')]")
    WebElement buyBtn;

    public void selectTshirt(){

        //Select classic model
        clickOnElement(classicT);

        //Select size
        clickOnElement(mSize);

        //Click select.
        clickOnElement(selectQty);

        //Select two
        clickOnElement(twoOpt);

        //Click buy button.
        clickOnElement(buyBtn);
    }


}
