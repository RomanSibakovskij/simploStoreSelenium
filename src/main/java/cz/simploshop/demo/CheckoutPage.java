package cz.simploshop.demo;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class CheckoutPage extends BasePage{

    //checkout page web elements
    //shipping section
    @FindBy(xpath = "//form[1]//div[@class='sim-form-section__title']")
    private WebElement checkoutPageShippingSectionTitle;
    //list elements
    @FindBy(xpath = "//form[1]//div[@class='mt-5 flex flex-col gap-6']/div//input")
    private List<WebElement> checkoutPageShippingSectionRadioButtonElements;
    @FindBy(xpath = "//form[1]//div[@class='mt-5 flex flex-col gap-6']/div//span[@class='flex flex-col gap-2']")
    private List<WebElement> checkoutPageShippingMethodNameElements;
    @FindBy(xpath = "//form[1]//div[@class='mt-5 flex flex-col gap-6']/div//span[@class='sim-font-medium']")
    private List<WebElement> checkoutPageShippingMethodPriceElements;
    //payment section
    @FindBy(xpath = "//form[2]//div[@class='sim-form-section__title']")
    private WebElement checkoutPagePaymentSectionTitle;
    //list elements
    @FindBy(xpath = "//form[2]//div[@class='mt-5 flex flex-col gap-6']/div//input")
    private List<WebElement> checkoutPagePaymentSectionRadioButtonElements;
    @FindBy(xpath = "//form[2]//div[@class='mt-5 flex flex-col gap-6']/div//span[@class='flex flex-col gap-2']")
    private List<WebElement> checkoutPagePaymentMethodNameElements;
    @FindBy(xpath = "//form[2]//div[@class='mt-5 flex flex-col gap-6']/div//span[@class='sim-font-medium']")
    private List<WebElement> checkoutPagePaymentMethodPriceElements;
    //order summary section
    @FindBy(xpath = "//button[@class='sim-c-btn sim-c-btn--fake w-full']")
    private WebElement checkoutPageOrderSummarySectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card__img-box']/img")
    private List<WebElement> checkoutPageOrderSummaryProductImgElements;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card__name-box']/a")
    private List<WebElement> checkoutPageOrderSummaryProductNameLinkElements;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card__name-box']/div")
    private List<WebElement> checkoutPageOrderSummaryProductUnitPriceElements;
    //shipping
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][3]//span[1]")
    private WebElement checkoutPageShippingTitle;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][3]//span[2]")
    private WebElement checkoutPageChosenShippingMethod;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][3]/div[2]")
    private WebElement checkoutPageChosenShippingMethodPrice;
    //payment
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][4]//span[1]")
    private WebElement checkoutPagePaymentTitle;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][4]//span[2]")
    private WebElement checkoutPageChosenPaymentMethod;
    @FindBy(xpath = "//div[@class='sim-collapse sim-collapse--vertical sim-collapse--lg']//div[@class='sim-cart-item-card'][4]/div[2]")
    private WebElement checkoutPageChosenPaymentMethodPrice;
    //order total
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[1]")
    private WebElement checkoutPageOrderTotalSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[2]")
    private WebElement checkoutPageOrderTotalPrice;
    //billing address section
    @FindBy(xpath = "//form[@class='sim-form'][1]//div[@class='sim-form-section__title']")
    private WebElement checkoutPageEmailSectionTitle;
    @FindBy(xpath = "//form[@class='sim-form'][1]//div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageEmailSectionSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][1]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageEmailInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-section__title']")
    private WebElement checkoutPageBillingAddressSectionTitle;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]/label[@class='sim-label']")
    private WebElement checkoutPageBillingFirstNameSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingFirstNameInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]/label[@class='sim-label']")
    private WebElement checkoutPageBillingLastNameSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingLastNameInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][2]/div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageBillingStreetSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][2]/div[@class='sim-form-group w-full']/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingStreetInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]/label")
    private WebElement checkoutPageBillingCitySubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageBillingCityInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]/label")
    private WebElement checkoutPageBillingZipCodeSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageBillingZipCodeInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][4]/div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageBillingCountrySubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][4]/div[@class='sim-form-group w-full']//select")
    private WebElement checkoutPageBillingCountryDropdownMenu;
    //list elements
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][4]/div[@class='sim-form-group w-full']//select/option")
    private List<WebElement> checkoutPageBillingCountryOptionElements;
    //singular elements
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full sim-form-phone-field__select']/label")
    private WebElement checkoutPageBillingCountryCodeSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full sim-form-phone-field__select']//select")
    private WebElement checkoutPageBillingCountryCodeDropdownMenu;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageBillingPhoneSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageBillingPhoneInputField;
    @FindBy(xpath = "//div[@class='sim-form-row sim-form-row--indented']//input")
    private WebElement checkoutPageBillingAddCompanyDetailsCheckbox;
    @FindBy(xpath = "//div[@class='sim-form-row sim-form-row--indented']//label")
    private WebElement checkoutPageBillingAddCompanyDetailsSubtext;
    @FindBy(xpath = "//form[@class='sim-form'][2]/div[3]/div/div//input")
    private WebElement checkoutPageBillingAddDifferentDeliveryAddressCheckbox;
    @FindBy(xpath = "//form[@class='sim-form'][2]/div[3]/div/div//label")
    private WebElement checkoutPageBillingAddDifferentDeliveryAddressSubtext;
    @FindBy(xpath = "//div[@class='sim-error']")
    private WebElement checkoutPageBillingMissingSingularInputError;
    //shipping address section (input fields are in relevant classes)
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-section__title']")
    private WebElement checkoutPageShippingAddressSectionTitle;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]//label[@class='sim-label']")
    private WebElement checkoutPageShippingFirstNameSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageShippingFirstNameInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]//label[@class='sim-label']")
    private WebElement checkoutPageShippingLastNameSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageShippingLastNameInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][2]//label")
    private WebElement checkoutPageShippingStreetSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][2]//input")
    private WebElement checkoutPageShippingStreetInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]//label")
    private WebElement checkoutPageShippingCitySubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageShippingCityInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]//label")
    private WebElement checkoutPageShippingZipCodeSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageShippingZipCodeInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][4]//label")
    private WebElement checkoutPageShippingCountrySubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][4]//select")
    private WebElement checkoutPageShippingCountryDropdownMenu;
    //list elements
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][4]//select/option")
    private List<WebElement> checkoutPageShippingCountryOptionElements;
    //singular elements
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full sim-form-phone-field__select']/label")
    private WebElement checkoutPageShippingCountryCodeSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full sim-form-phone-field__select']//select")
    private WebElement checkoutPageShippingCountryCodeDropdownMenu;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageShippingPhoneSubtext;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageShippingPhoneInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row sim-form-row--indented']//input")
    private WebElement checkoutPageShippingAddCompanyDetailsCheckbox;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row sim-form-row--indented']//label")
    private WebElement checkoutPageShippingAddCompanyDetailsSubtext;

    //registered user side elements
    @FindBy(xpath = "//form[@class='sim-form']/div[@class='sim-form-section']/div[1]")
    private WebElement checkoutPageRegUserBillingAddressSectionTitle;
    @FindBy(xpath = "//form[@class='sim-form']/div[@class='sim-form-section']//button")
    private WebElement checkoutPageRegUserBillAddressAddNewAddressButton;
    @FindBy(xpath = "//form[@class='sim-form']/div[@class='sim-form-row sim-form-row--indented']//label")
    private WebElement checkoutPageRegUserBillAddDifferentDeliveryAddressCheckbox;
    @FindBy(xpath = "//form[@class='sim-form']/div[@class='sim-form-row sim-form-row--indented']//input")
    private WebElement checkoutPageRegUserBillAddDifferentDeliveryAddressSubtext;
    //note
    @FindBy(xpath = "//div[@class='sim-form-section sim-form-section--indented']/div[1]")
    private WebElement checkoutPageNoteSectionTitle;
    @FindBy(xpath = "//div[@class='sim-form-group w-full']/label")
    private WebElement checkoutPageNoteSectionSubtext;
    @FindBy(xpath = "//div[@class='sim-form-group w-full']//textarea")
    private WebElement checkoutPageNoteInputField;
    //buttons
    @FindBy(xpath = "//div[@class='max-lg:col-span-3 lg:col-start-3']/a")
    private WebElement checkoutPageDeliveryDetailsButton;
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-large sim-btn--v-solid w-full']")
    private WebElement checkoutPageCheckoutButton;

    //valid billing address data
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    //valid shipping address data - for remaining inputs
    private String validCheckoutShipAddressFirstName;
    private String validCheckoutShipAddressLastName;
    private String validCheckoutShipAddressStreet;
    private String validCheckoutShipAddressCity;
    private int validCheckoutShipAddressZipCode;
    private String validCheckoutShipAddressPhone;

    public CheckoutPage(WebDriver driver) {super(driver);}

    //click set shipping method radio button method
    public void clickSetShippingMethodRadioButton(int index){
        WebElement targetShippingMethodRadioButton = checkoutPageShippingSectionRadioButtonElements.get(index);
        targetShippingMethodRadioButton.click();
    }

    //click set payment method radio button method
    public void clickSetPaymentMethodRadioButton(int index){
        WebElement targetPaymentMethodRadioButton = checkoutPagePaymentSectionRadioButtonElements.get(index);
        targetPaymentMethodRadioButton.click();
    }

    //click "Delivery details" button method
    public void clickDeliveryDetailsButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageDeliveryDetailsButton).click().perform();
    }

    //billing address section

    //valid billing address (guest) data input getter
    public void validCheckoutBillAddressEmailInputDataGetter(){

        validCheckoutBillAddressEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid checkout billing address email input data: " + "\n");

        logger.info("Valid checkout billing address email: " + validCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //valid (guest) email input method
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}

    //valid billing address data (guest) input data getter
    public void validCheckoutBillAddressInputDataGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Valid checkout billing address input data: " + "\n");

        logger.info("Valid checkout billing address first name: " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name: " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street: " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city: " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code: " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone: " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //valid billing address (guest) input data methods
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

    //click country dropdown menu method
    public void clickCountryDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageBillingCountryDropdownMenu).click().perform();
    }

    //select set country method
    public void selectSetCountryOption(int index){
        WebElement targetBillingCountry = checkoutPageBillingCountryOptionElements.get(index);
        targetBillingCountry.click();
    }

    //click country code dropdown menu method
    public void clickCountryCodeDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageBillingCountryCodeDropdownMenu).click().perform();
    }

    //click "Submit order" button method
    public void clickSubmitOrderButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageCheckoutButton).click().perform();
    }

    //checkout page product data getters
    public List<String> getCheckoutPageOrderSummaryProductName() {return checkoutPageOrderSummaryProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageOrderSummaryProductUnitPrice() {return checkoutPageOrderSummaryProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //checkout page text element getters
    //shipping section
    public String getCheckoutPageShippingSectionTitle() {return checkoutPageShippingSectionTitle.getText();}

    //list elements
    public List<String> getCheckoutPageShippingMethodName() {return checkoutPageShippingMethodNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageShippingMethodPrice() {return checkoutPageShippingMethodPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //payment section
    public String getCheckoutPagePaymentSectionTitle() {return checkoutPageShippingSectionTitle.getText();}

    //list elements
    public List<String> getCheckoutPagePaymentMethodName() {return checkoutPagePaymentMethodNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPagePaymentMethodPrice() {return checkoutPagePaymentMethodPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //order summary section
    public String getCheckoutPageOrderSummarySectionTitle() {
        String fullText = checkoutPageOrderSummarySectionTitle.getText().trim();
        return fullText.replaceAll("\\d+$", "").trim();
    }

    //shipping
    public String getCheckoutPageShippingTitle() {return checkoutPageShippingTitle.getText();}
    public String getCheckoutPageChosenShippingMethodName() {return checkoutPageChosenShippingMethod.getText();}
    public String getCheckoutPageChosenShippingMethodPrice() {return checkoutPageChosenShippingMethodPrice.getText();}

    //payment
    public String getCheckoutPagePaymentTitle() {return checkoutPagePaymentTitle.getText();}
    public String getCheckoutPageChosenPaymentMethodName() {return checkoutPageChosenPaymentMethod.getText();}
    public String getCheckoutPageChosenPaymentMethodPrice() {return checkoutPageChosenPaymentMethodPrice.getText();}

    //order total
    public String getCheckoutPageOrderTotalSubtext() {return checkoutPageOrderTotalSubtext.getText();}

    //billing address section
    //email
    public String getCheckoutPageEmailSectionTitle() {return checkoutPageEmailSectionTitle.getText();}
    public String getCheckoutPageEmailSectionSubtext() {return checkoutPageEmailSectionSubtext.getText();}
    //billing address
    public String getCheckoutPageBillingAddressSectionTitle() {return checkoutPageBillingAddressSectionTitle.getText();}
    public String getCheckoutPageBillingAddressFirstNameSubtext() {return checkoutPageBillingFirstNameSubtext.getText();}
    public String getCheckoutPageBillingAddressLastNameSubtext() {return checkoutPageBillingLastNameSubtext.getText();}
    public String getCheckoutPageBillingAddressStreetSubtext() {return checkoutPageBillingStreetSubtext.getText();}
    public String getCheckoutPageBillingAddressCitySubtext() {return checkoutPageBillingCitySubtext.getText();}
    public String getCheckoutPageBillingAddressZipCodeSubtext() {return checkoutPageBillingZipCodeSubtext.getText();}
    public String getCheckoutPageBillingAddressCountrySubtext() {return checkoutPageBillingCountrySubtext.getText();}
    public String getCheckoutPageBillingAddressCountryCodeSubtext() {return checkoutPageBillingCountryCodeSubtext.getText();}
    public String getCheckoutPageBillingAddressPhoneSubtext() {return checkoutPageBillingPhoneSubtext.getText();}
    public String getCheckoutPageBillingAddressAddCompanyDetailsSubtext() {return checkoutPageBillingAddCompanyDetailsSubtext.getText();}
    public String getCheckoutPageBillingAddressAddDiffDeliveryAddressSubtext() {return checkoutPageBillingAddDifferentDeliveryAddressSubtext.getText();}
    //shipping address
    public String getCheckoutPageShippingAddressSectionTitle() {return checkoutPageShippingAddressSectionTitle.getText();}
    public String getCheckoutPageShippingAddressFirstNameSubtext() {return checkoutPageShippingFirstNameSubtext.getText();}
    public String getCheckoutPageShippingAddressLastNameSubtext() {return checkoutPageShippingLastNameSubtext.getText();}
    public String getCheckoutPageShippingAddressStreetSubtext() {return checkoutPageShippingStreetSubtext.getText();}
    public String getCheckoutPageShippingAddressCitySubtext() {return checkoutPageShippingCitySubtext.getText();}
    public String getCheckoutPageShippingAddressZipCodeSubtext() {return checkoutPageShippingZipCodeSubtext.getText();}
    public String getCheckoutPageShippingAddressCountrySubtext() {return checkoutPageShippingCountrySubtext.getText();}
    public String getCheckoutPageShippingAddressCountryCodeSubtext() {return checkoutPageShippingCountryCodeSubtext.getText();}
    public String getCheckoutPageShippingAddressPhoneSubtext() {return checkoutPageShippingPhoneSubtext.getText();}
    public String getCheckoutPageShippingAddressAddCompanyDetailsSubtext() {return checkoutPageShippingAddCompanyDetailsSubtext.getText();}

    //registered user side elements
    public String getCheckoutPageRegUserBillAddressSectionTitle() {return checkoutPageRegUserBillingAddressSectionTitle.getText();}
    public String getCheckoutPageRegUserBillAddressAddDiffDeliveryAddressSubtext() {return checkoutPageRegUserBillAddDifferentDeliveryAddressSubtext.getText();}

    //missing singular input error getter
    public String getMissingBillingAddressSingularInputErrorMsg(){return checkoutPageBillingMissingSingularInputError.getText();}

    //note
    public String getCheckoutPageNoteSectionTitle() {return checkoutPageNoteSectionTitle.getText();}
    public String getCheckoutPageNoteSectionSubtext() {return checkoutPageNoteSectionSubtext.getText();}

    //checkout page web element assert methods
    //shipping section
    public boolean isCheckoutPageShippingSectionTitleDisplayed(){return checkoutPageShippingSectionTitle.isDisplayed();}

    //list elements
    public boolean isCheckoutPageShippingSectionRadioButtonDisplayed(){
        return checkoutPageShippingSectionRadioButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageShippingMethodNameDisplayed(){
        return checkoutPageShippingMethodNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageShippingMethodPriceDisplayed(){
        return checkoutPageShippingMethodPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //payment section
    public boolean isCheckoutPagePaymentSectionTitleDisplayed(){return checkoutPagePaymentSectionTitle.isDisplayed();}

    //list elements
    public boolean isCheckoutPagePaymentSectionRadioButtonDisplayed(){
        return checkoutPagePaymentSectionRadioButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPagePaymentMethodNameDisplayed(){
        return checkoutPagePaymentMethodNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPagePaymentMethodPriceDisplayed(){
        return checkoutPagePaymentMethodPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //order summary section
    public boolean isCheckoutPageOrderSummarySectionTitleDisplayed(){return checkoutPageOrderSummarySectionTitle.isDisplayed();}
    public boolean isCheckoutPageDeliveryDetailsButtonDisplayed(){return checkoutPageDeliveryDetailsButton.isDisplayed();}

    //list elements
    public boolean isCheckoutPageOrderSummaryProductImgDisplayed(){
        return checkoutPageOrderSummaryProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageOrderSummaryProductNameDisplayed(){
        return checkoutPageOrderSummaryProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageOrderSummaryProductUnitPriceDisplayed(){
        return checkoutPageOrderSummaryProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //shipping
    public boolean isCheckoutPageShippingTitleDisplayed(){return checkoutPageShippingTitle.isDisplayed();}
    public boolean isCheckoutPageChosenShippingMethodDisplayed(){return checkoutPageChosenShippingMethod.isDisplayed();}
    public boolean isCheckoutPageChosenShippingMethodPriceDisplayed(){return checkoutPageChosenShippingMethodPrice.isDisplayed();}
    //payment
    public boolean isCheckoutPagePaymentTitleDisplayed(){return checkoutPagePaymentTitle.isDisplayed();}
    public boolean isCheckoutPageChosenPaymentMethodDisplayed(){return checkoutPageChosenPaymentMethod.isDisplayed();}
    public boolean isCheckoutPageChosenPaymentMethodPriceDisplayed(){return checkoutPageChosenPaymentMethodPrice.isDisplayed();}
    //order total
    public boolean isCheckoutPageOrderTotalSubtextDisplayed(){return checkoutPageOrderTotalSubtext.isDisplayed();}
    public boolean isCheckoutPageOrderTotalPriceDisplayed(){return checkoutPageOrderTotalPrice.isDisplayed();}
    //billing address section
    //email
    public boolean isCheckoutPageEmailSectionTitleDisplayed(){return checkoutPageEmailSectionTitle.isDisplayed();}
    public boolean isCheckoutPageEmailSubtextDisplayed(){return checkoutPageEmailSectionSubtext.isDisplayed();}
    public boolean isCheckoutPageEmailInputFieldDisplayed(){return checkoutPageEmailInputField.isDisplayed();}
    //billing address
    public boolean isCheckoutPageBillingAddressSectionTitleDisplayed(){return checkoutPageBillingAddressSectionTitle.isDisplayed();}
    public boolean isCheckoutPageBillingFirstNameSubtextDisplayed(){return checkoutPageBillingFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingFirstNameInputFieldDisplayed(){return checkoutPageBillingFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageBillingLastNameSubtextDisplayed(){return checkoutPageBillingLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingLastNameInputFieldDisplayed(){return checkoutPageBillingLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageBillingStreetSubtextDisplayed(){return checkoutPageBillingStreetSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingStreetInputFieldDisplayed(){return checkoutPageBillingStreetInputField.isDisplayed();}
    public boolean isCheckoutPageBillingCitySubtextDisplayed(){return checkoutPageBillingCitySubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCityInputFieldDisplayed(){return checkoutPageBillingCityInputField.isDisplayed();}
    public boolean isCheckoutPageBillingZipCodeSubtextDisplayed(){return checkoutPageBillingZipCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingZipCodeInputFieldDisplayed(){return checkoutPageBillingZipCodeInputField.isDisplayed();}
    public boolean isCheckoutPageBillingCountrySubtextDisplayed(){return checkoutPageBillingCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCountryDropdownMenuDisplayed(){return checkoutPageBillingCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageBillingCountryCodeSubtextDisplayed(){return checkoutPageBillingCountryCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCountryCodeDropdownMenuDisplayed(){return checkoutPageBillingCountryCodeDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageBillingPhoneSubtextDisplayed(){return checkoutPageBillingPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingPhoneInputFieldDisplayed(){return checkoutPageBillingPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageBillingAddCompanyDetailsSubtextDisplayed(){return checkoutPageBillingAddCompanyDetailsSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingAddCompanyDetailsCheckboxDisplayed(){return checkoutPageBillingAddCompanyDetailsCheckbox.isDisplayed();}
    public boolean isCheckoutPageBillingAddDifferentDeliveryAddressSubtextDisplayed(){return checkoutPageBillingAddDifferentDeliveryAddressSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingAddDifferentDeliveryAddressCheckboxDisplayed(){return checkoutPageBillingAddDifferentDeliveryAddressCheckbox.isDisplayed();}
    //shipping address
    public boolean isCheckoutPageShippingAddressSectionTitleDisplayed(){return checkoutPageShippingAddressSectionTitle.isDisplayed();}
    public boolean isCheckoutPageShippingFirstNameSubtextDisplayed(){return checkoutPageShippingFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingFirstNameInputFieldDisplayed(){return checkoutPageShippingFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageShippingLastNameSubtextDisplayed(){return checkoutPageShippingLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingLastNameInputFieldDisplayed(){return checkoutPageShippingLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageShippingStreetSubtextDisplayed(){return checkoutPageShippingStreetSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingStreetInputFieldDisplayed(){return checkoutPageShippingStreetInputField.isDisplayed();}
    public boolean isCheckoutPageShippingCitySubtextDisplayed(){return checkoutPageShippingCitySubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCityInputFieldDisplayed(){return checkoutPageShippingCityInputField.isDisplayed();}
    public boolean isCheckoutPageShippingZipCodeSubtextDisplayed(){return checkoutPageShippingZipCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingZipCodeInputFieldDisplayed(){return checkoutPageShippingZipCodeInputField.isDisplayed();}
    public boolean isCheckoutPageShippingCountrySubtextDisplayed(){return checkoutPageShippingCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCountryDropdownMenuDisplayed(){return checkoutPageShippingCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageShippingCountryCodeSubtextDisplayed(){return checkoutPageShippingCountryCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCountryCodeDropdownMenuDisplayed(){return checkoutPageShippingCountryCodeDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageShippingPhoneSubtextDisplayed(){return checkoutPageShippingPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingPhoneInputFieldDisplayed(){return checkoutPageShippingPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageShippingAddCompanyDetailsSubtextDisplayed(){return checkoutPageShippingAddCompanyDetailsSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingAddCompanyDetailsCheckboxDisplayed(){return checkoutPageShippingAddCompanyDetailsCheckbox.isDisplayed();}
    //registered user side elements
    public boolean isCheckoutPageRegUserBillAddressSectionTitleDisplayed(){return checkoutPageRegUserBillingAddressSectionTitle.isDisplayed();}
    public boolean isCheckoutPageRegUserBillAddNewAddressButtonDisplayed(){return checkoutPageRegUserBillAddressAddNewAddressButton.isDisplayed();}
    public boolean isCheckoutPageRegUserBillAddDifferentDeliveryAddressSubtextDisplayed(){return checkoutPageRegUserBillAddDifferentDeliveryAddressCheckbox.isDisplayed();}
    public boolean isCheckoutPageRegUserBillAddDifferentDeliveryAddressCheckboxDisplayed(){return checkoutPageRegUserBillAddDifferentDeliveryAddressSubtext.isDisplayed();}

    //note
    public boolean isCheckoutPageNoteSectionTitleDisplayed(){return checkoutPageNoteSectionTitle.isDisplayed();}
    public boolean isCheckoutPageNoteSectionSubtextDisplayed(){return checkoutPageNoteSectionSubtext.isDisplayed();}
    public boolean isCheckoutPageNoteInputFieldDisplayed(){return checkoutPageNoteInputField.isDisplayed();}

}
