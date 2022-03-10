package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;



public class CreditPage {
    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public CreditPage() {
        methods = new Methods();
    }

    public void AddCart(){

        logger.info("Yeni adres bilgileri kaydediliyor");
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));
        methods.click(By.id("address-firstname-companyname"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-firstname-companyname"), "Cem");
        methods.waitBySeconds(1);
        methods.click(By.id("address-lastname-title"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-lastname-title"), "Garip");
        methods.waitBySeconds(1);
        methods.click(By.id("address-zone-id"));
        methods.waitBySeconds(1);
        methods.selectByText(By.id("address-zone-id"), "İstanbul");
        methods.waitBySeconds(1);
        methods.click(By.id("address-county-id"));
        methods.waitBySeconds(1);
        methods.selectByText(By.id("address-county-id"), "AVCILAR");
        methods.waitBySeconds(1);
        methods.click(By.id("address-address-text"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-address-text"), "cem mahallesi garip caddesi");
        methods.waitBySeconds(1);
        methods.click(By.id("address-telephone"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-telephone"), "5549969696");
        methods.waitBySeconds(1);
        methods.click(By.id("address-mobile-telephone"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-mobile-telephone"), "5434444444");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);

        logger.info("Bakiyesiz kart ile ürün alımı gerçekleştiriliyor");
        methods.click(By.id("credit-card-owner"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-owner"), "ibrahim cem garip");
        methods.waitBySeconds(1);
        methods.click(By.id("credit_card_number_1"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_1"), "1111111111111111");
        methods.waitBySeconds(1);
        methods.click(By.id("credit-card-expire-date-month"));
        methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-month"), "01");
        methods.waitBySeconds(1);
        methods.click(By.id("credit-card-expire-date-year"));
        methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-year"), "2033");
        methods.waitBySeconds(1);
        methods.click(By.id("credit-card-security-code"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-security-code"), "287");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);
        methods.waitBySeconds(1);

        logger.info("Hata mesajı alındığı görülüyor");
        String errorMessage = methods.getText(By.cssSelector("#form-credit-card > div.credit-card-form-content > table > tbody > tr:nth-child(5) > td > span"));
        if (errorMessage != null) {
            System.out.println(errorMessage);
            methods.click(By.cssSelector("#logo > a > img"));
        }

        logger.info("Logout olunuyor");
        methods.click(By.cssSelector("#header-top>.container_12>.welcome.fl>.menu.top.login"));
        methods.scrollWithAction1(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
        methods.clickJS(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));
    }
    }

