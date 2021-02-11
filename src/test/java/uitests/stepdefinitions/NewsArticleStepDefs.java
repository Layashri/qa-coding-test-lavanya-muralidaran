package uitests.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import uitests.actions.NewsArticlepageActions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class NewsArticleStepDefs {

    @Steps
    NewsArticlepageActions newsArticlepageActions;

    @Then("user validates Article title is present in the page")
    public void userValidatesArticleTitleIsPresentInThePage() {

        assertThat("Validate Article title is displayed",
                newsArticlepageActions.isArticleTitlePresent(),is(true));
    }

    @And("user validates Description is present in the page")
    public void userValidatesDescriptionIsPresentInThePage() {
        assertThat("Validate Article Description is displayed",
                newsArticlepageActions.isArticleDescPresent(),is(true));
    }

    @And("user validates hero image is present in the page")
    public void userValidatesHeroImageIsPresentInThePage() {

        assertThat("Validate Article hero Image is displayed",
                newsArticlepageActions.isArticleHeroimgPresent(),is(true));
    }
}
