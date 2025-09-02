package cz.simploshop.demo.invalidscenarios.accountinfopage;

import cz.simploshop.demo.utilities.*;
import cz.simploshop.demo.modals.RegisterAccountModal;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountInfoPageTooLongSingularInput extends BasePage{

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

    //invalid edited user account input data - too long singular input
    private String tooLongEditedFirstName;
    private String tooLongEditedLastName;
    private String tooLongEditedEmail;
    private String tooLongEditedUserNewPassword;
    private String tooLongEditedConfirmNewPassword;

    //valid edited user account input data - for remaining inputs
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private String validEditedUserEmail;
    private String validUserPassword;

    public AccountInfoPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter method - too long edited first name (51 chars)
    public void invalidEditedUserInfoTooLongFirstNameGetter(){

        tooLongEditedFirstName = "Hsfddsgfdgdfgfjyuiuokghgbvxvsdgfhjyuteefggfvcxbbvmb";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (too long edited first name):" + "\n");

        logger.info("Too long edited user first name: " + tooLongEditedFirstName);
        logger.info("Valid generated edited user last name (too long edited first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (too long edited first name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too long edited first name
    public void inputTooLongEditedUserFirstNameIntoFirstNameInputField(){
        accountInfoPageFirstNameInputField.clear();
        accountInfoPageFirstNameInputField.sendKeys(tooLongEditedFirstName);
    }

    //invalid edited user input data getter method - too long edited last name (51 chars)
    public void invalidEditedUserInfoTooLongLastNameGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        tooLongEditedLastName = "Bsfddsgfdgdfgfjyuiuokghgbvxvsdgfhjyuteefggfvcxbbvmb";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(5);

        System.out.println("Invalid generated edited user account information data (too long edited last name):" + "\n");

        logger.info("Valid generated user first name (too long edited last name): " + validEditedUserFirstName);
        logger.info("Too long edited user last name: " + tooLongEditedLastName);
        logger.info("Valid generated edited user email (too long edited last name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too long edited last name
    public void inputTooLongEditedUserLastNameIntoLastNameInputField(){
        accountInfoPageLastNameInputField.clear();
        accountInfoPageLastNameInputField.sendKeys(tooLongEditedLastName);
    }

    //invalid edited user input data getter method - too long edited email (75 chars -> name, domain)
    public void invalidEditedUserInfoTooLongEmailGetter(){

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        tooLongEditedEmail = TestDataGenerator.generateRandomTooLongEmailAddress(75);

        System.out.println("Invalid generated edited user account information data (too long edited email):" + "\n");

        logger.info("Valid generated user first name (too long edited email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (too long edited email): " + validEditedUserLastName);
        logger.info("Too long edited user email: " + tooLongEditedEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too long edited email
    public void inputTooLongEditedUserEmailIntoEmailInputField(){
        accountInfoPageEmailInputField.clear();
        accountInfoPageEmailInputField.sendKeys(tooLongEditedEmail);
    }

    //invalid edited user password input data getter method - too long user password/confirm password (75 chars)
    public void invalidEditedUserPasswordDataTooLongUserPasswordConfirmGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validUserPassword = registerAccountModal.getPassword();
        tooLongEditedUserNewPassword = "%Tsfddsgfdgdfgfjyuiuokghgbvxvsdgfhjyuteefggfvcxbbvmbmhgjklioipuyutyrtreerr#";
        tooLongEditedConfirmNewPassword = tooLongEditedUserNewPassword;

        System.out.println("Invalid generated edited user password data (too long login password):" + "\n");

        logger.info("Valid generated edited user first name (too long login password): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (too long login password): " + validEditedUserLastName);
        logger.info("Valid user password: " + validUserPassword);
        logger.info("Too long generated edited user password: " + tooLongEditedUserNewPassword);
        logger.info("Too long matching generated edited user new password: " + tooLongEditedConfirmNewPassword);

        System.out.println("\n");

    }

    //invalid edited user account data input method - too long new / confirm password
    public void inputTooLongUserNewPasswordIntoNewPasswordInputField(){accountInfoPageNewPasswordInputField.sendKeys(tooLongEditedUserNewPassword);}
    public void inputTooLongUserConfirmNewPasswordIntoConfirmNewPasswordInputField(){accountInfoPageConfirmNewPasswordInputField.sendKeys(tooLongEditedConfirmNewPassword);}

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
