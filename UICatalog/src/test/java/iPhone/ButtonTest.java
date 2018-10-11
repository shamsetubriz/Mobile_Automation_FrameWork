package iPhone;

import ButtonsPage.Buttons;
import common.Base;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Updated by Shams.
 */
public class ButtonTest extends Base {

    Buttons buttons;

    @BeforeMethod
    public void button()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        buttons = PageFactory.initElements(ad, Buttons.class);
    }
    @Test
    public void testButton(){
        buttons.clickOnGrayButton();
    }
    @Test
    public void testBackGroundImageText(){
        buttons.backGroundImageBoxIsDisplayd();
    }
    @Test
    public void testImageButton(){
        buttons.clickOnImageBtn();
    }
    @Test
    public void testRoundedButton(){
        buttons.clickOnRoundedBtn();
    }
    @Test
    public void testBackGroundButton(){
        buttons.clickOnBackBtn();
    }
    @Test
    public void testUiButtonText(){
        buttons.uiButtonTextIsDisplayed();
    }
}
