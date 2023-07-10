package tests1.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_ornek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
/*
1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
 degilse dogru basligi yazdirin.

 */     driver.get("http://facebook.com");
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();
        Thread.sleep(1000);
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Walmart title testi PASSED");
        }else {
            System.out.println("Walmart title testi FAILED");
            System.out.println("Actual Title actualTitle : "+actualTitle);
        }
        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedUrlIcerik = "facebook";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Facebook Url testi PASSED");
        }else {
            System.out.println("Facebook Url testi FAILED \nActual Url : " + actualUrl);
        }




//4.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.walmart.com/ ");
        Thread.sleep(1000);
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String arananIcerik="Walmart.com";
        actualTitle=driver.getTitle();

        if (actualTitle.contains(arananIcerik)){

            System.out.println("wallmart testi PASSED");
        }else {
            System.out.println("Test failed");
            System.out.println(actualTitle);
        }
//6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//7. Sayfayi yenileyin
        driver.navigate().refresh();
//8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
//9.Browser’i kapatin
        driver.close();
//Walmart.comWalmart.com
//Walmart.com | Save Money. Live Better
//Shop Walmart.com today for Every Day Low Prices. Join Walmart+ for unlimited free delivery from your store &
//free shipping with no order minimum. Start your free 30-day trial now! (21 kB)











    }

}