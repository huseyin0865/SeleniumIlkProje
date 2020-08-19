package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        //1 youtube ye git
        // 2 titleyi  video kelimesi geciyor mu
        //driveri kapat

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver= new ChromeDriver();
        //youtube ye git

        webDriver.get("https://youtube.com");
        //sayfa basligini al
        String sayfaBasligi = webDriver.getTitle();

        if( sayfaBasligi.contains("Video") ){
            System.out.println("Video kelimesini içeriyor." + sayfaBasligi);
        }else{
            System.out.println("Video kelimesini İÇERMİYOR." + sayfaBasligi);
        }
        //driver i kapatalim
        webDriver.quit();

    }
}
