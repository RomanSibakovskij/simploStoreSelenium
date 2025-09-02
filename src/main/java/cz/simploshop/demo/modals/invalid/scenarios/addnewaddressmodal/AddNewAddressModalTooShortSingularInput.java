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

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
