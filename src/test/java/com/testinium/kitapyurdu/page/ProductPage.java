package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {

        logger.info("Ürün aratılıyor");
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        List<WebElement> products = methods.findElements(By.cssSelector(".product-details"));
        WebElement el = products.get(7);

        logger.info("Sayfada yer alan 7.ürüne scroll yapılıyor");
        methods.scrollWithAction(el);

        logger.info("4 ürün favorilerime ekleniyor");
        methods.addFavorites();

        methods.scrollWithAction(By.cssSelector(".js-ajaxCt.js-bookCt"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(3);

        logger.info("Favorilere eklenmiş olması kontrolu yapılıyor");
        String sonuc1 = methods.findElement(By.cssSelector(".limit")).getText();
        Assert.assertTrue(sonuc1.contains("Göster"));

        logger.info("Anasayfaya geri dönülüyor");
        methods.scrollWithAction(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.waitBySeconds(1);




    }
    }
