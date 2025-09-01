package cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountModalTooShortSingularInput extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-2']")
    private WebElement registerAccountModalFirstNameInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-8']")
    private WebElement registerAccountModalLastNameInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-14']")
    private WebElement registerAccountModalEmailInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-20']")
    private WebElement registerAccountModalPasswordInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-26']")
    private WebElement registerAccountModalConfirmPasswordInputField;

    //invalid register input data - too short singular input
    private String tooShortRegisterFirstName;
    private String tooShortRegisterLastName;

    //valid register input data - for remaining inputs
    private String validRegisterFirstName;
    private String validRegisterLastName;
    private String validRegisterEmail;
    private String validRegisterPassword;

    public RegisterAccountModalTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid register input data getter - too short first name (1 char)
    public void invalidRegisterInputDataTooShortFirstNameGetter(){

        tooShortRegisterFirstName = "G";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (too short first name): " + "\n");

        logger.info("Too short register first name: " + tooShortRegisterFirstName);
        logger.info("Valid register last name (too short first name): " + validRegisterLastName);
        logger.info("Valid register email (too short first name): " + validRegisterEmail);
        logger.info("Valid register password (too short first name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (too short first name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too short first name
    public void inputTooShortFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(tooShortRegisterFirstName);}

    //invalid register input data getter - too short last name (1 char)
    public void invalidRegisterInputDataTooShortLastNameGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        tooShortRegisterLastName = "D";
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (too short last name): " + "\n");

        logger.info("Valid register first name (too short last name): " + validRegisterFirstName);
        logger.info("Too short register last name: " + tooShortRegisterLastName);
        logger.info("Valid register email (too short last name): " + validRegisterEmail);
        logger.info("Valid register password (too short last name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (too short last name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too short last name
    public void inputTooShortLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(tooShortRegisterLastName);}

    //valid register data input methods - for remaining inputs
    public void inputValidFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(validRegisterPassword);}

}
