package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://test1.itcareercenter.us/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("menu-item-72")).click(); Thread.sleep(2000);
        driver.findElement(By.linkText("MY ACCOUNT")).click(); Thread.sleep(2000);
        driver.findElement(By.partialLinkText("CHECK")).click(); Thread.sleep(2000);
        driver.findElement(By.id("menu-item-76")).click(); Thread.sleep(2000);
        driver.get("https://test1.itcareercenter.us/index.php/product/iphone-phone/"); Thread.sleep(2000);
        driver.findElement(By.name("add-to-cart")).click(); Thread.sleep(2000);
        driver.findElement(By.linkText("VIEW CART")).click(); Thread.sleep(2000);
        driver.findElement(By.id("coupon_code")).sendKeys("deneme123"); Thread.sleep(2000);
        driver.findElement(By.name("apply_coupon")).click(); Thread.sleep(2000);




        Thread.sleep(5000);
        driver.close();
    }
}
