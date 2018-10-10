package iPhone;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Updated by Shams.
 */
public class TextFieldsTest extends Base {

    TextFields textFields = new TextFields();

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields.writeTextToFields();

    }
}
