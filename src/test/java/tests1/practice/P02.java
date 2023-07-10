package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) {
        //. .Exercise2...
        //1-Driver oluşturalim
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //2-Java class'imiza chnomedriver.exet i tanitalim
        WebDriver driver = new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //5-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //driver.findElement(By.xpath())
        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String actualURL=driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        String expectedAranacakMetin="OTTO";
        if (actualTitle.contains(expectedAranacakMetin)&&actualURL.contains(expectedAranacakMetin)){
            System.out.println("OTTO testi PASSED");
        }else {
            System.out.println("OTTO testi FAILLED");
        }

        //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");


        //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        actualTitle= driver.getTitle();
        System.out.println(actualTitle);


        if (actualTitle.contains("Quarter")){
            System.out.println("Title Quarter testi PASSED");
        }else {
            System.out.println("Title Quarter testi FAILLED");
        }
        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11-Sayfayı yenileyelim
        driver.navigate().refresh();
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
