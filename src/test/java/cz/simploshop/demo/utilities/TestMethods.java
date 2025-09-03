package cz.simploshop.demo.utilities;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;
import cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal.*;
import cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal.*;
import cz.simploshop.demo.invalidscenarios.accountinfopage.*;
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

    //valid edit user account information tests

    //valid edit user account data (with login email) test method
    protected void validEditUserAccountInfoLoginEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2300);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //valid edited user (with login email) input data getter
        accountInformationPage.validEditedUserInfoLoginEmailDataGetter();
        //input valid edited first name into first name input field
        accountInformationPage.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInformationPage.inputValidEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInformationPage.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after data input
        captureScreenshot(driver, "Account Information Page Display After Data Input");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user data gets edited (by confirming the changes of user first and last names)
        assertEquals(accountInformationPage.getEditedUsername(), generalPage.getUpperHeaderUsername(), "The usernames don't match expectations or the edit user account data process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Account Info (with login email) Test Result");
    }

    //valid edit user account login password test method
    protected void validEditUserAccountLoginPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //valid edited user password input data getter
        accountInformationPage.validEditedUserPasswordDataGetter();
        //input valid edited first name into first name input field
        accountInformationPage.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInformationPage.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input valid password into password input field
        accountInformationPage.inputValidUserPasswordIntoPasswordInputField();
        //input valid new password into new password input field
        accountInformationPage.inputValidUserNewPasswordIntoNewPasswordInputField();
        //input valid matching confirm new password into confirm new password input field
        accountInformationPage.inputValidUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after data input
        captureScreenshot(driver, "Account Information Page Display After Data (with new password) Input");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Account Password Test Result");
    }

    //invalid edit user account information tests

    //no singular input

    //invalid edit user account data (with login email) test method - no edited first name
    protected void invalidEditUserAccountInfoNoEditedFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageNoSingularInput accountInfoPageNoSingularInput = new AccountInfoPageNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3100);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - no edited first name
        accountInfoPageNoSingularInput.invalidEditedUserInfoNoFirstNameGetter();
        //don't input edited first name into first name input field
        accountInfoPageNoSingularInput.inputNoEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageNoSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageNoSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - no edited first name
        captureScreenshot(driver, "Account Information Page Display After Data Input - No Edited First Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //log an error if the error doesn't get triggered
        try {
            assertEquals("Pole je povinné", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The missing edited first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing edited first name input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - No Edited First Name");
    }

    //invalid edit user account data (with login email) test method - no edited last name
    protected void invalidEditUserAccountInfoNoEditedLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageNoSingularInput accountInfoPageNoSingularInput = new AccountInfoPageNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - no edited last name
        accountInfoPageNoSingularInput.invalidEditedUserInfoNoLastNameGetter();
        //input valid edited first name into first name input field
        accountInfoPageNoSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //don't input edited last name into last name input field
        accountInfoPageNoSingularInput.inputNoEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageNoSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - no edited last name
        captureScreenshot(driver, "Account Information Page Display After Data Input - No Edited Last Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //log an error if the error doesn't get triggered
        try {
            assertEquals("Pole je povinné", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The missing edited last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing edited last name input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - No Edited Last Name");
    }

    //invalid edit user account data (with login email) test method - no edited email
    protected void invalidEditUserAccountInfoNoEditedEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageNoSingularInput accountInfoPageNoSingularInput = new AccountInfoPageNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - no edited email
        accountInfoPageNoSingularInput.invalidEditedUserInfoNoEmailGetter();
        //input valid edited first name into first name input field
        accountInfoPageNoSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageNoSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //don't input edited email into email input field
        accountInfoPageNoSingularInput.inputNoEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - no edited email
        captureScreenshot(driver, "Account Information Page Display After Data Input - No Edited Email");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //log an error if the error doesn't get triggered
        try {
            assertEquals("Pole je povinné", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The missing edited email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing edited email input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - No Edited Email");
    }

    //invalid edit user account test method - no user password
    protected void invalidEditUserAccountNoUserPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageNoSingularInput accountInfoPageNoSingularInput = new AccountInfoPageNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - no user password
        accountInfoPageNoSingularInput.invalidEditedUserPasswordDataNoUserPasswordGetter();
        //input valid edited first name into first name input field
        accountInfoPageNoSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageNoSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //don't input password into password input field
        accountInfoPageNoSingularInput.inputNoUserPasswordIntoPasswordInputField();
        //input valid new password into new password input field
        accountInfoPageNoSingularInput.inputValidUserNewPasswordIntoNewPasswordInputField();
        //input valid matching confirm new password into confirm new password input field
        accountInfoPageNoSingularInput.inputValidUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - no user password
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - No User Password");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //log an error if the error doesn't get triggered
        try {
            assertEquals("Pole je povinné", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The missing user password input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing user password input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - No User Password");
    }

    //too short singular input

    //invalid edit user account data (with login email) test method - too short edited first name (1 char)
    protected void invalidEditUserAccountInfoTooShortEditedFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooShortSingularInput accountInfoPageTooShortSingularInput = new AccountInfoPageTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too short edited first name (1 char)
        accountInfoPageTooShortSingularInput.invalidEditedUserInfoTooShortFirstNameGetter();
        //input too short edited first name into first name input field (1 char)
        accountInfoPageTooShortSingularInput.inputTooShortEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too short edited first name
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Short Edited First Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too short edited first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited First Name");
            throw new Error("The too short edited first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited First Name");
    }

    //invalid edit user account data (with login email) test method - too short edited last name (1 char)
    protected void invalidEditUserAccountInfoTooShortEditedLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooShortSingularInput accountInfoPageTooShortSingularInput = new AccountInfoPageTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too short edited last name (1 char)
        accountInfoPageTooShortSingularInput.invalidEditedUserInfoTooShortLastNameGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input too short edited last name into last name input field (1 char)
        accountInfoPageTooShortSingularInput.inputTooShortEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too short edited last name
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Short Edited Last Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too short edited last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited Last Name");
            throw new Error("The too short edited last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited Last Name");
    }

    //invalid edit user account data (with login email) test method - too short edited email (1 char -> name, domain)
    protected void invalidEditUserAccountInfoTooShortEditedEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooShortSingularInput accountInfoPageTooShortSingularInput = new AccountInfoPageTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too short edited email (1 char -> name, domain)
        accountInfoPageTooShortSingularInput.invalidEditedUserInfoTooShortEmailGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //input too short edited email into email input field (1 char -> name, domain)
        accountInfoPageTooShortSingularInput.inputTooShortEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too short edited email
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Short Edited Email");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too short edited email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited Email");
            throw new Error("The too short edited email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited Email");
    }

    //invalid edit user account test method - too short new password / confirm password (7 chars)
    protected void invalidEditUserAccountTooShortNewPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooShortSingularInput accountInfoPageTooShortSingularInput = new AccountInfoPageTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - too short user password/confirm password (7 chars)
        accountInfoPageTooShortSingularInput.invalidEditedUserPasswordDataTooShortUserPasswordConfirmGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooShortSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input valid password into password input field
        accountInfoPageTooShortSingularInput.inputValidUserPasswordIntoPasswordInputField();
        //input too short new password into new password input field (7 chars)
        accountInfoPageTooShortSingularInput.inputTooShortUserNewPasswordIntoNewPasswordInputField();
        //input too short matching confirm new password into confirm new password input field (7 chars)
        accountInfoPageTooShortSingularInput.inputTooShortUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - too short user password
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - Too Short User Password And Confirm Password");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole musí mít alespoň 8 znaků.", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too short edited password/confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Short Edited Email");
            throw new Error("The too short edited password/confirm password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - Too Short User Password And Confirm Password");
    }

    //too long singular input

    //invalid edit user account data (with login email) test method - too long edited first name (51 chars)
    protected void invalidEditUserAccountInfoTooLongEditedFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooLongSingularInput accountInfoPageTooLongSingularInput = new AccountInfoPageTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too long edited first name (51 chars)
        accountInfoPageTooLongSingularInput.invalidEditedUserInfoTooLongFirstNameGetter();
        //input too short edited first name into first name input field (51 chars)
        accountInfoPageTooLongSingularInput.inputTooLongEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too long edited first name
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Long Edited First Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 50 znaků", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too long edited first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited First Name");
            throw new Error("The too long edited first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited First Name");
    }

    //invalid edit user account data (with login email) test method - too long edited last name (100 chars)
    protected void invalidEditUserAccountInfoTooLongEditedLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooLongSingularInput accountInfoPageTooLongSingularInput = new AccountInfoPageTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too long edited last name (51 chars)
        accountInfoPageTooLongSingularInput.invalidEditedUserInfoTooLongLastNameGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input too long edited last name into last name input field (51 chars)
        accountInfoPageTooLongSingularInput.inputTooLongEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too long edited last name
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Long Edited Last Name");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 50 znaků", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too long edited last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited Last Name");
            throw new Error("The too long edited last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited Last Name");
    }

    //invalid edit user account data (with login email) test method - too long edited email (100 chars -> name, domain)
    protected void invalidEditUserAccountInfoTooLongEditedEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooLongSingularInput accountInfoPageTooLongSingularInput = new AccountInfoPageTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - too long edited email (75 chars -> name, domain)
        accountInfoPageTooLongSingularInput.invalidEditedUserInfoTooLongEmailGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //input too long edited email into email input field (75 chars -> name, domain)
        accountInfoPageTooLongSingularInput.inputTooLongEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - too long edited email
        captureScreenshot(driver, "Account Information Page Display After Data Input - Too Long Edited Email");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 74 znaků", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too long edited email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited Email");
            throw new Error("The too long edited email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long Edited Email");
    }

    //invalid edit user account test method - too long user password (75 chars)
    protected void invalidEditUserAccountTooLongUserPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageTooLongSingularInput accountInfoPageTooLongSingularInput = new AccountInfoPageTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - too long user password/confirm password (75 chars)
        accountInfoPageTooLongSingularInput.invalidEditedUserPasswordDataTooLongUserPasswordConfirmGetter();
        //input valid edited first name into first name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageTooLongSingularInput.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input valid password into password input field
        accountInfoPageTooLongSingularInput.inputValidUserPasswordIntoPasswordInputField();
        //input too long new password into new password input field (75 chars)
        accountInfoPageTooLongSingularInput.inputTooLongUserNewPasswordIntoNewPasswordInputField();
        //input too long matching confirm new password into confirm new password input field (75 chars)
        accountInfoPageTooLongSingularInput.inputTooLongUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - too long user password/confirm password
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - Too Long User Password And Confirm Password");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The too long edited password/confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Too Long User Password And Confirm Password");
            throw new Error("The too long edited password/confirm password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - Too Long User Password And Confirm Password");
    }

    //invalid singular input format

    //invalid edit user account data (with login email) test method - invalid edited first name format (special symbols only)
    protected void invalidEditUserAccountInfoInvalidEditedFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - invalid edited first name format (special symbols only)
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserInfoInvalidFirstNameFormatGetter();
        //input invalid edited first name format into first name input field (special symbols only)
        accountInfoPageInvalidSingularInputFormat.inputInvalidEditedUserFirstNameFormatIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - invalid edited first name format
        captureScreenshot(driver, "Account Information Page Display After Data Input - Invalid Edited First Name Format");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The invalid edited first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited First Name Format");
            throw new Error("The invalid edited first name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited First Name Format");
    }

    //invalid edit user account data (with login email) test method - invalid edited last name format (special symbols only)
    protected void invalidEditUserAccountInfoInvalidEditedLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - invalid edited last name format (special symbols only)
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserInfoInvalidLastNameFormatGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input invalid edited last name format into last name input field (special symbols only)
        accountInfoPageInvalidSingularInputFormat.inputInvalidEditedUserLastNameFormatIntoLastNameInputField();
        //input valid edited email into email input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - invalid edited last name format
        captureScreenshot(driver, "Account Information Page Display After Data Input - Invalid Edited Last Name Format");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The invalid edited last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited Last Name Format");
            throw new Error("The invalid edited last name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited Last Name Format");
    }

    //invalid edit user account data (with login email) test method - invalid edited email format (missing '@')
    protected void invalidEditUserAccountInfoInvalidEditedEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - invalid edited email format (missing '@')
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserInfoInvalidEmailFormatGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //input invalid edited email format into email input field (missing '@')
        accountInfoPageInvalidSingularInputFormat.inputInvalidEditedUserEmailFormatIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - invalid edited email format
        captureScreenshot(driver, "Account Information Page Display After Data Input - Invalid Edited Email Format");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Neplatný formát e-mailová adresa", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The invalid edited email input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited Email Format");
            throw new Error("The invalid edited email input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid Edited Email Format");
    }

    //invalid edit user account data (with login email) test method - existing email (used beforehand in manual testing)
    protected void invalidEditUserAccountInfoExistingEditedEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data Input");
        //invalid edited user input data getter - existing email (used beforehand in manual testing)
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserInfoExistingEmailGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //input existing edited email into email input field (used beforehand in manual testing)
        accountInfoPageInvalidSingularInputFormat.inputExistingEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account information page display after invalid data input - existing email
        captureScreenshot(driver, "Account Information Page Display After Data Input - Existing Edited Email");
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("E-mail je již používán", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The existing edited email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Existing Edited Email");
            throw new Error("The existing edited email input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Existing Edited Email");
    }

    //invalid edit user account test method - invalid user password
    protected void invalidEditUserAccountInvalidUserPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - invalid user password
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserPasswordDataInvalidUserPasswordGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input invalid password into password input field
        accountInfoPageInvalidSingularInputFormat.inputInvalidUserPasswordIntoPasswordInputField();
        //input invalid new password into new password input field
        accountInfoPageInvalidSingularInputFormat.inputValidUserNewPasswordIntoNewPasswordInputField();
        //input valid matching confirm new password into confirm new password input field
        accountInfoPageInvalidSingularInputFormat.inputValidUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - invalid user password
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - Invalid User Password");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Bylo zadáno nesprávne původní heslo.", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The invalid user password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid User Password");
            throw new Error("The invalid user password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - Invalid User Password");
    }

    //invalid edit user account test method - invalid user password/confirm format (lowercase only)
    protected void invalidEditUserAccountInvalidUserPasswordConfirmFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - invalid user password/confirm password format (lowercase only)
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserPasswordDataInvalidUserPasswordConfirmFormatGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input valid password into password input field
        accountInfoPageInvalidSingularInputFormat.inputValidUserPasswordIntoPasswordInputField();
        //input invalid new password format into new password input field (75 chars)
        accountInfoPageInvalidSingularInputFormat.inputInvalidUserNewPasswordFormatIntoNewPasswordInputField();
        //input invalid matching confirm new password format into confirm new password input field (75 chars)
        accountInfoPageInvalidSingularInputFormat.inputInvalidUserConfirmNewPasswordFormatIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - invalid user password/confirm password format
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - Invalid User Password And Confirm Password Format");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Heslo nemůže obsahovat pouze malá písmena", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The invalid edited password/confirm password input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Invalid User Password And Confirm Password Format");
            throw new Error("The invalid edited password/confirm password input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - Invalid User Password And Confirm Password Format");
    }

    //invalid edit user account test method - mismatching confirm password
    protected void invalidEditUserAccountMismatchingConfirmPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        AccountInfoPageInvalidSingularInputFormat accountInfoPageInvalidSingularInputFormat = new AccountInfoPageInvalidSingularInputFormat(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before Data (new password) Input");
        //invalid edited user password input data getter - mismatching confirm password
        accountInfoPageInvalidSingularInputFormat.invalidEditedUserPasswordDataMismatchingConfirmPasswordGetter();
        //input valid edited first name into first name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountInfoPageInvalidSingularInputFormat.inputValidEditedUserLastNameIntoLastNameInputField();
        //click 'Apply Changes" button
        accountInformationPage.clickApplyChangesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(800);
        //input valid password into password input field
        accountInfoPageInvalidSingularInputFormat.inputValidUserPasswordIntoPasswordInputField();
        //input valid new password into new password input field
        accountInfoPageInvalidSingularInputFormat.inputValidUserNewPasswordIntoNewPasswordInputField();
        //input mismatching confirm new password into confirm new password input field
        accountInfoPageInvalidSingularInputFormat.inputMismatchingUserConfirmNewPasswordIntoConfirmNewPasswordInputField();
        //capture screenshot of the account information page display after invalid data input - mismatching confirm password
        captureScreenshot(driver, "Account Information Page Display After Invalid Data (with new password) Input - Mismatching Confirm Password");
        //click 'Change password" button
        accountInformationPage.clickChangePasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nesouhlasí", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The mismatching edited confirm password input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Edit User Account Info Test Result - Mismatching Confirm Password");
            throw new Error("The mismatching edited confirm password input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Password Test Result - Mismatching Confirm Password");
    }

    //valid user account removal test

    //valid user account removal test method
    protected void validUserAccountRemovalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3000);
        //select "Account Information" option
        generalPage.selectSetAccountInfoDropdownOption(1);
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account information page breadcrumb web element assert
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //account information page my user section web element assert
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page web element assert
        isAccountInfoPageWebElementDisplayed(accountInformationPage);
        //account information page text element assert
        isAccountInfoPageTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account information page display before data input
        captureScreenshot(driver, "Account Information Page Display Before User Account Removal");
        //click "Delete user account" button
        accountInformationPage.clickDeleteUserAccountButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1750);
        //account removal modal web element assert
        isAccountRemovalModalWebElementDisplayed(accountInformationPage);
        //account removal modal text element assert
        isAccountRemovalModalTextElementAsExpected(accountInformationPage);
        //capture screenshot of the account removal modal
        captureScreenshot(driver, "Account Removal Modal Display");
        //click "Delete" button
        accountInformationPage.clickDeleteButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Uživatelský účet byl odstraněn.", accountInformationPage.getAccountInfoPageSingularInputErrorMsg(), "The user account removal confirmation message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Valid User Account Removal Test Result");
            throw new Error("The user account removal confirmation message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Removal Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid add user address test

    //valid add user address test method
    protected void validAddUserAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //valid user address input data getter
        addNewAddressModal.validUserAddressInputDataGetter();
        //input valid user first name into first name input field
        addNewAddressModal.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModal.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModal.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModal.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModal.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModal.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after valid data input
        captureScreenshot(driver, "Add New Address Modal Display After Valid Data Input");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected success message, throw an error otherwise
        try {
            assertEquals("Adresa byla úspěšně přidána", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The address addition success message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Valid Add New User Address Test Result (no country options available)");
            throw new Error("The address addition success message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Add New User Address Test Result");
    }

    //invalid add user address tests

    //no singular input

    //invalid add user address test method - no first name
    protected void invalidAddUserAddressNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no first name
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoFirstNameGetter();
        //don't input user first name into first name input field
        addNewAddressModalNoSingularInput.inputNoUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalNoSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalNoSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalNoSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalNoSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no first name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No First Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No First Name (no country code options available)");
            throw new Error("The missing address first name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No First Name");
    }

    //invalid add user address test method - no last name
    protected void invalidAddUserAddressNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no last name
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoLastNameGetter();
        //input valid user first name into first name input field
        addNewAddressModalNoSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //don't input user last name into last name input field
        addNewAddressModalNoSingularInput.inputNoUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalNoSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalNoSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalNoSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no last name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Last Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No Last Name (no country code options available)");
            throw new Error("The missing address last name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Last Name");
    }

    //invalid add user address test method - no street
    protected void invalidAddUserAddressNoStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no street
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoStreetGetter();
        //input valid user first name into first name input field
        addNewAddressModalNoSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalNoSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //don't input user street into street input field
        addNewAddressModalNoSingularInput.inputNoUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalNoSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalNoSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no street
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Street");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No Street (no country code options available)");
            throw new Error("The missing address street input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Street");
    }

    //invalid add user address test method - no zip code
    protected void invalidAddUserAddressNoZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no zip code
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoZipCodeGetter();
        //input valid user first name into first name input field
        addNewAddressModalNoSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalNoSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalNoSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //don't input user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputNoUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalNoSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalNoSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no zip code
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Zip Code");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No Zip Code (no country code options available)");
            throw new Error("The missing address zip code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Zip Code");
    }

    //invalid add user address test method - no city
    protected void invalidAddUserAddressNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no city
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoCityGetter();
        //input valid user first name into first name input field
        addNewAddressModalNoSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalNoSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalNoSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //don't input user city into city input field
        addNewAddressModalNoSingularInput.inputNoUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalNoSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no city
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No City");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No City (no country code options available)");
            throw new Error("The missing address city input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No City");
    }

    //invalid add user address test method - no country code
    protected void invalidAddUserAddressNoCountryCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //valid user address input data getter
        addNewAddressModal.validUserAddressInputDataGetter();
        //input valid user first name into first name input field
        addNewAddressModal.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModal.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModal.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModal.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModal.inputValidUserCityIntoNewAddressModalCityInputField();
        //input valid user phone into phone input field
        addNewAddressModal.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no country code
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Country Code");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Country Code");
    }

    //invalid add user address test method - no phone
    protected void invalidAddUserAddressNoPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalNoSingularInput addNewAddressModalNoSingularInput = new AddNewAddressModalNoSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - no phone
        addNewAddressModalNoSingularInput.invalidUserAddressInputDataNoPhoneGetter();
        //input valid user first name into first name input field
        addNewAddressModalNoSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalNoSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalNoSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalNoSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalNoSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //don't input user phone into phone input field
        addNewAddressModalNoSingularInput.inputNoUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - no phone
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Phone");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No Phone (no country code options available)");
            throw new Error("The missing address phone input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Phone");
    }

    //invalid add user address test method - no country
    protected void invalidAddUserAddressNoCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //valid user address input data getter
        addNewAddressModal.validUserAddressInputDataGetter();
        //input valid user first name into first name input field
        addNewAddressModal.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModal.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModal.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModal.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModal.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModal.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //capture screenshot of the add new address modal display after invalid data input - no country
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - No Country");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addressesDashboardPage.getAddressesDashPageAddAddressSuccessMsg(), "The missing address country input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - No Country (no country code options available)");
            throw new Error("The missing address country input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - No Country");
    }

    //too short singular input

    //invalid add user address test method - too short first name (1 char)
    protected void invalidAddUserAddressTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short first name (1 char)
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortFirstNameGetter();
        //input too short user first name into first name input field (1 char)
        addNewAddressModalTooShortSingularInput.inputTooShortUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooShortSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooShortSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooShortSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooShortSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short first name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short First Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short First Name (no country code options available)");
            throw new Error("The too short address first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short First Name");
    }

    //invalid add user address test method - too short last name (1 char)
    protected void invalidAddUserAddressTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short last name
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortLastNameGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooShortSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input too short user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputTooShortUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooShortSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooShortSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooShortSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooShortSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short last name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short Last Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Last Name (no country code options available)");
            throw new Error("The too short address last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Last Name");
    }

    //invalid add user address test method - too short street (3 chars)
    protected void invalidAddUserAddressTooShortStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short street (3 chars)
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortStreetGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooShortSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input too short user street into street input field (3 chars)
        addNewAddressModalTooShortSingularInput.inputTooShortUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooShortSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooShortSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooShortSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short street
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short Street");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Street (no country code options available)");
            throw new Error("The too short address street input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Street");
    }

    //invalid add user address test method - too short zip code (4 digits)
    protected void invalidAddUserAddressTooShortZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short zip code (4 digits)
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortZipCodeGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooShortSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooShortSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input too short user zip code into zip code input field (4 digits)
        addNewAddressModalTooShortSingularInput.inputTooShortUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooShortSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooShortSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short zip code
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short Zip Code");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Zip Code (no country code options available)");
            throw new Error("The too short address zip code input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Zip Code");
    }

    //invalid add user address test method - too short city (2 chars)
    protected void invalidAddUserAddressTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short city (2 chars)
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortCityGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooShortSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooShortSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooShortSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input too short user city into city input field (2 chars)
        addNewAddressModalTooShortSingularInput.inputTooShortUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooShortSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short city
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short City");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short City (no country code options available)");
            throw new Error("The too short address city input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short City");
    }

    //invalid add user address test method - too short phone (2 digits)
    protected void invalidAddUserAddressTooShortPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooShortSingularInput addNewAddressModalTooShortSingularInput = new AddNewAddressModalTooShortSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too short phone (2 digits)
        addNewAddressModalTooShortSingularInput.invalidUserAddressInputDataTooShortPhoneGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooShortSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooShortSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooShortSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooShortSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooShortSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input too short user phone into phone input field (2 digits)
        addNewAddressModalTooShortSingularInput.inputTooShortUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too short phone
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Short Phone");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too short address phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Phone (no country code options available)");
            throw new Error("The too short address phone input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Phone");
    }

    //too long singular input

    //invalid add user address test method - too long first name (100 chars)
    protected void invalidAddUserAddressTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long first name (100 chars)
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongFirstNameGetter();
        //input too long user first name into first name input field (100 chars)
        addNewAddressModalTooLongSingularInput.inputTooLongUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooLongSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooLongSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooLongSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooLongSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long first name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long First Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long First Name (no country code options available)");
            throw new Error("The too long address first name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long First Name");
    }

    //invalid add user address test method - too long last name (100 chars)
    protected void invalidAddUserAddressTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long last name
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongLastNameGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooLongSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input too long user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputTooLongUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooLongSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooLongSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooLongSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooLongSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long last name
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long Last Name");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1800);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Last Name (no country code options available)");
            throw new Error("The too long address last name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Short Last Name");
    }

    //invalid add user address test method - too long street (100 chars)
    protected void invalidAddUserAddressTooLongStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long street (100 chars)
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongStreetGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooLongSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input too long user street into street input field (100 chars)
        addNewAddressModalTooLongSingularInput.inputTooLongUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooLongSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooLongSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooLongSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long street
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long Street");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Street (no country code options available)");
            throw new Error("The too long address street input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Street");
    }

    //invalid add user address test method - too long zip code (6 digits)
    protected void invalidAddUserAddressTooLongZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long zip code (6 digits)
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongZipCodeGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooLongSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooLongSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input too long user zip code into zip code input field (6 digits)
        addNewAddressModalTooLongSingularInput.inputTooLongUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooLongSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooLongSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long zip code
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long Zip Code");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Zip Code (no country code options available)");
            throw new Error("The too long address zip code input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Zip Code");
    }

    //invalid add user address test method - too long city (100 chars)
    protected void invalidAddUserAddressTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long city (100 chars)
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongCityGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooLongSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooLongSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooLongSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input too long user city into city input field (100 chars)
        addNewAddressModalTooLongSingularInput.inputTooLongUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalTooLongSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long city
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long City");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long City (no country code options available)");
            throw new Error("The too long address city input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long City");
    }

    //invalid add user address test method - too long phone (30 digits)
    protected void invalidAddUserAddressTooLongPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalTooLongSingularInput addNewAddressModalTooLongSingularInput = new AddNewAddressModalTooLongSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - too long phone (30 digits)
        addNewAddressModalTooLongSingularInput.invalidUserAddressInputDataTooLongPhoneGetter();
        //input valid user first name into first name input field
        addNewAddressModalTooLongSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalTooLongSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalTooLongSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalTooLongSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalTooLongSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input too long user phone into phone input field (30 digits)
        addNewAddressModalTooLongSingularInput.inputTooLongUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - too long phone
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Too Long Phone");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The too long address phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Phone (no country code options available)");
            throw new Error("The too long address phone input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Too Long Phone");
    }

    //invalid singular input format

    //invalid add user address test method - invalid first name input format (special symbols only)
    protected void invalidAddUserAddressInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalInvalidSingularInput addNewAddressModalInvalidSingularInput = new AddNewAddressModalInvalidSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - invalid first name format (special symbols only)
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidFirstNameFormatGetter();
        //input invalid user first name format into first name input field (100 chars)
        addNewAddressModalInvalidSingularInput.inputInvalidUserFirstNameFormatIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalInvalidSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalInvalidSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalInvalidSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalInvalidSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalInvalidSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid first name format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid First Name Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid First Name Format (no country code options available)");
            throw new Error("The invalid address first name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid First Name Format");
    }

    //invalid add user address test method - invalid last name format (special symbols only)
    protected void invalidAddUserAddressInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalInvalidSingularInput addNewAddressModalInvalidSingularInput = new AddNewAddressModalInvalidSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - invalid last name input format
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidLastNameFormatGetter();
        //input valid user first name into first name input field
        addNewAddressModalInvalidSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input invalid user last name format into last name input field
        addNewAddressModalInvalidSingularInput.inputInvalidUserLastNameFormatIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalInvalidSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalInvalidSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalInvalidSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalInvalidSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid last name format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid Last Name Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Last Name Format (no country code options available)");
            throw new Error("The invalid address last name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Last Name Format");
    }

    //invalid add user address test method - invalid street format (special symbols only)
    protected void invalidAddUserAddressInvalidStreetFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalInvalidSingularInput addNewAddressModalInvalidSingularInput = new AddNewAddressModalInvalidSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - invalid street format (special symbols only)
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidStreetFormatGetter();
        //input valid user first name into first name input field
        addNewAddressModalInvalidSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalInvalidSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input invalid user street format into street input field (100 chars)
        addNewAddressModalInvalidSingularInput.inputInvalidUserStreetFormatIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalInvalidSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalInvalidSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalInvalidSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid street format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid Street Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address street input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Street Format (no country code options available)");
            throw new Error("The invalid address street input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Street Format");
    }

    //invalid add user address test method - invalid zip code format (special symbols only)
    protected void invalidAddUserAddressInvalidZipCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalInvalidSingularInput addNewAddressModalInvalidSingularInput = new AddNewAddressModalInvalidSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - invalid zip code format (special symbols only)
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidZipCodeFormatGetter();
        //input valid user first name into first name input field
        addNewAddressModalInvalidSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalInvalidSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalInvalidSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input invalid user zip code format into zip code input field (special symbols only)
        addNewAddressModalInvalidSingularInput.inputInvalidUserZipCodeFormatIntoNewAddressModalZipCodeInputField();
        //input valid user city into city input field
        addNewAddressModalInvalidSingularInput.inputValidUserCityIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalInvalidSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid zip code format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid Zip Code Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address zip code input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Zip Code Format (no country code options available)");
            throw new Error("The invalid address zip code input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Zip Code Format");
    }

    //invalid add user address test method - invalid city format (special symbols only)
    protected void invalidAddUserAddressInvalidCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AddressesDashboardPage addressesDashboardPage = new AddressesDashboardPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        AddNewAddressModalInvalidSingularInput addNewAddressModalInvalidSingularInput = new AddNewAddressModalInvalidSingularInput(driver);
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
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5500);
        //select "Addresses" option
        generalPage.selectAddressesOption();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8000);
        //addresses dashboard page web element assert
        isAddressesDashPageWebElementDisplayed(addressesDashboardPage);
        //addresses dashboard page text element assert
        isAddressesDashPageTextElementAsExpected(addressesDashboardPage);
        //capture screenshot of the addresses dashboard page page display
        captureScreenshot(driver, "Addresses Dashboard Page Display");
        //click "Add new address" button
        addressesDashboardPage.clickAddNewAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input");
        //invalid user address input data getter - invalid city format (special symbols only)
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidCityFormatGetter();
        //input valid user first name into first name input field
        addNewAddressModalInvalidSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
        //input valid user last name into last name input field
        addNewAddressModalInvalidSingularInput.inputValidUserLastNameIntoNewAddressModalLastNameInputField();
        //input valid user street into street input field
        addNewAddressModalInvalidSingularInput.inputValidUserStreetIntoNewAddressModalStreetInputField();
        //input valid user zip code into zip code input field
        addNewAddressModalInvalidSingularInput.inputValidUserZipCodeIntoNewAddressModalZipCodeInputField();
        //input too long user city into city input field (100 chars)
        addNewAddressModalInvalidSingularInput.inputInvalidUserCityFormatIntoNewAddressModalCityInputField();
        //click country code dropdown menu
        addNewAddressModal.clickCountryCodeDropdownMenu();
        //capture screenshot of the absence of country code options (hence, further valid testing is impossible since this input is tagged as required)
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes");
        //input valid user phone into phone input field
        addNewAddressModalInvalidSingularInput.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid city format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid City Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address city input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid City Format (no country code options available)");
            throw new Error("The invalid address city input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid City Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
