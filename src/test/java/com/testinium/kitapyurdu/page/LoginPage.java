package com.testinium.kitapyurdu.page;
import com.testinium.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


public class LoginPage {
    Methods methods;
    private static Logger logger = (Logger) LogManager.getLogger(LoginPage.class);
    public LoginPage() {
        methods = new Methods();
    }

    public void login() {

        logger.info("aaaaa");
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"), "testinium.kitapyurdu@gmail.com");
        methods.sendKeys(By.id("login-password"), "12345cem");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        logger.info("Giriş kontrol ediliyor");
        String sonuc = methods.findElement(By.cssSelector(".section")).getText();
        Assert.assertTrue(sonuc.contains("Hesabım"));
    }
}