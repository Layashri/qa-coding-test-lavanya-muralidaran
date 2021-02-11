package uitests.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import uitests.actions.VideoHomePageActions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class VideoHomePageStepDefs {


    VideoHomePageActions videoHomePageActions;

    @Then("user plays any video from the tile")
    public void plays_any_video_from_the_tile() {
        videoHomePageActions.playfirstVideo();
    }

    @Then("user ensures the ad is played before video")
    public void ensures_the_ad_is_played_before_video() {
        assertThat("Validate ad is played before video",videoHomePageActions.adCheck(),is(true));
    }


    @And("user validates the play or pause button")
    public void userValidatesThePlayOrPauseButton() {

        assertThat("Validate play pause button is working",videoHomePageActions.playPauseCheck(),containsString("playing"));
        videoHomePageActions.playPauseVideo();
        assertThat("Validate play pause button is working",videoHomePageActions.playPauseCheck(),containsString("paused"));
    }

}
