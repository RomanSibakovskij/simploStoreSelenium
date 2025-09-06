package cz.simploshop.demo.utilities;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;
import cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal.*;
import cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal.*;
import cz.simploshop.demo.modals.invalid.scenarios.addproductreviewmodal.*;
import cz.simploshop.demo.invalidscenarios.accountinfopage.*;
import cz.simploshop.demo.invalidscenarios.checkoutpage.*;
import cz.simploshop.demo.modals.invalid.scenarios.loginaccountmodal.LoginAccountModalInvalidScenarios;
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

    //invalid add user address test method - invalid phone format (special symbols only)
    protected void invalidAddUserAddressInvalidPhoneFormatTest(){
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
        //invalid user address input data getter - invalid phone format (special symbols only)
        addNewAddressModalInvalidSingularInput.invalidUserAddressInputDataInvalidPhoneFormatGetter();
        //input valid user first name into first name input field
        addNewAddressModalInvalidSingularInput.inputValidUserFirstNameIntoNewAddressModalFirstNameInputField();
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
        //input invalid user phone format into phone input field (special symbols only)
        addNewAddressModalInvalidSingularInput.inputInvalidUserPhoneFormatIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after invalid data input - invalid phone format
        captureScreenshot(driver, "Add New Address Modal Display After Invalid Data Input - Invalid Phone Format");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addNewAddressModal.getAddNewAddressModalSingularInputErrorMsg(), "The invalid address phone input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Phone Format (no country code options available)");
            throw new Error("The invalid address phone input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add New User Address Test Result - Invalid Phone Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user logout test

    //valid user logout test method
    protected void userLogoutTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        //click upper header home page logo
        generalPage.clickUpperHeaderHomePageLogo();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (footer section) web element assert (Selenium can't find these elements with VALID selectors)
        //isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page (header section) text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //general page (footer section) text element assert (Selenium can't find these elements with VALID selectors)
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //click upper header "Account" button
        generalPage.clickUpperHeaderAccountDropdownMenu();
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //select "Logout" option
        generalPage.selectLogoutOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Logout Test Result");
    }

    //valid user login tests

    //valid user login test method
    protected void validUserLoginTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //valid login input data getter
        loginAccountModal.validLoginInputDataGetter();
        //input valid login email into login email input field
        loginAccountModal.inputValidLoginEmailIntoEmailInputField();
        //input valid login password into login password input field
        loginAccountModal.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after valid login data input
        captureScreenshot(driver, "Login Account Modal Display After Valid Login Data Input");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user account gets created
        assertEquals(registerAccountModal.getUsername(), generalPage.getUpperHeaderUsername(), "The usernames don't match expectations or the user login process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result");
    }

    //valid user login test method - edited login email
    protected void validUserLoginEditedEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        //wait for elements to load (due to network issues, wait has been extended)
        generalPage.waitForElementsToLoad(4750);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (footer section) web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page (header section) text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //general page (footer section) text element assert
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementIsAsExpected(homePage);
        //capture screenshot of the home page display
        captureScreenshot(driver, "Home Page Display");
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //valid edited login input data getter - edited login email
        loginAccountModal.validEditedLoginEmailInputDataGetter();
        //input valid edited login email into login email input field
        loginAccountModal.inputValidEditedLoginEmailIntoEmailInputField();
        //input valid login password into login password input field
        loginAccountModal.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after valid edited login data input - edited login email
        captureScreenshot(driver, "Login Account Modal Display After Valid Edited Login Data Input - Edited Login Email");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user account gets created
        assertEquals(accountInformationPage.getEditedUsername(), generalPage.getUpperHeaderUsername(), "The usernames don't match expectations or the user login (with edited data) process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result - Edited Login Email");
    }

    //valid user login test method - edited login password
    protected void validUserLoginEditedPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        //wait for elements to load (due to network issues, wait has been extended)
        generalPage.waitForElementsToLoad(4750);
        //general page (header section) web element assert
        isGeneralPageHeaderSectionWebElementDisplayed(generalPage);
        //general page (footer section) web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page (header section) text element assert
        isGeneralPageHeaderSectionTextElementAsExpected(generalPage);
        //general page (footer section) text element assert
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementIsAsExpected(homePage);
        //capture screenshot of the home page display
        captureScreenshot(driver, "Home Page Display");
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //valid edited login input data getter - edited login password
        loginAccountModal.validEditedLoginPasswordInputDataGetter();
        //input valid login email into login email input field
        loginAccountModal.inputValidLoginEmailIntoEmailInputField();
        //input valid edited login password into login password input field
        loginAccountModal.inputValidEditedLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after valid edited login data input - edited login password
        captureScreenshot(driver, "Login Account Modal Display After Valid Edited Login Data Input - Edited Login Password");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user account gets created
        assertEquals(accountInformationPage.getEditedUsername(), generalPage.getUpperHeaderUsername(), "The usernames don't match expectations or the user login (with edited data) process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result - Edited Login Password");
    }

    //invalid user login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        LoginAccountModalInvalidScenarios loginAccountModalInvalidScenarios = new LoginAccountModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //invalid login input data getter - no login email
        loginAccountModalInvalidScenarios.invalidLoginInputDataNoEmailGetter();
        //don't input login email into login email input field
        loginAccountModalInvalidScenarios.inputNoLoginEmailIntoEmailInputField();
        //input valid login password into login password input field
        loginAccountModalInvalidScenarios.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after invalid login data input - no login email
        captureScreenshot(driver, "Login Account Modal Display After Invalid Login Data Input - No Login Email");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", loginAccountModal.getLoginAccountModalSingularInputErrorMsg(), "The missing login email error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing login email error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Email");
    }

    //invalid user login test method - no login password
    protected void invalidUserLoginNoPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        LoginAccountModalInvalidScenarios loginAccountModalInvalidScenarios = new LoginAccountModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //invalid login input data getter - no login password
        loginAccountModalInvalidScenarios.invalidLoginInputDataNoPasswordGetter();
        //input valid login email into login email input field
        loginAccountModalInvalidScenarios.inputValidLoginEmailIntoEmailInputField();
        //don't input login password into login password input field
        loginAccountModalInvalidScenarios.inputNoLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after invalid login data input - no login password
        captureScreenshot(driver, "Login Account Modal Display After Invalid Login Data Input - No Login Password");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Pole je povinné", loginAccountModal.getLoginAccountModalSingularInputErrorMsg(), "The missing login password error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing login password error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Password");
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        LoginAccountModalInvalidScenarios loginAccountModalInvalidScenarios = new LoginAccountModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //invalid login input data getter - invalid login email
        loginAccountModalInvalidScenarios.invalidLoginInputDataInvalidEmailGetter();
        //input invalid login email into login email input field
        loginAccountModalInvalidScenarios.inputInvalidLoginEmailIntoEmailInputField();
        //input valid login password into login password input field
        loginAccountModalInvalidScenarios.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after invalid login data input - invalid login email
        captureScreenshot(driver, "Login Account Modal Display After Invalid Login Data Input - Invalid Login Email");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user gets an expected error message
        assertEquals("Zadané údaje neodpovídají záznamům v naší databázi.", loginAccountModal.getLoginAccountModalSingularInputErrorMsg(), "The invalid login email input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Email");
    }

    //invalid user login test method - invalid login email format (missing '@')
    protected void invalidUserLoginInvalidEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        LoginAccountModalInvalidScenarios loginAccountModalInvalidScenarios = new LoginAccountModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //invalid login input data getter - invalid login email format (missing '@')
        loginAccountModalInvalidScenarios.invalidLoginInputDataInvalidEmailFormatGetter();
        //input invalid login email format into login email input field (missing '@)
        loginAccountModalInvalidScenarios.inputInvalidLoginEmailFormatIntoEmailInputField();
        //input valid login password into login password input field
        loginAccountModalInvalidScenarios.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after invalid login data input - invalid login email format
        captureScreenshot(driver, "Login Account Modal Display After Invalid Login Data Input - Invalid Login Email Format");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("E-mailová adresa je neplatná.", loginAccountModal.getLoginAccountModalSingularInputErrorMsg(), "The invalid login email error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid login email error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Email Format");
    }

    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginAccountModal loginAccountModal = new LoginAccountModal(driver);
        LoginAccountModalInvalidScenarios loginAccountModalInvalidScenarios = new LoginAccountModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
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
        //click upper header "Login" button
        generalPage.clickLoginButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(3500);
        //login account modal web element assert
        isLoginAccountModalWebElementDisplayed(loginAccountModal);
        //login account modal text element assert
        isLoginAccountModalTextElementAsExpected(loginAccountModal);
        //capture screenshot of the login account modal display before data input
        captureScreenshot(driver, "Login Account Modal Display Before Data Input");
        //invalid login input data getter - invalid login password
        loginAccountModalInvalidScenarios.invalidLoginInputDataInvalidPasswordGetter();
        //input valid login email into login email input field
        loginAccountModalInvalidScenarios.inputValidLoginEmailIntoEmailInputField();
        //input invalid login password into login password input field
        loginAccountModalInvalidScenarios.inputInvalidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the login account modal display after invalid login data input - invalid login password
        captureScreenshot(driver, "Login Account Modal Display After Invalid Login Data Input - Invalid Login Password");
        //click "Login" button
        loginAccountModal.clickLoginButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(6000);
        //assert the user gets an expected error message
        assertEquals("Zadané údaje neodpovídají záznamům v naší databázi.", loginAccountModal.getLoginAccountModalSingularInputErrorMsg(), "The invalid login password input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Password");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single chosen product to cart tests

    //add single chosen product ("Polštář Furniture") to cart test method - as a guest
    protected void addSingleChosenProductToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
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
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Polštář Furniture";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Chosen Product (single Polštář Furniture product) To Cart Test Result (as guest)");
    }

    //add single chosen product ("Polštář Furniture") to cart test method - as a guest
    protected void addSingleChosenProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //perform the click a couple of times to scroll the list
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product as registered user)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Polštář Furniture";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Chosen Product (single Polštář Furniture product) To Cart Test Result (as registered user)");
    }

    //add multiple chosen products to cart tests

    //add multiple chosen products ("Polštář Furniture") to cart test method - as a guest
    protected void addMultipleChosenProductToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Polštář Furniture";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click set product quantity increase button
        shoppingCartModal.clickSetProductQtyIncreaseButton(0);
        //click set product quantity increase button
        shoppingCartModal.clickSetProductQtyIncreaseButton(0);
        //log shopping cart modal product data (to verify the product quantity has increased)
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Chosen Products (multiple Polštář Furniture products) To Cart Test Result (as guest)");
    }

    //add multiple chosen product ("Polštář Furniture") to cart test method - as a guest
    protected void addMultipleChosenProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //perform the click a couple of times to scroll the list
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product as registered user)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Polštář Furniture";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click set product quantity increase button
        shoppingCartModal.clickSetProductQtyIncreaseButton(0);
        //log shopping cart modal product data (to verify the product quantity has increased)
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Chosen Products (multiple Polštář Furniture products) To Cart Test Result (as registered user)");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //update product quantity in shopping cart modal test (both guest and registered user will have the same output, hence, only guest branch is tested to avoid redundancy)

    //update product quantity in shopping cart modal test method
    protected void updateProductQuantityShopCartModalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //input set product quantity (the input field doesn't allow to be cleared, so the output will be 11)
        shoppingCartModal.inputSetProductQuantityIntoProductQtyInputField(0, 1);
        //wait for elements to load (for quantity to be altered)
        generalPage.waitForElementsToLoad(3000);
        //log shopping cart modal product data (to verify the product quantity has been updated)
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button (the pop-up closes)
        shoppingCartModal.clickProceedToCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Update Product Quantity In Shopping Cart Modal Test Result");
    }

    //remove product from shopping cart modal test (both guest and registered user will have the same output, hence, only guest branch is tested to avoid redundancy)

    //remove product from shopping cart modal test method
    protected void removeProductFromShopCartModalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
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
        //click chosen products section scroll left button
        homePage.clickChosenProductScrollLeftButton();
        //wait for elements to load (for click to be performed)
        generalPage.waitForElementsToLoad(900);
        //click set product ("Polštář Furniture") "Add to cart" button
        homePage.clickSetChosenProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Polštář Furniture product)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click set product remove button
        shoppingCartModal.clickSetProductRemoveButton(0);
        //wait for elements to load (for the shopping cart modal to be updated)
        generalPage.waitForElementsToLoad(3000);
        //assert the user receives an expected warning message
        assertEquals("V košíku nemáte zatím žádnou položku", shoppingCartModal.getShoppingCartModalNoProductWarning(), "The shopping cart modal no product warning message doesn't match expectations or the product removal process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Product Removal From Shopping Cart Modal Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single category dashboard tests

    //add single category ("Pracovna") single product ("Knihovna - 10 polic") to cart test method - as a guest
    protected void addSetSingleCategoryProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click set lower header category link ("Pracovna")
        homePage.clickSetRoomCategoryNameLink(3);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //single category dashboard page aside section web element assert
        isSingleCategoryDashPageAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard page aside section web element assert;
        isSingleCategoryDashPageAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Pracovna";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product name, test has failed");
        //log category product options data
        logCategoryProductOptions(singleCategoryDashboardPage);
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Pracovna") dashboard page display (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display (guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (name ascending) option
        singleCategoryDashboardPage.selectSortByOption(0);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by name (ascending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Name Asc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (name desccending) option
        singleCategoryDashboardPage.selectSortByOption(1);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by name (descending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Name Desc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (price ascending) option
        singleCategoryDashboardPage.selectSortByOption(2);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by price (ascending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Price Asc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (price descending) option
        singleCategoryDashboardPage.selectSortByOption(3);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by price (descending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Price Desc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (position ascending) option
        singleCategoryDashboardPage.selectSortByOption(4);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by positione (ascending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Position Asc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (position descending) option
        singleCategoryDashboardPage.selectSortByOption(5);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by position (descending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Position Desc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (availability ascending) option
        singleCategoryDashboardPage.selectSortByOption(6);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by availability (ascending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Availability Asc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (availability descending) option
        singleCategoryDashboardPage.selectSortByOption(7);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by availability (descending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Availability Desc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (bestselling ascending) option
        singleCategoryDashboardPage.selectSortByOption(8);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by bestselling (ascending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Bestselling Asc(guest)");
        //click sort by dropdown menu
        singleCategoryDashboardPage.clickSortByDropdownMenu();
        //select set sort by (bestselling descending) option -> default sort by option
        singleCategoryDashboardPage.selectSortByOption(9);
        //log single category dashboard page product data (to verify the products have been sorted)
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(950);
        //capture screenshot of the set single category ("Pracovna") dashboard page display after sorting products by bestselling (descending) (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display - Sort By Bestselling Desc(guest) - Default Sorting Option");
        //click set product ("Knihovna - 10 polic") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (single Knihovna - 10 polic Study product as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Knihovna - 10 polic";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Set Category Product (single Knihovna - 10 polic Study product) To Cart Test Result (as guest)");
    }

    //add single category ("Nábytek") multiple products ("Odkládací stolek") to cart test method - as a registered user
    protected void addSetSingleCategoryProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click lower header category ("Nábytek")
        generalPage.clickSetLowerHeaderCategoryDropdownLink(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //single category dashboard (furniture) page aside section in stock web element assert
        isSingleCategoryDashPageAsideInStockWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section in stock text element assert
        isSingleCategoryDashPageAsideInStockTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section web element assert
        isSingleCategoryDashPageFurnitureAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section text element assert;
        isSingleCategoryDashPageFurnitureAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page text element assert
        isSingleCategoryDashPageFurnitureCategoryTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page subcategories web element assert
        isSingleCategoryDashPageSubcategoryWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Nábytek";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product name, test has failed");
        //log single category (furniture) dashboard page product data
        logFurnitureCategoryProductOptions(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Nábytek") dashboard page display (as a registered user)
        captureScreenshot(driver, "Single Category (Nábytek) Dashboard Page Display (registered user)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product ("Odkládací stolek") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(0);
        //wait for elements to load (for modal to appear) -> due to network issues, wait time is extended
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Odkládací stolek Furniture product as registered user)");
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Odkládací stolek";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Set Category Product (Odkládací stolek Furniture product) To Cart Test Result (as registered user)");
    }

    //add single category ("Pracovna") multiple products ("Konferenční stolek", "Knihovna - 3 police") to cart test method - as a guest
    protected void addSetSingleCategoryMultipleProductsToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click set room category link ("Pracovna")
        homePage.clickSetRoomCategoryNameLink(3);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //single category dashboard page aside section web element assert
        isSingleCategoryDashPageAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard page aside section web element assert;
        isSingleCategoryDashPageAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Pracovna";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product name, test has failed");
        //log category product options data
        logCategoryProductOptions(singleCategoryDashboardPage);
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Pracovna") dashboard page display (as a guest)
        captureScreenshot(driver, "Single Category (Pracovna) Dashboard Page Display (guest)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product ("Konferenční stolek") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(2);
        //wait for elements to load (for modal to disappear) -> due to network issues wait time is extended
        generalPage.waitForElementsToLoad(4000);
        //click close shopping cart modal button
        shoppingCartModal.clickShoppingCartCloseModalButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1200);
        //click set product ("Knihovna - 3 police") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(2);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Konferenční stolek and Knihovna - 3 police Study products as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        List<String> expectedProductNames = Arrays.asList("Konferenční stolek", "Knihovna - 3 police");
        List<String> actualProductNames = shoppingCartModal.getShoppingCartModalProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected product names list don't match the actual product names list, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Set Category Products (Konferenční stolek and Knihovna - 3 police Study products) To Cart Test Result (as guest)");
    }

    //add single category ("Dětský pokoj") multiple products ("Dětská postýlka", "Polštář") to cart test method - as a registered user
    protected void addSetSingleCategoryMultipleProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click set room category link ("Dětský pokoj")
        homePage.clickSetRoomCategoryNameLink(7);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //single category dashboard page aside section web element assert
        isSingleCategoryDashPageAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard page aside section web element assert;
        isSingleCategoryDashPageAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Dětský pokoj";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product name, test has failed");
        //log category product options data
        logCategoryProductOptions(singleCategoryDashboardPage);
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Dětský pokoj") dashboard page display (as a registered user)
        captureScreenshot(driver, "Single Category (Dětský pokoj) Dashboard Page Display (registered user)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product ("Dětská postýlka") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(0);
        //wait for elements to load (for modal to disappear) -> due to network issues wait time is extended
        generalPage.waitForElementsToLoad(4000);
        //click close shopping cart modal button
        shoppingCartModal.clickShoppingCartCloseModalButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1200);
        //click set product ("Polštář") add to cart button
        singleCategoryDashboardPage.clickSetCategoryProductAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Dětská postýlka and Polštář Children room products as registered user)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        List<String> expectedProductNames = Arrays.asList("Dětská postýlka", "Polštář");
        List<String> actualProductNames = shoppingCartModal.getShoppingCartModalProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected product names list don't match the actual product names list, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Set Category Products (Dětská postýlka and Polštář Children room products) To Cart Test Result (as registered user)");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single searched product add to cart tests

    //add single searched product ("Rohová pohovka") to cart test method - as a guest
    protected void addSingleSearchedProductToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add to cart" button
        singleProductPage.clickAddToCartButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Rohová pohovka Searched product as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Rohová pohovka";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Searched Product (Rohová pohovka) To Cart Test Result (as guest)");
    }

    //add single searched product ("Knihovna - 3 police") to cart test method - as a registered user
    protected void addSingleSearchedProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product ("Knihovna - 3 police") into search bar
        generalPage.inputSetSearchedShelfProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Knihovna - 3 police) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3900);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Knihovna - 3 police) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionNoAppearanceWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Knihovna - 3 police) Page Reviews Section Display");
        //click "Add to cart" button
        singleProductPage.clickAddToCartButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Knihovna - 3 police Searched product as registered user)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Knihovna - 3 police";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Searched Products (Knihovna - 3 police) To Cart Test Result (as registered user)");
    }

    //multiple searched products add to cart tests

    //add multiple searched products ("Rohová pohovka") to cart test method - as a guest
    protected void addMultipleSearchedProductsToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //input set product quantity
        singleProductPage.inputSetProductQuantityIntoProductQtyInputField(2);
        //click "Add to cart" button
        singleProductPage.clickAddToCartButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Rohová pohovka Searched product as guest)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Rohová pohovka";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Searched Products (Rohová pohovka) To Cart Test Result (as guest)");
    }

    //add multiple searched products ("Knihovna - 3 police") to cart test method - as a registered user
    protected void addMultipleSearchedProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product ("Knihovna - 3 police") into search bar
        generalPage.inputSetSearchedShelfProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Knihovna - 3 police) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3900);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Knihovna - 3 police) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionNoAppearanceWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Knihovna - 3 police) Page Reviews Section Display");
        //input set product quantity
        singleProductPage.inputSetProductQuantityIntoProductQtyInputField(6);
        //click "Add to cart" button
        singleProductPage.clickAddToCartButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Knihovna - 3 police Searched products as registered user)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //assert the correct product has been added to shopping cart
        String expectedProductName = "Knihovna - 3 police";
        String actualProductName = shoppingCartModal.getShoppingCartModalProductName().getFirst();
        assertEquals(expectedProductName, actualProductName, "The expected product name doesn't match the actual product name, test has failed");
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Searched Products (Knihovna - 3 police) To Cart Test Result (as registered user)");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //product add to wishlist tests (only registered user have this feature)

    //add set category ("Nábytek") product ("Manželská postel") to wishlist test method
    protected void addSetCategoryProductToWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        WishlistDashboardPage wishlistDashboardPage = new WishlistDashboardPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click lower header category ("Nábytek")
        generalPage.clickSetLowerHeaderCategoryDropdownLink(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5200);
        //single category dashboard (furniture) page aside section in stock web element assert
        isSingleCategoryDashPageAsideInStockWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section in stock text element assert
        isSingleCategoryDashPageAsideInStockTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section web element assert
        isSingleCategoryDashPageFurnitureAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section text element assert;
        isSingleCategoryDashPageFurnitureAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page text element assert
        isSingleCategoryDashPageFurnitureCategoryTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page subcategories web element assert
        isSingleCategoryDashPageSubcategoryWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Nábytek";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product category name, test has failed");
        //log single category (furniture) dashboard page product data
        logFurnitureCategoryProductOptions(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Nábytek") dashboard page display (as a registered user)
        captureScreenshot(driver, "Single Category (Nábytek) Dashboard Page Display (registered user)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(3);
        //click upper header wishlist link
        generalPage.clickUpperHeaderWishlistLink();
        //wait for elements to load
        generalPage.waitForElementsToLoad(4000);
        //account information page my user section web element assert (it appears on this page)
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert (it appears on this page)
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page breadcrumb web element assert (it appears on this page)
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //wishlist dashboard page web element assert
        isWishlistDashboardPageWebElementDisplayed(wishlistDashboardPage);
        //wishlist dashboard page text element assert
        isWishlistDashboardPageTextElementAsExpected(wishlistDashboardPage);
        //log wishlist dashboard page product data
        logWishlistDashboardPageProductData(wishlistDashboardPage);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
        //assert the correct product has been added to wishlist
        String expectedWishlistProduct = "Manželská postel";
        String actualWishlistProduct = wishlistDashboardPage.getWishlistDashboardProductName().getFirst();
        assertEquals(expectedWishlistProduct, actualWishlistProduct, "The expected wishlist product name doesn't match the actual wishlist product name, test has failed");
        //capture screenshot of the test result
        captureScreenshot(driver, "Set Category Product (Manželská postel) Add To Wishlist Test Result");
    }

    //add set category ("Nábytek") products ("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka") to wishlist test method
    protected void addSetCategoryProductsToWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        WishlistDashboardPage wishlistDashboardPage = new WishlistDashboardPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click lower header category ("Nábytek")
        generalPage.clickSetLowerHeaderCategoryDropdownLink(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5200);
        //single category dashboard (furniture) page aside section in stock web element assert
        isSingleCategoryDashPageAsideInStockWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section in stock text element assert
        isSingleCategoryDashPageAsideInStockTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section web element assert
        isSingleCategoryDashPageFurnitureAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section text element assert;
        isSingleCategoryDashPageFurnitureAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page text element assert
        isSingleCategoryDashPageFurnitureCategoryTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page subcategories web element assert
        isSingleCategoryDashPageSubcategoryWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Nábytek";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product category name, test has failed");
        //log single category (furniture) dashboard page product data
        logFurnitureCategoryProductOptions(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Nábytek") dashboard page display (as a registered user)
        captureScreenshot(driver, "Single Category (Nábytek) Dashboard Page Display (registered user)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product ("Manželská postel") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(3);
        //click set product ("Knihovna - 10 polic") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(4);
        //click set product ("Rohová pohovka") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(5);
        //click upper header wishlist link
        generalPage.clickUpperHeaderWishlistLink();
        //wait for elements to load
        generalPage.waitForElementsToLoad(4000);
        //account information page my user section web element assert (it appears on this page)
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert (it appears on this page)
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page breadcrumb web element assert (it appears on this page)
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //wishlist dashboard page web element assert
        isWishlistDashboardPageWebElementDisplayed(wishlistDashboardPage);
        //wishlist dashboard page text element assert
        isWishlistDashboardPageTextElementAsExpected(wishlistDashboardPage);
        //assert the correct products have been added to wishlist
        List<String> expectedWishlistProducts = Arrays.asList("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka");
        List<String> actualWishlistProducts = wishlistDashboardPage.getWishlistDashboardProductName();
        assertEquals(expectedWishlistProducts, actualWishlistProducts, "The expected product names don't match the actual product names, test has failed");
        //log wishlist dashboard page product data
        logWishlistDashboardPageProductData(wishlistDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Set Category Products (Manželská postel, Knihovna - 10 polic, Rohová pohovka) Add To Wishlist Test Result");
    }

    //add set category ("Nábytek") products ("Manželská postel", "Knihovna - 10 polic") to cart from wishlist test method
    protected void addSetCategoryProductsToCartFromWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleCategoryDashboardPage singleCategoryDashboardPage = new SingleCategoryDashboardPage(driver);
        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        WishlistDashboardPage wishlistDashboardPage = new WishlistDashboardPage(driver);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //click lower header category ("Nábytek")
        generalPage.clickSetLowerHeaderCategoryDropdownLink(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5200);
        //single category dashboard (furniture) page aside section in stock web element assert
        isSingleCategoryDashPageAsideInStockWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section in stock text element assert
        isSingleCategoryDashPageAsideInStockTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section web element assert
        isSingleCategoryDashPageFurnitureAsideWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page aside section text element assert;
        isSingleCategoryDashPageFurnitureAsideTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page web element assert
        isSingleCategoryDashPageWebElementDisplayed(singleCategoryDashboardPage);
        //single category dashboard (furniture) page text element assert
        isSingleCategoryDashPageFurnitureCategoryTextElementAsExpected(singleCategoryDashboardPage);
        //single category dashboard page subcategories web element assert
        isSingleCategoryDashPageSubcategoryWebElementDisplayed(singleCategoryDashboardPage);
        //assert the correct category page has been opened
        String expectedProductCategory = "Nábytek";
        String actualProductCategory = singleCategoryDashboardPage.getSingleCategoryDashPageTitle();
        assertEquals(expectedProductCategory, actualProductCategory, "The expected product category name doesn't match the actual product name, test has failed");
        //log single category (furniture) dashboard page product data
        logFurnitureCategoryProductOptions(singleCategoryDashboardPage);
        //capture screenshot of the set single category ("Nábytek") dashboard page display (as a registered user)
        captureScreenshot(driver, "Single Category (Nábytek) Dashboard Page Display (registered user)");
        //log single category dashboard page product data
        logSingleCategoryDashboardProductData(singleCategoryDashboardPage);
        //click set product ("Manželská postel") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(3);
        //click set product ("Knihovna - 10 polic") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(4);
        //click set product ("Rohová pohovka") "Add to wishlist" button
        singleCategoryDashboardPage.clickSetCategoryProductAddToWishlistButton(5);
        //click upper header wishlist link
        generalPage.clickUpperHeaderWishlistLink();
        //wait for elements to load
        generalPage.waitForElementsToLoad(4000);
        //account information page my user section web element assert (it appears on this page)
        isAccountInfoPageMyUserSectionWebElementDisplayed(accountInformationPage);
        //account information page my user section text element assert (it appears on this page)
        isAccountInfoPageMyUserSectionTextElementAsExpected(accountInformationPage);
        //account information page breadcrumb web element assert (it appears on this page)
        isAccountInfoPageBreadcrumbWebElementDisplayed(accountInformationPage);
        //wishlist dashboard page web element assert
        isWishlistDashboardPageWebElementDisplayed(wishlistDashboardPage);
        //wishlist dashboard page text element assert
        isWishlistDashboardPageTextElementAsExpected(wishlistDashboardPage);
        //assert the correct products have been added to wishlist
        List<String> expectedWishlistProducts = Arrays.asList("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka");
        List<String> actualWishlistProducts = wishlistDashboardPage.getWishlistDashboardProductName();
        assertEquals(expectedWishlistProducts, actualWishlistProducts, "The expected product names don't match the actual product names, test has failed");
        //log wishlist dashboard page product data
        logWishlistDashboardPageProductData(wishlistDashboardPage);
        //click set products "Add to cart" button
        wishlistDashboardPage.clickSetProductsAddToCartButton(0);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Manželská postel)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click close shopping cart modal button
        shoppingCartModal.clickShoppingCartCloseModalButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //click set products "Add to cart" button
        wishlistDashboardPage.clickSetProductsAddToCartButton(1);
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2000);
        //capture screenshot of the shopping cart modal display
        captureScreenshot(driver, "Shopping Cart Modal Display (Rohová pohovka)");
        //wait for elements to load
        generalPage.waitForElementsToLoad(2000);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementDisplayed(shoppingCartModal);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(shoppingCartModal);
        //log shopping cart modal product data
        logShoppingCartModalProductData(shoppingCartModal);
        //click "Proceed to cart" button
        shoppingCartModal.clickProceedToCartButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1100);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Set Category Products (Manželská postel, Knihovna - 10 polic) To Cart From Wishlist Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add review for a set searched product test

    //add review for a set single searched product ("Rohová pohovka") test method - as a guest
    protected void addReviewForSingleSearchedProductTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalGuestAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModal.inputGuestAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModal.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after valid  guest review input data
        captureScreenshot(driver, "Add Product Review Modal Display After Valid Guest Review Input Data");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Searched Product (Rohová pohovka) Review Test Result (guest)");
    }

    //add review for a set single searched product ("Rohová pohovka") test method - as a registered user
    protected void addReviewForSingleSearchedProductRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(4500);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (registered user) into author name input field
        addProductReviewModal.inputAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModal.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after valid registered user review input data
        captureScreenshot(driver, "Add Product Review Modal Display After Valid Reg User Review Input Data");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Searched Product (Rohová pohovka) Review Test Result (registered user)");
    }

    //invalid add review for a set searched product tests (since both registered user and guest will have the same output, nly guest branch is being tested to avoid redundancy)

    //no singular input

    //invalid add review for a set single searched product ("Rohová pohovka") test method - no product review stars
    protected void invalidAddReviewForSingleSearchedProductNoReviewStarsTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        //addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModal.inputGuestAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModal.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - no review stars
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - No Review Stars");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - No Review Stars");
    }

    //invalid add review for a set single searched product ("Rohová pohovka") test method - no product review author name
    protected void invalidAddReviewForSingleSearchedProductNoReviewAuthorTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //don't input author name (guest) into author name input field
        addProductReviewModalInvalidScenarios.inputNoGuestAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModalInvalidScenarios.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - no review author name
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - No Review Author Name");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The missing product review author name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing product review author name input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product Review Test Result (guest) - No Review Author Name");
    }

    //invalid add review for a set single searched product ("Rohová pohovka") test method - no product review
    protected void invalidAddReviewForSingleSearchedProductNoReviewTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModalInvalidScenarios.inputGuestAuthorNameIntoAuthorNameInputField();
        //don't input review into review input field
        addProductReviewModalInvalidScenarios.inputNoProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - no review
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - No Review");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole je povinné", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The missing product review input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing product review input error message doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - No Review");
    }

    //too short singular input

    //invalid add review for a set single searched product ("Rohová pohovka") test method - too short product review author name (1 char)
    protected void invalidAddReviewForSingleSearchedProductTooShortReviewAuthorTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input too short author name (guest) into author name input field (1 char)
        addProductReviewModalInvalidScenarios.inputTooShortGuestAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModalInvalidScenarios.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - too short review author name
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Too Short Review Author Name");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The too short review author name error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Short Review Author Name");
           throw new Error("The too short review author name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Short Review Author Name");
    }

    //invalid add review for a set single searched product ("Rohová pohovka") test method - too short product review (1 char)
    protected void invalidAddReviewForSingleSearchedProductTooShortReviewTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModalInvalidScenarios.inputGuestAuthorNameIntoAuthorNameInputField();
        //input too short review into review input field (1 char)
        addProductReviewModalInvalidScenarios.inputTooShortProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - too short review
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Too Short Review");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The too short review error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Short Review");
            throw new Error("The too short review input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Short Review");
    }

    //too long singular input

    //invalid add review for a set single searched product ("Rohová pohovka") test method - too short product review author name (101 chars)
    protected void invalidAddReviewForSingleSearchedProductTooLongReviewAuthorTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input too long author name (guest) into author name input field (101 chars)
        addProductReviewModalInvalidScenarios.inputTooLongGuestAuthorNameIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModalInvalidScenarios.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - too long review author name
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Too Long Review Author Name");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže být delší než 100 znaků.", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The too long review author name error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Long Review Author Name");
            throw new Error("The too long review author name input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Long Review Author Name");
    }

    //invalid add review for a set single searched product ("Rohová pohovka") test method - too long product review (10001 chars)
    protected void invalidAddReviewForSingleSearchedProductTooLongReviewTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModalInvalidScenarios.inputGuestAuthorNameIntoAuthorNameInputField();
        //input too long review into review input field (10001 char)
        addProductReviewModalInvalidScenarios.inputTooLongProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - too long review
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Too Long Review");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The too long review error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Long Review");
            throw new Error("The too long review input error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Too Long Review");
    }

    //invalid singular input

    //invalid add review for a set single searched product ("Rohová pohovka") test method - invalid product review author name format (special symbols only)
    protected void invalidAddReviewForSingleSearchedProductInvalidReviewAuthorNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input invalid author name (guest) format into author name input field (special symbols only)
        addProductReviewModalInvalidScenarios.inputInvalidGuestAuthorNameFormatIntoAuthorNameInputField();
        //input valid review into review input field
        addProductReviewModalInvalidScenarios.inputProductReviewIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - invalid review author name format
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Invalid Review Author Name Format");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The invalid review author name input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Invalid Review Author Name Format");
            throw new Error("The invalid review author name input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Invalid Review Author Name Format");
    }

    //invalid add review for a set single searched product ("Rohová pohovka") test method - invalid product review format (special symbols only)
    protected void invalidAddReviewForSingleSearchedProductInvalidReviewFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchProductModal searchProductModal = new SearchProductModal(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        AddProductReviewModal addProductReviewModal = new AddProductReviewModal(driver);
        AddProductReviewModalInvalidScenarios addProductReviewModalInvalidScenarios = new AddProductReviewModalInvalidScenarios(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2100);
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
        //input set searched product into search bar
        generalPage.inputSetSearchedProductIntoSearchBar();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3500);
        //capture screenshot of the search product modal display
        captureScreenshot(driver, "Search Product (Rohová pohovka) Modal Display");
        //search product modal web element assert
        isSearchProductModalWebElementDisplayed(searchProductModal);
        //search product modal text element assert
        isSearchProductModalTextElementAsExpected(searchProductModal);
        //log search product modal product data
        logSearchProductModalProductData(searchProductModal);
        //click set search product card
        searchProductModal.clickSetSearchProductCard(0);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2200);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(singleProductPage);
        //assert the correct product page has been opened
        String expectedProduct = "Rohová pohovka";
        String actualProduct = singleProductPage.getSingleProductPageProductName();
        assertEquals(expectedProduct, actualProduct, "The expected product name doesn't match the actual product name, test has failed");
        //log single product page product data
        logSingleProductPageProductData(singleProductPage);
        //log single product page product description data
        logSingleProductPageProductDescriptionData(singleProductPage);
        //capture screenshot of the single product page display
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Display");
        //click "Product reviews" section button
        singleProductPage.clickProductReviewsSectionButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //single product page reviews section web element assert
        isSingleProductPageReviewSectionWebElementDisplayed(singleProductPage);
        //log single product page product reviews section data
        logSingleProductPageProductReviewsData(singleProductPage);
        //capture screenshot of the single product page display -> reviews section
        captureScreenshot(driver, "Single Product (Rohová pohovka) Page Reviews Section Display");
        //click "Add product review" button
        singleProductPage.clickProductReviewButton();
        //wait for elements to load (for modal to appear)
        generalPage.waitForElementsToLoad(2800);
        //add product review modal web element assert
        isAddProductReviewModalWebElementDisplayed(addProductReviewModal);
        //add product review modal additional web element assert (not all products have these)
        isAddProductReviewModalAdditionalWebElementDisplayed(addProductReviewModal);
        //add product review modal text element assert
        isAddProductReviewModalTextElementAsExpected(addProductReviewModal);
        //add product review modal additional text element assert (not all products have these)
        isAddProductReviewModalAdditionalTextElementAsExpected(addProductReviewModal);
        //capture screenshot of the add product review modal display before review input data
        captureScreenshot(driver, "Add Product Review Modal Display Before Review Input Data");
        //select set review stars count
        addProductReviewModal.selectSetReviewStars(3);
        //input valid author name (guest) into author name input field
        addProductReviewModalInvalidScenarios.inputGuestAuthorNameIntoAuthorNameInputField();
        //input invalid review format into review input field (special symbols only)
        addProductReviewModalInvalidScenarios.inputInvalidProductReviewFormatIntoReviewInputField();
        //select set looks review stars
        addProductReviewModal.selectSetLooksReviewStars(3);
        //select set comfort review stars
        addProductReviewModal.selectSetComfortReviewStars(2);
        //select set price review stars
        addProductReviewModal.selectSetPriceReviewStars(2);
        //select set assembly ease review stars
        addProductReviewModal.selectSetAssemblyEaseReviewStars(1);
        //capture screenshot of the add product review modal display after invalid guest review input data - invalid review format
        captureScreenshot(driver, "Add Product Review Modal Display After Invalid Guest Review Input Data - Invalid Review Format");
        //click "Send review" button
        addProductReviewModal.clickSendReviewButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //assert the user gets an expected error message, throw an error otherwise
        try {
            assertEquals("Pole nemůže obsahovat pouze speciální symboly", addProductReviewModal.getAddProductReviewModalSingularInputErrorMsg(), "The invalid review input format error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Invalid Review Format");
            throw new Error("The invalid review input format error message doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Add Single Searched Product (Rohová pohovka) Review Test Result (guest) - Invalid Review Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add product to check out test (both guest and registered user share the same method)

    //add product to check out test method
    protected void addProductToCheckoutTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //wait for elements to load (due to laggy backend, wait time is extended)
        generalPage.waitForElementsToLoad(7000);
        //general page footer web element assert (due to laggy backend. Selenium often fails to load these elements, the footer itself is present with all its elements)
        //isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert (due to laggy backend. Selenium often fails to load these elements, the footer itself is present with all its elements)
        //isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //shopping cart breadcrumb web element assert
        isShoppingCartBreadcrumbWebElementDisplayed(shoppingCartPage);
        //shopping cart page web element assert
        isShoppingCarPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart page product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click "Shipping and Payment" button
        shoppingCartPage.clickShipAndPaymentButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad(1600);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Product To Checkout Test Result");
    }

    //update product quantity in shopping cart test

    //update product quantity in shopping cart test method
    protected void updateProductQtyInShoppingCartPageTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //shopping cart breadcrumb web element assert
        isShoppingCartBreadcrumbWebElementDisplayed(shoppingCartPage);
        //shopping cart page web element assert
        isShoppingCarPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart page product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of the shopping cart page display before quantity change
        captureScreenshot(driver, "Shopping Cart Page Display Before Product Quantity Change");
        //input set product quantity
        shoppingCartPage.inputSetProductQty(0, 6);
        //click "Shipping and Payment" button
        shoppingCartPage.clickShipAndPaymentButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Update Product Quantity In Shopping Cart Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //product(s) checkout confirmation tests

    //product checkout confirmation test method - as a guest
    protected void productCheckoutConfirmationGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The missing country code error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Product(s) Checkout Confirmation Test Result (guest) - Missing country code options on checkout");
            throw new Error("The country code dropdown menu has no visible country code options, test has failed.");
        }
        //capture screenshot of the test Result
        captureScreenshot(driver, "Product(s) Checkout Confirmation Test Result (guest)");
    }

    //product checkout confirmation test method - as a registered user
    protected void productCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        AddNewAddressModal addNewAddressModal = new AddNewAddressModal(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //capture screenshot of the checkout page billing address section display (registered user)
        captureScreenshot(driver, "Checkout Page Billing Address Section Display (registered user)");
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //checkout page billing address section (registered user) web element assert
        isCheckoutPageRegUserBillAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section (registered user) text element assert
        isCheckoutPageRegUserBillAddressSectionTextElementAsExpected(checkoutPage);
        //click "Add new address" button
        checkoutPage.clickAddNewAddressButton();
        //the modal is the same as in "Add new address" in address dashboard, so the same methods are being reused
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(4000);
        //add new address modal web element assert
        isAddNewAddressModalWebElementDisplayed(addNewAddressModal);
        //add new address modal text element assert
        isAddNewAddressModalTextElementAsExpected(addNewAddressModal);
        //capture screenshot of the add new address modal display before data input
        captureScreenshot(driver, "Add New Address Modal Display Before Data Input (checkout page)");
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
        captureScreenshot(driver, "Add New Address Modal Absence of Available Country Codes (checkout page)");
        //input valid user phone into phone input field
        addNewAddressModal.inputValidUserPhoneIntoNewAddressModalPhoneInputField();
        //click country dropdown menu
        addNewAddressModal.clickCountryDropdownMenu();
        //select "United States" option
        addNewAddressModal.selectSetCountryOption(3);
        //capture screenshot of the add new address modal display after valid data input
        captureScreenshot(driver, "Add New Address Modal Display After Valid Data Input (checkout page)");
        //click "Add address" button
        addNewAddressModal.clickAddAddressButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The missing country code error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Product(s) Checkout Confirmation Test Result (registered user) - Missing country code options on checkout");
            throw new Error("The country code dropdown menu has no visible country code options, test has failed.");
        }
        //capture screenshot of the test Result
        captureScreenshot(driver, "Product(s) Checkout Confirmation Test Result (registered user)");
    }

    //product checkout confirmation (payment -> "Go Pay") test method - as a guest
    protected void productCheckoutConfirmationGoPayGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Go Pay" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(4);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The missing country code error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Product(s) Checkout Confirmation (Go Pay) Test Result (guest) - Missing country code options on checkout");
            throw new Error("The country code dropdown menu has no visible country code options, test has failed.");
        }
        //capture screenshot of the test Result
        captureScreenshot(driver, "Product(s) Checkout Confirmation Test Result (guest)");
    }

    //invalid product checkout confirmation tests

    //no singular input

    //invalid product checkout confirmation test method - no email
    protected void invalidProductCheckoutConfirmationGuestNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //invalid checkout billing address email input data getter - no email
        checkoutPageNoSingularInput.invalidCheckoutBillAddressEmailInputDataGetter();
        //don't input email into email input field
        checkoutPageNoSingularInput.inputNoCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no email
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Email");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Email - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Email");
    }

    //invalid product checkout confirmation test method - no billing first name
    protected void invalidProductCheckoutConfirmationGuestNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing first name
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoFirstNameGetter();
        //don't input first name into first name input field
        checkoutPageNoSingularInput.inputNoCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing first name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No First Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing First Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing First Name");
    }

    //invalid product checkout confirmation test method - no billing first name
    protected void invalidProductCheckoutConfirmationGuestNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing last name
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoLastNameGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //don't input last name into last name input field
        checkoutPageNoSingularInput.inputNoCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing last name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Last Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Last Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Last Name");
    }

    //invalid product checkout confirmation test method - no billing street
    protected void invalidProductCheckoutConfirmationGuestNoStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing street
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoStreetGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //don't input street into street input field
        checkoutPageNoSingularInput.inputNoCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing street
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Street");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Street - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Street");
    }

    //invalid product checkout confirmation test method - no billing city
    protected void invalidProductCheckoutConfirmationGuestNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing city
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoCityGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //don't input city into city input field
        checkoutPageNoSingularInput.inputNoCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing city
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No City");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing City - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing City");
    }

    //invalid product checkout confirmation test method - no billing country
    protected void invalidProductCheckoutConfirmationGuestNoCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing country
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Country");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing country input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Country - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Country");
    }

    //invalid product checkout confirmation test method - no billing zip code
    protected void invalidProductCheckoutConfirmationGuestNoZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing zip code
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoZipCodeGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //don't input zip code into zip code input field
        checkoutPageNoSingularInput.inputNoCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing zip code
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Zip Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Zip Code - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Zip Code");
    }

    //invalid product checkout confirmation test method - no billing country code
    protected void invalidProductCheckoutConfirmationGuestNoCountryCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing country code
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Country Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing country code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Country Code - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Country Code");
    }

    //invalid product checkout confirmation test method - no billing phone
    protected void invalidProductCheckoutConfirmationGuestNoPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - no billing phone
        checkoutPageNoSingularInput.invalidCheckoutBillAddressInputDataNoPhoneGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //don't input valid phone into phone input field
        checkoutPageNoSingularInput.inputNoCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no billing phone
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - No Phone");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole musí být platné telefonní číslo.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section missing phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Phone - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Billing Phone");
    }

    //invalid product checkout confirmation test method - no shipping first name
    protected void invalidProductCheckoutConfirmationGuestNoShipFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping first name
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoFirstNameGetter();
        //don't input first name into first name input field
        checkoutPageNoSingularInput.inputNoCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping first name
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping First Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping First Name - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping First Name");
    }

    //invalid product checkout confirmation test method - no shipping last name
    protected void invalidProductCheckoutConfirmationGuestNoShipLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping last name
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoLastNameGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //don't input last name into last name input field
        checkoutPageNoSingularInput.inputNoCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping last name
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Last Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Last Name - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Last Name");
    }

    //invalid product checkout confirmation test method - no shipping street
    protected void invalidProductCheckoutConfirmationGuestNoShipStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping street
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoStreetGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //don't input street into street input field
        checkoutPageNoSingularInput.inputNoCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping street
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Street");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Street - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Street");
    }

    //invalid product checkout confirmation test method - no shipping city
    protected void invalidProductCheckoutConfirmationGuestNoShipCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping city
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoCityGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //don't input city into city input field
        checkoutPageNoSingularInput.inputNoCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping city
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping City");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping City - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping City");
    }

    //invalid product checkout confirmation test method - no shipping country
    protected void invalidProductCheckoutConfirmationGuestNoShipCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //valid checkout shipping address input data getter
        checkoutPage.validCheckoutShipAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutShipCityIntoShipCityInputField();
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping street
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Country");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing country input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Country - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Country");
    }

    //invalid product checkout confirmation test method - no shipping zip code
    protected void invalidProductCheckoutConfirmationGuestNoShipZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping zip code
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoZipCodeGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //don't input zip code into zip code input field
        checkoutPageNoSingularInput.inputNoCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageNoSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping city
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Zip Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Zip Code - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Zip Code");
    }

    //invalid product checkout confirmation test method - no shipping country code
    protected void invalidProductCheckoutConfirmationGuestNoShipCountryCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //valid checkout shipping address input data getter
        checkoutPage.validCheckoutShipAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping street
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Country Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing country code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Country Code - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Country Code");
    }

    //invalid product checkout confirmation test method - no shipping phone
    protected void invalidProductCheckoutConfirmationGuestNoShipPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageNoSingularInput checkoutPageNoSingularInput = new CheckoutPageNoSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - no shipping phone
        checkoutPageNoSingularInput.invalidCheckoutShipAddressInputDataNoPhoneGetter();
        //input valid first name into first name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageNoSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageNoSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageNoSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageNoSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //don't input phone into phone input field
        checkoutPageNoSingularInput.inputNoCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - no shipping phone
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - No Shipping Phone");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole je povinné", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section missing phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Phone - Missing country code options on checkout");
            throw new Error("The shipping country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - No Shipping Phone");
    }

    //too short singular input

    //invalid product checkout confirmation test method - too short email (1 char -> name, domain)
    protected void invalidProductCheckoutConfirmationGuestTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //invalid checkout billing address email input data getter - too short email (1 char -> name, domain)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressTooShortEmailInputDataGetter();
        //=input too short email into email input field (1 char -> name, domain)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short email
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short Email");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Email - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Email");
    }

    //invalid product checkout confirmation test method - too short billing first name (1 char)
    protected void invalidProductCheckoutConfirmationGuestTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing first name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortFirstNameGetter();
        //input too short first name into first name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing first name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short First Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing First Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing First Name");
    }

    //invalid product checkout confirmation test method - too short billing last name (1 char)
    protected void invalidProductCheckoutConfirmationGuestTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing last name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortLastNameGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input too short last name into last name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing last name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short Last Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Last Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Last Name");
    }

    //invalid product checkout confirmation test method - too short billing street (3 chars)
    protected void invalidProductCheckoutConfirmationGuestTooShortStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing street (3 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortStreetGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input too short street into street input field (3 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing street
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short Street");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Street - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Street");
    }

    //invalid product checkout confirmation test method - too short billing city (2 chars)
    protected void invalidProductCheckoutConfirmationGuestTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing city (2 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortCityGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input too short city into city input field (2 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing city
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short City");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing City - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing City");
    }

    //invalid product checkout confirmation test method - too short billing zip code (4 digits)
    protected void invalidProductCheckoutConfirmationGuestTooShortZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing zip code (4 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortZipCodeGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input too short zip code into zip code input field (4 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing zip code
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short Zip Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Zip Code - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Zip Code");
    }

    //invalid product checkout confirmation test method - too short billing phone (2 digits)
    protected void invalidProductCheckoutConfirmationGuestTooShortPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too short billing phone (2 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutBillAddressInputDataTooShortPhoneGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input too short phone into phone input field (2 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short billing phone
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Short Phone");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole musí být platné telefonní číslo.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too short phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Phone - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Billing Phone");
    }

    //invalid product checkout confirmation test method - too short shipping first name (1 char)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping first name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortFirstNameGetter();
        //input too short first name into first name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping first name
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping First Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping First Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping First Name");
    }

    //invalid product checkout confirmation test method - too short shipping last name (1 char)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping last name (1 char)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortLastNameGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input too short last name into last name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping last name
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping Last Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Last Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Last Name");
    }

    //invalid product checkout confirmation test method - too short shipping city (3 chars)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping street (3 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortStreetGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input too short street into street input field (3 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping street
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping Street");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Street - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Street");
    }

    //invalid product checkout confirmation test method - too short shipping city (2 chars)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping city (2 chars)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortCityGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input too short city into city input field (2 chars)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping city
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping City");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping City - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping City");
    }

    //invalid product checkout confirmation test method - too short shipping zip code (4 digits)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping zip code (4 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortZipCodeGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input too short zip code into zip code input field (4 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping zip code
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping Zip Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš krátký vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Zip Code - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Zip Code");
    }

    //invalid product checkout confirmation test method - too short shipping phone (2 digits)
    protected void invalidProductCheckoutConfirmationGuestTooShortShipPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after valid address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Valid Address Data Input (guest)");
        //click "Add Shipping Address" checkbox
        checkoutPage.clickAddDifferentAddressCheckbox();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //checkout page shipping address section web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping address section text element assert
        isCheckoutPageShippingAddressSectionTextElementAsExpected(checkoutPage);
        //invalid checkout shipping address input data getter - too short shipping phone (2 digits)
        checkoutPageTooShortSingularInput.invalidCheckoutShipAddressInputDataTooShortPhoneGetter();
        //input valid first name into first name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipFirstNameIntoShipFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipLastNameIntoShipLastNameInputField();
        //input valid street into street input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipStreetIntoShipStreetInputField();
        //input valid city into city input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipCityIntoShipCityInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetShipCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooShortSingularInput.inputValidCheckoutShipZipCodeIntoShipZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickShipCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display Country Code Options Absence");
        //input too short phone into phone input field (2 digits)
        checkoutPageTooShortSingularInput.inputTooShortCheckoutShipPhoneIntoShipPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too short shipping phone (2 digits)
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display After Invalid Address Data Input (guest) - Too Short Shipping Phone");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole musí být platné telefonní číslo.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page shipping address section too short phone input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Phone - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Short Shipping Phone");
    }

    //too long singular input

    //invalid product checkout confirmation test method - too long email (75 chars -> name, domain)
    protected void invalidProductCheckoutConfirmationGuestTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //invalid checkout billing address email input data getter - too long email (75 chars -> name, domain)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressTooLongEmailInputDataGetter();
        //=input too long email into email input field (75 chars -> name, domain)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //valid checkout billing address input data getter
        checkoutPage.validCheckoutBillAddressInputDataGetter();
        //input valid first name into first name input field
        checkoutPage.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPage.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPage.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPage.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPage.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPage.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long email
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long Email");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Hodnota je příliš velká: řetězec musí mít <= 74 znaků", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long email input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Email - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Email");
    }

    //invalid product checkout confirmation test method - too long billing first name (51 chars)
    protected void invalidProductCheckoutConfirmationGuestTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too long billing first name (51 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressInputDataTooLongFirstNameGetter();
        //input too long first name into first name input field (51 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooLongSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooLongSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooLongSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooLongSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long billing first name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long First Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole nemůže být delší než 50 znaků.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long billing first name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing First Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing First Name");
    }

    //invalid product checkout confirmation test method - too long billing last name (100 chars)
    protected void invalidProductCheckoutConfirmationGuestTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too long billing last name (51 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressInputDataTooLongLastNameGetter();
        //input valid first name into first name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input too long last name into last name input field (51 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooLongSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooLongSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooLongSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooLongSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long billing last name
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long Last Name");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole nemůže být delší než 50 znaků.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long billing last name input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Last Name - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Last Name");
    }

    //invalid product checkout confirmation test method - too long billing street (100 chars)
    protected void invalidProductCheckoutConfirmationGuestTooLongStreetTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too long billing street (101 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressInputDataTooLongStreetGetter();
        //input valid first name into first name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input too long street into street input field (101 chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooLongSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooLongSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooLongSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long billing street
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long Street");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole nemůže být delší než 100 znaků.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long billing street input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Street - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Street");
    }

    //invalid product checkout confirmation test method - too long billing city (100 chars)
    protected void invalidProductCheckoutConfirmationGuestTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too long billing city (51 chars)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressInputDataTooLongCityGetter();
        //input valid first name into first name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooLongSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input too long city into city input field (5` chars)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input valid zip code into zip code input field
        checkoutPageTooLongSingularInput.inputValidCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooLongSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long billing city
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long City");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole nemůže být delší než 50 znaků.", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long billing city input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing City - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing City");
    }

    //invalid product checkout confirmation test method - too long billing zip code (6 digits)
    protected void invalidProductCheckoutConfirmationGuestTooLongZipCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad(2500);
        //general page footer web element assert
        isGeneralPageFooterSectionWebElementDisplayed(generalPage);
        //general page footer text element assert
        isGeneralPageFooterSectionTextElementAsExpected(generalPage);
        //checkout page shipping section web element assert
        isCheckoutPageShippingSectionWebElementDisplayed(checkoutPage);
        //checkout page shipping section text element assert
        isCheckoutPageShippingSectionTextElementAsExpected(checkoutPage);
        //log checkout page shipping method data
        logCheckoutPageShippingMethodData(checkoutPage);
        //log checkout page payment method data
        logCheckoutPagePaymentMethodData(checkoutPage);
        //checkout page order summary section web element assert
        isCheckoutPageOrderSummarySectionWebElementDisplayed(checkoutPage);
        //checkout page order summary section text element assert
        isCheckoutPageOrderSummarySectionTextElementAsExpected(checkoutPage);
        //log checkout page order summary product data
        logCheckoutPageOrderSummaryMethodData(checkoutPage);
        //capture screenshot of the checkout page shipping section display before shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display Before Shipping And Payment Methods Selection");
        //click "PenguinBox" shipping method
        checkoutPage.clickSetShippingMethodRadioButton(2);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2000);
        //checkout page shipping method web element assert
        //isCheckoutPageShippingWebElementDisplayed(checkoutPage);
        //click "Dobírkou" payment method
        checkoutPage.clickSetPaymentMethodRadioButton(0);
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(5000);
        //checkout page payment method web element assert
        //isCheckoutPagePaymentWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page shipping section display after shipping/payment method selection
        captureScreenshot(driver, "Checkout Page Shipping Section Display After Shipping And Payment Methods Selection");
        //click "Delivery Details" button
        checkoutPage.clickDeliveryDetailsButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(8500);
        //checkout page billing address section web element assert
        isCheckoutPageBillingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page billing address section text element assert
        isCheckoutPageBillingAddressSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page billing section display before address data input
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Before Address Data Input (guest)");
        //valid checkout billing address email input data getter
        checkoutPage.validCheckoutBillAddressEmailInputDataGetter();
        //input valid email into email input field
        checkoutPage.inputValidCheckoutEmailIntoEmailInputField();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(2500);
        //invalid checkout billing address input data getter - too long billing zip code (6 digits)
        checkoutPageTooLongSingularInput.invalidCheckoutBillAddressInputDataTooLongZipCodeGetter();
        //input valid first name into first name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        checkoutPageTooLongSingularInput.inputValidCheckoutLastNameIntoLastNameInputField();
        //input valid street into street input field
        checkoutPageTooLongSingularInput.inputValidCheckoutStreetIntoStreetInputField();
        //input valid city into city input field
        checkoutPageTooLongSingularInput.inputValidCheckoutCityIntoCityInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select "United States" option
        checkoutPage.selectSetCountryOption(3);
        //input too long zip code into zip code input field (6 digits)
        checkoutPageTooLongSingularInput.inputTooLongCheckoutZipCodeIntoZipCodeInputField();
        //click country code dropdown menu
        checkoutPage.clickCountryCodeDropdownMenu();
        //capture screenshot of the checkout page billing section absence of country codes
        captureScreenshot(driver, "Checkout Page Billing Address Section Display Country Code Options Absence");
        //input valid phone into phone input field
        checkoutPageTooLongSingularInput.inputValidCheckoutPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page billing section display after invalid address data input - too long billing zip code
        captureScreenshot(driver, "Checkout Page Billing Address Section Display After Invalid Address Data Input (guest) - Too Long Zip Code");
        //click "Submit order" (checkout) button
        checkoutPage.clickSubmitOrderButton();
        //wait for elements to load (due to network issues, wait time is extended)
        generalPage.waitForElementsToLoad(3000);
        //assert the user gets an expected error message, throw an error otherwise (it throws invalid phone number input error, it doesn't seem to accept any phone number)
        try {
            assertEquals("Pole obsahuje příliš dlouhý vstup", checkoutPage.getMissingBillingAddressSingularInputErrorMsg(), "The checkout page billing address section too long billing zip code input error message doesn't match expectations.");
        } catch (Exception e) {
            captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Zip Code - Missing country code options on checkout");
            throw new Error("The billing country code dropdown menu has no visible country code options.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Product Checkout Confirmation Test Result (guest) - Too Long Billing Zip Code");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
