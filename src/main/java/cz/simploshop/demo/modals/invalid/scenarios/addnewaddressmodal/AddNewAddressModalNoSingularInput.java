package cz.simploshop.demo.modals.invalid.scenarios.addnewaddressmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressModalNoSingularInput extends BasePage{

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

    //invalid address input data - no singular input
    private String noUserFirstName;
    private String noUserLastName;
    private String noStreet;
    private String noZipCode;
    private String noCity;
    private String noPhone;

    //valid address input data - for remaining inputs
    private String validUserFirstName;
    private String validUserLastName;
    private String validStreet;
    private int validZipCode;
    private String validCity;
    private String validPhone;

    public AddNewAddressModalNoSingularInput(WebDriver driver) {super(driver);}

    //invalid user address input data getter - no first name
    public void invalidUserAddressInputDataNoFirstNameGetter(){

        noUserFirstName = "";
        validUserLastName = "Jameson";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (no first name): " + "\n");

        logger.info("No user address first name: " + noUserFirstName);
        logger.info("Valid user address last name (no first name): " + validUserLastName);
        logger.info("Valid user street (no first name): " + validStreet);
        logger.info("Valid user zip code (no first name): " + validZipCode);
        logger.info("Valid user city (no first name): " + validCity);
        logger.info("Valid user phone (no first name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no first name
    public void inputNoUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(noUserFirstName);}

    //invalid user address input data getter - no last name
    public void invalidUserAddressInputDataNoLastNameGetter(){

        validUserFirstName = "Kyle";
        noUserLastName = "";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (no last name): " + "\n");

        logger.info("Valid user address first name (no last name): " + validUserFirstName);
        logger.info("No user address last name: " + noUserLastName);
        logger.info("Valid user street (no last name): " + validStreet);
        logger.info("Valid user zip code (no last name): " + validZipCode);
        logger.info("Valid user city (no last name): " + validCity);
        logger.info("Valid user phone (no last name): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no last name
    public void inputNoUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(noUserLastName);}

    //invalid user address input data getter - no street
    public void invalidUserAddressInputDataNoStreetGetter(){

        validUserFirstName = "Jane";
        validUserLastName = "O'Connor";
        noStreet = "";
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (no street): " + "\n");

        logger.info("Valid user address first name (no street): " + validUserFirstName);
        logger.info("Valid user address last name (no street): " + validUserLastName);
        logger.info("No user street: " + noStreet);
        logger.info("Valid user zip code (no street): " + validZipCode);
        logger.info("Valid user city (no street): " + validCity);
        logger.info("Valid user phone (no street): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no street
    public void inputNoUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(noStreet);}

    //invalid user address input data getter - no zip code
    public void invalidUserAddressInputDataNoZipCodeGetter(){

        validUserFirstName = "Thomas";
        validUserLastName = "Kane";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        noZipCode = "";
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (no zip code): " + "\n");

        logger.info("Valid user address first name (no zip code): " + validUserFirstName);
        logger.info("Valid user address last name (no zip code): " + validUserLastName);
        logger.info("Valid user street (no zip code): " + validStreet);
        logger.info("No user zip code: " + noZipCode);
        logger.info("Valid user city (no zip code): " + validCity);
        logger.info("Valid user phone (no zip code): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no zip code
    public void inputNoUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(noZipCode);}

    //invalid user address input data getter - no city
    public void invalidUserAddressInputDataNoCityGetter(){

        validUserFirstName = "Katherine";
        validUserLastName = "Stone";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        noCity = "";
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid generated user new address data (no city): " + "\n");

        logger.info("Valid user address first name (no city): " + validUserFirstName);
        logger.info("Valid user address last name (no city): " + validUserLastName);
        logger.info("Valid user street (no city): " + validStreet);
        logger.info("Valid user zip code (no city): " + validZipCode);
        logger.info("No user city: " + noCity);
        logger.info("Valid user phone (no city): " + validPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no city
    public void inputNoUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(noCity);}

    //invalid user address input data getter - no phone
    public void invalidUserAddressInputDataNoPhoneGetter(){

        validUserFirstName = "Bill";
        validUserLastName = "Leyte";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        noPhone = "";

        System.out.println("Invalid generated user new address data (no phone): " + "\n");

        logger.info("Valid user address first name (no phone): " + validUserFirstName);
        logger.info("Valid user address last name (no phone): " + validUserLastName);
        logger.info("Valid user street (no phone): " + validStreet);
        logger.info("Valid user zip code (no phone): " + validZipCode);
        logger.info("Valid user city (no phone): " + validCity);
        logger.info("No user phone: " + noPhone);

        System.out.println("\n");

    }

    //invalid user address data input method - no phone
    public void inputNoUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(noPhone);}

    //valid user address data input methods - for remaining inputs
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

}
