package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://google.com");

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl = webDriver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

        webDriver.navigate().to("http://youtube.com");



        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        webDriver.navigate().back();

        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        webDriver.quit();

    }
}
