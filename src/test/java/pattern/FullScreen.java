package pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePageClass;

import static java.lang.Integer.parseInt;

/**
 * Created by kirsanov_rd on 13.05.2017.
 */
public class FullScreen extends BasePageClass{
     public FullScreen(WebDriver driver) {
        super(driver);
    }

    /**
     * нажатие на кнопку record
     */
    public void addRecord(){
        WebElement addRecordButton=searchElement("//button[@title='Create New Object']");
        addRecordButton.click();
    }

    /**
     * нажатие на кнопку settings
     */
    public void settings(){
        WebElement settingsButton=searchElement("//button[@title='Settings'][contains(@data-sap-ui,'contract')]");
        settingsButton.click();
    }

    /**
     * нажатие go
     */
    public void go(){
        WebElement goButton=searchElement("//button[contains(@aria-describedby,'text')]");
        goButton.click();
    }

    /**
     * возвращает количество договоров на странице
     * @return
     */
    public int getCountOfRecords() {
        String contracts=searchElement(".//div[@role='heading'][contains(@data-sap-ui,'contract')][contains(@class,'sap')]//span").getAttribute("innerHTML");
//        System.out.println(contracts);
        int index1=contracts.indexOf("(");
        int index2=contracts.indexOf(")");
        String temp=contracts.substring(index1+1,index2);
        return parseInt(temp);
    }

//    public static void main(String args[]){
//        String str="ssdsddfdfdf  (148) df dfdf d";
//        int index1=str.indexOf("(");
//        System.out.println(index1);
//        int index2=str.indexOf(")");
//        System.out.println(index2);
//        String temp=str.substring(index1+1,index2);
//        System.out.println(temp);
//    }
    /**
     * возвращает
     * @param filterName
     * @return
     */
    public WebElement getFilterField(String filterName){
        return searchElement("//div[label[text()='"+filterName+"']]/following-sibling::div//input");
    }
}
