package dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ModalFormPage extends BasePage {
    @FindBy(xpath = "//table[@class='ui-widget ui-widget-content mb-4']/tbody/tr")
    private List<WebElement> userDatas;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "surname")
    private WebElement surnameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    public void giveName(String name){
        nameField.sendKeys(name);
    }
    public void giveSurName(String surname){
        surnameField.sendKeys(surname);
    }
    public void giveEmail(String email){
        emailField.sendKeys(email);
    }
    public void clickCreateAccountButton(){
        createAccountButton.click();
    }
    public String getAccountInfo(int index){
        List<String>list = userDatas.stream().map(WebElement::getText).toList();
        return list.get(index);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }

}
