package homepage;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.HomePagePOM;

public class HomePage extends MobileAPI {

    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setPageFactory() {
        homePagePOM = PageFactory.initElements(appiumDriver, HomePagePOM.class);
    }

    @Test
    public void allowAccessFiles() {
        homePagePOM.allowAccessFiles();
    }


}
