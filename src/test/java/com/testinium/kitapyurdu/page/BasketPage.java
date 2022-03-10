package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BasketPage {

    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public BasketPage() {
        methods = new Methods();
    }

    public void basketAdd() {
        logger.info("Sepete ekleniyor");
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);

        logger.info("Favorilerim gidiliyor");
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);

        logger.info("Favori Listesinde yer alan, 3.ürün siliniyor");
        methods.click(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".heading"));
        methods.waitBySeconds(2);

        logger.info("Sepetime gidiliyor");
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);

        logger.info("Sepette ürün adedinde artırımı gerçekleştiriliyor");
        methods.sendKeys(By.cssSelector("input[name=quantity]"), "0");
        methods.waitBySeconds(10);

        logger.info("Ürün satın alınıyor");
        methods.click(By.cssSelector(".button.red"));
        methods.waitBySeconds(3);

    }
}
