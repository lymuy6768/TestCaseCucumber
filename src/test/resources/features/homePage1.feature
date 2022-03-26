@homePage1
Feature: homePage1
 
 @homePage1
  Scenario: Navigate to homepage and test whether the Home page has Three Sliders only
    Given User is on homepage
    When User navigate to ShopPage
    When User navigate to HomePage
    Then the homePage should has only three sliders
    And the homePage has only three sliders


   
