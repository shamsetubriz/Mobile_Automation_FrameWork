package iPhone;

import ButtonsPage.Buttons;
import ImgesPage.Images;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTest extends Images {
    Images images;

    @BeforeMethod
    public void images()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getImages();
        images = PageFactory.initElements(ad, Images.class);
    }
    @Test
    public void testDurationSlider(){
        images.durationSliderIsDisplayed();
    }
}
