package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    WebElement allowAccess;

    @FindBy(xpath = "//android.widget.Button[@text='SIGN UP']")
    WebElement signUpButton;

    public void allowAccessFiles() {
        allowAccess.click();
    }

    public void signUp() {
        signUpButton.click();
    }
}
