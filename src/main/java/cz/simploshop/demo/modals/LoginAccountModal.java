package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
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

    public LoginAccountModal(WebDriver driver) {super(driver);}

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
