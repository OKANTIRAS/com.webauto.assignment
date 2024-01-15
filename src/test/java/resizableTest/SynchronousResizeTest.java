package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SynchronousResizeTest extends Hooks {
    @Test
    void testSynchronousResize() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        pages.getWebAutomationPage().clickSynchronousResize();

        int initHeight1 = pages.getSynchronousResizePage().heightOfElement1();
        int initWidth1 = pages.getSynchronousResizePage().widthOfElement1();

        int initHeight2 = pages.getSynchronousResizePage().heightOfElement3();
        int initWidth2 = pages.getSynchronousResizePage().widthOfElement3();

        pages.getSynchronousResizePage().clickHolder(50, 50);

        int finalHeight1 = pages.getSynchronousResizePage().heightOfElement1();
        int finalWidth1 = pages.getSynchronousResizePage().widthOfElement1();

        int finalHeight2 = pages.getSynchronousResizePage().heightOfElement3();
        int finalWidth2 = pages.getSynchronousResizePage().widthOfElement3();

        Assertions.assertThat(finalHeight1).isGreaterThan(initHeight1);
        Assertions.assertThat(finalHeight2).isGreaterThan(initHeight2);
        Assertions.assertThat(finalWidth1).isGreaterThan(initWidth1);
        Assertions.assertThat(finalWidth2).isGreaterThan(initWidth2);

    }
}
