package Homepage;

import com.google.common.base.Verify;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenu extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        // Click on the “Shipping” link
        clickOnElement(By.xpath("(//span[contains(text(),'Shipping')])[2]"));
        //Verify the text “Shipping
        verifyText("Shipping", By.xpath("//h1[contains(text(),'Shipping')]"), "Error Message not displayed as expected");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //2.1 Click on the “New!” link
        clickOnElement(By.xpath("(//span[contains(text(),'New!')])[2]"));
        //		2.2 Verify the text “New arrivals
        verifyText("New arrivals", By.xpath("//h1[contains(text(),'New arrivals')]"), "Error, Message not displayed as expected");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        // 3.1 Click on the “Coming soon”link
        clickOnElement(By.xpath("(//span[contains(text(),'Coming soon')])[2]"));
        // Verify the text “Coming soon”
        verifyText("Coming soon", By.xpath("//h1[contains(text(),'Coming soon')]"), "Error, Message not displayed as expected");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        // Click on the “Contact us” link
        clickOnElement(By.xpath("(//span[contains(text(),'Contact us')])[2]"));
        // 4.2 Verify the text “Contact us
        verifyText("Contact us", By.xpath("//h1[contains(text(),'Contact us')]"), "Error, Message not displayed as expected");
    }
}



