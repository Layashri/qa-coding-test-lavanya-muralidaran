package uitests.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoHomePage extends PageObject {

    public VideoHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='fiso-video-mosaic__main']//ul/li[1]//button")
    public WebElement firstVideoBtn;
    @FindBy(xpath = "//section//div[contains(@class,'main')]//button[contains(@class,'play-control')]")
    public WebElement playOrpauseBtn;
    @FindBy(xpath = "//video[@class='video-ads']")
    public WebElement advertisement;
    @FindBy(xpath = "//section//div[contains(@class,'main')]//button[contains(@class,'play-control')]")
    public WebElementFacade playBtn;

}
