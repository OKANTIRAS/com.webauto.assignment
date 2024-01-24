package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import utils.BrowserUtils;

public class NormalIframeTest extends Hooks {
    void normalIframePage(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickNormalIframeLink();

        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickNormalIframeLink();

        pages.getNormalIframePage().passToNormalIframe();
        String actual = pages.getNormalIframePage().getTextTitle();
        System.out.println(actual);

        Assertions.assertEquals("Inar academy", actual);

    }
}
