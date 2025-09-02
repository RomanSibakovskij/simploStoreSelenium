package cz.simploshop.demo.invalidscenarios.accountinfopage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountInfoPageInvalidSingularInputFormat extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-1']")
    private WebElement accountInfoPageFirstNameInputField;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-7']")
    private WebElement accountInfoPageLastNameInputField;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-13']")
    private WebElement accountInfoPageEmailInputField;
    //password section
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-25']")
    private WebElement accountInfoPagePasswordInputField;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-31']")
    private WebElement accountInfoPageNewPasswordInputField;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-37']")
    private WebElement accountInfoPageConfirmNewPasswordInputField;

    //invalid edited user account input data - invalid singular input format
    private String invalidEditedFirstNameFormat;
    private String invalidEditedLastNameFormat;
    private String invalidEditedEmailFormat;

    //valid edited user account input data - for remaining inputs
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private String validEditedUserEmail;
    private String validUserPassword;
    private String validEditedUserNewPassword;
    private String validEditedUserConfirmNewPassword;

    public AccountInfoPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid edited user input data getter method - invalid edited first name format (special symbols only)
    public void invalidEditedUserInfoInvalidFirstNameFormatGetter(){

        invalidEditedFirstNameFormat = "@#$#%%^%^&";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (invalid edited first name format):" + "\n");

        logger.info("Invalid edited user first name format: " + invalidEditedFirstNameFormat);
        logger.info("Valid generated edited user last name (invalid edited first name format): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (invalid edited first name format): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - invalid edited first name format
    public void inputInvalidEditedUserFirstNameFormatIntoFirstNameInputField(){
        accountInfoPageFirstNameInputField.clear();
        accountInfoPageFirstNameInputField.sendKeys(invalidEditedFirstNameFormat);
    }

    //invalid edited user input data getter method - invalid edited last name format (special symbols only)
    public void invalidEditedUserInfoInvalidLastNameFormatGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        invalidEditedLastNameFormat = "(*&(*&^&%^";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (invalid edited last name format):" + "\n");

        logger.info("Valid generated user first name (invalid edited last name format): " + validEditedUserFirstName);
        logger.info("Invalid edited user last name format: " + invalidEditedLastNameFormat);
        logger.info("Valid generated edited user email (invalid edited last name format): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - invalid edited last name format
    public void inputInvalidEditedUserLastNameFormatIntoLastNameInputField(){
        accountInfoPageLastNameInputField.clear();
        accountInfoPageLastNameInputField.sendKeys(invalidEditedLastNameFormat);
    }

    //invalid edited user input data getter method - invalid edited email format (missing '@')
    public void invalidEditedUserInfoInvalidEmailFormatGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        invalidEditedEmailFormat = "dfdfdfdfakemail.com";

        System.out.println("Invalid generated edited user account information data (invalid edited email format):" + "\n");

        logger.info("Valid generated user first name (invalid edited email format): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (invalid edited email format): " + validEditedUserLastName);
        logger.info("Invalid edited user email format: " + invalidEditedEmailFormat);

        System.out.println("\n");

    }

    //invalid edited user account data input method - invalid edited email format
    public void inputInvalidEditedUserEmailFormatIntoEmailInputField(){
        accountInfoPageEmailInputField.clear();
        accountInfoPageEmailInputField.sendKeys(invalidEditedEmailFormat);
    }

    //valid edited user account data input methods - for remaining inputs
    public void inputValidEditedUserFirstNameIntoFirstNameInputField(){
        accountInfoPageFirstNameInputField.clear();
        accountInfoPageFirstNameInputField.sendKeys(validEditedUserFirstName);
    }
    public void inputValidEditedUserLastNameIntoLastNameInputField(){
        accountInfoPageLastNameInputField.clear();
        accountInfoPageLastNameInputField.sendKeys(validEditedUserLastName);
    }
    public void inputValidEditedUserEmailIntoEmailInputField(){
        accountInfoPageEmailInputField.clear();
        accountInfoPageEmailInputField.sendKeys(validEditedUserEmail);
    }
    public void inputValidUserPasswordIntoPasswordInputField(){accountInfoPagePasswordInputField.sendKeys(validUserPassword);}
    public void inputValidUserNewPasswordIntoNewPasswordInputField(){accountInfoPageNewPasswordInputField.sendKeys(validEditedUserNewPassword);}
    public void inputValidUserConfirmNewPasswordIntoConfirmNewPasswordInputField(){accountInfoPageConfirmNewPasswordInputField.sendKeys(validEditedUserConfirmNewPassword);}

}
