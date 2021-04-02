@web

  Feature:  DarkSky Feature

    Background: :
      Given I am on darsky page

      @login

      Scenario: Verify the lowest and highest temp is displayed correctly

        When I click on Today Section

        And  I check the lowest and highest temp
        Then Verify the lowest and highest temp is displayed correctly

