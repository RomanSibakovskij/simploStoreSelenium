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

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
