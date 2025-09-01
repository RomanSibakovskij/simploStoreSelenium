package cz.simploshop.demo.utilities;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;
import cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal.*;
import cz.simploshop.demo.loggers.*;
import cz.simploshop.demo.web.element.asserts.*;
import cz.simploshop.demo.text.element.asserts.*;
import cz.simploshop.demo.screenshot.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.slf4j.*;

public class TestMethods extends BaseTest implements PageWebElementAsserts, PageTextElementAsserts, PageDataLoggers, ScreenshotMethod {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //navigate to 'Register' account modal test method
    protected void navigateToRegisterAccountModalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
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
        //wait for elements to load
        generalPage.waitForElementsToLoad(1500);
        //click "Password strength" dropdown button
        registerAccountModal.clickPasswordStrengthDropdownButton();
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
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

    //invalid user register account tests

    //no singular input

    //invalid register account modal test method - no first name
    protected void invalidRegisterAccountModalNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalNoSingularInput registerAccountModalNoSingularInput = new RegisterAccountModalNoSingularInput(driver);
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
        //don't input register first name into first name input field
        registerAccountModalNoSingularInput.inputNoFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalNoSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalNoSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalNoSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalNoSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - no first name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - No First Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The missing first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing first name input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No First Name");
    }

    //invalid register account modal test method - no last name
    protected void invalidRegisterAccountModalNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalNoSingularInput registerAccountModalNoSingularInput = new RegisterAccountModalNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - no last name
        registerAccountModalNoSingularInput.invalidRegisterInputDataNoLastNameGetter();
        //input valid register first name into first name input field
        registerAccountModalNoSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //don't input register last name into last name input field
        registerAccountModalNoSingularInput.inputNoLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalNoSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalNoSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalNoSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - no last name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - No Last Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The missing last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing last name input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Last Name");
    }

    //invalid register account modal test method - no email
    protected void invalidRegisterAccountModalNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalNoSingularInput registerAccountModalNoSingularInput = new RegisterAccountModalNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - no email
        registerAccountModalNoSingularInput.invalidRegisterInputDataNoEmailGetter();
        //input valid register first name into first name input field
        registerAccountModalNoSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalNoSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //don't input register email into email input field
        registerAccountModalNoSingularInput.inputNoEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalNoSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalNoSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - no email
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - No Email");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The missing email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing email input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Email");
    }

    //invalid register account modal test method - no password/confirm password
    protected void invalidRegisterAccountModalNoPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalNoSingularInput registerAccountModalNoSingularInput = new RegisterAccountModalNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - no password
        registerAccountModalNoSingularInput.invalidRegisterInputDataNoPasswordGetter();
        //input valid register first name into first name input field
        registerAccountModalNoSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalNoSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalNoSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //don't input register password into password input field
        registerAccountModalNoSingularInput.inputNoPasswordIntoRegisterPasswordInputField();
        //don't input register confirm password into confirm password input field
        registerAccountModalNoSingularInput.inputNoConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //capture screenshot of the register account modal display after invalid data input - no password
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - No Password And Confirm Password");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The missing password/confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing password/confirm password input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Password And Confirm Password");
    }

    //too short singular input

    //invalid register account modal test method - too short first name (1 char)
    protected void invalidRegisterAccountModalTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooShortSingularInput registerAccountModalTooShortSingularInput = new RegisterAccountModalTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - too short first name (1 char)
        registerAccountModalTooShortSingularInput.invalidRegisterInputDataTooShortFirstNameGetter();
        //input too short register first name into first name input field (1 char)
        registerAccountModalTooShortSingularInput.inputTooShortFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooShortSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooShortSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooShortSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooShortSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too short first name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Short First Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too short first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short First Name");
            throw new Error("The too short first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short First Name");
    }

    //invalid register account modal test method - too short last name (1 char)
    protected void invalidRegisterAccountModalTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooShortSingularInput registerAccountModalTooShortSingularInput = new RegisterAccountModalTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - too short last name (1 char)
        registerAccountModalTooShortSingularInput.invalidRegisterInputDataTooShortLastNameGetter();
        //input valid register first name into first name input field
        registerAccountModalTooShortSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input too short register last name into last name input field
        registerAccountModalTooShortSingularInput.inputTooShortLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooShortSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooShortSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooShortSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too short last name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Short Last Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too short last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Last Name");
            throw new Error("The too short last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Last Name");
    }

    //invalid register account modal test method - too short email (1 char -> name, domain)
    protected void invalidRegisterAccountModalTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooShortSingularInput registerAccountModalTooShortSingularInput = new RegisterAccountModalTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1700);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (header section text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //register account modal web element assert
        isRegisterAccountModalWebElementDisplayed(registerAccountModal);
        //register account modal page text element assert
        isRegisterAccountModalTextElementAsExpected(registerAccountModal);
        //capture screenshot of the register account modal display before data input
        captureScreenshot(driver, "Register Account Modal Display Before Data Input");
        //invalid register account modal data getter - too short email (1 char -> name, domain)
        registerAccountModalTooShortSingularInput.invalidRegisterInputDataTooShortEmailGetter();
        //input valid register first name into first name input field
        registerAccountModalTooShortSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooShortSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input too short register email into email input field (1 char -> name, domain)
        registerAccountModalTooShortSingularInput.inputTooShortEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooShortSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooShortSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too short email
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Short Email");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too short email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Email");
            throw new Error("The too short email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Email");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
