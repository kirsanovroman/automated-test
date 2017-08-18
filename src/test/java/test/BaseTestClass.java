package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.URL;

/**
 * Created by Александр on 10.02.2017.
 */

public abstract class BaseTestClass {
    public WebDriver driver;

    @BeforeMethod
    public void initDriver() throws Exception {

        DesiredCapabilities capability = DesiredCapabilities.chrome();

//        URL hostURL = new URL("http://172.27.20.60:7777/");
//      driver = new RemoteWebDriver(hostURL, capability);
        driver = new ChromeDriver();
        System.out.println("end initDriver()");
}

    @AfterMethod
    public void quitDriver() throws Exception {
        driver.quit();
        System.out.println("end quitDriver()");
    }


}
