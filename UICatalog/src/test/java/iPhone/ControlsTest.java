package iPhone;

import ControlsPage.Controls;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Controls {
    @BeforeMethod
    public Controls controls(){
         UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
         uiCatalog.getControls();
         return PageFactory.initElements(ad, Controls.class);
    }

    @Test
    public void testStandardSwitchText(){
        controls().standardSwitchTextisDisplayed();
    }
    @Test
    public void testStandardSwitch(){
        controls().clickOnStandardSwitch();
    }
    @Test
    public void testStandardSliderText(){
        controls().statndardSliderTextIsDisplayed();
    }
    @Test
    public void testStandartSlider(){
        controls().actionStandardSliderSwitch();
    }
    @Test
    public void testCustomizeSlidetText(){
        controls().customizeSliderTextIsDisplayed();
    }
    @Test
    public void testCustomizedSlider(){
        controls().actionOnCustomizeSliderSwitch();
    }
    @Test
    public void testUiSliderText(){
        controls().uiSliderTextIsDisplayed();
    }
}
