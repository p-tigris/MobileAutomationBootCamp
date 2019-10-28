package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    WebElement allowAccess;


    public void allowAccessFiles() {
        allowAccess.click();
    }
}
