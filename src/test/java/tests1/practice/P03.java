package tests1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) throws InterruptedException {
        //Exercise3...
        //System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");//driverimizi tanittik
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
       //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
      //driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps
        driver.findElement(By.xpath("//*[@id=\"calculatetest\"]")).click();
        Thread.sleep(3000);
       //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("12");
        //Type any number in the second inpu
        driver.findElement(By.id("number2")).sendKeys("8");
       //Click on Calculate
        driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();
      //Get the result
        String resultat = driver.findElement(By.id("answer")).getText();

      //Print the result
        System.out.println("resultat = " + resultat);
    }
}
