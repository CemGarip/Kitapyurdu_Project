package com.testinium.kitapyurdu.methods;

import com.testinium.kitapyurdu.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    Logger logger = LogManager.getLogger(Methods.class);
    JavascriptExecutor jsdriver;

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(300)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;

    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by) {

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }


    public void scrollWithAction(WebElement el) {
        Actions actions = new Actions(driver);
        actions.moveToElement(el).build().perform();
    }

    public void addFavorites() {
        List<WebElement> products = findElements(By.cssSelector(".add-to-favorites"));
        for (int i = 2; i <= 5; i++) {
            WebElement element = products.get(i);
            scrollWithAction(element);
            products.get(i).click();
            waitBySeconds(1);
        }
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {
        getSelect(by).selectByVisibleText(text);
    }


    public String getText(By by) {
        return findElement(by).getText();
    }


    public  void scrollWithAction1(By by){

        Actions actions =new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void clickJS(By by){
        jsdriver.executeScript("arguments[0].click();",findElement(by));
    }

    public void clickRandomProduct(){
        Random rnd = new Random();
        List<WebElement> Products = findElements(By.cssSelector(".cover"));
        WebElement rndProduct = Products.get(rnd.nextInt(Products.size()));
        rndProduct.click();
        logger.info("Rastgele ürün");
    }


}



