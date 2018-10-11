package androidPhone;

import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
       // homePage.getHomePage();
        homePage = PageFactory.initElements(ad, HomePage.class);
    }
}
