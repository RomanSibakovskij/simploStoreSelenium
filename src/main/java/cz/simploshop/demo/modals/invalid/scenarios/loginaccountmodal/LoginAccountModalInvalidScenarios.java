package cz.simploshop.demo.modals.invalid.scenarios.loginaccountmodal;

import cz.simploshop.demo.utilities.*;
import cz.simploshop.demo.modals.RegisterAccountModal;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginAccountModalInvalidScenarios extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-38']")
    private WebElement loginAccountModalEmailInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-44']")
    private WebElement loginAccountModalPasswordInputField;

    //invalid login input data - no singular input
    private String noLoginEmail;
    private String noLoginPassword;

    //invalid login input data - invalid singular input
    private String invalidLoginEmail;
    private String invalidLoginEmailFormat;
    private String invalidLoginPassword;

    //valid login input data - for remaining inputs
    private String validLoginEmail;
    private String validLoginPassword;

    public LoginAccountModalInvalidScenarios(WebDriver driver) {super(driver);}

    //invalid login input data getter - no login email
    public void invalidLoginInputDataNoEmailGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        noLoginEmail = "";
        validLoginPassword = registerAccountModal.getPassword();

        System.out.println("Invalid user login input data (no login email): " + "\n");

        logger.info("No login email: " + noLoginEmail);
        logger.info("Valid user login password (no login email): " + validLoginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - no login password
    public void invalidLoginInputDataNoPasswordGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validLoginEmail = registerAccountModal.getEmail();
        noLoginPassword = "";

        System.out.println("Invalid user login input data (no login password): " + "\n");

        logger.info("Valid user login email (no login password): " + validLoginEmail);
        logger.info("No login password: " + noLoginPassword);

        System.out.println("\n");

    }

    //invalid user login input data methods - no singular input
    public void inputNoLoginEmailIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(noLoginEmail);}
    public void inputNoLoginPasswordIntoPasswordInputField(){loginAccountModalPasswordInputField.sendKeys(noLoginPassword);}

    //invalid singular input

    //invalid login input data getter - invalid login email
    public void invalidLoginInputDataInvalidEmailGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        invalidLoginEmail = "fgcxcvcn@fakemail.com";
        validLoginPassword = registerAccountModal.getPassword();

        System.out.println("Invalid user login input data (invalid login email): " + "\n");

        logger.info("Invalid login email: " + invalidLoginEmail);
        logger.info("Valid user login password (invalid login email): " + validLoginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - invalid login email format (missing '@')
    public void invalidLoginInputDataInvalidEmailFormatGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        invalidLoginEmailFormat = "saswfakemail.com";
        validLoginPassword = registerAccountModal.getPassword();

        System.out.println("Invalid user login input data (invalid login email format): " + "\n");

        logger.info("Invalid login email format: " + invalidLoginEmailFormat);
        logger.info("Valid user login password (invalid login email format): " + validLoginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - invalid login password
    public void invalidLoginInputDataInvalidPasswordGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validLoginEmail = registerAccountModal.getEmail();
        invalidLoginPassword = "7**&^fdsf#$3";

        System.out.println("Invalid user login input data (invalid login password): " + "\n");

        logger.info("Valid user login email (invalid login password): " + validLoginEmail);
        logger.info("Invalid login password: " + invalidLoginPassword);

        System.out.println("\n");

    }

    //invalid user login input data methods - invalid singular input
    public void inputInvalidLoginEmailIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(invalidLoginEmail);}
    public void inputInvalidLoginEmailFormatIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(invalidLoginEmailFormat);}
    public void inputInvalidLoginPasswordIntoPasswordInputField(){loginAccountModalPasswordInputField.sendKeys(invalidLoginPassword);}

    //valid user login input data methods - for remaining inputs
    public void inputValidLoginEmailIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(validLoginEmail);}
    public void inputValidLoginPasswordIntoPasswordInputField(){loginAccountModalPasswordInputField.sendKeys(validLoginPassword);}

}
