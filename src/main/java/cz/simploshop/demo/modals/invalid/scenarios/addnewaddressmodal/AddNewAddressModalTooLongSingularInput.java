package cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressModalTooLongSingularInput extends BasePage{

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

    //invalid address input data - too long singular input
    private String tooLongUserFirstName;
    private String tooLongUserLastName;
    private String tooLongStreet;
    private int tooLongZipCode;

    //valid address input data - for remaining inputs
    private String validUserFirstName;
    private String validUserLastName;
    private String validStreet;
    private int validZipCode;
    private String validCity;
    private String validPhone;

    public AddNewAddressModalTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user address input data getter - too long first name (100 chars)
    public void invalidUserAddressInputDataTooLongFirstNameGetter(){

        tooLongUserFirstName = "Hfddsgdsfssdsfgdhjfg Dfddsgdsfssdsfgdhjfghsdrtuioikjfdgsdfhfhsfdsfgdfsdcvfgghyukghfgdfdsfvfdbcvdfgfd";
        validUserLastName = "Lincoln";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too long first name): " + "\n");

        logger.info("Too long user address first name: " + tooLongUserFirstName);
        logger.info("Valid user address last name (too long first name): " + validUserLastName);
        logger.info("Valid user street (too long first name): " + validStreet);
        logger.info("Valid user zip code (too long first name): " + validZipCode);
        logger.info("Valid user city (too long first name): " + validCity);
        logger.info("Valid user phone (too long first name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too long first name
    public void inputTooLongUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(tooLongUserFirstName);}

    //invalid user address input data getter - too long last name (100 chars)
    public void invalidUserAddressInputDataTooLongLastNameGetter(){

        validUserFirstName = "Francis";
        tooLongUserLastName = "Dfddsgdsfssdsfgdhjfghsdrtuioikjfdgsdfhfhsfdsfgdfsdcvfgghyukghfgdfdsfvfdbcvdfgfddfdsgdfdfdfdfdfdffdfd";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too long last name): " + "\n");

        logger.info("Valid user address first name (too long last name): " + validUserFirstName);
        logger.info("Too long user address last name: " + tooLongUserLastName);
        logger.info("Valid user street (too long last name): " + validStreet);
        logger.info("Valid user zip code (too long last name): " + validZipCode);
        logger.info("Valid user city (too long last name): " + validCity);
        logger.info("Valid user phone (too long last name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too long last name
    public void inputTooLongUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(tooLongUserLastName);}

    //invalid user address input data getter - too long street (100 chars)
    public void invalidUserAddressInputDataTooLongStreetGetter(){

        validUserFirstName = "Andy";
        validUserLastName = "Goode";
        tooLongStreet = TestDataGenerator.generateRandomAddress(100);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too long street): " + "\n");

        logger.info("Valid user address first name (too long street): " + validUserFirstName);
        logger.info("Valid user address last name (too long street): " + validUserLastName);
        logger.info("Too long user street: " + tooLongStreet);
        logger.info("Valid user zip code (too long street): " + validZipCode);
        logger.info("Valid user city (too long street): " + validCity);
        logger.info("Valid user phone (too long street): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too long street
    public void inputTooLongUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(tooLongStreet);}

    //invalid user address input data getter - too long zip code (6 digits)
    public void invalidUserAddressInputDataTooLongZipCodeGetter(){

        validUserFirstName = "Mandy";
        validUserLastName = "Goode";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        tooLongZipCode = 226578;
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (too long zip code): " + "\n");

        logger.info("Valid user address first name (too long zip code): " + validUserFirstName);
        logger.info("Valid user address last name (too long zip code): " + validUserLastName);
        logger.info("Valid user street (too long zip code): " + validStreet);
        logger.info("Too long user zip code: " + tooLongZipCode);
        logger.info("Valid user city (too long zip code): " + validCity);
        logger.info("Valid user phone (too long zip code): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - too long zip code
    public void inputTooLongUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(tooLongZipCode));}

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
