package uitests.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import uitests.pages.FoxHomePage;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class HomePageActions extends UIInteractionSteps {

    FoxHomePage foxHomePage;

    @Step
    public void openFoxHomepage(){
        foxHomePage.open();

    }
    @Step
    public void clickVideoslink(){
        clickOn(foxHomePage.videoLink);
    }
    @Step
    public void clickHamburgerMenu(){
    clickOn(foxHomePage.HamburgerMenu);
    }

    @Step
    public void navigateToLatestNews(){

        clickOn(foxHomePage.sportsSubLink);
        await("wait till sports link get displayed").atMost(10, TimeUnit.SECONDS).until(foxHomePage.selectSportslink::isDisplayed);
        clickOn(foxHomePage.selectSportslink);
        await().atMost(10, TimeUnit.SECONDS).until(foxHomePage.latestNewslink::isDisplayed);
        clickOn(foxHomePage.latestNewslink);

    }





}
