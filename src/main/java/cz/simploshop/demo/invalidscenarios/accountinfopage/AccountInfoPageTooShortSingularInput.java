package cz.simploshop.demo.invalidscenarios.accountinfopage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;

import org.openqa.selenium.support.FindBy;

public class AccountInfoPageTooShortSingularInput extends BasePage{

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

    //invalid edited user account input data - too short singular input
    private String tooShortEditedFirstName;
    private String tooShortEditedLastName;

    //valid edited user account input data - for remaining inputs
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private String validEditedUserEmail;
    private String validUserPassword;

    public AccountInfoPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter method - too short edited first name (1 char)
    public void invalidEditedUserInfoTooShortFirstNameGetter(){

        tooShortEditedFirstName = "H";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (too short edited first name):" + "\n");

        logger.info("Too short edited user first name: " + tooShortEditedFirstName);
        logger.info("Valid generated edited user last name (too short edited first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (too short edited first name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too short edited first name
    public void inputTooShortEditedUserFirstNameIntoFirstNameInputField(){
        accountInfoPageFirstNameInputField.clear();
        accountInfoPageFirstNameInputField.sendKeys(tooShortEditedFirstName);
    }

    //invalid edited user input data getter method - too short edited last name (1 char)
    public void invalidEditedUserInfoTooShortLastNameGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        tooShortEditedLastName = "B";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (too short edited last name):" + "\n");

        logger.info("Valid generated user first name (too short edited last name): " + validEditedUserFirstName);
        logger.info("Too short edited user last name: " + tooShortEditedLastName);
        logger.info("Valid generated edited user email (too short edited last name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too short edited last name
    public void inputTooShortEditedUserLastNameIntoLastNameInputField(){
        accountInfoPageLastNameInputField.clear();
        accountInfoPageLastNameInputField.sendKeys(tooShortEditedLastName);
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

}
