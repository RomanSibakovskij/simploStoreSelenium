package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageTooLongSingularInput extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//form[@class='sim-form'][1]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageEmailInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingFirstNameInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingLastNameInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][2]/div[@class='sim-form-group w-full']/div[@class='sim-input c-white v-solid s-md']/input")
    private WebElement checkoutPageBillingStreetInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageBillingCityInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageBillingZipCodeInputField;
    @FindBy(xpath = "//form[@class='sim-form'][2]//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageBillingPhoneInputField;
    //shipping address
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageShippingFirstNameInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][1]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageShippingLastNameInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][2]//input")
    private WebElement checkoutPageShippingStreetInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][1]//input")
    private WebElement checkoutPageShippingCityInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][3]/div[@class='sim-form-group w-full'][2]//input")
    private WebElement checkoutPageShippingZipCodeInputField;
    @FindBy(xpath = "//form[2]/div[4]/form//div[@class='sim-form-row'][5]//div[@class='sim-form-group w-full']//input")
    private WebElement checkoutPageShippingPhoneInputField;

    //invalid billing address data - too long singular input
    private String tooLongCheckoutBillAddressEmail;
    private String tooLongCheckoutBillAddressFirstName;
    private String tooLongCheckoutBillAddressLastName;

    //valid billing address data - for remaining inputs
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    public CheckoutPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //billing address section

    //valid billing address (guest) data input getter (for remaining inputs)
    public void validCheckoutBillAddressEmailInputDataGetter(){

        validCheckoutBillAddressEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid checkout billing address email input data: " + "\n");

        logger.info("Valid checkout billing address email: " + validCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address (guest) data input getter - too long email (75 chars -> name, domain)
    public void invalidCheckoutBillAddressTooLongEmailInputDataGetter(){

        tooLongCheckoutBillAddressEmail = TestDataGenerator.generateRandomTooLongEmailAddress(75);

        System.out.println("Invalid checkout billing address too long email input data: " + "\n");

        logger.info("Too long checkout billing address email: " + tooLongCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too long first name (51 chars)
    public void invalidCheckoutBillAddressInputDataTooLongFirstNameGetter(){

        tooLongCheckoutBillAddressFirstName = "Hfddsgdsfssdsfgdhjfgdsfgdhjfghsdrtuioikjfdgsdfhfhsf";
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too long billing first name): " + "\n");

        logger.info("Too long checkout billing address first name: " + tooLongCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too long billing first name): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too long billing first name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too long billing first name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too long billing first name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too long billing first name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too long last name (51 chars)
    public void invalidCheckoutBillAddressInputDataTooLongLastNameGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        tooLongCheckoutBillAddressLastName = "Hfddsgdsfssdsfgdhjfgdsfgdhjfghsdrtuioikjfdgsdfhfhsf";
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too long billing last name): " + "\n");

        logger.info("Valid checkout billing address first name (too long billing last name): " + validCheckoutBillAddressFirstName);
        logger.info("Too long checkout billing address last name: " + tooLongCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too long billing last name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too long billing last name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too long billing last name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too long billing last name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address (guest) input data methods - too long singular input
    public void inputTooLongCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(tooLongCheckoutBillAddressEmail);}
    public void inputTooLongCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(tooLongCheckoutBillAddressFirstName);}
    public void inputTooLongCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(tooLongCheckoutBillAddressLastName);}

    //valid billing address (guest) input data methods
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

}
