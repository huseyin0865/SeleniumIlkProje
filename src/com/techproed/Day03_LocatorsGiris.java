package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementi buluyoruz
        //"Hamza"; string
        // web sayfasindaki tum eelmanlar webelement
        //web elementi bulduk ve
        WebElement singInLink = driver.findElement(By.id("sign-in"));
        //webelemente tikladik
        singInLink.click();
        //e mail kutusunu bulkalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        //sifre kutusunu buluyor

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        //sifre giriyor
        sifreKutusu.sendKeys("Test1234!");
        // sign in butonunu buluyoruz. // name="commit"
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();
        String baslik = driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş Başarısız.");
        }




    }
}
