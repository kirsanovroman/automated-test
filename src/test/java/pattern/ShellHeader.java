package pattern;


import element.Dialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePageClass;


/**
 * Created by kirsanov_rd on 13.05.2017.
 */
public class ShellHeader extends BasePageClass {
    private String xpath=".//header[@class='sapContrastPlus sapUshellShellHead']/div";

    public ShellHeader(WebDriver driver) {
        super(driver);
    }

    /**
     * возвращает xPath элемента
     * @param dataSapUi
     * @return
     */
    private String getButtonXPath(String dataSapUi){
        return this.xpath+"//a[@data-sap-ui='"+dataSapUi+"']";
    }

    /**
     * нажатие на кнопку user
     */
    public void user(){
        WebElement userButton=searchElement(getButtonXPath("meAreaHeaderButton"));
        userButton.click();
    }

    /**
     * нажатие на кнопку back
     */
    public void back() {
        WebElement backButton=searchElement(getButtonXPath("backBtn"));
        backButton.click();
    }

    /**
     * нажатие на кнопку home
     */
    public void home() {
        WebElement homeButton=searchElement(getButtonXPath("homeBtn"));
        homeButton.click();
    }

    /**
     * нажатие на лупу
     */
    public void search(){
        WebElement searchButton=searchElement(getButtonXPath("sf"));
        searchButton.click();
    }

    /**
     * нажимает на кнопку ColloborationToolButton
     */
    public void openChat(){
        WebElement ctButton=searchElement(getButtonXPath("CollaborationToolButton"));
        ctButton.click();
    }

    public String getAppName(){
        return searchElement(this.xpath+"//span[@class='sapUshellHeadTitle']").getText();
    }


    public Dialog getCollaborationTool() { return new Dialog(driver); }

}
