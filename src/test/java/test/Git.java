package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Created by kirsanov_rd on 18.08.2017.
 */
public class Git extends BaseTestClass {
    @Test
    void gitTest() throws InterruptedException {
        driver.get ("https://git-scm.com");
        Thread.sleep (5000);
        driver.findElement(By.xpath("//h3[text()=\"Documentation\"]")).click();
        Thread.sleep (5000);
    }
}
