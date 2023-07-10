package tests1.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // wise quarter anasayfaya gidelim
        driver.navigate().to("https://wisequarter.com");
        Thread.sleep(2000);
        // ayni browser'da amazon ana sayfaya gideli
        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);

        // tekrar wise anasayfaya donun
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden amazon'a gidin
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.close();





    }
}
