package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CatalogPage {
    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public CatalogPage() {
        methods = new Methods();
    }

    public void catalogSelect() {
        logger.info("Puan Kataloguna gidiliyor");
        methods.scrollWithAction(By.cssSelector(".lvl1catalog"));
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(1);

        logger.info("Türk klasikleri seçiliyor");
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".product-filter-header"));
        methods.click(By.cssSelector(".product-filter-header"));
        methods.scrollWithAction(By.cssSelector(".sort>:nth-of-type(1)"));

        logger.info("“Yüksek Oylama” seçimi yapılıyor");
        methods.click(By.cssSelector(".sort>:nth-of-type(1)"));
        methods.click(By.cssSelector(".sort>:nth-of-type(1)>:nth-of-type(6)"));

        logger.info("Tüm kitaplar seçimi yapılıyor");
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);

        logger.info("Hobi seçimi yapılıyor");
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
        methods.waitBySeconds(2);

        logger.info("Sayfadan random ürün seçimi yapılyor");
        methods.clickRandomProduct();
        methods.waitBySeconds(3);

    }
}
