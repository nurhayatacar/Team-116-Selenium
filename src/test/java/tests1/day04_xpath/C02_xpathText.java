package tests1.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpathText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //driver.findElement(By.cssSelector("button[onclick='addElement()'")).click();

        Thread.sleep(3000);
        //  3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonElementi= driver.findElement(By.xpath("//*[text()='Delete']"));
        //WebElement deleteButonElementi=driver.findElement(By.cssSelector("button[class='added-manually']"));
       // WebElement deleteButonElementi = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButonElementi.isDisplayed()){
            System.out.println("delete testi PASSED");
        }else {
            System.out.println("delete testi FAILED");
        }


        //  4- Delete tusuna basin
        //deleteButonElementi.click();
       // driver.findElement(By.cssSelector("button[class='added-manually']")).click();
        driver.findElement(By.cssSelector("#elements > button"));
        //driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementi = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElementi.isDisplayed()){
            System.out.println("addRemove testi PASSED");
        }else {
            System.out.println("addRemove testi FAILED");
        }
        driver.close();


    }
}
