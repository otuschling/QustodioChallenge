
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QustodioLoginPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "button.rck-btn.rck-btn--block.rck-btn--success.rck-btn--small.rck-btn--centered")
    @CacheLookup
    private WebElement ampliaYa;

    @FindBy(name = "username")
    @CacheLookup
    private WebElement enterUserName;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement enterPassword;

    @FindBy(css = "a.Login__passwordLink")
    @CacheLookup
    private WebElement hasOlvidadoTuContrasea;

    @FindBy(css = "#root div.ReactRoot div.App div.Login.Screen div.Screen__content div.Login__content div:nth-of-type(1) div.section.container div:nth-of-type(3) button.rck-btn.rck-btn--block.rck-btn--small.rck-btn--centered")
    @CacheLookup
    private WebElement iniciarSesin;

    private final String pageLoadedText = "Gestiona y limita el tiempo que tus hijos pueden utilizar cada dispositivo";

    private final String pageUrl = "/parents-app#/login/LICENSE_FREE";

    @FindBy(css = "a[href='https://www.qustodio.com']")
    @CacheLookup
    private WebElement qustodiologin389ea39d;

    public QustodioLoginPage() {
    }

    public QustodioLoginPage(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public QustodioLoginPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
        PageFactory.initElements(driver, this);
    }

    public QustodioLoginPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
        PageFactory.initElements(driver, this);
    }

    /**
     * Click on Amplia Ya Button.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage clickAmpliaYaButton() {
        ampliaYa.click();
        return this;
    }

    /**
     * Click on Has Olvidado Tu Contrasea Link.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage clickHasOlvidadoTuContraseaLink() {
        hasOlvidadoTuContrasea.click();
        return this;
    }

    /**
     * Click on Iniciar Sesin Button.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage clickIniciarSesinButton() {
        iniciarSesin.click();
        return this;
    }

    /**
     * Click on Qustodiologin.389ea39d Link.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage clickQustodiologin389ea39dLink() {
        qustodiologin389ea39d.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage fill() {
        setUserName();
        setPassword();
        return this;
    }

    /**
     * Set default value to Bienvenido A Qustodiointroduce Tus Datos En El Formulario Que Aparece A Continuacininiciar Sesinhas Olvidado Tu Contrasea Password field.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage setUserName() {
        return setUserName(data.get("BIENVENIDO_A_QUSTODIOINTRODUCE_TUS_DATOS_EN_1"));
    }

    /**
     * Set value to Bienvenido A Qustodiointroduce Tus Datos En El Formulario Que Aparece A Continuacininiciar Sesinhas Olvidado Tu Contrasea Password field.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage setUserName(String bienvenidoAQustodiointroduceTusDatosEn1Value) {
        enterUserName.sendKeys(bienvenidoAQustodiointroduceTusDatosEn1Value);
        return this;
    }

    /**
     * Set default value to Bienvenido A Qustodiointroduce Tus Datos En El Formulario Que Aparece A Continuacininiciar Sesinhas Olvidado Tu Contrasea Password field.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage setPassword() {
        return setPassword(data.get("BIENVENIDO_A_QUSTODIOINTRODUCE_TUS_DATOS_EN_2"));
    }

    /**
     * Set value to Bienvenido A Qustodiointroduce Tus Datos En El Formulario Que Aparece A Continuacininiciar Sesinhas Olvidado Tu Contrasea Password field.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage setPassword(String bienvenidoAQustodiointroduceTusDatosEn2Value) {
        enterPassword.sendKeys(bienvenidoAQustodiointroduceTusDatosEn2Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage verifyPageLoaded() {
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
     * @return the QustodioLoginPage class instance.
     */
    public QustodioLoginPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
