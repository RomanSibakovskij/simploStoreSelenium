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
    private String tooLongCheckoutBillAddressStreet;
    private String tooLongCheckoutBillAddressCity;
    private int tooLongCheckoutBillAddressZipCode;
    private String tooLongCheckoutBillAddressPhone;

    //valid billing address data - for remaining inputs
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    //invalid shipping address data - too long singular input
    private String tooLongCheckoutShipAddressFirstName;
    private String tooLongCheckoutShipAddressLastName;
    private String tooLongCheckoutShipAddressStreet;

    //valid shipping address data - for remaining inputs
    private String validCheckoutShipAddressFirstName;
    private String validCheckoutShipAddressLastName;
    private String validCheckoutShipAddressStreet;
    private String validCheckoutShipAddressCity;
    private int validCheckoutShipAddressZipCode;
    private String validCheckoutShipAddressPhone;

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

    //invalid billing address data (guest) input data getter - too long street (101 chars)
    public void invalidCheckoutBillAddressInputDataTooLongStreetGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        tooLongCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(94);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too long billing street): " + "\n");

        logger.info("Valid checkout billing address first name (too long billing street): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too long billing street): " + validCheckoutBillAddressLastName);
        logger.info("Too long checkout billing address street: " + tooLongCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too long billing street): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too long billing street): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too long billing street): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too long city (51 chars)
    public void invalidCheckoutBillAddressInputDataTooLongCityGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        tooLongCheckoutBillAddressCity = "Hfddsgdsfssdsfgdhjfgdsfgdhjfghsdrtuioikjfdgsdfhfhsf";
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too long billing city): " + "\n");

        logger.info("Valid checkout billing address first name (too long billing city): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too long billing city): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too long billing city): " + validCheckoutBillAddressStreet);
        logger.info("Too long checkout billing address city: " + tooLongCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too long billing city): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too long billing city): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too long zip code (6 digits)
    public void invalidCheckoutBillAddressInputDataTooLongZipCodeGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        tooLongCheckoutBillAddressZipCode = 546311;
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too long billing zip code): " + "\n");

        logger.info("Valid checkout billing address first name (too long billing zip code): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too long billing zip code): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too long billing zip code): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too long billing zip code): " + validCheckoutBillAddressCity);
        logger.info("Too long checkout billing address zip code: " + tooLongCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too long billing zip code): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too long phone (30 digits)
    public void invalidCheckoutBillAddressInputDataTooLongPhoneGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        tooLongCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(30);

        System.out.println("Invalid checkout billing address input data (too long billing phone): " + "\n");

        logger.info("Valid checkout billing address first name (too long billing phone): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too long billing phone): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too long billing phone): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too long billing phone): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too long billing phone): " + validCheckoutBillAddressZipCode);
        logger.info("Too long checkout billing address phone: " + tooLongCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address (guest) input data methods - too long singular input
    public void inputTooLongCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(tooLongCheckoutBillAddressEmail);}
    public void inputTooLongCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(tooLongCheckoutBillAddressFirstName);}
    public void inputTooLongCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(tooLongCheckoutBillAddressLastName);}
    public void inputTooLongCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(tooLongCheckoutBillAddressStreet);}
    public void inputTooLongCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(tooLongCheckoutBillAddressCity);}
    public void inputTooLongCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(tooLongCheckoutBillAddressZipCode));}
    public void inputTooLongCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(tooLongCheckoutBillAddressPhone);}

    //valid billing address (guest) input data methods
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

    //shipping address section

    //invalid shipping address data (guest) input data getter - too long first name (51 chars)
    public void invalidCheckoutShipAddressInputDataTooLongFirstNameGetter(){

        tooLongCheckoutShipAddressFirstName = "Hfddsgdsfssdsfgdhjfgdsfgdhjfghsdrtuioikjfdgsdfhfhsf";
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too long shipping first name): " + "\n");

        logger.info("Too long checkout shipping address first name: " + tooLongCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (too long shipping first name): " + validCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (too long shipping first name): " + validCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too long shipping first name): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too long shipping first name): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too long shipping first name): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address data (guest) input data getter - too long last name (51 chars)
    public void invalidCheckoutShipAddressInputDataTooLongLastNameGetter(){

        validCheckoutShipAddressFirstName = TestDataGenerator.getRandomFirstName();
        tooLongCheckoutShipAddressLastName = "Hfddsgdsfssdsfgdhjfgdsfgdhjfghsdrtuioikjfdgsdfhfhsf";
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too long shipping last name): " + "\n");

        logger.info("Valid checkout shipping address first name (too long shipping last name): " + validCheckoutShipAddressFirstName);
        logger.info("Too long checkout shipping address last name: " + tooLongCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (too long shipping last name): " + validCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too long shipping last name): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too long shipping last name): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too long shipping last name): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address data (guest) input data getter - too long street (101 chars)
    public void invalidCheckoutShipAddressInputDataTooLongStreetGetter(){

        validCheckoutShipAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        tooLongCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(94);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too long shipping street): " + "\n");

        logger.info("Valid checkout shipping address first name (too long shipping street): " + validCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (too long shipping street): " + validCheckoutShipAddressLastName);
        logger.info("Too long checkout shipping address street: " + tooLongCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too long shipping street): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too long shipping street): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too long shipping street): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address (guest) input data methods - too long singular input
    public void inputTooLongCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(tooLongCheckoutShipAddressFirstName);}
    public void inputTooLongCheckoutShipLastNameIntoShipLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(tooLongCheckoutShipAddressLastName);}
    public void inputTooLongCheckoutShipStreetIntoShipStreetInputField(){checkoutPageShippingStreetInputField.sendKeys(tooLongCheckoutShipAddressStreet);}

    //valid shipping address (guest) input data methods
    public void inputValidCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validCheckoutShipAddressFirstName);}
    public void inputValidCheckoutShipLastNameIntoShipLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validCheckoutShipAddressLastName);}
    public void inputValidCheckoutShipStreetIntoShipStreetInputField(){checkoutPageShippingStreetInputField.sendKeys(validCheckoutShipAddressStreet);}
    public void inputValidCheckoutShipCityIntoShipCityInputField(){checkoutPageShippingCityInputField.sendKeys(validCheckoutShipAddressCity);}
    public void inputValidCheckoutShipZipCodeIntoShipZipCodeInputField(){checkoutPageShippingZipCodeInputField.sendKeys(String.valueOf(validCheckoutShipAddressZipCode));}
    public void inputValidCheckoutShipPhoneIntoShipPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validCheckoutShipAddressPhone);}

}
