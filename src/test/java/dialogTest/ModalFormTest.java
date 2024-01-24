package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModalFormTest extends Hooks {
    @Test
    void modalFormTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        JSUtils.executeJavaScript("window.scroll(0,400)");
        BrowserUtils.wait(2);

        pages.getWebAutomationPage().clickDialogLink();
        pages.getWebAutomationPage().clickModalFormLink();

        pages.getModalFormPage().clickCreateAccountButton();

        pages.getModalFormPage().giveName("Okan");
        pages.getModalFormPage().giveSurName("TIRAS");
        pages.getModalFormPage().giveEmail("okantiras@gmail.com");

        pages.getModalFormPage().clickSubmitButton();
        BrowserUtils.wait(2);

       assertTrue(pages.getModalFormPage().getAccountInfo(1).contains("Okan"));
       assertTrue(pages.getModalFormPage().getAccountInfo(1).contains("TIRAS"));
       assertTrue(pages.getModalFormPage().getAccountInfo(1).contains("okantiras@gmail.com"));


    }
}
