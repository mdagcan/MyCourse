package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lesson2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://test1.itcareercenter.us/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String pageTitle = driver.getTitle();
        System.out.println("sayfanın başlığı : " + pageTitle);

        String pageUrl = driver.getCurrentUrl();
        System.out.println(pageUrl);

        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);

        WebElement pageLink = driver.findElement(By.xpath("//a[contains(text(),'Uygulamasi')]"));
        pageLink.click();

        WebElement pageYazi = driver.findElement(By.xpath("//p[contains(text(),'Automated Test son zamanlarda gelisen yeni bir sis')]"));

        System.out.println(pageYazi.getText());

        if(pageYazi.getText().contains("JAVA")) {
            System.out.println("test başarılı");
        }

        List<WebElement> allPageLinks = driver.findElements(By.xpath("//a"));
        System.out.println("Sayfadaki link sayısı : " + allPageLinks.size());

        for(WebElement oneLink:allPageLinks) {
            System.out.println(oneLink.getText());
        }
        System.out.println("===============================================");

        List<WebElement> menuPageLinks = driver.findElements(By.xpath("//*[@id='menu-shop']//a"));

        for(int i = 1 ; i < menuPageLinks.size() ; i++) {
            WebElement oneElement;
            oneElement = menuPageLinks.get(i);
            System.out.println(oneElement.getText());
        }


        Thread.sleep(5000);
        driver.close();
    }
}
