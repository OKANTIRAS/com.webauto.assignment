package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextAreaPage extends BasePage {
    @FindBy(css = "textarea[class='ui-resizable']")
    private WebElement textArea;
    @FindBy(xpath = "//div[@class='ui-wrapper']/div[3]")
    private WebElement holder;

    public int getWidthOfTheTextArea(){
        return textArea.getSize().getWidth();
    }
    public int getHeightOfTheArea(){
        return textArea.getSize().getHeight();
    }
    public void clickAndExtendHolder(int xOffset, int yOffset){
        actions.clickAndHold(holder).moveByOffset(xOffset,yOffset).release().perform();
    }
}
