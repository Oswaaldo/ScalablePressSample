package tests;

import org.testng.annotations.Test;
import pages.DefaultPage;

public class AddToCarTest extends BaseTest {

    @Test
    public void addToCartTest(){
        System.out.println("working");

        DefaultPage defaultPage = new DefaultPage(driver);
        defaultPage.selectTshirt();

    }
}
