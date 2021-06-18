

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QustodioChallenge {


    static String siteToTest ="https://family.qustodio.com/parents-app#";
    static WebDriver tstchromeDriver ;

    @Before
    public void testSetup (){

        // Create an instance of the Helper
        Helper chromeDriverHelper = new Helper();

        tstchromeDriver = chromeDriverHelper.GetChromeDriverPage(siteToTest);

        // Accept the cookies message
        //tstchromeDriver.findElement(By.cssSelector(".vzKQHb.K2OSr")).click();

    }

    @After
    public void CloseBrowser (){
        // Close any open instance of ChromeDriver
        //chromeDriver.quit();
    }
    @Test
    public void ClickOnTaxilink(){
        otuschlingSite mainSite = new otuschlingSite(tstchromeDriver);

        mainSite.clickTaxidbarcelonaLink();
    }


    @Test
    public void ClickPaginasWeb (){
        otuschlingSite mainSite = new otuschlingSite(tstchromeDriver);

        mainSite.clickPginasWeb2Link();

    }

    @Test
    public void CheckBrokenLinksTest(){
        WebDriver tstWebDrv;
        String homePage = "https://family.qustodio.com/parents-app#";

        // Create an instance of the Helper
        Helper chromeDriverHelper = new Helper();

        tstWebDrv = chromeDriverHelper.GetChromeDriverPage(homePage);
        chromeDriverHelper.CheckBrokenLinks(tstWebDrv, homePage);

    }

    @Test
    public void TestCase_01() {
        QustodioLogin("otuschling@gmail.com", "Aleixlaia0811");

        QustodioMainPage mainpage = new QustodioMainPage(tstchromeDriver);

        mainpage.ClickYourAccountItem();

        mainpage.clicktextNamelastnameButton();
        mainpage.ClickBackArrow();
        //mainpage.clicktextEmailButton();
        //mainpage.ClickBackArrow();
        //mainpage.clicktextTimeZoneButton();
        //mainpage.ClickBackArrow();
        //mainpage.clicktextLanguageButton();
        //mainpage.ClickBackArrow();
        //mainpage.clicktextCountryButton();
        //mainpage.ClickBackArrow();
    }

    public void QustodioMainSelectFamilyItem(){
        QustodioMainPage mainpage = new QustodioMainPage(tstchromeDriver);
        mainpage.ClickOnTestProfile();
    }

    public void QustodioClickYourAccountItem(){
        QustodioMainPage mainpage = new QustodioMainPage(tstchromeDriver);
        mainpage.ClickYourAccountItem();
    }

    public void QustodioLogin (String username, String password){
        QustodioLoginPage login = new QustodioLoginPage(tstchromeDriver);

        login.setUserName(username);
        login.setPassword(password);

        login.clickIniciarSesinButton();
    }

}
