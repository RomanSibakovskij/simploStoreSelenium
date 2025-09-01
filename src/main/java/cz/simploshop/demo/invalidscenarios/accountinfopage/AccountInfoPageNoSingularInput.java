package cz.simploshop.demo.invalidscenarios.accountinfopage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountInfoPageNoSingularInput extends BasePage {

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

    //invalid edited user account input data - no singular input
    private String noEditedFirstName;
    private String noEditedLastName;
    private String noEditedEmail;
    private String noUserPassword;

    //valid edited user account input data - for remaining inputs
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private String validEditedUserEmail;
    private String validUserPassword;
    private String validEditedUserNewPassword;
    private String validEditedConfirmNewPassword;

    public AccountInfoPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter method - no edited first name
    public void invalidEditedUserInfoNoFirstNameGetter(){

        noEditedFirstName = "";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (no edited first name):" + "\n");

        logger.info("No edited user first name: " + noEditedFirstName);
        logger.info("Valid generated edited user last name (no edited first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (no edited first name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - no edited first name
    public void inputNoEditedUserFirstNameIntoFirstNameInputField(){
        accountInfoPageFirstNameInputField.clear();
        accountInfoPageFirstNameInputField.sendKeys(noEditedFirstName);
    }

    //invalid edited user input data getter method - no edited last name
    public void invalidEditedUserInfoNoLastNameGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        noEditedLastName = "";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (no edited last name):" + "\n");

        logger.info("Valid generated user first name (no edited last name): " + validEditedUserFirstName);
        logger.info("No edited user last name: " + noEditedLastName);
        logger.info("Valid generated edited user email (no edited last name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - no edited last name
    public void inputNoEditedUserLastNameIntoLastNameInputField(){
        accountInfoPageLastNameInputField.clear();
        accountInfoPageLastNameInputField.sendKeys(noEditedLastName);
    }

    //invalid edited user input data getter method - no edited email
    public void invalidEditedUserInfoNoEmailGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        noEditedEmail = "";

        System.out.println("Invalid generated edited user account information data (no edited email):" + "\n");

        logger.info("Valid generated user first name (no edited email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (no edited email): " + validEditedUserLastName);
        logger.info("No edited user email: " + noEditedEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - no edited email
    public void inputNoEditedUserEmailIntoEmailInputField(){
        accountInfoPageEmailInputField.clear();
        accountInfoPageEmailInputField.sendKeys(noEditedEmail);
    }

    //invalid edited user password input data getter method - no user password
    public void invalidEditedUserPasswordDataNoUserPasswordGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        noUserPassword = "";
        validEditedUserNewPassword = TestDataGenerator.generateRandomPassword();
        validEditedConfirmNewPassword = validEditedUserNewPassword;

        System.out.println("Invalid generated edited user password data (no login password):" + "\n");

        logger.info("Valid generated edited user first name (no login password): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (no login password): " + validEditedUserLastName);
        logger.info("No user password: " + noUserPassword);
        logger.info("Valid generated edited user password (no login password): " + validEditedUserNewPassword);
        logger.info("Valid matching generated edited user new password (no login password): " + validEditedConfirmNewPassword);

        System.out.println("\n");

    }

    //invalid edited user account data input method - no user password
    public void inputNoUserPasswordIntoPasswordInputField(){accountInfoPagePasswordInputField.sendKeys(noUserPassword);}

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
    public void inputValidUserConfirmNewPasswordIntoConfirmNewPasswordInputField(){accountInfoPageConfirmNewPasswordInputField.sendKeys(validEditedConfirmNewPassword);}

}
