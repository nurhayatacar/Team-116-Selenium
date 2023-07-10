package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    public static void main(String[] args) throws InterruptedException {
        // ....Exercise-1:...
        //        Create a new class with main method
        //                Set Path
        //                Create a chrome driver
        //                Maximize window
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");//driverimizi tanittik
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();//pencereyi menuler ve dugmeler kaybolmadan en buyuk boyutuna  ulastiri
        // driver.manage().window().fullscreen();//pencereyi menuler ve dugmeler olmayacak sekilde ekrani kaplamasi saglanir
        Thread.sleep(5000);

        //                Open google home page https://www.google.com
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();

        //get ve navigate to ayni isi yapar fakat get daha hizli calisir
        //navigate komutu genelde bagimli durumlarda tercih edilir

        //        On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        //        Wait about 4 sn
        Thread.sleep(4000);
        //        Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(2000);
        //        Refresh page
        driver.navigate().refresh();
        //        Close/quit the browser
      driver.close();//calistigimiz son pencereyi kapatir
      //driver.quit();//actigimiz tum pencereleri kapatir
        //        And Last step print "All is well" on console
        System.out.println("All is well");
        System.err.println("Merhaba T116");
        //

    }
}
