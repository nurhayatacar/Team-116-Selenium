package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {
        // 1-Driver oluşturalim
        //    2-Java class'imiza chnomedriver. exetyi tanitalim
        //    3-Driver'in tum ekranı kaplamasini sagu ayalim
        //    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.navigate().to("http://www.babayigit.net/murat/testpage.html");
        //    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        //        alanlarına gerekli bilgileri yazsın
        driver.findElement(By.xpath("//input[@id='ad']")).sendKeys("Ela");
        driver.findElement(By.xpath("//input[@id='soyad']")).sendKeys("Lale");
        driver.findElement(By.xpath("//input[@id='yas']")).sendKeys("45");
        driver.findElement(By.xpath("//input[@id='meslek']")).sendKeys("doktor");
        driver.findElement(By.xpath("//input[@id='dogum_yeri']")).sendKeys("Colmar");
        driver.findElement(By.xpath("//input[@id='mezun_okul']")).sendKeys("bartholdi");
        driver.findElement(By.xpath("//input[@id='cocuk_sayisi']")).sendKeys("5");

        //    7-Submit tuşuna bassın.
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        //    8- All information was entered correctly.. yazısının göründüğünü test etsin
        if (driver.findElement(By.tagName("p")).isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILLED");
        }

        //    9- Clear butonu ile tüm butonları temizlesin
        driver.findElement(By.xpath("//*[@type='reset']")).click();


        //    10- Manuel olarak temizlendiğini görecek kadar beklesin
        Thread.sleep(3000);
        //    11- Sayfayı kapatsın
        driver.quit();

    }
}
