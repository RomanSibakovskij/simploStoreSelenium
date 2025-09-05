package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageNoSingularInput extends BasePage{

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

    //invalid billing address data - no singular input
    private String noCheckoutBillAddressEmail;
    private String noCheckoutBillAddressFirstName;
    private String noCheckoutBillAddressLastName;
    private String noCheckoutBillAddressStreet;
    private String noCheckoutBillAddressCity;
    private String noCheckoutBillAddressZipCode;
    private String noCheckoutBillAddressPhone;

    //valid billing address data - for remaining inputs
    private String validCheckoutBillAddressEmail;
    private String validCheckoutBillAddressFirstName;
    private String validCheckoutBillAddressLastName;
    private String validCheckoutBillAddressStreet;
    private String validCheckoutBillAddressCity;
    private int validCheckoutBillAddressZipCode;
    private String validCheckoutBillAddressPhone;

    //invalid shipping address data - no singular input
    private String noCheckoutShipAddressFirstName;

    //valid shipping address data - for remaining inputs
    private String validCheckoutShipAddressFirstName;
    private String validCheckoutShipAddressLastName;
    private String validCheckoutShipAddressStreet;
    private String validCheckoutShipAddressCity;
    private int validCheckoutShipAddressZipCode;
    private String validCheckoutShipAddressPhone;

    public CheckoutPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid billing address (guest) data input getter - no email
    public void invalidCheckoutBillAddressEmailInputDataGetter(){

        noCheckoutBillAddressEmail = "";

        System.out.println("Invalid checkout billing address email input data: " + "\n");

        logger.info("No checkout billing address email: " + noCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //valid billing address (guest) data input getter (for remaining inputs)
    public void validCheckoutBillAddressEmailInputDataGetter(){

        validCheckoutBillAddressEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid checkout billing address email input data: " + "\n");

        logger.info("Valid checkout billing address email: " + validCheckoutBillAddressEmail);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no first name
    public void invalidCheckoutBillAddressInputDataNoFirstNameGetter(){

        noCheckoutBillAddressFirstName = "";
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (no billing first name): " + "\n");

        logger.info("No checkout billing address first name: " + noCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (no billing first name): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (no billing first name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (no billing first name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (no billing first name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (no billing first name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no last name
    public void invalidCheckoutBillAddressInputDataNoLastNameGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        noCheckoutBillAddressLastName = "";
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (no billing last name): " + "\n");

        logger.info("Valid checkout billing address first name (no billing last name): " + validCheckoutBillAddressFirstName);
        logger.info("No checkout billing address last name: " + noCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (no billing last name): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (no billing last name): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (no billing last name): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (no billing last name): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no street
    public void invalidCheckoutBillAddressInputDataNoStreetGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        noCheckoutBillAddressStreet = "";
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (no billing street): " + "\n");

        logger.info("Valid checkout billing address first name (no billing street): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (no billing street): " + validCheckoutBillAddressLastName);
        logger.info("No checkout billing address street: " + noCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (no billing street): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (no billing street): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (no billing street): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no city
    public void invalidCheckoutBillAddressInputDataNoCityGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        noCheckoutBillAddressCity = "";
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (no billing city): " + "\n");

        logger.info("Valid checkout billing address first name (no billing city): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (no billing city): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (no billing city): " + validCheckoutBillAddressStreet);
        logger.info("No checkout billing address city: " + noCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (no billing city): " + validCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (no billing city): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no zip code
    public void invalidCheckoutBillAddressInputDataNoZipCodeGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        noCheckoutBillAddressZipCode = "";
        validCheckoutBillAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout billing address input data (no billing zip code): " + "\n");

        logger.info("Valid checkout billing address first name (no billing zip code): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (no billing zip code): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (no billing zip code): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (no billing zip code): " + validCheckoutBillAddressCity);
        logger.info("No checkout billing address zip code: " + noCheckoutBillAddressZipCode);
        logger.info("Valid checkout billing address phone (no billing zip code): " + validCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address data (guest) input data getter - no phone
    public void invalidCheckoutBillAddressInputDataNoPhoneGetter(){

        validCheckoutBillAddressFirstName = TestDataGenerator.getRandomFirstName();
        validCheckoutBillAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutBillAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutBillAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutBillAddressZipCode = TestDataGenerator.getRandomPostalCode();
        noCheckoutBillAddressPhone = "";

        System.out.println("Invalid checkout billing address input data (no billing phone): " + "\n");

        logger.info("Valid checkout billing address first name (no billing phone): " + validCheckoutBillAddressFirstName);
        logger.info("Valid checkout billing address last name (no billing phone): " + validCheckoutBillAddressLastName);
        logger.info("Valid checkout billing address street (no billing phone): " + validCheckoutBillAddressStreet);
        logger.info("Valid checkout billing address city (no billing phone): " + validCheckoutBillAddressCity);
        logger.info("Valid checkout billing address zip code (no billing phone): " + validCheckoutBillAddressZipCode);
        logger.info("No checkout billing address phone: " + noCheckoutBillAddressPhone);

        System.out.println("\n");

    }

    //invalid billing address (guest) input data methods - no singular input
    public void inputNoCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(noCheckoutBillAddressEmail);}
    public void inputNoCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(noCheckoutBillAddressFirstName);}
    public void inputNoCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(noCheckoutBillAddressLastName);}
    public void inputNoCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(noCheckoutBillAddressStreet);}
    public void inputNoCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(noCheckoutBillAddressCity);}
    public void inputNoCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(noCheckoutBillAddressZipCode);}
    public void inputNoCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(noCheckoutBillAddressPhone);}

    //valid billing address (guest) input data methods
    public void inputValidCheckoutEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validCheckoutBillAddressEmail);}
    public void inputValidCheckoutFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validCheckoutBillAddressFirstName);}
    public void inputValidCheckoutLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validCheckoutBillAddressLastName);}
    public void inputValidCheckoutStreetIntoStreetInputField(){checkoutPageBillingStreetInputField.sendKeys(validCheckoutBillAddressStreet);}
    public void inputValidCheckoutCityIntoCityInputField(){checkoutPageBillingCityInputField.sendKeys(validCheckoutBillAddressCity);}
    public void inputValidCheckoutZipCodeIntoZipCodeInputField(){checkoutPageBillingZipCodeInputField.sendKeys(String.valueOf(validCheckoutBillAddressZipCode));}
    public void inputValidCheckoutPhoneIntoPhoneInputField(){checkoutPageBillingPhoneInputField.sendKeys(validCheckoutBillAddressPhone);}

    //shipping address section

    //invalid shipping address data (guest) input data getter - no first name
    public void invalidCheckoutShipAddressInputDataNoFirstNameGetter(){

        noCheckoutShipAddressFirstName = "";
        validCheckoutShipAddressLastName = TestDataGenerator.getRandomLastName();
        validCheckoutShipAddressStreet = TestDataGenerator.generateRandomAddress(8);
        validCheckoutShipAddressCity = TestDataGenerator.getRandomCity();
        validCheckoutShipAddressZipCode = TestDataGenerator.getRandomPostalCode();
        validCheckoutShipAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid checkout shipping address input data (no shipping first name): " + "\n");

        logger.info("No checkout shipping address first name: " + noCheckoutShipAddressFirstName);
        logger.info("Valid checkout shipping address last name (no shipping first name): " + validCheckoutShipAddressLastName);
        logger.info("Valid checkout shipping address street (no shipping first name): " + validCheckoutShipAddressStreet);
        logger.info("Valid checkout shipping address city (no shipping first name): " + validCheckoutShipAddressCity);
        logger.info("Valid checkout shipping address zip code (no shipping first name): " + validCheckoutShipAddressZipCode);
        logger.info("Valid checkout shipping address phone (no shipping first name): " + validCheckoutShipAddressPhone);

        System.out.println("\n");

    }

    //invalid shipping address (guest) input data methods - no singular input
    public void inputNoCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(noCheckoutShipAddressFirstName);}

    //valid shipping address (guest) input data methods
    public void inputValidCheckoutShipFirstNameIntoShipFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validCheckoutShipAddressFirstName);}
    public void inputValidCheckoutShipLastNameIntoShipLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validCheckoutShipAddressLastName);}
    public void inputValidCheckoutShipStreetIntoShipStreetInputField(){checkoutPageShippingStreetInputField.sendKeys(validCheckoutShipAddressStreet);}
    public void inputValidCheckoutShipCityIntoShipCityInputField(){checkoutPageShippingCityInputField.sendKeys(validCheckoutShipAddressCity);}
    public void inputValidCheckoutShipZipCodeIntoShipZipCodeInputField(){checkoutPageShippingZipCodeInputField.sendKeys(String.valueOf(validCheckoutShipAddressZipCode));}
    public void inputValidCheckoutShipPhoneIntoShipPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validCheckoutShipAddressPhone);}

}
