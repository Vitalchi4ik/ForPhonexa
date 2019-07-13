package properties;

import data.TestData;
import org.openqa.selenium.WebDriver;
import pages.SignUpPage;

public class GeneralActions {
    private final WebDriver driver;

    public GeneralActions(final WebDriver driver){
        this.driver = driver;
    }

    TestData testData = new TestData();

    public void openPage(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.open();
    }

    public boolean registrationTitleDisplay(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.registrationTitleIsDisplay().isDisplayed();
    }

    public boolean validationOfTheFieldVasheImyaIsDisplay(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationFieldVasheImyaIsDisplay().isDisplayed();
    }

    public boolean validationOfTheFieldEmailOrPhoneIsDisplay(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationFieldEmailOrPhoneIsDisplay().isDisplayed();
    }

    public boolean validationOfTheFieldPasswordIsDisplay(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationFieldPasswordIsDisplay().isDisplayed();
    }

    public boolean validationVasheImyaFieldWithLess2Symbols(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationVasheImyaField(testData.getLessThan2Symbols()).isDisplayed();
    }

    public boolean validationVasheImyaFieldWithMore50Symbols(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationVasheImyaField(testData.getMoreThan50Symols()).isDisplayed();
    }

    public boolean validationEmailOrPhoneFieldLess5Symbols(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationEmailOrPhoneField(testData.getLessThan5Symbols()).isDisplayed();
    }

    public boolean validationPasswordFieldLess6Symbols(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage.validationPasswordField(testData.getLessThan6Symbols()).isDisplayed();
    }


}
