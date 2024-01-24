package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcceptPage extends BasePage {

    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement element1;

    @FindBy(id = "draggable-accept")
    private WebElement element2;

    @FindBy(id = "droppable-accept")
    private WebElement element3;

    public void dragAndDropElement1(){
        actions.dragAndDrop(element1,element3).build().perform();
    }
    public void dragAndDropElement2(){
        actions.dragAndDrop(element2,element3).build().perform();
    }

    public String getClassAttributeOfWebElement3(){
        return element3.getAttribute("class");
    }






}
