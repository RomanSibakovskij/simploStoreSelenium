package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import cz.simploshop.demo.AccountInformationPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginAccountModal extends BasePage{

    //login account modal web elements
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//h2")
    private WebElement loginAccountModalTitle;
    //login section
    //input form
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//label[@for='v-0-3-38']")
    private WebElement loginAccountModalEmailSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-38']")
    private WebElement loginAccountModalEmailInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//label[@for='v-0-3-44']")
    private WebElement loginAccountModalPasswordSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-44']")
    private WebElement loginAccountModalPasswordInputField;
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-giant sim-btn--v-solid grow']")
    private WebElement loginAccountModalLoginButton;
    //alternatives section
    @FindBy(xpath = "//span[@class='sim-divider__label']")
    private WebElement loginAccountModalOrSubtext;
    @FindBy(xpath = "//span[@class='sim-text-large sim-font-medium text-nowrap']")
    private WebElement loginAccountModalContinueWithSubtext;
    @FindBy(xpath = "//div[@class='sim-customer-auth-socials']/button[1]")
    private WebElement loginAccountModalGoogleButton;
    @FindBy(xpath = "//div[@class='sim-customer-auth-socials']/button[2]")
    private WebElement loginAccountModalSeznamCzPortalButton;
    //register section
    @FindBy(xpath = "//div[@class='flex w-full flex-col items-center gap-3.5 md:gap-6']/span")
    private WebElement loginAccountModalRegisterSubtitle;
    @FindBy(xpath = "//div[@class='hidden flex-col items-end md:flex']/button")
    private WebElement loginAccountModalCloseButton;
    @FindBy(xpath = "//div[@class='flex w-full flex-col items-center gap-3.5 md:gap-6']/button")
    private WebElement loginAccountModalRegisterButton;
    @FindBy(xpath = "//div[@class='text-simplo text-center']/h3")
    private WebElement loginAccountModalForgotPasswordSubtitle;
    @FindBy(xpath = "//div[@class='text-simplo text-center']/button")
    private WebElement loginAccountModalForgotPasswordButton;
    //invalid singular input error message
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement loginAccountModalInvalidSingularInputError;

    //valid login input data
    private String validLoginEmail;
    private String validLoginPassword;

    //valid edited login input data
    private String validEditedLoginEmail;
    private String validEditedLoginPassword;

    public LoginAccountModal(WebDriver driver) {super(driver);}

    //valid login input data getter
    public void validLoginInputDataGetter(){

        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validLoginEmail = registerAccountModal.getEmail();
        validLoginPassword = registerAccountModal.getPassword();

        System.out.println("Valid user login input data: " + "\n");

        logger.info("Valid user login email: " + validLoginEmail);
        logger.info("Valid user login password: " + validLoginPassword);

        System.out.println("\n");

    }

    //valid user login input data methods
    public void inputValidLoginEmailIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(validLoginEmail);}
    public void inputValidLoginPasswordIntoPasswordInputField(){loginAccountModalPasswordInputField.sendKeys(validLoginPassword);}

    //valid edited login input data getter - edited login email
    public void validEditedLoginEmailInputDataGetter(){

        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validEditedLoginEmail = accountInformationPage.getEditedUserEmail();
        validLoginPassword = registerAccountModal.getPassword();

        System.out.println("Valid edited user login input data (edited login email): " + "\n");

        logger.info("Valid edited user login email: " + validEditedLoginEmail);
        logger.info("Valid user login password (edited login email): " + validLoginPassword);

        System.out.println("\n");

    }

    //valid edited login input data getter - edited login password
    public void validEditedLoginPasswordInputDataGetter(){

        AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
        RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);

        validLoginEmail = registerAccountModal.getEmail();
        validEditedLoginPassword = accountInformationPage.getEditedUserPassword();

        System.out.println("Valid edited user login input data (edited login password): " + "\n");

        logger.info("Valid user login email (edited login password): " + validLoginEmail);
        logger.info("Valid edited user login password: " + validEditedLoginPassword);

        System.out.println("\n");

    }

    //valid edited user login input data methods
    public void inputValidEditedLoginEmailIntoEmailInputField(){loginAccountModalEmailInputField.sendKeys(validEditedLoginEmail);}
    public void inputValidEditedLoginPasswordIntoPasswordInputField(){loginAccountModalPasswordInputField.sendKeys(validEditedLoginPassword);}

    //click "Login" button method
    public void clickLoginButton(){
        Actions action = new Actions(driver);
        action.moveToElement(loginAccountModalLoginButton).click().perform();
    }

    //login account modal text element getters
    public String getLoginAccountModalTitle(){return loginAccountModalTitle.getText();}
    //login section
    //input form
    public String getLoginAccountModalEmailSubtext(){return loginAccountModalEmailSubtext.getText();}
    public String getLoginAccountModalPasswordSubtext(){return loginAccountModalPasswordSubtext.getText();}
    //alternatives section
    public String getLoginAccountModalOrSubtext(){return loginAccountModalOrSubtext.getText();}
    public String getLoginAccountModalContinueWithSubtext(){return loginAccountModalContinueWithSubtext.getText();}
    //register section
    public String getLoginAccountModalRegisterSubtitle(){return loginAccountModalRegisterSubtitle.getText();}
    public String getLoginAccountModalForgotPasswordSubtitle(){return loginAccountModalForgotPasswordSubtitle.getText();}

    //login account modal singular input error message getter
    public String getLoginAccountModalSingularInputErrorMsg() {return loginAccountModalInvalidSingularInputError.getText();}

    //login account modal web element assert methods
    public boolean isLoginAccountModalTitleDisplayed(){return loginAccountModalTitle.isDisplayed();}
    //login section
    //input form
    public boolean isLoginAccountModalEmailSubtextDisplayed(){return loginAccountModalEmailSubtext.isDisplayed();}
    public boolean isLoginAccountModalEmailInputFieldDisplayed(){return loginAccountModalEmailInputField.isDisplayed();}
    public boolean isLoginAccountModalPasswordSubtextDisplayed(){return loginAccountModalPasswordSubtext.isDisplayed();}
    public boolean isLoginAccountModalPasswordInputFieldDisplayed(){return loginAccountModalPasswordInputField.isDisplayed();}
    public boolean isLoginAccountModalLoginButtonDisplayed(){return loginAccountModalLoginButton.isDisplayed();}
    //alternatives section
    public boolean isLoginAccountModalOrSubtextDisplayed(){return loginAccountModalOrSubtext.isDisplayed();}
    public boolean isLoginAccountModalContinueWithSubtextDisplayed(){return loginAccountModalContinueWithSubtext.isDisplayed();}
    public boolean isLoginAccountModalGoogleButtonDisplayed(){return loginAccountModalGoogleButton.isDisplayed();}
    public boolean isLoginAccountModalSeznamCzPortalButtonDisplayed(){return loginAccountModalSeznamCzPortalButton.isDisplayed();}
    //register section
    public boolean isLoginAccountModalRegisterSubtitleDisplayed(){return loginAccountModalRegisterSubtitle.isDisplayed();}
    public boolean isLoginAccountModalCloseButtonDisplayed(){return loginAccountModalCloseButton.isDisplayed();}
    public boolean isLoginAccountModalRegisterButtonDisplayed(){return loginAccountModalRegisterButton.isDisplayed();}
    public boolean isLoginAccountModalForgotPasswordSubtitleDisplayed(){return loginAccountModalForgotPasswordSubtitle.isDisplayed();}
    public boolean isLoginAccountModalForgotPasswordButtonDisplayed(){return loginAccountModalForgotPasswordButton.isDisplayed();}

}
