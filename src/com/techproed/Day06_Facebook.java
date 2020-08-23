package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CEM BULUT\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        // e mail kutusuna e mail

        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        // placeholder="Email or Phone Number" autofocus="1" aria-label="Email or Phone Number">
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        //<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass"
        // data-testid="royal_pass" placeholder="Password" aria-label="Password">

        WebElement sifreKutusu = driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234");

        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_d">Log In</button>

        //sifreKutusu.submit();

        WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_d"));
       // WebElement loginButonu = driver.findElement(By.xpath("//button"));
        loginButonu.click();

        //burada java 3000 milisaniye bekleyecek
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //https://www.facebook.com/login/

        String url= driver.getCurrentUrl();


        if(url.contains("https://www.facebook.com/login/")){
            System.out.println("giris basarisiz");
        }else {
            System.out.println("giris basarili");


        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        driver.quit();




    }
}
