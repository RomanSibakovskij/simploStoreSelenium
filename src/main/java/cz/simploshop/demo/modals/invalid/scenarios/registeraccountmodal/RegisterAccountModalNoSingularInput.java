package cz.simploshop.demo.modals.invalid.scenarios.registeraccountmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountModalNoSingularInput extends BasePage{

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

    //invalid register input data - no singular input
    private String noRegisterFirstName;
    private String noRegisterLastName;
    private String noRegisterEmail;
    private String noRegisterPassword;
    private String noRegisterConfirmPassword;

    //valid register input data - for remaining inputs
    private String validRegisterFirstName;
    private String validRegisterLastName;
    private String validRegisterEmail;
    private String validRegisterPassword;

    public RegisterAccountModalNoSingularInput(WebDriver driver) {super(driver);}

    //invalid register input data getter - no first name
    public void invalidRegisterInputDataNoFirstNameGetter(){

        noRegisterFirstName = "";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (no first name): " + "\n");

        logger.info("No register first name: " + noRegisterFirstName);
        logger.info("Valid register last name (no first name): " + validRegisterLastName);
        logger.info("Valid register email (no first name): " + validRegisterEmail);
        logger.info("Valid register password (no first name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (no first name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - no first name
    public void inputNoFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(noRegisterFirstName);}

    //invalid register input data getter - no last name
    public void invalidRegisterInputDataNoLastNameGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        noRegisterLastName = "";
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (no last name): " + "\n");

        logger.info("Valid register first name (no last name): " + validRegisterFirstName);
        logger.info("No register last name: " + noRegisterLastName);
        logger.info("Valid register email (no last name): " + validRegisterEmail);
        logger.info("Valid register password (no last name): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (no last name): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - no last name
    public void inputNoLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(noRegisterLastName);}

    //invalid register input data getter - no email
    public void invalidRegisterInputDataNoEmailGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        noRegisterEmail = "";
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated register input data (no email): " + "\n");

        logger.info("Valid register first name (no email): " + validRegisterFirstName);
        logger.info("Valid register last name (no email): " + validRegisterLastName);
        logger.info("No register email: " + noRegisterEmail);
        logger.info("Valid register password (no email): " + validRegisterPassword);
        logger.info("Valid register matching confirm password (no email): " + validRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input method - no email
    public void inputNoEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(noRegisterEmail);}

    //invalid register input data getter - no password
    public void invalidRegisterInputDataNoPasswordGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        noRegisterPassword = "";
        noRegisterConfirmPassword = "";

        System.out.println("Invalid generated register input data (no password): " + "\n");

        logger.info("Valid register first name (no password): " + validRegisterFirstName);
        logger.info("Valid register last name (no password): " + validRegisterLastName);
        logger.info("Valid register email (no password): " + validRegisterEmail);
        logger.info("No register password: " + noRegisterPassword);
        logger.info("No register confirm password: " + noRegisterConfirmPassword);

        System.out.println("\n");

    }

    //invalid register data input method - no password / confirm password
    public void inputNoPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(noRegisterPassword);}
    public void inputNoConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(noRegisterPassword);}

    //valid register data input methods - for remaining inputs
    public void inputValidFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(validRegisterPassword);}

}
