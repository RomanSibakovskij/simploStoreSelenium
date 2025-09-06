package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageInvalidSingularInput extends BasePage{

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
    private String invalidCheckoutBillAddressEmailFormat;
    private String existingCheckoutBillAddressEmail;
    private String invalidCheckoutBillAddressFirstNameFormat;
    private String invalidCheckoutBillAddressLastNameFormat;
    private String invalidCheckoutBillAddressStreetFormat;
    private String invalidCheckoutBillAddressCityFormat;
    private String invalidCheckoutBillAddressZipCodeFormat;

    //valid billing address data - for remaining inputs
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    public CheckoutPageInvalidSingularInput(WebDriver driver) {super(driver);}

    //billing address section

    //valid billing address (guest) data input getter (for remaining inputs)
    public void validCheckoutBillAddressEmailInputDataGetter(){

        validCheckoutBillAddressEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid checkout billing address email input data: " + "\n");

        logger.info("Valid checkout billing address email: " + validCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address (guest) data input getter - invalid email format (missing '@')
    public void invalidCheckoutBillAddressInvalidEmailFormatInputDataGetter(){

        invalidCheckoutBillAddressEmailFormat = "dsfdsffakemail.com";

        System.out.println("Invalid checkout billing address invalid email input data: " + "\n");

        logger.info("Invalid checkout billing address email format: " + invalidCheckoutBillAddressEmailFormat);

        System.out.println("\n");

    }

    //invalid billing address (guest) data input getter - existing email (used beforehand in manual testing)
    public void invalidCheckoutBillAddressExistingEmaiInputDataGetter(){

        existingCheckoutBillAddressEmail = "m0@example.com";

        System.out.println("Invalid checkout billing address existing email input data: " + "\n");

        logger.info("Existing checkout billing address email: " + invalidCheckoutBillAddressEmailFormat);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - invalid first name format (special symbols only)
    public void invalidCheckoutBillAddressInputDataInvalidFirstNameFormatGetter(){

        invalidCheckoutBillAddressFirstNameFormat = "!#@#$#%";
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (invalid billing first name format): " + "\n");

        logger.info("Invalid checkout billing address first name format: " + invalidCheckoutBillAddressFirstNameFormat);
        logger.info("Valid checkout billing address last name (invalid billing first name format): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (invalid billing first name format): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (invalid billing first name format): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (invalid billing first name format): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (invalid billing first name format): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - invalid last name format (special symbols only)
    public void invalidCheckoutBillAddressInputDataInvalidLastNameFormatGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        invalidCheckoutBillAddressLastNameFormat = "@$#@#$^%$";
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (invalid billing last name format): " + "\n");

        logger.info("Valid checkout billing address first name (invalid billing last name format): " + validCheckoutBillAddressFirstName);
        logger.info("Invalid checkout billing address last name format: " + invalidCheckoutBillAddressLastNameFormat);
        logger.info("Valid checkout billing address street (invalid billing last name format): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (invalid billing last name format): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (invalid billing last name format): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (invalid billing last name format): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - invalid street format (special symbols only)
    public void invalidCheckoutBillAddressInputDataInvalidStreetFormatGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        invalidCheckoutBillAddressStreetFormat = "@!$@#$%%$^";
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (invalid billing street format): " + "\n");

        logger.info("Valid checkout billing address first name (invalid billing street format): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (invalid billing street format): " + validCheckoutBillAddressLastName);
        logger.info("Invalid checkout billing address street format: " + invalidCheckoutBillAddressStreetFormat);
        logger.info("Valid checkout billing address city (invalid billing street format): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (invalid billing street format): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (invalid billing street format): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - invalid city format (special symbols only)
    public void invalidCheckoutBillAddressInputDataInvalidCityFormatGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        invalidCheckoutBillAddressCityFormat = "$%^%*&&^*(";
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (invalid billing city format): " + "\n");

        logger.info("Valid checkout billing address first name (invalid billing city format): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (invalid billing city format): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (invalid billing city format): " + validCheckoutBillAddressStreet);
        logger.info("Invalid checkout billing address city format: " + invalidCheckoutBillAddressCityFormat);
        logger.info("Valid checkout billing address zip code (invalid billing city format): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (invalid billing city format): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - invalid zip code format (special symbols only)
    public void invalidCheckoutBillAddressInputDataInvalidZipCodeFormatGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        invalidCheckoutBillAddressZipCodeFormat = "@$#$%";
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (invalid billing zip code format): " + "\n");

        logger.info("Valid checkout billing address first name (invalid billing zip code format): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (invalid billing zip code format): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (invalid billing zip code format): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (invalid billing zip code format): " + validCheckoutBillAddressCity);
        logger.info("Invalid checkout billing address zip code format: " + invalidCheckoutBillAddressZipCodeFormat);
        logger.info("Valid checkout billing address phone (invalid billing zip code format): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address (guest) input data methods - invalid singular input format
    public void inputInvalidCheckoutEmailFormatIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(invalidCheckoutBillAddressEmailFormat);}
    public void inputExistingCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(existingCheckoutBillAddressEmail);}
    public void inputInvalidCheckoutFirstNameFormatIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(invalidCheckoutBillAddressFirstNameFormat);}
    public void inputInvalidCheckoutLastNameFormatIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(invalidCheckoutBillAddressLastNameFormat);}
    public void inputInvalidCheckoutStreetFormatIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(invalidCheckoutBillAddressStreetFormat);}
    public void inputInvalidCheckoutCityFormatIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(invalidCheckoutBillAddressCityFormat);}
    public void inputInvalidCheckoutZipCodeFormatIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(invalidCheckoutBillAddressZipCodeFormat);}

    //valid billing address (guest) input data methods
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

}
