package controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class Toolbar extends BasePage {
    @FindBy(xpath = "//div[@class='d-flex flex-row mb-4']/select")
    private List<WebElement> dropdownTabs;
    @FindBy(xpath = "//button[text()='B']")
    private WebElement boldButton;
    @FindBy(xpath = "//button[text()='I']")
    private WebElement italicButton;
    @FindBy(xpath = "//button[text()='U']")
    private WebElement underLineButton;

    @FindBy(css = "textarea[class='page form-control']")
    private WebElement textArea;

    public void selectZoom(String zoomRate){
        Select select = new Select(dropdownTabs.get(0));
        select.selectByVisibleText(zoomRate);
    }
    public void selectBackgroundColour(String backgroundColour){
        Select select = new Select(dropdownTabs.get(1));
        select.selectByVisibleText(backgroundColour);
    }
    public void selectTextColour(String textColour){
        Select select = new Select(dropdownTabs.get(2));
        select.selectByVisibleText(textColour);
    }

    public void clickOnBoldButton() {
        boldButton.click();
    }

    public void clickOnItalicButton() {
        italicButton.click();
    }

    public void clickOnUnderlineButton() {
        underLineButton.click();
    }

   public String getTextInfo(){
        return textArea.getAttribute("style");
   }

   public boolean checkZoomRate(String zoomRate){
        String textInfo = getTextInfo();
        return textInfo.contains(zoomRate.toLowerCase());
   }
    public boolean checkBackGroundColour(String backgroundColour){
        String textInfo = getTextInfo();
        return textInfo.contains(backgroundColour.toLowerCase());
    }
    public boolean checkTextColour(String textColour){
        String textInfo = getTextInfo();
        return textInfo.contains(textColour.toLowerCase());
    }
    public boolean checkIsBold() {
        String textInfo = getTextInfo();
        return textInfo.contains("bold");
    }

    public boolean checkIsItalic() {
        String textInfo = getTextInfo();
        return textInfo.contains("italic");
    }

    public boolean checkIsUnderline() {
        String textInfo = getTextInfo();
        return textInfo.contains("underline");
    }
}
