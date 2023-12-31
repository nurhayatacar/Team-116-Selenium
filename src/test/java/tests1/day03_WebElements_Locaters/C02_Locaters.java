package tests1.day03_WebElements_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_Locaters {
    public static void main(String[] args) throws InterruptedException {
         /*
            Locator : verdigimiz locate bilgisini kullanarak
                      driver'in locate etmesini saglayan hazir method'lardir
            Selenium'da 8 adet Locator vardir
                - ilk 6 tanesi webelementi olusturan HTML kodun icerigine baglidir
                    1- By.id
                    2- By.name
                    3- By.className
                    4- By.linkText
                    5- By.partialLinkText
                    6- By.tagName
                 - son 2 tane ise her turlu web element icin kullanilabilir
                    7- By.xPath
                    8- By.cssSelector

         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //Amazon anasayfyaya gidelim
        driver.get("https://amazon.com");
        // arama kutusuna Nutella yazip aratalim

        WebElement aramaKutusuElementi= driver.findElement(By.name("field-keywords"));
        aramaKutusuElementi.sendKeys("Nutella"+ Keys.ENTER);
        // gosterilen urun resimlerinin 10'dan fazla oldugunu test edin
        // Locator stratejisi olarak By.className secildiginde
        // class attribute'unun degeri space iceriyorsa
        // locate islemi basarisiz olabilir
        //aramaKutusuElementi.submit();
        //List<WebElement>urunElementleriList=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));

        List<WebElement> urunIsimElementleriList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'"));

        if (urunIsimElementleriList.size()>10){
            System.out.println("test passes");
        }else {
            System.out.println("test failled");
        }
        // 5.urun ismini yazdirin ve ismin Nutella icerdigini test edin

        String besinciUrunIsmi=urunIsimElementleriList.get(4).getText();
        String expectedIcerik="Nutella";
        System.out.println("5. urun ismi : " + besinciUrunIsmi);

        if (besinciUrunIsmi.contains(expectedIcerik)){
            System.out.println("5.urun isim testi PASSED");
        }else{
            System.out.println("5.urun isim testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
