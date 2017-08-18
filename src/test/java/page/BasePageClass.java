package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Александр on 13.02.2017.
 */
public abstract class BasePageClass {

    protected final WebDriver driver;
    protected String errorMessage = "О.р. не соответствует фактическому!!!";

    protected WebElement searchElement(String xPath){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }
    protected BasePageClass(WebDriver driver) {
        this.driver = driver;
    }
}
