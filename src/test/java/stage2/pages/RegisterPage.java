package stage2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import stage2.utilities.Driver;

public class RegisterPage extends BasePage{



    @FindBy (xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameInput;

    @FindBy (xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy (css = "[ng-model='Adress']")
    public WebElement addressInput;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailInput;

    @FindBy (xpath = "//input[@type='tel']")
    public WebElement phoneInput;

    @FindBy (xpath = "//input[@value='Male']")
    public WebElement male;

    @FindBy (css= "#Skills")
    public WebElement skillsDropDown;


    public void selectGender(String gender){
        Driver.get().findElement(By.xpath("//input[@value='"+gender+"']")).click();


    }

    public void selectSkill(String skillName){
        Select select=new Select(skillsDropDown);
        select.selectByVisibleText(skillName);
    }

    public void selectHobby(String hobby){
        Driver.get().findElement(By.xpath("//input[@value='"+hobby+"']")).click();
    }






    @FindBy (xpath = "//*[text()='Consent']")
    public WebElement consentButton;


}
