package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

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

    public RegisterAccountModal(WebDriver driver) {super(driver);}

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
