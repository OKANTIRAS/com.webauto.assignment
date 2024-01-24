package progressBarTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;


import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * 1.Open the browser and navigate to the webAutomation page
 * 2.Click on the progress bar button
 * 3.Click on the download dialog button
 * 4.Get start download button text
 * 5.Click on start download button
 * 6.Verify that text on the start download button turned into initial state
 */

public class DownloadDialogTest extends Hooks {
    SoftAssertions softAssertions = new SoftAssertions();
    @Test

    void downloadDialogTest() {
        //1.Open the browser and navigate to the webAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2.Click on the progress bar button
        JSUtils.executeJavaScript("window.scroll(0,700)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickProgressBar();

        // 3.Click on the download dialog button
        JSUtils.executeJavaScript("window.scroll(0,-100)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickDownLoadDialogLink();

        // 4.Get start download button text
        pages.getDownloadDialog().getFileDownloadTitleText();

        //5.Click on start download button
        pages.getDownloadDialog().clickStartDownloadButton();
        BrowserUtils.wait(10);

        // 6.Verify that text on the start download button turned into initial state
        assertEquals(pages.getDownloadDialog().getStartDownloadButtonText(), "Start Download",
                "Text on the button is not correct");
    }
    /**
     * 1.Open the browser and navigate to the webAutomation page
     * 2.Click on the progress bar button
     * 3.Click on the download dialog button
     * 4.Click on start download button
     * 5.Get initial size of progress bar
     * 6.Wait 1 second
     * 7.Get final size of progress bar
     * 8.Ver(ify that final size is bigger than initial size
     */
    @Test
    void testProgressBarFunctionality(){
        //1.Open the browser and navigate to the webAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2.Click on the progress bar button
        JSUtils.executeJavaScript("window.scroll(0,700)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickProgressBar();

        // 3.Click on the download dialog button
        JSUtils.executeJavaScript("window.scroll(0,-100)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickDownLoadDialogLink();
        BrowserUtils.wait(5);

        // 4.Get start download button text
        pages.getDownloadDialog().clickStartDownloadButton();
        BrowserUtils.wait(2);

        // 5.Get initial size of progress bar
        double initialSizeBar = pages.getDownloadDialog().getProgressBarLevel();

        // * 6.Wait 1 second
        BrowserUtils.wait(1);

        // Get final size of progress bar
        double finalSizeBar = pages.getDownloadDialog().getProgressBarLevel();

        // Ver(ify that final size is bigger than initial size
        softAssertions.assertThat(finalSizeBar).isGreaterThan(initialSizeBar);



































    }

}
