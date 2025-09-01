package cz.simploshop.demo;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;

import org.openqa.selenium.support.FindBy;

import java.util.*;

public class AccountInformationPage extends BasePage {

    //account information page web elements
    //my user section
    @FindBy(xpath = "//aside[@class='sim-card sim-user-navigation hidden lg:block']//header")
    private WebElement accountInfoPageMyUserSectionTitle;
    //list elements
    @FindBy(xpath = "//aside[@class='sim-card sim-user-navigation hidden lg:block']//ul/li/a")
    private List<WebElement> accountInfoPageMyUserMenuOptionElements;
    @FindBy(xpath = "//ol[@class='sim-breadcrumbs__container']/li")
    private List<WebElement> accountInfoPageBreadcrumb;
    //main section
    @FindBy(xpath = "//main//section[1]//h1")
    private WebElement accountInfoPageTitle;
    //contact info section
    @FindBy(xpath = "//main//section[2]//h2")
    private WebElement accountInfoPageContactInfoSectionTitle;
    @FindBy(xpath = "//main//section[2]//label[@for='v-0-4-0-0-1']") //in manual testing run the tag is 'v-0-6-0-0-1' etc
    private WebElement accountInfoPageFirstNameSubtext;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-1']")
    private WebElement accountInfoPageFirstNameInputField;
    @FindBy(xpath = "//main//section[2]//label[@for='v-0-4-0-0-7']")
    private WebElement accountInfoPageLastNameSubtext;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-7']")
    private WebElement accountInfoPageLastNameInputField;
    @FindBy(xpath = "//main//section[2]//label[@for='v-0-4-0-0-13']")
    private WebElement accountInfoPageEmailSubtext;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-13']")
    private WebElement accountInfoPageEmailInputField;
    @FindBy(xpath = "//main//section[2]//label[@for='v-0-4-0-0-19']")
    private WebElement accountInfoPageSubNewsletterSubtext;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-19']")
    private WebElement accountInfoPageSubNewsletterCheckbox;
    @FindBy(xpath = "//main//section[2]//div[@class='sim-cc cpt-none cpr-none cpb-normal cpl-none cw-normal']//button")
    private WebElement accountInfoPageApplyChangesButton;
    //password section
    @FindBy(xpath = "//main//section[3]//h2")
    private WebElement accountInfoPagePasswordSectionTitle;
    @FindBy(xpath = "//main//section[3]//label[@for='v-0-4-0-0-25']")
    private WebElement accountInfoPagePasswordSubtext;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-25']")
    private WebElement accountInfoPagePasswordInputField;
    @FindBy(xpath = "//main//section[3]//label[@for='v-0-4-0-0-31']")
    private WebElement accountInfoPageNewPasswordSubtext;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-31']")
    private WebElement accountInfoPageNewPasswordInputField;
    @FindBy(xpath = "//main//section[3]//label[@for='v-0-4-0-0-37']")
    private WebElement accountInfoPageConfirmNewPasswordSubtext;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-37']")
    private WebElement accountInfoPageConfirmNewPasswordInputField;
    @FindBy(xpath = "//main//section[3]//div[@class='sim-cc cpt-none cpr-none cpb-normal cpl-none cw-normal']//button")
    private WebElement accountInfoPageChangePasswordButton;
    @FindBy(xpath = "//main//section[4]//button")
    private WebElement accountInfoPageDeleteUserButton;
    //user account removal modal elements
    @FindBy(xpath = "//h2[@class='sim-subtitle sim-font-medium']")
    private WebElement accountRemovalModalTitle;
    @FindBy(xpath = "//div[@class='sim-modal__content']//button[@class='sim-close-btn sim-menu-btn']")
    private WebElement accountRemovalModalCloseButton;
    @FindBy(xpath = "//p[@class='sim-text-normal sim-font-regular mb-8']")
    private WebElement accountRemovalModalText;
    @FindBy(xpath = "//div[@class='sim-modal__content']//button[1]")
    private WebElement accountRemovalModalCancelButton;
    @FindBy(xpath = "//div[@class='sim-modal__content']//button[2]")
    private WebElement accountRemovalModalDeleteButton;

    public AccountInformationPage(WebDriver driver) {super(driver);}

    //account information page text element getters
    //my user section
    public String getAccountInfoPageMyUserSectionTitle(){return accountInfoPageMyUserSectionTitle.getText();}
    public List<String> getAccountInfoPageMyUserMenuOptionNames(){return accountInfoPageMyUserMenuOptionElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //main section
    public String getAccountInfoPageTitle(){return accountInfoPageTitle.getText();}
    //contact info section
    public String getAccountInfoPageContactInfoSectionTitle(){return accountInfoPageContactInfoSectionTitle.getText();}
    public String getAccountInfoPageFirstNameSubtext(){return accountInfoPageFirstNameSubtext.getText();}
    public String getAccountInfoPageLastNameSubtext(){return accountInfoPageLastNameSubtext.getText();}
    public String getAccountInfoPageEmailSubtext(){return accountInfoPageEmailSubtext.getText();}
    public String getAccountInfoPageSubToNewsletterSubtext(){return accountInfoPageSubNewsletterSubtext.getText();}
    //password section
    public String getAccountInfoPagePasswordSectionTitle(){return accountInfoPagePasswordSectionTitle.getText();}
    public String getAccountInfoPagePasswordSubtext(){return accountInfoPagePasswordSubtext.getText();}
    public String getAccountInfoPageNewPasswordSubtext(){return accountInfoPageNewPasswordSubtext.getText();}
    public String getAccountInfoPageConfirmNewPasswordSubtext(){return accountInfoPageConfirmNewPasswordSubtext.getText();}

    //user account removal modal text element getters
    public String getUserAccountRemovalModalTitle(){return accountRemovalModalTitle.getText();}
    public String getUserAccountRemovalModalText(){return accountRemovalModalText.getText();}

    //account information page web element assert methods
    //my user section
    public boolean isAccountInfoPageMyUserSectionTitleDisplayed(){return accountInfoPageMyUserSectionTitle.isDisplayed();}

    public boolean isAccountInfoPageMyUserMenuOptionsDisplayed(){
        return accountInfoPageMyUserMenuOptionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //main section
    public boolean isAccountInfoPageTitleDisplayed(){return accountInfoPageTitle.isDisplayed();}

    public boolean isAccountInfoPageBreadcrumbDisplayed(){
        return accountInfoPageBreadcrumb.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //contact info section
    public boolean isAccountInfoPageContactInfoSectionDisplayed(){return accountInfoPageContactInfoSectionTitle.isDisplayed();}
    public boolean isAccountInfoPageFirstNameSubtextDisplayed(){return accountInfoPageFirstNameSubtext.isDisplayed();}
    public boolean isAccountInfoPageFirstNameInputFieldDisplayed(){return accountInfoPageFirstNameInputField.isDisplayed();}
    public boolean isAccountInfoPageLastNameSubtextDisplayed(){return accountInfoPageLastNameSubtext.isDisplayed();}
    public boolean isAccountInfoPageLastNameInputFieldDisplayed(){return accountInfoPageLastNameInputField.isDisplayed();}
    public boolean isAccountInfoPageEmailSubtextDisplayed(){return accountInfoPageEmailSubtext.isDisplayed();}
    public boolean isAccountInfoPageEmailInputFieldDisplayed(){return accountInfoPageEmailInputField.isDisplayed();}
    public boolean isAccountInfoPageSubNewsletterSubtextDisplayed(){return accountInfoPageSubNewsletterSubtext.isDisplayed();}
    public boolean isAccountInfoPageSubNewsletterCheckboxDisplayed(){return accountInfoPageSubNewsletterCheckbox.isDisplayed();}
    public boolean isAccountInfoPageApplyChangesButtonDisplayed(){return accountInfoPageApplyChangesButton.isDisplayed();}
    //password section
    public boolean isAccountInfoPagePasswordSectionTitleDisplayed(){return accountInfoPagePasswordSectionTitle.isDisplayed();}
    public boolean isAccountInfoPagePasswordSubtextDisplayed(){return accountInfoPagePasswordSubtext.isDisplayed();}
    public boolean isAccountInfoPagePasswordInputFieldDisplayed(){return accountInfoPagePasswordInputField.isDisplayed();}
    public boolean isAccountInfoPageNewPasswordSubtextDisplayed(){return accountInfoPageNewPasswordSubtext.isDisplayed();}
    public boolean isAccountInfoPageNewPasswordInputFieldDisplayed(){return accountInfoPageNewPasswordInputField.isDisplayed();}
    public boolean isAccountInfoPageConfirmNewPasswordSubtextDisplayed(){return accountInfoPageConfirmNewPasswordSubtext.isDisplayed();}
    public boolean isAccountInfoPageConfirmNewPasswordInputFieldDisplayed(){return accountInfoPageConfirmNewPasswordInputField.isDisplayed();}
    public boolean isAccountInfoPageChangePasswordButtonDisplayed(){return accountInfoPageChangePasswordButton.isDisplayed();}
    public boolean isAccountInfoPageDeleteUserButtonDisplayed(){return accountInfoPageDeleteUserButton.isDisplayed();}

    //user account removal modal web element assert methods
    public boolean isUserAccountRemovalModalTitleDisplayed(){return accountRemovalModalTitle.isDisplayed();}
    public boolean isUserAccountRemovalModalCloseButtonDisplayed(){return accountRemovalModalCloseButton.isDisplayed();}
    public boolean isUserAccountRemovalModalTextDisplayed(){return accountRemovalModalText.isDisplayed();}
    public boolean isUserAccountRemovalModalCancelButtonDisplayed(){return accountRemovalModalCancelButton.isDisplayed();}
    public boolean isUserAccountRemovalModalDeleteButtonDisplayed(){return accountRemovalModalDeleteButton.isDisplayed();}

}
