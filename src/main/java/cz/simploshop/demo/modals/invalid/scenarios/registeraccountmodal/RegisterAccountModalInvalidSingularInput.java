package cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class RegisterAccountModalInvalidSingularInput extends BasePage{

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

    //invalid register input data - invalid singular input format
    private String invalidRegisterFirstNameFormat;
    private String invalidRegisterLastNameFormat;

    //valid register input data - for remaining inputs
    private String validRegisterFirstName;
    private String validRegisterLastName;
    private String validRegisterEmail;
    private String validRegisterPassword;

    public RegisterAccountModalInvalidSingularInput(WebDriver driver) {super(driver);}

    //invalid register input data getter - invalid first name format (special symbols only)
    public void invalidRegisterInputDataInvalidFirstNameFormatGetter(){

        invalidRegisterFirstNameFormat = "@#@#@$%$#^";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (invalid first name format): " + "\n");

        logger.info("Invalid register first name input format: " + invalidRegisterFirstNameFormat);
        logger.info("Valid register last name (invalid first name format): " + validRegisterLastName);
        logger.info("Valid register email (invalid first name format): " + validRegisterEmail);
        logger.info("Valid register password (invalid first name format): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (invalid first name format): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - invalid first name input format
    public void inputInvalidFirstNameFormatIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(invalidRegisterFirstNameFormat);}

    //invalid register input data getter - invalid last name format (special symbols only)
    public void invalidRegisterInputDataInvalidLastNameFormatGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        invalidRegisterLastNameFormat = "@$#^%&^*^*&&";
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (invalid last name format): " + "\n");

        logger.info("Valid register first name (invalid last name format): " + validRegisterFirstName);
        logger.info("Invalid register last name input format: " + invalidRegisterLastNameFormat);
        logger.info("Valid register email (invalid last name format): " + validRegisterEmail);
        logger.info("Valid register password (invalid last name format): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (invalid last name format): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - invalid last name input format
    public void inputInvalidLastNameFormatIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(invalidRegisterLastNameFormat);}

    //valid register data input methods - for remaining inputs
    public void inputValidFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(validRegisterPassword);}

}
