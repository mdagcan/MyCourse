package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://itcareercenter.us/actionsJS.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement radioButtton_1 = driver.findElement(By.id("male"));
        WebElement radioButtton_2 = driver.findElement(By.id("female"));
        WebElement checkBox_1 = driver.findElement(By.className("Automation"));
        WebElement checkBox_2 = driver.findElement(By.className("Performance"));


        radioButtton_1.click(); Thread.sleep(2000);
        radioButtton_2.click(); Thread.sleep(2000);

        checkBox_1.click(); Thread.sleep(2000);
        checkBox_2.click(); Thread.sleep(2000);

        if (checkBox_1.isSelected()) {
            System.out.println("check box 1 seçili");
        } else {
            System.out.println("check box 1 seçili değil");
        }

        checkBox_1.click(); Thread.sleep(2000);
        checkBox_2.click(); Thread.sleep(2000);

        if (checkBox_2.isSelected()) {
            System.out.println("check box 2 seçili");
        } else {
            System.out.println("check box 2 seçili değil");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
