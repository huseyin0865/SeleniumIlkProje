package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        //java projemoize chrome driveri tanittik

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");


        //webDriver nesnesi olusturarak chrome driver kullanabilir hale getirdikm

        WebDriver webDriver = new ChromeDriver();


        webDriver.manage().window().maximize();
        //driver a google.com a gitmesini soyledik
        webDriver.get("https://google.com");

       // get ile ayni islemi yapiyor


        webDriver.navigate().to("http://amazon.com");

        //navigate().back() acilan yeni sayfayi kapatir bir onceki sayfaya geri donuyor

        webDriver.navigate().back();

        //navigate().forward(); method u geri geldigimiz sayfaya gitmemizi sagliyor
        // ornek google gittik amazona gitti  back le geri geldi forvard la amazona tekrar gitti

        webDriver.navigate().forward();

        //navigate().refresh(); sayfayi yenilemeye yariyor


        webDriver.navigate().refresh();





    }
}
