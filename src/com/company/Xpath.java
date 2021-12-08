package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://test1.itcareercenter.us/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@title='Shop']")).click(); Thread.sleep(1000);
        driver.findElement(By.xpath("//li[2]//a[2]")).click(); Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'View cart')]")).click(); Thread.sleep(1000);
        driver.findElement(By.linkText("PROCEED TO CHECKOUT")).click(); Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.id("billing_first_name"));
        firstName.sendKeys("Mustafa"); Thread.sleep(1000);



        Thread.sleep(3000);
        driver.close();
        }
    }

