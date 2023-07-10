package tests1.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_relativeLocated {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html ");
        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        /*
            Berlin Webelementi'nin HTML kodlari
            <img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">

            Normalde locate edip kullanabildigimiz bir webelement icin buna ihtiyac yoktur

            Relative locators, HTML ozelliklerini gordugumuz halde locate EDEMEDIGIMIZ
            bir webelement varsa kullanilir.

            Bu soruda ornek olmasi amaciyla BERLIN elemanini LOCATE EDEMEDIGIMIZI varsayiyoruz

            Bu durumda Berlin webelementininetrafindaki web elementleri locate edip
            Berlin'i onlar uzerinden tarif edecegiz
         */

        /*
        <img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">

         */
        //3 ) Relative locator’larin dogru calistigini test edin

        WebElement bostonElementi=driver.findElement(By.xpath("//img[@id='pid6_thumb']"));//boston
        WebElement sailorElementi=driver.findElement(By.xpath("//img[@id='pid11_thumb']"));//boston
        WebElement byAreaElementi=driver.findElement(By.xpath("//img[@id='pid8_thumb']"));//boston
        WebElement nYCAreaElementi=driver.findElement(By.xpath("//img[@id='pid3_thumb']"));//boston

        WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nYCAreaElementi).toRightOf(bostonElementi));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).toLeftOf(berlin2));


        // 1.locator test icin
        String actualIdValue=berlin1.getAttribute("id");
        String expectedIdValue="pid7_thumb";
        if (actualIdValue.equals(expectedIdValue)){
            System.out.println("1.test PASSED");
        }else {
            System.out.println("1.tesyt FAILLED");
        }
        // 2.locator testi icin
        String actualIdValue2=berlin2.getAttribute("id");

        if (actualIdValue.equals(expectedIdValue)){
            System.out.println("2.test PASSED");
        }else {
            System.out.println("2.tesyt FAILLED");
        }
        // 3.locator testi icin
        String actualIdValue3=berlin3.getAttribute("id");

        if (actualIdValue.equals(expectedIdValue)){
            System.out.println("3.test PASSED");
        }else {
            System.out.println("3.tesyt FAILLED");
        }

        driver.close();
    }
}
