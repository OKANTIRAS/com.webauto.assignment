package pages.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShowConfirmPage extends BasePage {

    @FindBy(xpath = "//button[text()='Show Confirm']")
    private WebElement showConfirmButton;

    public void clickOnShowConfirm(){
        showConfirmButton.click();
    }
    public void clickAccept(){
        getAlert().accept();
    }
    public void clickDismiss(){
        getAlert().dismiss();
    }
    public String getTextFromAlert(){
        return getAlert().getText();
    }
}
