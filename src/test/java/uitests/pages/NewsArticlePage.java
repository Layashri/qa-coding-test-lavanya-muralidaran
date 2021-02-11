package uitests.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsArticlePage extends PageObject {

    public NewsArticlePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='habitual-content']//div[2]/article//h1/a")
    public WebElement firstArticleLink;
    @FindBy(css = "h1")
    public WebElement articleTitle;
    @FindBy(css="div[class='fiso-article-body']")
    public WebElement articleDesc;
    @FindBy(xpath = "//img[@class='fiso-article-captioned-figure__image']")
    public WebElement articleHeroImg;
}
