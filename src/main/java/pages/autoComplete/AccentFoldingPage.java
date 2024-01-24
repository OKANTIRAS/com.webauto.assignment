package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFoldingPage extends BasePage {
    @FindBy(id = "developer-accentFolding")
    private WebElement developerTextField;

    @FindBy(css = "#ui-id-40>li")
    private List<WebElement> names;

    public void sendKeysToText(String name){
        developerTextField.sendKeys(name);
    }
    public List<String> getNames(){
        return names.stream().map(WebElement::getText).toList();
    }
    public void cleanDeveloperTextField(){
        developerTextField.clear();
    }




}
