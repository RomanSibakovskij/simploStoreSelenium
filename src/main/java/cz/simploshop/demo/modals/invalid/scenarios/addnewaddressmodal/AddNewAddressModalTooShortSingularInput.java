package cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressModalTooShortSingularInput extends BasePage{

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

    //invalid address input data - too short singular input
    private String tooShortUserFirstName;
    private String tooShortUserLastName;
    private String tooShortStreet;
    private int tooShortZipCode;
    private String tooShortCity;
    private String tooShortPhone;

    //valid address input data - for remaining inputs
    private String validUserFirstName;
    private String validUserLastName;
    private String validStreet;
    private int validZipCode;
    private String validCity;
    private String validPhone;

    public AddNewAddressModalTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid user address input data getter - too short first name (1 char)
    public void invalidUserAddressInputDataTooShortFirstNameGetter(){

        tooShortUserFirstName = "H";
        validUserLastName = "Last";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too short first name): " + "\n");

        logger.info("Too short user address first name: " + tooShortUserFirstName);
        logger.info("Valid user address last name (too short first name): " + validUserLastName);
        logger.info("Valid user street (too short first name): " + validStreet);
        logger.info("Valid user zip code (too short first name): " + validZipCode);
        logger.info("Valid user city (too short first name): " + validCity);
        logger.info("Valid user phone (too short first name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short first name
    public void inputTooShortUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(tooShortUserFirstName);}

    //invalid user address input data getter - too short last name (1 char)
    public void invalidUserAddressInputDataTooShortLastNameGetter(){

        validUserFirstName = "Robin";
        tooShortUserLastName = "B";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too short last name): " + "\n");

        logger.info("Valid user address first name (too short last name): " + validUserFirstName);
        logger.info("Too short user address last name: " + tooShortUserLastName);
        logger.info("Valid user street (too short last name): " + validStreet);
        logger.info("Valid user zip code (too short last name): " + validZipCode);
        logger.info("Valid user city (too short last name): " + validCity);
        logger.info("Valid user phone (too short last name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short last name
    public void inputTooShortUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(tooShortUserLastName);}

    //invalid user address input data getter - too short street (3 chars)
    public void invalidUserAddressInputDataTooShortStreetGetter(){

        validUserFirstName = "Frank";
        validUserLastName = "Stein";
        tooShortStreet = "4.F";
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too short street): " + "\n");

        logger.info("Valid user address first name (too short street): " + validUserFirstName);
        logger.info("Valid user address last name (too short street): " + validUserLastName);
        logger.info("Too short user street: " + tooShortStreet);
        logger.info("Valid user zip code (too short street): " + validZipCode);
        logger.info("Valid user city (too short street): " + validCity);
        logger.info("Valid user phone (too short street): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short street
    public void inputTooShortUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(tooShortStreet);}

    //invalid user address input data getter - too short zip code (4 digits)
    public void invalidUserAddressInputDataTooShortZipCodeGetter(){

        validUserFirstName = "Floyd";
        validUserLastName = "Kirk";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        tooShortZipCode = 6578;
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too short zip code): " + "\n");

        logger.info("Valid user address first name (too short zip code): " + validUserFirstName);
        logger.info("Valid user address last name (too short zip code): " + validUserLastName);
        logger.info("Valid user street (too short zip code): " + validStreet);
        logger.info("Too short user zip code: " + tooShortZipCode);
        logger.info("Valid user city (too short zip code): " + validCity);
        logger.info("Valid user phone (too short zip code): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short zip code
    public void inputTooShortUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(tooShortZipCode));}

    //invalid user address input data getter - too short city (2 chars)
    public void invalidUserAddressInputDataTooShortCityGetter(){

        validUserFirstName = "Franklin";
        validUserLastName = "Lincoln";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        tooShortCity = "Fl";
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too short city): " + "\n");

        logger.info("Valid user address first name (too short city): " + validUserFirstName);
        logger.info("Valid user address last name (too short city): " + validUserLastName);
        logger.info("Valid user street (too short city): " + validStreet);
        logger.info("Valid user zip code (too short city): " + validZipCode);
        logger.info("Too short user city: " + tooShortCity);
        logger.info("Valid user phone (too short city): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short city
    public void inputTooShortUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(tooShortCity);}

    //invalid user address input data getter - too short phone (2 digits)
    public void invalidUserAddressInputDataTooShortPhoneGetter(){

        validUserFirstName = "Andrew";
        validUserLastName = "Watson";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        tooShortPhone = "43";

        System.out.println("Invalid generated user new address data (too short phone): " + "\n");

        logger.info("Valid user address first name (too short phone): " + validUserFirstName);
        logger.info("Valid user address last name (too short phone): " + validUserLastName);
        logger.info("Valid user street (too short phone): " + validStreet);
        logger.info("Valid user zip code (too short phone): " + validZipCode);
        logger.info("Valid user city (too short phone): " + validCity);
        logger.info("Too short user phone: " + tooShortPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too short phone
    public void inputTooShortUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(tooShortPhone);}

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
