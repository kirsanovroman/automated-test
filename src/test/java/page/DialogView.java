package page;

import element.Dialog;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by kirsanov_rd on 12.05.2017.
 */
public class DialogView extends BasePageClass
{

    @Step("Проверка поиска в диалоге")
    public void checkSearch(String value) {
        Dialog dialog = new Dialog(driver);
        dialog.search(value);
        dialog.ok();

    }


    @Step("Выбор элемента из списка")
    public void checkSelecting(String value) {
        Dialog dialog = new Dialog(driver);
        dialog.selectLink(value);
        dialog.close();

    }



    public DialogView(WebDriver driver) {
        super(driver);
    }


}
