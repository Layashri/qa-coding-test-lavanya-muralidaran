package uitests.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import uitests.pages.FoxHomePage;
import uitests.pages.VideoHomePage;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class VideoHomePageActions extends UIInteractionSteps {

    FoxHomePage foxHomePage;
    VideoHomePage videoHomePage;

    @Step
    public void playfirstVideo()
    {

        await("Wait till Video Home page Loads").atMost(15,TimeUnit.SECONDS)
                .until(videoHomePage.firstVideoBtn::isDisplayed);
        clickOn(videoHomePage.firstVideoBtn);
    }

    public void playPauseVideo(){
        await("Wait till Video play button is displayed").atMost(15, TimeUnit.SECONDS)
        .until(videoHomePage.playOrpauseBtn::isDisplayed);
        element(videoHomePage.playBtn).click();
    }

    public String playPauseCheck(){
        await("Wait till Video play button is displayed").atMost(15, TimeUnit.SECONDS)
                .until(videoHomePage.playOrpauseBtn::isDisplayed);
        return videoHomePage.playOrpauseBtn.getAttribute("class");
    }

    public Boolean adCheck(){

        await("Wait till Ad plays").atMost(20, TimeUnit.SECONDS).ignoreExceptions()
                .until(element(videoHomePage.advertisement)::isPresent);
       return element(videoHomePage.advertisement).isPresent();

    }


}
