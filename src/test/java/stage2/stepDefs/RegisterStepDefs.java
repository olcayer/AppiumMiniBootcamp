package stage2.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import stage2.pages.RegisterPage;
import stage2.utilities.ConfigurationReader;
import stage2.utilities.Driver;

public class RegisterStepDefs {

    RegisterPage registerPage= new RegisterPage();

    @Given("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() {

        Driver.get().get(ConfigurationReader.get("url"));
      //  registerPage.demoSiteButton.click();
        registerPage.consentButton.click();
    }

    @When("I enter {string} in the first name and enter {string} in the last name")
    public void i_enter_in_the_first_name_and_enter_in_the_last_name(String firstName, String lastName) {
        registerPage.firstNameInput.sendKeys(firstName);
        registerPage.lastNameInput.sendKeys(lastName);

    }
    @When("I enter {string} in the address field")
    public void i_enter_in_the_address_field(String address) {
        registerPage.addressInput.sendKeys(address);

    }
    @When("I enter {string} in the email address field")
    public void i_enter_in_the_email_address_field(String email) {
        registerPage.emailInput.sendKeys(email);

    }

    @And("I enter {string} in the phone field")
    public void iEnterInThePhoneField(String phone) {
        registerPage.phoneInput.sendKeys(phone);

    }

    @And("I enter {string} as gender")
    public void iEnterAsGender(String male) {
        registerPage.selectGender(male);

    }

    @And("I select skill as {string}")
    public void iSelectSkillAs(String skillName) {
        registerPage.selectSkill(skillName);
    }

    @And("I check {string} as a Hobby")
    public void iCheckAsAHobby(String hobby) {
        registerPage.selectHobby(hobby);
    }
}
