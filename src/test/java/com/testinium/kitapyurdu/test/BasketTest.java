package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.*;
import org.junit.Test;

public class BasketTest extends BaseTest {

    @Test
    public void BasketTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        BasketPage basketPage = new BasketPage();
        loginPage.login();
        productPage.selectProduct();
        catalogPage.catalogSelect();
        basketPage.basketAdd();


    }
}
