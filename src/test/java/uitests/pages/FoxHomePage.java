package uitests.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.foxsports.com.au/")
public class FoxHomePage extends PageObject{
    public FoxHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Video")
    public WebElement videoLink;
    @FindBy(xpath = "//label[@aria-label='Toggle menu open and closed']")
    public WebElement HamburgerMenu;
    @FindBy(css = "button[aria-label='Expand Secondary Menu']")
    public WebElement moreOnLinks;
    @FindBy(xpath = "//label[@aria-label='Open Sports submenu']")
    public WebElement sportsSubLink;
    @FindBy(xpath = "//ul[contains(@class,'fnhmbs--r')]//label[contains(@aria-label,'Football')]")
    public WebElement selectSportslink;
    @FindBy(xpath = "//a[@href='/football/latest-news']")
    public WebElementFacade latestNewslink;



}
