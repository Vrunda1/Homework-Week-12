package hotdeals;

import com.google.common.base.Verify;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class HotDealsTest extends Utility {
	String baseUrl = "https://mobile.x-cart.com/";
	@Before
	public void openBrowser(){
		openBrowser(baseUrl);
	}
	@Test
	public void verifySaleProductsArrangeAlphabetically(){
		// Mouse hover on the “Hot deals” link
		mouseHoverToElement(By.xpath("//ul[@class='mm-listview']//span[@class='primary-title']"));
		//1.2 Mouse hover on the “Sale”  link and click
		mouseHoverToElement(By.xpath(("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']")));
		clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
		//1.3 Verify the text “Sale”
		mouseHoverToElement(By.xpath("//span[contains(text(),'Sales')]"));
		verifyText("Sale", By.xpath("//h1[contains(text(),'Sale')]"), "Error, Message not displayed as expected");
//		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
//		1.5 Verify that the product arrange alphabetically
		verifyText("Name A-Z",By.xpath("//span[contains(text(),'Name A - Z')]"), "Error, Message not displayed as expected");

	}
	@Test
	public void  verifySaleProductsPriceArrangeLowToHigh(){
//		2.1 Mouse hover on the “Hot deals” link
		mouseHoverToElement(By.xpath("//ul[@class='mm-listview']//span[@class='primary-title']"));
//		2.2 Mouse hover on the “Sale”  link and click
		mouseHoverToElement(By.xpath(("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']")));
		clickOnElement(By.xpath("//h1[contains(text(),'Sale')]"));
//		2.3 Verify the text “Sale”
		verifyText("Sale", By.xpath("//h1[contains(text(),'Sale')]"), "Error, Message not displayed as expected");
		//		2.4 Mouse hover on “Sort By” and select “Price Low-High”
		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
		mouseHoverToElement(By.xpath("//span[@class='sort-by-value']"));
		//2.5 Verify that the product’s price arrange Low to High
		verifyText("Price Low - High",By.xpath("//span[contains(text(),'Price Low - High')]"),"Error, Message not displayed as expected");
//
	}
	@Test
	public void verifySaleProductsArrangeByRates(){
//		3.1 Mouse hover on the “Hot deals” link
		mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title' and text()='Hot deals']"));
//		3.2 Mouse hover on the “Sale”  link and click
		mouseHoverToElement(By.xpath(("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']")));
//		3.3 Verify the text “Sale”
		verifyText("Sale", By.xpath("//h1[contains(text(),'Sale')]"), "Error, Message not displayed as expected");
//		3.4 Mouse hover on “Sort By” and select “Rates”
		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
		clickOnElement(By.xpath("//a[contains(text(),'Rates')"));
//		3.5 Verify that the product’s arrange Rates
		verifyText("Rates",By.xpath(("//span[contains(text(),'Rates')]")),"Error Message not displayed as expected");

	}
	@Test
	public void verifyBestSellersProductsArrangeByZToA(){
//		1.1 Mouse hover on the “Hot deals” link
		mouseHoverToElement(By.xpath("//ul[@class='mm-listview']//span[@class='primary-title']"));
//		1.2 Mouse hover on the “Bestsellers”  link and click
		mouseHoverToElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
		clickOnElement(By.xpath(("//span[contains(text(),'Bestsellers')])[2]")));
//		1.3 Verify the text “Bestsellers”
		verifyText("Bestsellers",By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"),"Error Message not displayed as expected");
//		1.4 Mouse hover on “Sort By” and select “Name Z-A”
		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
		clickOnElement(By.xpath(("//a[contains(text(),'Name Z - A')]")));
//		1.5 Verify that the product arrange by Z to A
		verifyText("Name Z - A", By.xpath("//span[contains(text(),'Name Z - A')]"), "Error Message not displayed as expected");

	}
	@Test
	public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
//		5.1 Mouse hover on the “Hot deals” link
		mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title' and text()='Hot deals']"));
		Thread.sleep(2000);
//		2.2 Mouse hover on the “Bestsellers” link and click
		mouseHoverToElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
		Thread.sleep(2000);
		clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//		2.3 Verify the text “Bestsellers”
		 verifyText("Bestsellers", By.xpath("//h1[contains(text(),'Bestsellers')]"), "Not in a right Page");
//		2.4 Mouse hover on “Sort By” and select “Price High-Low”
		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
		Thread.sleep(2000);
//		2.5 Verify that the product’s price arrange High to Low
		verifyText("Price High - Low", By.xpath("//span[contains(text(),'Price High - Low')]"), "Error message not displayed as expected");

	}
	@Test
	public void verifyBestSellersProductsArrangeByRates() {
//		3.1 Mouse hover on the “Hot deals”link
		mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
//		3.2 Mouse hover on the “Bestsellers”link and click
		mouseHoverToElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
		clickOnElement(By.xpath(("(//span[contains(text(),'Bestsellers')])[2]")));
//		3.3 Verify the text “Bestsellers”
		verifyText("Bestsellers", By.xpath("//h1[contains(text(),'Bestsellers')]"), "Error, Message not displayed as expected");
//		3.4 Mouse hover on “Sort By”and select “Rates”

		mouseHoverToElement(By.xpath("//span[@class='sort-by-label']"));
		mouseHoverToElement(By.xpath("//a[contains(text(),'Rates')]"));
//		3.5 Verify that the product’s arrange Rates
		verifyText("Rates", By.xpath("//span[contains(text(),'Rates')]"), "Error, Message not displayed as expected");

	}





















}
