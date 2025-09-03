package cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressModalInvalidSingularInput extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[1]//input")
    private WebElement addNewAddressModalFirstNameInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[2]//input")
    private WebElement addNewAddressModalLastNameInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][2]//input")
    private WebElement addNewAddressModalStreetInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[1]//input")
    private WebElement addNewAddressModalZipCodeInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[2]//input")
    private WebElement addNewAddressModalCityInputField;
    @FindBy(xpath = "//form/div[4]//input")
    private WebElement addNewAddressModalPhoneInputField;

    //invalid address input data - invalid singular input format
    private String invalidUserFirstNameFormat;
    private String invalidUserLastNameFormat;
    private String invalidStreetFormat;
    private String invalidZipCodeFormat;
    private String invalidCityFormat;
    private String invalidPhoneFormat;

    //valid address input data - for remaining inputs
    private String validUserFirstName;
    private String validUserLastName;
    private String validStreet;
    private int validZipCode;
    private String validCity;
    private String validPhone;

    public AddNewAddressModalInvalidSingularInput(WebDriver driver) {super(driver);}

    //invalid user address input data getter - invalid first name input format (special symbols only)
    public void invalidUserAddressInputDataInvalidFirstNameFormatGetter(){

        invalidUserFirstNameFormat = "@$@#$%$";
        validUserLastName = "Laydon";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (invalid first name format): " + "\n");

        logger.info("Invalid user address first name format: " + invalidUserFirstNameFormat);
        logger.info("Valid user address last name (invalid first name format): " + validUserLastName);
        logger.info("Valid user street (invalid first name format): " + validStreet);
        logger.info("Valid user zip code (invalid first name format): " + validZipCode);
        logger.info("Valid user city (invalid first name format): " + validCity);
        logger.info("Valid user phone (invalid first name format): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid first name format
    public void inputInvalidUserFirstNameFormatIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(invalidUserFirstNameFormat);}

    //invalid user address input data getter - invalid last name input format (special symbols only)
    public void invalidUserAddressInputDataInvalidLastNameFormatGetter(){

        validUserFirstName = "Michael";
        invalidUserLastNameFormat = "@$##%^$%&^";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (invalid last name format): " + "\n");

        logger.info("Valid user address first name (invalid last name format): " + validUserFirstName);
        logger.info("Invalid user address last name format: " + invalidUserLastNameFormat);
        logger.info("Valid user street (invalid last name format): " + validStreet);
        logger.info("Valid user zip code (invalid last name format): " + validZipCode);
        logger.info("Valid user city (invalid last name format): " + validCity);
        logger.info("Valid user phone (invalid last name format): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid last name format
    public void inputInvalidUserLastNameFormatIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(invalidUserLastNameFormat);}

    //invalid user address input data getter - invalid street input format (special symbols only)
    public void invalidUserAddressInputDataInvalidStreetFormatGetter(){

        validUserFirstName = "Matt";
        validUserLastName = "Laydon";
        invalidStreetFormat = "@$@#$%$#^";
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (invalid street format): " + "\n");

        logger.info("Valid user address first name (invalid street format): " + validUserFirstName);
        logger.info("Valid user address last name (invalid street format): " + validUserLastName);
        logger.info("Invalid user street format: " + invalidStreetFormat);
        logger.info("Valid user zip code (invalid street format): " + validZipCode);
        logger.info("Valid user city (invalid street format): " + validCity);
        logger.info("Valid user phone (invalid street format): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid street format
    public void inputInvalidUserStreetFormatIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(invalidStreetFormat);}

    //invalid user address input data getter - invalid zip code input format (special symbols only)
    public void invalidUserAddressInputDataInvalidZipCodeFormatGetter(){

        validUserFirstName = "Dave";
        validUserLastName = "Connor";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        invalidZipCodeFormat = "@#@$%";
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (invalid zip code format): " + "\n");

        logger.info("Valid user address first name (invalid zip code format): " + validUserFirstName);
        logger.info("Valid user address last name (invalid zip code format): " + validUserLastName);
        logger.info("Valid user street (invalid zip code format): " + validStreet);
        logger.info("Invalid user zip code format: " + invalidZipCodeFormat);
        logger.info("Valid user city (invalid zip code format): " + validCity);
        logger.info("Valid user phone (invalid zip code format): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid zip code format
    public void inputInvalidUserZipCodeFormatIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(invalidZipCodeFormat);}

    //invalid user address input data getter - invalid city input format (special symbols only)
    public void invalidUserAddressInputDataInvalidCityFormatGetter(){

        validUserFirstName = "David";
        validUserLastName = "Taylor";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        invalidCityFormat = "$#$#%$%^";
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (invalid city format): " + "\n");

        logger.info("Valid user address first name (invalid city format): " + validUserFirstName);
        logger.info("Valid user address last name (invalid city format): " + validUserLastName);
        logger.info("Valid user street (invalid city format): " + validStreet);
        logger.info("Valid user zip code (invalid city format): " + validZipCode);
        logger.info("Invalid user city format: " + invalidCityFormat);
        logger.info("Valid user phone (invalid city format): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid city format
    public void inputInvalidUserCityFormatIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(invalidCityFormat);}

    //invalid user address input data getter - invalid phone input format (special symbols only)
    public void invalidUserAddressInputDataInvalidPhoneFormatGetter(){

        validUserFirstName = "Andrew";
        validUserLastName = "Johnson";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        invalidPhoneFormat = "@$##@%$#";

        System.out.println("Invalid generated user new address data (invalid phone format): " + "\n");

        logger.info("Valid user address first name (invalid phone format): " + validUserFirstName);
        logger.info("Valid user address last name (invalid phone format): " + validUserLastName);
        logger.info("Valid user street (invalid phone format): " + validStreet);
        logger.info("Valid user zip code (invalid phone format): " + validZipCode);
        logger.info("Valid user city (invalid phone format): " + validCity);
        logger.info("Invalid user phone format: " + invalidPhoneFormat);

        System.out.println("\n");

    }

    //invalid user address data input method - invalid phone format
    public void inputInvalidUserPhoneFormatIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(invalidPhoneFormat);}

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
