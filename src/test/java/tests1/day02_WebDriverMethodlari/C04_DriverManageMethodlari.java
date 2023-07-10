package tests1.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://wisequarter.com");
        // driver'a url verirken www yazmasaniz da calisir
        // ANCAK https yazmazsaniz calismaz
        System.out.println("Ilk sayfa size : "+driver.manage().window().getSize());//Ilk sayfa size : (1051, 798)
        System.out.println("Ilk sayfanin konumu : "+driver.manage().window().getPosition());//Ilk sayfanin konumu : (9, 9)

        driver.manage().window().maximize();
        System.out.println("maximize konumu : "+driver.manage().window().getPosition());//maximize konumu : (-8, -8)
        System.out.println("maximize size degeri : "+driver.manage().window().getSize());//maximize size degeri : (1552, 832)


        driver.manage().window().fullscreen();
        System.out.println("minimaze konumu : "+driver.manage().window().getPosition());//minimaze konumu : (0, 0)
        System.out.println("minimaze size degeri : "+driver.manage().window().getSize());//minimaze size degeri : (1536, 864)


        Thread.sleep(3000);


        driver.close();

    }
}
