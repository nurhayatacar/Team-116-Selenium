package tests1.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wiseQuarter.com");
        Thread.sleep(13000);
        System.out.println(driver.getTitle());
        // Sayfa title'inin Wise icerdigini test edin

        String expectedIcerik="Wise";

        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title wise icermiyor.test Failed");
        }

        // Url'in https://www.wisequarter.com oldugunu test edin

        String expectedUrl="http://www.wisequarter.com";
        String actualUrl=driver.getCurrentUrl();
        if (expectedIcerik.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url test Failed");
            System.out.println("actual Url :"+actualUrl);//actual Url :https://wisequarter.com/ test failed
        }

         System.out.println(driver.getPageSource());
        // sayfa kaynagi testlerde cok kullanilmaz

        System.out.println(driver.getWindowHandle());//EEC8F92BA66573EDA684BFAD6A216E67
        //  Sistemde her olusturulan browser icin unique bir window handle degeri atanir.
        //  Bu handle degeri sayfalar arasinda gecis yapmak icin kullanilir.Bu bir hashcod dur
        //Bu window acik iken biz baska windowda calisiyorsak ve bu window a gecmek istiyorsak
        //driver a "window handle degeri DF9DE1FAE1699D1F0844FC524CB26F1B olan Window a git" dersek
        //diver o window a gecis yapar

        System.out.println(driver.getWindowHandles());//[EEC8F92BA66573EDA684BFAD6A216E67]
        // bulundugumuz class'daki driver tarafindan olusturulan
        // ve acik olan tum window'larin window handle degerlerini
        // bir Set olarak bize dondurur

        driver.close();



    }
}
