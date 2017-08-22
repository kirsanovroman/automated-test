package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DialogView;
import page.ManageContractsView;

import java.util.Random;


/**
 * Created by Александр on 21.04.2017.
 */
public class SeleniumTest extends BaseTestClass {




    @Test
    void seleniumTest()  throws InterruptedException{

        String login = "admin";
        String password = "admin";
        driver.get ("http://lenta.ru");
//        driver.findElement(By.xpath("//a[@href=\"/auth/signin/\"]")).sendKeys(login);
        Thread.sleep(2000);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//        driver.findElement(By.id("check")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.id("enter")).click();



    }



}
