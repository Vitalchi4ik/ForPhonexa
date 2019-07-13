package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Properties;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class SignUpPage extends Page {

    @CacheLookup
    @FindBy(className = "signup-title")
    private WebElement registrationTitle;

    @CacheLookup
    @FindBy (name = "title")
    private WebElement vasheImya;

    @CacheLookup
    @FindBy (xpath = "//input[@name='title'and @class='input-text auth-input-text']")
    private WebElement validVasheImya;

    @CacheLookup
    @FindBy (xpath = "//input[@name='title'and @class='input-text auth-input-text input-invalid']")
    private WebElement invalidVasheImya;

    @CacheLookup
    @FindBy (name = "login")
    private WebElement emailOrLogin;

    @CacheLookup
    @FindBy (xpath = "//input[@name='login'and @class='input-text auth-input-text']")
    private WebElement validEmailOrLogin;

    @CacheLookup
    @FindBy (xpath = "//input[@name='login'and @class='input-text auth-input-text input-invalid']")
    private WebElement invalidEmailOrLogin;

    @CacheLookup
    @FindBy (name = "password")
    private WebElement password;

    @CacheLookup
    @FindBy (xpath = "//input[@name='password'and @class='input-text auth-input-text']")
    private WebElement validPassword;

    @CacheLookup
    @FindBy (xpath = "//input[@name='password'and @class='input-text auth-input-text input-invalid']")
    private WebElement invalidPassword;

    @CacheLookup
    @FindBy (className = "signup-submit")
    private WebElement zaregestrirovatsa;


    public SignUpPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignUpPage open() {
        getDriver().get(Properties.getBaseUrl());
        return this;
    }

    public WebElement registrationTitleIsDisplay() {
        getWait().until(visibilityOf(registrationTitle));
        return registrationTitle;
    }

    public WebElement validationFieldVasheImyaIsDisplay(){
        return invalidVasheImya;
    }

    public WebElement validationFieldEmailOrPhoneIsDisplay(){
        return invalidEmailOrLogin;
    }

    public WebElement validationFieldPasswordIsDisplay(){
        return invalidPassword;
    }

    public WebElement validationVasheImyaField(String invalidValueName){
        registrationTitleIsDisplay();
        vasheImya.sendKeys(invalidValueName);
        zaregestrirovatsa.click();
        getWait().until(visibilityOf(invalidVasheImya));
        return invalidVasheImya;
    }

    public WebElement validationEmailOrPhoneField(String invalidValuedEmailPhone){
        registrationTitleIsDisplay();
        emailOrLogin.sendKeys(invalidValuedEmailPhone);
        zaregestrirovatsa.click();
        getWait().until(visibilityOf(invalidEmailOrLogin));
        return invalidEmailOrLogin;
    }

    public WebElement validationPasswordField(String invalidValuePassword){
        registrationTitleIsDisplay();
        password.sendKeys(invalidValuePassword);
        zaregestrirovatsa.click();
        getWait().until(visibilityOf(invalidPassword));
        return invalidPassword;
    }
}
