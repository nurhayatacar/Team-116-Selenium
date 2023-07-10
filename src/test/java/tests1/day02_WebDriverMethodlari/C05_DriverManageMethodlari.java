package tests1.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
           /*
            Implicitly wait Selenium'dan gelen DINAMIK bir beklemedir
            Sayfanin yuklenmesi veya islem yapilacak web elementlerin bulunmasi icin
            beklenecek MAXIMUM sureyi belirler
            Driver bu sure dolana kadar verilen gorevin yapilip yapilmadigini kontrol eder
            bu sure icerisinde gorev yapilamazsa
            Exception firlatip calismayi durdurur

         */

        driver.get("https://wisequarter.com");
        System.out.println("baslangic konumu : "+driver.manage().window().getPosition());//baslangic konumu : (-8, -8)
        System.out.println("baslangic size i : "+driver.manage().window().getSize());//baslangic size i : (1552, 832)

        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));
        Thread.sleep(2000);

        System.out.println("degisen yeni size : "+driver.manage().window().getSize());//degisen yeni size : (1203, 503)
        System.out.println("degisen yeni konum : "+driver.manage().window().getPosition());//degisen yeni konum : (100, 200)


        Thread.sleep(3000);//javadan gelir ve yazdigimiz sure miktarinca codlari bekletir
        driver.close();

    }

}
