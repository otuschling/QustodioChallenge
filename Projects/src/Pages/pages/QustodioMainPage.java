
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QustodioMainPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) ul.rck-side-navigation-menu__list li:nth-of-type(4) a.rck-side-navigation-menu__anchor")
    @CacheLookup
    private WebElement centroDeAyuda;

    @FindBy(id = "isDailyReport")
    @CacheLookup
    private WebElement correoConResumenDiario;

    @FindBy(id = "isWeeklyReport")
    @CacheLookup
    private WebElement correoConResumenSemanal;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(2) div:nth-of-type(4) button.rck-action-input")
    @CacheLookup
    private WebElement textLanguage;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(2) div:nth-of-type(5) button.rck-action-input")
    @CacheLookup
    private WebElement textTimeZone;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(2) div:nth-of-type(1) button.rck-action-input")
    @CacheLookup
    private WebElement textNamelastname;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(2) div:nth-of-type(2) button.rck-action-input")
    @CacheLookup
    private WebElement textEmail;

    private final String pageLoadedText = "Accede a más dispositivos y funciones con Premium";

    private final String pageUrl = "/parents-app#/account-settings";

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(1) div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--margin-bottom-spacing-16 div:nth-of-type(2) div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column a div:nth-of-type(2) button.rck-btn.rck-btn--ui.rck-btn--success.rck-btn--small.rck-btn--centered")
    @CacheLookup
    private WebElement pasaAPremiumAhora;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(1) div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--margin-bottom-spacing-16 div:nth-of-type(2) div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column a")
    @CacheLookup
    private WebElement protege1PerfilY1Dispositivosconsigue;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(1) a.SideBar__bottomBox.SideBar__bottomBox--free div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-row.rck-layout--margin-bottom-spacing-16 button.rck-btn.rck-btn--ui.rck-btn--success.rck-btn--small.rck-btn--centered")
    @CacheLookup
    private WebElement qustodioFree;

    @FindBy(css = "a.SideBar__bottomBox.SideBar__bottomBox--free")
    @CacheLookup
    private WebElement qustodioFreeaccedeAMsDispositivosY;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) ul.rck-side-navigation-menu__list li:nth-of-type(5) a.rck-side-navigation-menu__anchor")
    @CacheLookup
    private WebElement salir;

    @FindBy(css = "#root div.ReactRoot div.App div.Main div:nth-of-type(2) div:nth-of-type(2) div.AccountSettings.Screen div:nth-of-type(2) div.Screen__content.PageContent__content-wrapper div.PageContent__content. div.rck-layout.rck-flex-layout.rck-flex-layout--main-axis-column.rck-layout--padding-left-spacing-72.rck-layout--padding-right-spacing-72.rck-layout--padding-top-spacing-24.rck-layout--padding-bottom-spacing-40 div:nth-of-type(2) div:nth-of-type(6) button.rck-action-input")
    @CacheLookup
    private WebElement textCountry;

    @FindBy(css = "a.rck-side-navigation-menu__anchor.rck-side-navigation-menu__anchor--active")
    @CacheLookup
    private WebElement tuCuenta;

    @FindBy(css = "a[href='#/']")
    @CacheLookup
    private WebElement tuFamilia;

    @FindBy(css = "a[href='#/devices']")
    @CacheLookup
    private WebElement tusDispositivos;

    public QustodioMainPage() {
    }

    public QustodioMainPage(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public QustodioMainPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
        PageFactory.initElements(driver, this);
    }

    public QustodioMainPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
        PageFactory.initElements(driver, this);
    }

    /**
     * Click on Centro De Ayuda Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickCentroDeAyudaLink() {
        centroDeAyuda.click();
        return this;
    }



    public void ClickOnTestProfile (){
        driver.findElement(By.className("ProfileListItem__name")).click();

    }

    public void ClickYourAccountItem (){
       // driver.findElement(By.tagName("Tu Cuenta")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/ul/li[3]")).click();
                //("rck-side-navigation-menu__anchor__text")).click();

    }
    public void ClickBackArrow (){
        // driver.findElement(By.tagName("Tu Cuenta")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/a/span/svg")).click();
        //("rck-side-navigation-menu__anchor__text")).click();

    }
    /**
     * Click on textTimeZone Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public void clicktextTimeZoneButton() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/div[5]/button/label")).click();

    }

    /**
     * Click on textLanguage Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public void clicktextLanguageButton() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/div[4]/button/label")).click();

    }

    /**
     * Click on Oliver Tuschling Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public void clicktextNamelastnameButton() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/div[1]/button")).click();
    }

    /**
     * Click on Otuschlinggmail.com Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public void clicktextEmailButton() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/div[2]/button/label")).click();

    }

    /**
     * Click on Pasa A Premium Ahora Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickPasaAPremiumAhoraButton() {
        pasaAPremiumAhora.click();
        return this;
    }

    /**
     * Click on Protege 1 Perfil Y 1 Dispositivosconsigue Mucho Ms Con Premiumpasa A Premium Ahora Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickProtege1PerfilY1DispositivosconsigueLink() {
        protege1PerfilY1Dispositivosconsigue.click();
        return this;
    }

    /**
     * Click on Qustodio Free Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickQustodioFreeButton() {
        qustodioFree.click();
        return this;
    }

    /**
     * Click on Qustodio Freeaccede A Ms Dispositivos Y Funciones Con Premium.pasa A Premium Ahora Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickQustodioFreeaccedeAMsDispositivosYLink() {
        qustodioFreeaccedeAMsDispositivosY.click();
        return this;
    }

    /**
     * Click on Salir Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickSalirLink() {
        salir.click();
        return this;
    }

    /**
     * Click on textCountry Button.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clicktextCountryButton() {
        textCountry.click();
        return this;
    }

    /**
     * Click on Tu Cuenta Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickTuCuentaLink() {
        tuCuenta.click();
        return this;
    }

    /**
     * Click on Tu Familia Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickTuFamiliaLink() {
        tuFamilia.click();
        return this;
    }

    /**
     * Click on Tus Dispositivos Link.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage clickTusDispositivosLink() {
        tusDispositivos.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage fill() {
        setCorreoConResumenDiarioCheckboxField();
        setCorreoConResumenSemanalCheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Correo Con Resumen Diario Checkbox field.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage setCorreoConResumenDiarioCheckboxField() {
        if (!correoConResumenDiario.isSelected()) {
            correoConResumenDiario.click();
        }
        return this;
    }

    /**
     * Set Correo Con Resumen Semanal Checkbox field.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage setCorreoConResumenSemanalCheckboxField() {
        if (!correoConResumenSemanal.isSelected()) {
            correoConResumenSemanal.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage submit() {
        clicktextNamelastnameButton();
        return this;
    }

    /**
     * Unset Correo Con Resumen Diario Checkbox field.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage unsetCorreoConResumenDiarioCheckboxField() {
        if (correoConResumenDiario.isSelected()) {
            correoConResumenDiario.click();
        }
        return this;
    }

    /**
     * Unset Correo Con Resumen Semanal Checkbox field.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage unsetCorreoConResumenSemanalCheckboxField() {
        if (correoConResumenSemanal.isSelected()) {
            correoConResumenSemanal.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the QustodioMainPage class instance.
     */
    public QustodioMainPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}