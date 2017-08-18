package page;

import element.Dialog;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pattern.FullScreen;
import pattern.ShellHeader;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by kirsanov_rd on 13.05.2017.
 */
public class ManageContractsView extends BasePageClass {

    ShellHeader header = new ShellHeader(driver);
    FullScreen screen=new FullScreen(driver);

    @Step("Проверка header")
    public void checkHeader(String appName){
        header.user();
        header.back();
        header.home();
        header.search();
        header.openChat();
//        Dialog colTool = header.getCollaborationTool();

        Assert.assertEquals(header.getAppName(),appName,errorMessage);
    }

    @Step("Проверка Screen")
    public void checkScreen(int countRecords, String str1, String str2, String str3){
        screen.go();
        screen.settings();
        screen.addRecord();
        screen.getFilterField("ContractCompanyCode").sendKeys(str1);
        screen.getFilterField("Контрагент").sendKeys(str2);
        screen.getFilterField("ContractInternalID").sendKeys(str3);
        Assert.assertEquals(screen.getCountOfRecords(),countRecords,errorMessage);
    }
    public ManageContractsView(WebDriver driver) {
        super(driver);
    }
}
