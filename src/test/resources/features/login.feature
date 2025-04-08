Feature:
  As a new user
  I want to register on the website

  @wip
  Scenario: Register with valid data
    Given I navigate to the registration page
    When I enter "John" in the first name and enter "Doe" in the last name
    And I enter "123 Stree, City" in the address field
    And I enter "johndoe@test.com" in the email address field
    And I enter "+447415744416" in the phone field
    And I enter "Male" as gender
    And I select skill as "Adobe Photoshop"
    And I check "Movies" as a Hobby