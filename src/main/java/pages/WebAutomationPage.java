package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(xpath = "//a[contains(text(),'Constrain Movement')]")
    private WebElement constrainMovementLink;

    @FindBy(xpath = "//a[text()='Handles']")
    private WebElement handlesLink;

    @FindBy(xpath = "//a[text()='Accept']")
    private WebElement acceptLink;

    @FindBy(xpath = "//a[text()='Revert draggable position']")
    private WebElement revertDraggablePositionLink;

    @FindBy(xpath = "//a[text()='Textarea']")
    private WebElement textAreaLink;

    @FindBy(xpath = "//a[text()='Serialize']")
    private WebElement serializeLink;

    @FindBy(xpath = "//a[text()='Normal Iframe']")
    private WebElement normalIframeLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;







    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickRevertDraggablePositionLink() {
        revertDraggablePositionLink.click();
    }

    public void clickTextAreaLink() {
        textAreaLink.click();
    }
    public void clickSerializeLink(){
        selectableLink.click();
    }

    public void clickNormalIframeLink(){normalIframeLink.click();}

    public void clickSynchronousResize() {
        synchronusResizeLink.click();
    }

}









