package uitests.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import uitests.pages.NewsArticlePage;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class NewsArticlepageActions extends UIInteractionSteps {

    NewsArticlePage newsArticlePage;

    @Step
    public Boolean isArticleTitlePresent(){

        await("Wait Article Title is present").atMost(30, TimeUnit.SECONDS)
                .until(element(newsArticlePage.articleTitle)::isPresent);

        return element(newsArticlePage.articleTitle).isDisplayed();
    }
    @Step
    public Boolean isArticleDescPresent(){

        await("Wait Article Description is present").atMost(30, TimeUnit.SECONDS)
                .until(element(newsArticlePage.articleDesc)::isPresent);

            return element(newsArticlePage.articleDesc).isDisplayed();
    }
    @Step
    public Boolean isArticleHeroimgPresent(){

        await("Wait Article Hero image is present").atMost(30, TimeUnit.SECONDS)
                .until(element(newsArticlePage.articleHeroImg)::isPresent);

        return element(newsArticlePage.articleHeroImg).isDisplayed();
    }

    @Step
    public void clickOnfirstArticle(){

        clickOn(newsArticlePage.firstArticleLink);
    }
}
