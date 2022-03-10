package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.BasketPage;
import com.testinium.kitapyurdu.page.CatalogPage;
import com.testinium.kitapyurdu.page.LoginPage;
import com.testinium.kitapyurdu.page.ProductPage;
import org.junit.Test;

public class CatalogTest extends BaseTest {


    @Test
    public void BasketTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        loginPage.login();
        productPage.selectProduct();
        catalogPage.catalogSelect();

    }
}
