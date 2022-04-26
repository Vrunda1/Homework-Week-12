package utilities;

import Homepage.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    // This method will click on element
    public void clickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }
    // This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    // This method will send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // This method will select value from drop down menu
    public void selectByValueFromDropdown(By by,String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }

    // This method will verify text displayed on web page
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, actualMessage);
    }
    //This method will mouse hover on element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }
    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        String textOnAlert = alert.getText();
        System.out.println(textOnAlert);
        return textOnAlert;
    }
    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    //This method will remove alert
    public String alertText(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        return alert.getText();
    }
    public void alertHandle(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        alert.accept();
    }
    }














