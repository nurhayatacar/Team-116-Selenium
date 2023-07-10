package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");//driverimizi tanittik
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://mynet.com");
        driver.findElement(By.xpath("//*[@id=\"myGlobalSearchBtn\"]")).click();
        driver.findElement(By.id("myGlobalSearchInput")).sendKeys("Berlusconi"+ Keys.ENTER);


    }
}
