package progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialog extends BasePage {

    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startDownloadButton;

    @FindBy(xpath = "//button[contains(text(),'Cancel Download')]")
    private WebElement cancelDownloadElement;

    @FindBy(id = "progressbar-download-dialog")
    private WebElement downloadBar;

    @FindBy(id = "ui-id-82")
    private WebElement fileDownloadTitleText;

    public void clickCancelDownloadButton(){
        cancelDownloadElement.click();
    }

    public void clickStartDownloadButton(){
        startDownloadButton.click();
    }
    public String getFileDownloadTitleText(){
        return fileDownloadTitleText.getText();
    }
    public double getProgressBarLevel(){
        String style = downloadBar.getAttribute("aria-valuenow");
        System.out.println(style);
        return Double.parseDouble(style);
    }
    public String getStartDownloadButtonText(){
        return startDownloadButton.getText();
    }



}
