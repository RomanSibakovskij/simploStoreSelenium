package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageTooShortSingularInput extends BasePage{

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

    //invalid billing address data - too short singular input
    private String tooShortCheckoutBillAddressEmail;
    private String tooShortCheckoutBillAddressFirstName;
    private String tooShortCheckoutBillAddressLastName;
    private String tooShortCheckoutBillAddressStreet;
    private String tooShortCheckoutBillAddressCity;
    private int tooShortCheckoutBillAddressZipCode;
    private String tooShortCheckoutBillAddressPhone;

    //valid billing address data - for remaining inputs
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    //invalid shipping address data - too short singular input
    private String tooShortCheckoutShipAddressFirstName;
    private String tooShortCheckoutShipAddressLastName;
    private String tooShortCheckoutShipAddressStreet;
    private String tooShortCheckoutShipAddressCity;

    //valid shipping address data - for remaining inputs
    private String validCheckoutShipAddressFirstName;
    private String validCheckoutShipAddressLastName;
    private String validCheckoutShipAddressStreet;
    private String validCheckoutShipAddressCity;
    private int validCheckoutShipAddressZipCode;
    private String validCheckoutShipAddressPhone;

    public CheckoutPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //billing address section

    //valid billing address (guest) data input getter (for remaining inputs)
    public void validCheckoutBillAddressEmailInputDataGetter(){

        validCheckoutBillAddressEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid checkout billing address email input data: " + "\n");

        logger.info("Valid checkout billing address email: " + validCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address (guest) data input getter - too short email (1 char -> name, domain)
    public void invalidCheckoutBillAddressTooShortEmailInputDataGetter(){

        tooShortCheckoutBillAddressEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);

        System.out.println("Invalid checkout billing address too short email input data: " + "\n");

        logger.info("Too short checkout billing address email: " + tooShortCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short first name (1 char)
    public void invalidCheckoutBillAddressInputDataTooShortFirstNameGetter(){

        tooShortCheckoutBillAddressFirstName = "G";
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too short billing first name): " + "\n");

        logger.info("Too short checkout billing address first name: " + tooShortCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too short billing first name): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too short billing first name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too short billing first name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too short billing first name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too short billing first name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short last name (1 char)
    public void invalidCheckoutBillAddressInputDataTooShortLastNameGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        tooShortCheckoutBillAddressLastName = "A";
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too short billing last name): " + "\n");

        logger.info("Valid checkout billing address first name (too short billing last name): " + validCheckoutBillAddressFirstName);
        logger.info("Too short checkout billing address last name: " + tooShortCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too short billing last name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too short billing last name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too short billing last name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too short billing last name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short street (3 chars)
    public void invalidCheckoutBillAddressInputDataTooShortStreetGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        tooShortCheckoutBillAddressStreet = "3.P";
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too short billing street): " + "\n");

        logger.info("Valid checkout billing address first name (too short billing street): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too short billing street): " + validCheckoutBillAddressLastName);
        logger.info("Too short checkout billing address street: " + tooShortCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too short billing street): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too short billing street): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too short billing street): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short city (2 chars)
    public void invalidCheckoutBillAddressInputDataTooShortCityGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        tooShortCheckoutBillAddressCity = "2G";
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too short billing city): " + "\n");

        logger.info("Valid checkout billing address first name (too short billing city): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too short billing city): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too short billing city): " + validCheckoutBillAddressStreet);
        logger.info("Too short checkout billing address city: " + tooShortCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too short billing city): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too short billing city): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short zip code (4 digits)
    public void invalidCheckoutBillAddressInputDataTooShortZipCodeGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        tooShortCheckoutBillAddressZipCode = 5463;
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (too short billing zip code): " + "\n");

        logger.info("Valid checkout billing address first name (too short billing zip code): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too short billing zip code): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too short billing zip code): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too short billing zip code): " + validCheckoutBillAddressCity);
        logger.info("Too short checkout billing address zip code: " + tooShortCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (too short billing zip code): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - too short phone (2 digits)
    public void invalidCheckoutBillAddressInputDataTooShortPhoneGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        tooShortCheckoutBillAddressPhone = "45";

        System.out.println("Invalid checkout billing address input data (too short billing phone): " + "\n");

        logger.info("Valid checkout billing address first name (too short billing phone): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (too short billing phone): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (too short billing phone): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (too short billing phone): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (too short billing phone): " + validCheckoutBillAddressZipCode);
        logger.info("Too short checkout billing address phone: " + tooShortCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address (guest) input data methods - too short singular input
    public void inputTooShortCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(tooShortCheckoutBillAddressEmail);}
    public void inputTooShortCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(tooShortCheckoutBillAddressFirstName);}
    public void inputTooShortCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(tooShortCheckoutBillAddressLastName);}
    public void inputTooShortCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(tooShortCheckoutBillAddressStreet);}
    public void inputTooShortCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(tooShortCheckoutBillAddressCity);}
    public void inputTooShortCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(tooShortCheckoutBillAddressZipCode));}
    public void inputTooShortCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(tooShortCheckoutBillAddressPhone);}

    //valid billing address (guest) input data methods
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

    //shipping address section

    //invalid shipping address data (guest) input data getter - too short first name (1 char)
    public void invalidCheckoutShipAddressInputDataTooShortFirstNameGetter(){

        tooShortCheckoutShipAddressFirstName = "H";
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too short shipping first name): " + "\n");

        logger.info("Too short checkout shipping address first name: " + tooShortCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (too short shipping first name): " + validCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (too short shipping first name): " + validCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too short shipping first name): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too short shipping first name): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too short shipping first name): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address data (guest) input data getter - too short last name (1 char)
    public void invalidCheckoutShipAddressInputDataTooShortLastNameGetter(){

        validCheckoutShipAddressFirstName = TestDataGenerator.getRandomFirstName();
        tooShortCheckoutShipAddressLastName = "D";
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too short shipping last name): " + "\n");

        logger.info("Valid checkout shipping address first name (too short shipping last name): " + validCheckoutShipAddressFirstName);
        logger.info("Too short checkout shipping address last name: " + tooShortCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (too short shipping last name): " + validCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too short shipping last name): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too short shipping last name): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too short shipping last name): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address data (guest) input data getter - too short street (3 chars)
    public void invalidCheckoutShipAddressInputDataTooShortStreetGetter(){

        validCheckoutShipAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        tooShortCheckoutShipAddressStreet = "5.B";
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too short shipping street): " + "\n");

        logger.info("Valid checkout shipping address first name (too short shipping street): " + validCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (too short shipping street): " + validCheckoutShipAddressLastName);
        logger.info("Too short checkout shipping address street: " + tooShortCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (too short shipping street): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too short shipping street): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too short shipping street): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address data (guest) input data getter - too short city (2 chars)
    public void invalidCheckoutShipAddressInputDataTooShortCityGetter(){

        validCheckoutShipAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        tooShortCheckoutShipAddressCity = "5F";
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (too short shipping city): " + "\n");

        logger.info("Valid checkout shipping address first name (too short shipping city): " + validCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (too short shipping city): " + validCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (too short shipping city): " + validCheckoutShipAddressStreet);
        logger.info("Too short checkout shipping address city: " + tooShortCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (too short shipping city): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (too short shipping city): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address (guest) input data methods - too short singular input
    public void inputTooShortCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(tooShortCheckoutShipAddressFirstName);}
    public void inputTooShortCheckoutShipLastNameIntoShipLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(tooShortCheckoutShipAddressLastName);}
    public void inputTooShortCheckoutShipStreetIntoShipStreetInputField(){checkoutPageShippingStreetInputField.sendKeys(tooShortCheckoutShipAddressStreet);}
    public void inputTooShortCheckoutShipCityIntoShipCityInputField(){checkoutPageShippingCityInputField.sendKeys(tooShortCheckoutShipAddressCity);}

    //valid shipping address (guest) input data methods
    public void inputValidCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validCheckoutShipAddressFirstName);}
    public void inputValidCheckoutShipLastNameIntoShipLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validCheckoutShipAddressLastName);}
    public void inputValidCheckoutShipStreetIntoShipStreetInputField(){checkoutPageShippingStreetInputField.sendKeys(validCheckoutShipAddressStreet);}
    public void inputValidCheckoutShipCityIntoShipCityInputField(){checkoutPageShippingCityInputField.sendKeys(validCheckoutShipAddressCity);}
    public void inputValidCheckoutShipZipCodeIntoShipZipCodeInputField(){checkoutPageShippingZipCodeInputField.sendKeys(String.valueOf(validCheckoutShipAddressZipCode));}
    public void inputValidCheckoutShipPhoneIntoShipPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validCheckoutShipAddressPhone);}

}
