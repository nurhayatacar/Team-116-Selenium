package tests1.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xpath_cssSelector {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
             //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/ ");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualtitle=driver.getTitle();
        String expectedIcerik="spend less";
        if (actualtitle.contains(expectedIcerik)){
            System.out.println(" title test passed");
        }else {
            System.out.println(" title test failled");
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        Thread.sleep(2000);

        //7- Birthday butonuna basin
        //driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        driver.findElement(By.cssSelector("img[alt=Birthday]")).click();
        Thread.sleep(2000);
        //8- Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("//img[@alt='Amazon.com eGift Card'][1]")).click();

        Thread.sleep(2000);

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("button[value='25']")).click();
        //driver.findElement(By.xpath("(//button[@id=‘gc-mini-picker-amount-1’ and @value=‘25’])")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement fiyatElementi= driver.findElement(By.cssSelector("#gc-live-preview-amount"));
        //WebElement fiyatElementi=driver.findElement(By.xpad("span[@id=‘gc-live-preview-amount"));
         String expectedFiyat="25$";
         String actualFiyat=fiyatElementi.getText();
         if (expectedFiyat.equals(actualFiyat)){
             System.out.println("Fiyat testi PASSED");
         }else {
             System.out.println("Fiyat testi FAILLED");
         }
        System.out.println("Actual fiyat : "+actualFiyat);


        //11-Sayfayi kapatin
        driver.close();
    }
}
