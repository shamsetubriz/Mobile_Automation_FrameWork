package androidPhone;

import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void homePage(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);

    }
    @Test
    public void testMenuLink(){
        homePage.tapOnMenuLinkl();
    }

    @Test
    public void testTapOnBellButton(){
        homePage.tapOnBellButton();
    }

    @Test
    public void testShowTheHeader(){
        homePage.showTheHeader();
    }

    @Test
    public void testHeaderBackGround(){
        homePage.checkHeaderBackGround();
    }
}
