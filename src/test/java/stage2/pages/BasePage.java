package stage2.pages;

import org.openqa.selenium.support.PageFactory;
import stage2.utilities.Driver;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
