@search
Feature:search
  As a end user
  I want to search
  so that I can view

  @smoke
  Scenario:Searchitem
  Given I launch a  Chrome Browser
  And I open the URL on the browser
  When I search for item
  Then I should  view the item
