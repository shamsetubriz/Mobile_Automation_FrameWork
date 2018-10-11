package iPhone;

import AlertsPage.Alerts;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Updated by Shams.
 */
public class AlertsTest extends Base {
    public Alerts alerts(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad,Alerts.class);
    }
    @Test
    public void testTapUiActionSheetShowSimple() throws InterruptedException {
        alerts().tapUiActionSheetShowSimple();
        sleep(2);
    }
    @Test
    public void testTapUiActionSheetShowOkCancel() throws InterruptedException {
        alerts().tapUiActionSheetShowOkCancel();
        sleep(2);
    }
    @Test
    public void testTapUiActionSheetShowCustomized() throws InterruptedException {
        alerts().tapUiActionSheetShowCustomized();
        sleep(2);
    }
    @Test
    public void testTapUiAlerViewShowSimple() throws InterruptedException {
        alerts().tapUiAlerViewShowSimple();
        sleep(2);
    }
}
