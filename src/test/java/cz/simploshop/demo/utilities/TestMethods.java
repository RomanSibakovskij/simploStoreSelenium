package cz.simploshop.demo.utilities;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;
import cz.simploshop.demo.loggers.*;
import cz.simploshop.demo.web.element.asserts.*;
import cz.simploshop.demo.text.element.asserts.*;
import cz.simploshop.demo.screenshot.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest implements PageWebElementAsserts, PageTextElementAsserts, PageDataLoggers, ScreenshotMethod {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //navigate to 'Register' account modal test method
    protected void navigateToRegisterAccountModalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1500);
        //general page warning box web element assert (displayed only once for each test start before the user clicks a button)
        isGeneralPageWarningBoxWebElementDisplayed(generalPage);
        //general page warning box text element assert (displayed only once for each test start before the user clicks a button)
        isGeneralPageWarningBoxTextElementAsExpected(generalPage);
        //click 'Close' warning box button
        generalPage.clickCloseWarningBoxButton();
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (footer section) web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page (header section) text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //general page (footer section) text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementIsAsExpected(homePage);
        //capture screenshot of the home page display
        captureScreenshot(driver, "Home Page Display");
        //log home page product data
        logHomePageProductData(homePage);
        //log home page latest article data
        logHomePageLatestArticleData(homePage);
        //click "Register" button
        generalPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "User Navigation To Register Account Modal Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user register account test

    //valid register account modal test method
    protected void validRegisterAccountModalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //click "Password strength" dropdown button
        registerAccountModal.clickPasswordStrengthDropdownButton();
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //valid register account modal data getter
        registerAccountModal.validRegisterInputDataGetter();
        //input valid register first name into first name input field
        registerAccountModal.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModal.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModal.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModal.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModal.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after valid data input
        captureScreenshot(driver, "Register Account Modal Display After Valid Data Input");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user account gets created
        assertEquals(registerAccountModal.getUsername(), generalPage.getUpperHeaderUsername(), "The usernames don't match expectations or the user account creation process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Creation Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
