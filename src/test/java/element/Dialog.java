package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePageClass;

/**
 * Created by kirsanov_rd on 12.05.2017.
 */
public class Dialog extends BasePageClass{

    private String xpath = ".//div[@id='dialog']";

    public Dialog(WebDriver driver) {
        super(driver);
//        this.xpath = ".//div[label[text()='" + name  + "']]";
    }

    /**
     * поиск значения
     * @param value
     */
    public void search(String value) {
        WebElement dialogField= searchElement(this.xpath + "//*[@id=\"dialog\"]/label/input"); //  ".//div[label[text()='Документы']]//*[@id="dialog"]/label/input"
        dialogField.sendKeys(value);
        WebElement searchButton=searchElement(this.xpath + "//*[@id=\"dialog\"]/button[1]");
        searchButton.click();
    }

    /**
     * выбор ссылки из списка
     * @param linkName
     */
    public void selectLink(String linkName) {
        WebElement link=searchElement(this.xpath + "//ul/li/a[text()='" + linkName + "']");
        link.click();

    }

    /**
     * нажатие кнопик ок
     */
    public void ok() {
        WebElement okButton=searchElement("//*[@id=\"dialog\"]/button[3]");
        okButton.click();
    }

    /**
     * нажатие кнопки cancel
     */
    public void cancel() {
        WebElement cancelButton=searchElement("//*[@id=\"dialog\"]/button[4]");
        cancelButton.click();

    }

    /**
     * нажатие кнопки close
     */
    public void close() {
        WebElement closeButton=searchElement("//*[@id=\"dialog\"]/button[2]");
        closeButton.click();
    }
}
