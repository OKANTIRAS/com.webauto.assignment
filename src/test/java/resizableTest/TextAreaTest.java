package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import utils.JSUtils;

public class TextAreaTest extends Hooks {
    @Test
    void testTextArea() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        JSUtils.executeJavaScript("window.scroll(0,300)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getWebAutomationPage().clickTextAreaLink();

        int initWidth = pages.getTextAreaPage().getWidthOfTheTextArea();
        int initHeight = pages.getTextAreaPage().getHeightOfTheArea();

        pages.getTextAreaPage().clickAndExtendHolder(100,100);

        int finalWidth = pages.getTextAreaPage().getWidthOfTheTextArea();
        int finalHeight = pages.getTextAreaPage().getHeightOfTheArea();

        Assertions.assertThat(finalWidth).isGreaterThan(initWidth);
        Assertions.assertThat(finalHeight).isGreaterThan(initHeight);


    }
}
