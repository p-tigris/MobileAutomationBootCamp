package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePagePOM {

    @FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    WebElement allowAccess;

    @FindBy(xpath = "//android.widget.Button[@text='DENY']")
    WebElement denyAccess;

    @FindBy(xpath = "//android.widget.Button[@text='SIGN UP']")
    WebElement signUpButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='App Logo']")
    WebElement espnLogo;


    public void allowAccessFiles() {
        allowAccess.click();
    }

    public void denyAccessLocation() {
        denyAccess.click();
    }

    public void signUp() {
        signUpButton.click();
    }

    public void validateESPN() {
        Assert.assertEquals(espnLogo.isDisplayed(), true, "ESPN logo is not displayed");
        TestLogger.log("Homepage validation status: " + espnLogo.isDisplayed());
    }
}
