package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.*;
import org.junit.Test;

public class CreditTest extends BaseTest {

    @Test
    public void CreditTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        BasketPage basketPage = new BasketPage();
        CreditPage creditPage = new CreditPage();

        loginPage.login();
        productPage.selectProduct();
        catalogPage.catalogSelect();
        basketPage.basketAdd();
        creditPage.AddCart();


    }

}
