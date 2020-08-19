package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //java projemoize chrome driveri tanittik

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz
        //webDriver nesnesi olusturarak chrome driver kullanabilir hale getirdikm

         WebDriver webDriver = new ChromeDriver();
         //driver a google.com a gitmesini soyledik
         webDriver.get("https://google.com");

         //driveriverimizda acik olan pencereyi kapatir(tek pencere kapatir)
       // webDriver.close();
        //acik olan driveri tum pencereleriyle kapatir
        //webDriver.quit();

        // sayfayi yenile butonu


    }
}
