package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class P07 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) http://babayigit.net/relativelocators/relative.html adresine gidin
        driver.get("http://babayigit.net/relativelocators/relative.html ");
        //2 ) Nurse  3 farkli relative locator ile locate edin
        WebElement police = driver.findElement(By.id("pol_thumb"));
        WebElement doktor = driver.findElement(By.id("dr_thumb"));
        WebElement fireman = driver.findElement(By.id("frmn_thumb"));

        WebElement nurse1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(doktor));
        WebElement nurse2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(fireman));
        WebElement nurse3 = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(police));


        //3 ) Relative locator’larin dogru calistigini test edin



    }
}
