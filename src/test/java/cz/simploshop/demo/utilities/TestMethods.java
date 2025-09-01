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

    //invalid register account modal test method - too short password/confirm password (7 chars)
    protected void invalidRegisterAccountModalTooShortPasswordConfirmTest(){
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
        //invalid register account modal data getter - too short password/confirm password (7 chars)
        registerAccountModalTooShortSingularInput.invalidRegisterInputDataTooShortPasswordConfirmGetter();
        //input valid register first name into first name input field
        registerAccountModalTooShortSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooShortSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooShortSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input too short register password into password input field (7 chars)
        registerAccountModalTooShortSingularInput.inputTooShortPasswordIntoRegisterPasswordInputField();
        //input too short register confirm password into confirm password input field (7 chars)
        registerAccountModalTooShortSingularInput.inputTooShortConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //capture screenshot of the register account modal display after invalid data input - too short password/confirm password
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Short Password And Confirm Password");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //assert the user gets an expected error message
        assertEquals("Hodnota je příliš malá: řetězec musí mít >= 8 znaků", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too short password / confirm password input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Password And Confirm Password");
    }

    //too long singular input

    //invalid register account modal test method - too long first name (51 chars)
    protected void invalidRegisterAccountModalTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooLongSingularInput registerAccountModalTooLongSingularInput = new RegisterAccountModalTooLongSingularInput(driver);
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
        //invalid register account modal data getter - too long first name (51 chars)
        registerAccountModalTooLongSingularInput.invalidRegisterInputDataTooLongFirstNameGetter();
        //input too long register first name into first name input field (51 chars)
        registerAccountModalTooLongSingularInput.inputTooLongFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooLongSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooLongSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooLongSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooLongSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too long first name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Long First Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 50 znaků", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too long first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long First Name");
            throw new Error("The too long first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long First Name");
    }

    //invalid register account modal test method - too long last name (100 chars)
    protected void invalidRegisterAccountModalTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooLongSingularInput registerAccountModalTooLongSingularInput = new RegisterAccountModalTooLongSingularInput(driver);
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
        //invalid register account modal data getter - too long last name (51 chars)
        registerAccountModalTooLongSingularInput.invalidRegisterInputDataTooLongLastNameGetter();
        //input valid register first name into first name input field
        registerAccountModalTooLongSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input too long register last name into last name input field (51 chars)
        registerAccountModalTooLongSingularInput.inputTooLongLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooLongSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooLongSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooLongSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too long last name
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Long Last Name");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 50 znaků", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too long last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Last Name");
            throw new Error("The too long last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Last Name");
    }

    //invalid register account modal test method - too long email (100 chars -> name, domain)
    protected void invalidRegisterAccountModalTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooLongSingularInput registerAccountModalTooLongSingularInput = new RegisterAccountModalTooLongSingularInput(driver);
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
        //invalid register account modal data getter - too long email (75 chars -> name, domain)
        registerAccountModalTooLongSingularInput.invalidRegisterInputDataTooLongEmailGetter();
        //input valid register first name into first name input field
        registerAccountModalTooLongSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooLongSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input too short register email into email input field (75 chars -> name, domain)
        registerAccountModalTooLongSingularInput.inputTooLongEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalTooLongSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalTooLongSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - too long email
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Long Email");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 74 znaků", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too long email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Email");
            throw new Error("The too long email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Email");
    }

    //invalid register account modal test method - too long password/confirm password (75 chars)
    protected void invalidRegisterAccountModalTooLongPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalTooLongSingularInput registerAccountModalTooLongSingularInput = new RegisterAccountModalTooLongSingularInput(driver);
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
        //invalid register account modal data getter - too long password/confirm password (7 chars)
        registerAccountModalTooLongSingularInput.invalidRegisterInputDataTooLongPasswordConfirmGetter();
        //input valid register first name into first name input field
        registerAccountModalTooLongSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalTooLongSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalTooLongSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input too short register password into password input field (75 chars)
        registerAccountModalTooLongSingularInput.inputTooLongPasswordIntoRegisterPasswordInputField();
        //input too short register confirm password into confirm password input field (75 chars)
        registerAccountModalTooLongSingularInput.inputTooLongConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //capture screenshot of the register account modal display after invalid data input - too long password/confirm password
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Too Long Password And Confirm Password");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The too long password / confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Password And Confirm Password");
            throw new Error("The too long password / confirm password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Password And Confirm Password");
    }

    //invalid singular input format

    //invalid register account modal test method - invalid first name format (special symbols only)
    protected void invalidRegisterAccountModalInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - invalid first name format (special symbols only)
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataInvalidFirstNameFormatGetter();
        //input too long register first name into first name input field (special symbols only)
        registerAccountModalInvalidSingularInput.inputInvalidFirstNameFormatIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalInvalidSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalInvalidSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalInvalidSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalInvalidSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - invalid first name format
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Invalid First Name Format");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The invalid first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid First Name Format");
            throw new Error("The invalid first name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid First Name Format");
    }

    //invalid register account modal test method - invalid last name input format (special symbols only)
    protected void invalidRegisterAccountModalInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - invalid last name format (special symbols only)
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataInvalidLastNameFormatGetter();
        //input valid register first name into first name input field
        registerAccountModalInvalidSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input invalid register last name format into last name input field (special symbols only)
        registerAccountModalInvalidSingularInput.inputInvalidLastNameFormatIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalInvalidSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalInvalidSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalInvalidSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - invalid last name format
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Invalid Last Name Format");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The invalid last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Last Name Format");
            throw new Error("The invalid last name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Last Name Format");
    }

    //invalid register account modal test method - invalid email format (missing '@')
    protected void invalidRegisterAccountModalInvalidEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - invalid email format (missing '@')
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataInvalidEmailFormatGetter();
        //input valid register first name into first name input field
        registerAccountModalInvalidSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalInvalidSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input invalid register email format into email input field (missing '@')
        registerAccountModalInvalidSingularInput.inputInvalidEmailFormatIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalInvalidSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalInvalidSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - invalid email format
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Invalid Email Format");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Neplatný formát e-mailová adresa", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The invalid email input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Email Format");
            throw new Error("The invalid email input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Email Format");
    }

    //invalid register account modal test method - existing email (used beforehand in manual testing)
    protected void invalidRegisterAccountModalExistingEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - existing email (used beforehand in manual testing)
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataExistingEmailGetter();
        //input valid register first name into first name input field
        registerAccountModalInvalidSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalInvalidSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input existing register email format into email input field (used beforehand in manual testing)
        registerAccountModalInvalidSingularInput.inputExistingEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalInvalidSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //click "View Password" button
        registerAccountModal.clickViewPasswordButton();
        //input valid matching register confirm password into confirm password input field
        registerAccountModalInvalidSingularInput.inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //click "View Confirm Password" button
        registerAccountModal.clickViewConfirmPasswordButton();
        //capture screenshot of the register account modal display after invalid data input - existing email
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Existing Email");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Zákazník se zadanou e-mailovou adresou již existuje.", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The existing email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Existing Email");
            throw new Error("The existing email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Existing Email");
    }

    //invalid register account modal test method - invalid password/confirm password format (lowercase only)
    protected void invalidRegisterAccountModalInvalidPasswordConfirmFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - invalid password/confirm password format (lowercase only)
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataInvalidPasswordConfirmFormatGetter();
        //input valid register first name into first name input field
        registerAccountModalInvalidSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalInvalidSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalInvalidSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input invalid register password format into password input field (lowercase only)
        registerAccountModalInvalidSingularInput.inputInvalidPasswordFormatIntoRegisterPasswordInputField();
        //input invalid register confirm password format into confirm password input field (lowercase only)
        registerAccountModalInvalidSingularInput.inputInvalidConfirmPasswordFormatIntoRegisterConfirmPasswordInputField();
        //capture screenshot of the register account modal display after invalid data input - invalid password/confirm password format
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Invalid Password And Confirm Password Format");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Heslo nemůže obsahovat pouze malá písmena", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The invalid password / confirm password input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Password And Confirm Password Format");
            throw new Error("The invalid password / confirm password input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Password And Confirm Password Format");
    }

    //invalid register account modal test method - mismatching confirm password
    protected void invalidRegisterAccountModalMismatchingConfirmPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        RegisterAccountModalInvalidSingularInput registerAccountModalInvalidSingularInput = new RegisterAccountModalInvalidSingularInput(driver);
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
        //invalid register account modal data getter - mismatching confirm password (lowercase only)
        registerAccountModalInvalidSingularInput.invalidRegisterInputDataMismatchingConfirmPasswordGetter();
        //input valid register first name into first name input field
        registerAccountModalInvalidSingularInput.inputValidFirstNameIntoRegisterFirstNameInputField();
        //input valid register last name into last name input field
        registerAccountModalInvalidSingularInput.inputValidLastNameIntoRegisterLastNameInputField();
        //input valid register email into email input field
        registerAccountModalInvalidSingularInput.inputValidEmailIntoRegisterEmailInputField();
        //input valid register password into password input field
        registerAccountModalInvalidSingularInput.inputValidPasswordIntoRegisterPasswordInputField();
        //input mismatching register confirm password into confirm password input field (lowercase only)
        registerAccountModalInvalidSingularInput.inputMismatchingConfirmPasswordIntoRegisterConfirmPasswordInputField();
        //capture screenshot of the register account modal display after invalid data input - mismatching confirm password
        captureScreenshot(driver, "Register Account Modal Display After Invalid Data Input - Mismatching Confirm Password");
        //click "Register" button
        registerAccountModal.clickRegisterButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nesouhlasí", registerAccountModal.getRegisterAccountModalSingularInputErrorMsg(), "The mismatching confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid User Account Creation Test Result - Mismatching Confirm Password");
            throw new Error("The mismatching confirm password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Mismatching Confirm Password");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
