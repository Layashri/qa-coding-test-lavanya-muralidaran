package uitests.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import uitests.actions.HomePageActions;
import uitests.actions.NewsArticlepageActions;
import uitests.actions.VideoHomePageActions;


public class HomePageStepDefs {

    @Steps
    HomePageActions homePageActions;

    @Steps
    VideoHomePageActions videoHomePageActions;

    @Steps
    NewsArticlepageActions newsArticlepageActions;




    @Given("user is navigating to foxtel sports site")
    public void navigating_to_foxtel_sports_site() {
        homePageActions.openFoxHomepage();

    }

    @When("user navigates to video section from the menu")
    public void navigates_to_video_section_from_the_menu() {
        homePageActions.clickVideoslink();
    }


    @When("user clicks on sports through hamburger menu")
    public void userClicksOnSportsThroughHamburgerMenu() {
        homePageActions.clickHamburgerMenu();
    }



    @And("user selects {string} from the list")
    public void userSelectsFromTheList(String arg0) {

    }

    @Then("user should see the sports listed out")
    public void userShouldSeeTheSportsListedOut() {

    }

    @And("user selects {string} from the sublist")
    public void userSelectsFromTheSublist(String arg0) {
    }

    @Then("user navigates to {string} latest news page")
    public void userNavigatesToLatestNewsPage(String arg0) {
            homePageActions.navigateToLatestNews();
            newsArticlepageActions.clickOnfirstArticle();
            newsArticlepageActions.waitOnPage();
    }

}
