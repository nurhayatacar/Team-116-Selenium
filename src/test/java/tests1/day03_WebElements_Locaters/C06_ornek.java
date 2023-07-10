package tests1.day03_WebElements_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_ornek {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://Amazon.com");
        Thread.sleep(2000);
        List<WebElement> seeList=driver.findElements(By.partialLinkText("See"));
        System.out.println(seeList.size());
        System.out.println("****");

seeList.get(0).click();
Thread.sleep(5000);

        driver.close();
    }
}
