Feature: List Movies

  Scenario: Customers see details of a movie
    Given Movies have a name, year, director and movie rating (from 1-10 or unrated).
    Then Details of a movie should appear in the list.

  Scenario: Customers list movies
    Given I would like to see a list of available movies, so that I can browse for a movie that I might check-out.
    Then Available movies should appear in the list.

