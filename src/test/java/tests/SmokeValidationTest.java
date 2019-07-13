package tests;


import org.testng.annotations.Test;
import properties.BaseTest;
import static org.testng.Assert.assertTrue;

public class SmokeValidationTest extends BaseTest {

    @Test
    public void checkTitleIsDisplay() throws Exception {
        actions.openPage();
        assertTrue(actions.registrationTitleDisplay(), "page does not have a tag with text \"Регистрация\"");
    }

    @Test
    public void checkValidationVasheImyaLess2Symbols() throws Exception{
        actions.openPage();
        assertTrue(actions.validationVasheImyaFieldWithLess2Symbols(), "validation of field \"Ваше имя \" is missing when fill text less than 2 symbols");
        assertTrue(actions.validationOfTheFieldEmailOrPhoneIsDisplay(), "validation of field \"Эл. почта или телефон \" is missing when fill \"Ваше имя \" field less than 2 symbols");
        assertTrue(actions.validationOfTheFieldPasswordIsDisplay(), "validation of field \"Придумайте пароль \" is missing when fill \"Ваше имя \" field less than 2 symbols");
    }

    @Test
    public void checkValidationVasheImyaMore50Symbols() throws Exception{
        actions.openPage();
        assertTrue(actions.validationVasheImyaFieldWithMore50Symbols(), "validation of field \"Ваше имя \" is missing when fill text more than 50 symbols");
        assertTrue(actions.validationOfTheFieldEmailOrPhoneIsDisplay(), "validation of field \"Эл. почта или телефон \" is missing when fill \"Ваше имя \" field more than 50 symbols");
        assertTrue(actions.validationOfTheFieldPasswordIsDisplay(), "validation of field \"Придумайте пароль \" is missing when fill \"Ваше имя \" field more than 50 symbols");
    }

    @Test
    public void checkValidationEmailOrPhoneLess5Symbols() throws Exception{
        actions.openPage();
        assertTrue(actions.validationEmailOrPhoneFieldLess5Symbols(), "validation of field \"Эл. почта или телефон \" is missing when fill text more than 50 symbols");
        assertTrue(actions.validationOfTheFieldVasheImyaIsDisplay(), "validation of field \"Ваше имя \" is missing when fill \"Эл. почта или телефон \" field more than 50 symbols");
        assertTrue(actions.validationOfTheFieldPasswordIsDisplay(), "validation of field \"Придумайте пароль \" is missing when fill \"Эл. почта или телефон \" field more than 50 symbols");
    }

    @Test
    public void checkValidationPasswordLess6Symbols() throws Exception{
        actions.openPage();
        assertTrue(actions.validationPasswordFieldLess6Symbols(), "validation of field \"Придумайте пароль \" is missing when fill text less than 6 symbols");
        assertTrue(actions.validationOfTheFieldVasheImyaIsDisplay(), "validation of field \"Ваше имя \" is missing when fill \"Придумайте пароль \" field less than 6 symbols");
        assertTrue(actions.validationOfTheFieldEmailOrPhoneIsDisplay(), "validation of field \"Эл. почта или телефон \" is missing when fill \"Придумайте пароль \" field less than 6 symbols");
    }
}
