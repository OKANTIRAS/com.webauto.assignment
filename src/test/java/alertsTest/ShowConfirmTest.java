package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class ShowConfirmTest extends Hooks {
    @Test
    void showConfirmPage(){
        pages.getHomePage().clickOnWebAutomationLink();
        JSUtils.executeJavaScript("window.scroll(0,900)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1);
        pages.getShowConfirmPage().clickOnShowConfirm();
        BrowserUtils.wait(2);

        String actual = pages.getShowConfirmPage().getTextFromAlert();
        Assertions.assertEquals("Are you sure?", actual, "Wrong alert text");

        pages.getShowConfirmPage().clickAccept();


        pages.getShowConfirmPage().clickAccept();
        BrowserUtils.wait(2);
    }
}
