package cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountModalTooLongSingularInput extends BasePage{

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

    //invalid register input data - too long singular input
    private String tooLongRegisterFirstName;
    private String tooLongRegisterLastName;
    private String tooLongRegisterEmail;
    private String tooLongRegisterPassword;
    private String tooLongRegisterConfirmPassword;

    //valid register input data - for remaining inputs
    private String validRegisterFirstName;
    private String validRegisterLastName;
    private String validRegisterEmail;
    private String validRegisterPassword;

    public RegisterAccountModalTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid register input data getter - too long first name (51 chars)
    public void invalidRegisterInputDataTooLongFirstNameGetter(){

        tooLongRegisterFirstName = "Gfddsgdsfssdsfgdhjfgdfddsgdsfssdsfgdhjfghsdrtuioikj";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (too long first name): " + "\n");

        logger.info("Too long register first name: " + tooLongRegisterFirstName);
        logger.info("Valid register last name (too long first name): " + validRegisterLastName);
        logger.info("Valid register email (too long first name): " + validRegisterEmail);
        logger.info("Valid register password (too long first name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (too long first name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too long first name
    public void inputTooLongFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(tooLongRegisterFirstName);}

    //invalid register input data getter - too long last name (51 chars)
    public void invalidRegisterInputDataTooLongLastNameGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        tooLongRegisterLastName = "Gfddsgdsfssdsfgdhjfgdfddsgdsfssdsfgdhjfghsdrtuioikj";
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (too long last name): " + "\n");

        logger.info("Valid register first name (too long last name): " + validRegisterFirstName);
        logger.info("Too long register last name: " + tooLongRegisterLastName);
        logger.info("Valid register email (too long last name): " + validRegisterEmail);
        logger.info("Valid register password (too long last name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (too long last name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too long last name
    public void inputTooLongLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(tooLongRegisterLastName);}

    //invalid register input data getter - too long email (75 chars -> name, domain)
    public void invalidRegisterInputDataTooLongEmailGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        tooLongRegisterEmail = TestDataGenerator.generateRandomTooLongEmailAddress(75);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (too long email): " + "\n");

        logger.info("Valid register first name (too long email): " + validRegisterFirstName);
        logger.info("Valid register last name (too long email): " + validRegisterLastName);
        logger.info("Too long register email: " + tooLongRegisterEmail);
        logger.info("Valid register password (too long email): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (too long email): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too long email
    public void inputTooLongEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(tooLongRegisterEmail);}

    //invalid register input data getter - too long password/confirm password (75 chars)
    public void invalidRegisterInputDataTooLongPasswordConfirmGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        tooLongRegisterPassword = "E#%$#^&fdfgghbfhfdfdgrrtr2354565dfgfhgfhdfbgfhfghr$%^&^%&%^^$$%#$gfdgfdgdgf";
        tooLongRegisterConfirmPassword = tooLongRegisterPassword;

        System.out.println("Invalid generated register input data (too long password): " + "\n");

        logger.info("Valid register first name (too long password): " + validRegisterFirstName);
        logger.info("Valid register last name (too long password): " + validRegisterLastName);
        logger.info("Valid register email (too long password): " + validRegisterEmail);
        logger.info("Too long register password: " + tooLongRegisterPassword);
        logger.info("Too long register confirm password: " + tooLongRegisterConfirmPassword);

        System.out.println("\n");

    }

    //invalid register data input method - too long password / confirm password
    public void inputTooLongPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(tooLongRegisterPassword);}
    public void inputTooLongConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(tooLongRegisterPassword);}

    //valid register data input methods - for remaining inputs
    public void inputValidFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(validRegisterPassword);}

}
