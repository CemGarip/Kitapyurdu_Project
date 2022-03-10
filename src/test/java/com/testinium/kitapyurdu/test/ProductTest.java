package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.LoginPage;
import com.testinium.kitapyurdu.page.ProductPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class ProductTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(ProductPage.class);
    @Test
    public void productTest() {

       LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();
    }
}


