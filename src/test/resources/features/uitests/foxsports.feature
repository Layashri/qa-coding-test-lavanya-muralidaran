Feature: Foxtel streaming and news article validation

  @foxsports @uitests @regression
  Scenario: To validate play and pause in Video section flow
    Given user is navigating to foxtel sports site
    When user navigates to video section from the menu
    Then user plays any video from the tile
    And user ensures the ad is played before video
    And user validates the play or pause button

  @foxsports @uitests @newsArticle @regression
  Scenario: To validate latest new article components
    Given user is navigating to foxtel sports site
    When user clicks on sports through hamburger menu
    Then user navigates to "Football" latest news page
    Then user validates Article title is present in the page
    And user validates Description is present in the page
    And user validates hero image is present in the page
