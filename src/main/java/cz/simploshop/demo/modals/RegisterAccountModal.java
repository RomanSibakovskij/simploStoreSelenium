package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import java.util.*;
import java.util.stream.Collectors;

public class RegisterAccountModal extends BasePage{

    //register account modal web elements
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//h2")
    private WebElement registerAccountModalTitle;
    //input form
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//label[@for='v-0-3-2']")
    private WebElement registerAccountModalFirstNameSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-2']")
    private WebElement registerAccountModalFirstNameInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//label[@for='v-0-3-8']")
    private WebElement registerAccountModalLastNameSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-8']")
    private WebElement registerAccountModalLastNameInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//label[@for='v-0-3-14']")
    private WebElement registerAccountModalEmailSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-14']")
    private WebElement registerAccountModalEmailInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//label[@for='v-0-3-20']")
    private WebElement registerAccountModalPasswordSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//button[@aria-controls='v-0-3-20']")
    private WebElement registerAccountModalViewPasswordButton;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-20']")
    private WebElement registerAccountModalPasswordInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//label[@for='v-0-3-26']")
    private WebElement registerAccountModalConfirmPasswordSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//button[@aria-controls='v-0-3-26']")
    private WebElement registerAccountModalViewConfirmPasswordButton;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//input[@id='v-0-3-26']")
    private WebElement registerAccountModalConfirmPasswordInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//div[@class='flex w-full items-center justify-between gap-5']")
    private WebElement registerAccountModalPasswordStrengthMeter;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//div[@class='flex w-full items-center justify-between gap-5']/button")
    private WebElement registerAccountModalPasswordStrengthLevelDropdownButton;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//span[@id='v-0-3-0']")
    private WebElement registerAccountModalPasswordStrengthLevelText;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//div[@class='sim-form-checkbox__container']//label")
    private WebElement registerAccountModalSubToNewsletterSubtext;
    @FindBy(xpath = "//div[@class='sim-auth-form__wrapper']//form//div[@class='sim-form-checkbox__container']//input")
    private WebElement registerAccountModalSubToNewsletterCheckbox;
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-giant sim-btn--v-solid grow']")
    private WebElement registerAccountModalRegisterButton;
    //alternatives section
    @FindBy(xpath = "//span[@class='sim-divider__label']")
    private WebElement registerAccountModalOrChoiceSubtext;
    @FindBy(xpath = "//span[@class='sim-text-large sim-font-medium text-nowrap']")
    private WebElement registerAccountModalContinueWithSubtext;
    @FindBy(xpath = "//div[@class='sim-customer-auth-socials']/button[1]")
    private WebElement registerAccountModalGoogleButton;
    @FindBy(xpath = "//div[@class='sim-customer-auth-socials']/button[2]")
    private WebElement registerAccountModalSeznamCzPortalButton;
    @FindBy(xpath = "//p[@class='sim-auth-form__gdpr']")
    private WebElement registerAccountModalPrivacyPolicyAndTermsAgreementText;
    @FindBy(xpath = "//p[@class='sim-auth-form__gdpr']/a[1]")
    private WebElement registerAccountModalPrivacyPolicyLink;
    @FindBy(xpath = "//p[@class='sim-auth-form__gdpr']/a[2]")
    private WebElement registerAccountModalTermsLink;
    //register benefits section
    @FindBy(xpath = "//span[@class='sim-subtitle sim-font-regular mb-4 text-center md:max-w-48']")
    private WebElement registerAccountModalRegisterBenefitsSectionTitle;
    @FindBy(xpath = "//div[@class='hidden flex-col items-end md:flex']/button")
    private WebElement registerAccountModalCloseButton;
    @FindBy(xpath = "//div[@class='text-simplo text-center']/h3")
    private WebElement registerAccountModalRegisterBenefitsLoginSubtitle;
    @FindBy(xpath = "//div[@class='text-simplo text-center']/button")
    private WebElement registerAccountModalRegisterBenefitsLoginButton;
    //list elements
    @FindBy(xpath = "//div[@class='hidden w-full flex-col items-center gap-6 md:flex']/ul/li")
    private List<WebElement> registerAccountModalRegisterBenefitElements;

    //valid register input data
    private static String validRegisterFirstName;
    private static String validRegisterLastName;
    private static String validRegisterEmail;
    private static String validRegisterPassword;

    public RegisterAccountModal(WebDriver driver) {super(driver);}

    //valid register input data getter
    public void validRegisterInputDataGetter(){

        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid generated register input data: " + "\n");

        logger.info("Valid register first name: " + validRegisterFirstName);
        logger.info("Valid register last name: " + validRegisterLastName);
        logger.info("Valid register email: " + validRegisterEmail);
        logger.info("Valid register password: " + validRegisterPassword);
        logger.info("Valid register matching confirm password: " + validRegisterPassword);

        System.out.println("\n");

    }

    //valid register data input methods
    public void inputValidFirstNameIntoRegisterFirstNameInputField(){registerAccountModalFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidLastNameIntoRegisterLastNameInputField(){registerAccountModalLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidEmailIntoRegisterEmailInputField(){registerAccountModalEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidPasswordIntoRegisterPasswordInputField(){registerAccountModalPasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidConfirmPasswordIntoRegisterConfirmPasswordInputField(){registerAccountModalConfirmPasswordInputField.sendKeys(validRegisterPassword);}

    //click "Password strength" button method
    public void clickPasswordStrengthDropdownButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerAccountModalPasswordStrengthLevelDropdownButton).click().perform();
    }

    //click "View Password" button method
    public void clickViewPasswordButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerAccountModalViewPasswordButton).click().perform();
    }

    //click "View Confirm Password" button method
    public void clickViewConfirmPasswordButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerAccountModalViewConfirmPasswordButton).click().perform();
    }

    //click "Register" button method
    public void clickRegisterButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerAccountModalRegisterButton).click().perform();
    }

    //private data getters
    public String getFirstName() {return validRegisterFirstName;}
    public String getLastName() {return validRegisterLastName;}
    public String getUsername(){return validRegisterFirstName + " " + validRegisterLastName;}
    public String getEmail(){return validRegisterEmail;}
    public String getPassword(){return validRegisterPassword;}

    //register account modal text element getters
    public String getRegisterAccountModalTitle() {return registerAccountModalTitle.getText();}
    //input form
    public String getRegisterAccountModalFirstNameSubtext() {return registerAccountModalFirstNameSubtext.getText();}
    public String getRegisterAccountModalLastNameSubtext() {return registerAccountModalLastNameSubtext.getText();}
    public String getRegisterAccountModalEmailSubtext() {return registerAccountModalEmailSubtext.getText();}
    public String getRegisterAccountModalPasswordSubtext() {return registerAccountModalPasswordSubtext.getText();}
    public String getRegisterAccountModalConfirmPasswordSubtext() {return registerAccountModalConfirmPasswordSubtext.getText();}
    public String getRegisterAccountModalPasswordStrengthLevelText() {return registerAccountModalPasswordStrengthLevelText.getText();}
    public String getRegisterAccountModalSubToNewsletterSubtext() {return registerAccountModalSubToNewsletterSubtext.getText();}
    //alternatives section
    public String getRegisterAccountModalOrChoiceSubtext() {return registerAccountModalOrChoiceSubtext.getText();}
    public String getRegisterAccountModalContinueWithSubtext() {return registerAccountModalContinueWithSubtext.getText();}
    public String getRegisterAccountModalPrivacyPolicyAndTermsAgreementText() {return registerAccountModalPrivacyPolicyAndTermsAgreementText.getText();}
    //register benefits section
    public String getRegisterAccountModalRegisterBenefitsSectionTitle() {return registerAccountModalRegisterBenefitsSectionTitle.getText();}
    public String getRegisterAccountModalRegisterBenefitsLoginSubtitle() {return registerAccountModalRegisterBenefitsLoginSubtitle.getText();}
    public List<String> getRegisterAccountModalRegisterBenefits(){return registerAccountModalRegisterBenefitElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //register account modal web element assert methods
    public boolean isRegisterAccountModalTitleDisplayed() {return registerAccountModalTitle.isDisplayed();}
    //input form
    public boolean isRegisterAccountModalFirstNameSubtextDisplayed() {return registerAccountModalFirstNameSubtext.isDisplayed();}
    public boolean isRegisterAccountModalFirstNameInputFieldDisplayed() {return registerAccountModalFirstNameInputField.isDisplayed();}
    public boolean isRegisterAccountModalLastNameSubtextDisplayed() {return registerAccountModalLastNameSubtext.isDisplayed();}
    public boolean isRegisterAccountModalLastNameInputFieldDisplayed() {return registerAccountModalLastNameInputField.isDisplayed();}
    public boolean isRegisterAccountModalEmailSubtextDisplayed() {return registerAccountModalEmailSubtext.isDisplayed();}
    public boolean isRegisterAccountModalEmailInputFieldDisplayed() {return registerAccountModalEmailInputField.isDisplayed();}
    public boolean isRegisterAccountModalPasswordSubtextDisplayed() {return registerAccountModalPasswordSubtext.isDisplayed();}
    public boolean isRegisterAccountModalViewPasswordButtonDisplayed() {return registerAccountModalViewPasswordButton.isDisplayed();}
    public boolean isRegisterAccountModalPasswordInputFieldDisplayed() {return registerAccountModalPasswordInputField.isDisplayed();}
    public boolean isRegisterAccountModalConfirmPasswordSubtextDisplayed() {return registerAccountModalConfirmPasswordSubtext.isDisplayed();}
    public boolean isRegisterAccountModalViewConfirmPasswordButtonDisplayed() {return registerAccountModalViewConfirmPasswordButton.isDisplayed();}
    public boolean isRegisterAccountModalConfirmPasswordInputFieldDisplayed() {return registerAccountModalConfirmPasswordInputField.isDisplayed();}
    public boolean isRegisterAccountModalPasswordStrengthMeterDisplayed() {return registerAccountModalPasswordStrengthMeter.isDisplayed();}
    public boolean isRegisterAccountModalPasswordStrengthLevelDropdownButtonDisplayed() {return registerAccountModalPasswordStrengthLevelDropdownButton.isDisplayed();}
    public boolean isRegisterAccountModalPasswordStrengthLevelTextDisplayed() {return registerAccountModalPasswordStrengthLevelText.isDisplayed();}
    public boolean isRegisterAccountModalSubToNewsletterSubtextDisplayed() {return registerAccountModalSubToNewsletterSubtext.isDisplayed();}
    public boolean isRegisterAccountModalSubToNewsletterCheckboxDisplayed() {return registerAccountModalSubToNewsletterCheckbox.isDisplayed();}
    public boolean isRegisterAccountModalRegisterButtonDisplayed() {return registerAccountModalRegisterButton.isDisplayed();}
    //alternatives section
    public boolean isRegisterAccountModalOrChoiceSubtextDisplayed() {return registerAccountModalOrChoiceSubtext.isDisplayed();}
    public boolean isRegisterAccountModalContinueWithSubtextDisplayed() {return registerAccountModalContinueWithSubtext.isDisplayed();}
    public boolean isRegisterAccountModalGoogleButtonDisplayed() {return registerAccountModalGoogleButton.isDisplayed();}
    public boolean isRegisterAccountModalSeznamCzPortalButtonDisplayed() {return registerAccountModalSeznamCzPortalButton.isDisplayed();}
    public boolean isRegisterAccountModalPrivacyPolicyAndTermsAgreementTextDisplayed() {return registerAccountModalPrivacyPolicyAndTermsAgreementText.isDisplayed();}
    public boolean isRegisterAccountModalPrivacyPolicyLinkDisplayed() {return registerAccountModalPrivacyPolicyLink.isDisplayed();}
    public boolean isRegisterAccountModalTermsLinkDisplayed() {return registerAccountModalTermsLink.isDisplayed();}
    //register benefits section
    public boolean isRegisterAccountModalRegisterBenefitsSectionTitleDisplayed() {return registerAccountModalRegisterBenefitsSectionTitle.isDisplayed();}
    public boolean isRegisterAccountModalCloseButtonDisplayed() {return registerAccountModalCloseButton.isDisplayed();}
    public boolean isRegisterAccountModalRegisterBenefitsLoginSubtitleDisplayed() {return registerAccountModalRegisterBenefitsLoginSubtitle.isDisplayed();}
    public boolean isRegisterAccountModalRegisterBenefitsLoginButtonDisplayed() {return registerAccountModalRegisterBenefitsLoginButton.isDisplayed();}

    public boolean isRegisterAccountModalRegisterBenefitElementsDisplayed() {
        return registerAccountModalRegisterBenefitElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
