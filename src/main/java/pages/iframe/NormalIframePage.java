package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframePage extends BasePage {
    @FindBy(id = "nestedIframe")
    private WebElement normalIframe;
    @FindBy(tagName = "h1")
    private WebElement textTitle;

    public NormalIframePage() {
        super();
    }


    public void passToNormalIframe() {
        DRIVER.switchTo().frame(normalIframe);
    }

    public String getTextTitle() {
        return textTitle.getText();
    }
}
