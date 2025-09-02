package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.*;

public class AddNewAddressModal extends BasePage{

    //add new address modal web elements
    @FindBy(xpath = "//div[@class='sim-modal__header']//h2")
    private WebElement addNewAddressModalTitle;
    @FindBy(xpath = "//div[@class='sim-modal__header']//button")
    private WebElement addNewAddressCloseModalButton;
    //input form
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[1]//label")
    private WebElement addNewAddressModalFirstNameSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[1]//input")
    private WebElement addNewAddressModalFirstNameInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[2]//label")
    private WebElement addNewAddressModalLastNameSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][1]/div[2]//input")
    private WebElement addNewAddressModalLastNameInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][2]//label")
    private WebElement addNewAddressModalStreetSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][2]//input")
    private WebElement addNewAddressModalStreetInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[1]//label")
    private WebElement addNewAddressModalZipCodeSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[1]//input")
    private WebElement addNewAddressModalZipCodeInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[2]//label")
    private WebElement addNewAddressModalCitySubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][3]/div[2]//input")
    private WebElement addNewAddressModalCityInputField;
    @FindBy(xpath = "//form/div[4]/div/div[1]/label")
    private WebElement addNewAddressModalCountryCodeSubtext;
    @FindBy(xpath = "//form/div[4]//select")
    private WebElement addNewAddressModalCountryCodeDropdownMenu;//this element doesn't have any options, since it's required, it's impossible to complete a valid address addition test
    @FindBy(xpath = "//form/div[4]/div/div[2]/label")
    private WebElement addNewAddressModalPhoneSubtext;
    @FindBy(xpath = "//form/div[4]//input")
    private WebElement addNewAddressModalPhoneInputField;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][5]//label")
    private WebElement addNewAddressModalCountrySubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][5]//select")
    private WebElement addNewAddressModalCountryDropdownMenu;
    //list elements
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][5]//select/option")
    private List<WebElement> addNewAddressModalCountryOptionElements;
    //checkbox elements
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row sim-form-row--indented']//label")
    private WebElement addNewAddressModalAddCompanyDetailsSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row sim-form-row--indented']//input")
    private WebElement addNewAddressModalAddCompanyDetailsCheckbox;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][6]//label")
    private WebElement addNewAddressModalDefaultBillAddressSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][6]//input")
    private WebElement addNewAddressModalDefaultBillAddressCheckbox;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][7]//label")
    private WebElement addNewAddressModalDefaultShipAddressSubtext;
    @FindBy(xpath = "//div[@class='sim-modal__content']//div[@class='sim-form-row'][7]//input")
    private WebElement addNewAddressModalDefaultShipAddressCheckbox;
    @FindBy(xpath = "//div[@class='sim-modal__content']//form//button")
    private WebElement addNewAddressModalAddAddressButton;
    //invalid singular input error message
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement addNewAddressModalInvalidSingularInputError;

    //valid address input data
    private String validUserFirstName;
    private String validUserLastName;
    private String validStreet;
    private int validZipCode;
    private String validCity;
    private String validPhone;

    public AddNewAddressModal(WebDriver driver) {super(driver);}

    //valid user address input data getter
    public void validUserAddressInputDataGetter(){

        validUserFirstName = "George";
        validUserLastName = "Thompson";
        validStreet = TestDataGenerator.generateRandomAddress(8);
        validZipCode = TestDataGenerator.getRandomPostalCode();
        validCity = TestDataGenerator.getRandomCity();
        validPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Valid generated user new address data: " + "\n");

        logger.info("Valid user address first name: " + validUserFirstName);
        logger.info("Valid user address last name: " + validUserLastName);
        logger.info("Valid user street: " + validStreet);
        logger.info("Valid user zip code: " + validZipCode);
        logger.info("Valid user city: " + validCity);
        logger.info("Valid user phone: " + validPhone);

        System.out.println("\n");

    }

    //valid user address data input methods
    public void inputValidUserFirstNameIntoNewAddressModalFirstNameInputField(){addNewAddressModalFirstNameInputField.sendKeys(validUserFirstName);}
    public void inputValidUserLastNameIntoNewAddressModalLastNameInputField(){addNewAddressModalLastNameInputField.sendKeys(validUserLastName);}
    public void inputValidUserStreetIntoNewAddressModalStreetInputField(){addNewAddressModalStreetInputField.sendKeys(validStreet);}
    public void inputValidUserZipCodeIntoNewAddressModalZipCodeInputField(){addNewAddressModalZipCodeInputField.sendKeys(String.valueOf(validZipCode));}
    public void inputValidUserCityIntoNewAddressModalCityInputField(){addNewAddressModalCityInputField.sendKeys(validCity);}
    public void inputValidUserPhoneIntoNewAddressModalPhoneInputField(){addNewAddressModalPhoneInputField.sendKeys(validPhone);}

    //click country code dropdown menu method
    public void clickCountryCodeDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(addNewAddressModalCountryCodeDropdownMenu).click().perform();
    }

    //click country dropdown menu method
    public void clickCountryDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(addNewAddressModalCountryDropdownMenu).click().perform();
    }

    //select set country option method
    public void selectSetCountryOption(int index){addNewAddressModalCountryOptionElements.get(index).click();}

    //click "Add address" button method
    public void clickAddAddressButton(){
        Actions action = new Actions(driver);
        action.moveToElement(addNewAddressModalAddAddressButton).click().perform();
    }

    //add new address modal text element getters
    public String getAddNewAddressModalTitle() {return addNewAddressModalTitle.getText();}
    //input form
    public String getAddNewAddressModalFirstNameSubtext() {return addNewAddressModalFirstNameSubtext.getText();}
    public String getAddNewAddressModalLastNameSubtext() {return addNewAddressModalLastNameSubtext.getText();}
    public String getAddNewAddressModalStreetSubtext() {return addNewAddressModalStreetSubtext.getText();}
    public String getAddNewAddressModalZipCodeSubtext() {return addNewAddressModalZipCodeSubtext.getText();}
    public String getAddNewAddressModalCitySubtext() {return addNewAddressModalCitySubtext.getText();}
    public String getAddNewAddressModalCountryCodeSubtext() {return addNewAddressModalCountryCodeSubtext.getText();}
    public String getAddNewAddressModalPhoneSubtext() {return addNewAddressModalPhoneSubtext.getText();}
    public String getAddNewAddressModalCountrySubtext() {return addNewAddressModalCountrySubtext.getText();}
    //checkbox elements
    public String getAddNewAddressModalAddCompanyDetailsSubtext() {return addNewAddressModalAddCompanyDetailsSubtext.getText();}
    public String getAddNewAddressModalDefaultBillAddressSubtext() {return addNewAddressModalDefaultBillAddressSubtext.getText();}
    public String getAddNewAddressModalDefaultShipAddressSubtext() {return addNewAddressModalDefaultShipAddressSubtext.getText();}

    //add new address modal singular input error message getter
    public String getAddNewAddressModalSingularInputErrorMsg() {return addNewAddressModalInvalidSingularInputError.getText();}

    //add new address modal web element assert methods
    public boolean isAddNewAddressModalTitleDisplayed() {return addNewAddressModalTitle.isDisplayed();}
    public boolean isAddNewAddressModalCloseButtonDisplayed() {return addNewAddressCloseModalButton.isDisplayed();}
    //input form
    public boolean isAddNewAddressModalFirstNameSubtextDisplayed() {return addNewAddressModalFirstNameSubtext.isDisplayed();}
    public boolean isAddNewAddressModalFirstNameInputFieldDisplayed() {return addNewAddressModalFirstNameInputField.isDisplayed();}
    public boolean isAddNewAddressModalLastNameSubtextDisplayed() {return addNewAddressModalLastNameSubtext.isDisplayed();}
    public boolean isAddNewAddressModalLastNameInputFieldDisplayed() {return addNewAddressModalLastNameInputField.isDisplayed();}
    public boolean isAddNewAddressModalStreetSubtextDisplayed() {return addNewAddressModalStreetSubtext.isDisplayed();}
    public boolean isAddNewAddressModalStreetInputFieldDisplayed() {return addNewAddressModalStreetInputField.isDisplayed();}
    public boolean isAddNewAddressModalZipCodeSubtextDisplayed() {return addNewAddressModalZipCodeSubtext.isDisplayed();}
    public boolean isAddNewAddressModalZipCodeInputFieldDisplayed() {return addNewAddressModalZipCodeInputField.isDisplayed();}
    public boolean isAddNewAddressModalCitySubtextDisplayed() {return addNewAddressModalCitySubtext.isDisplayed();}
    public boolean isAddNewAddressModalCityInputFieldDisplayed() {return addNewAddressModalCityInputField.isDisplayed();}
    public boolean isAddNewAddressModalCountryCodeSubtextDisplayed() {return addNewAddressModalCountryCodeSubtext.isDisplayed();}
    public boolean isAddNewAddressModalCountryCodeDropdownMenuDisplayed() {return addNewAddressModalCountryCodeDropdownMenu.isDisplayed();}
    public boolean isAddNewAddressModalPhoneSubtextDisplayed() {return addNewAddressModalPhoneSubtext.isDisplayed();}
    public boolean isAddNewAddressModalPhoneInputFieldDisplayed() {return addNewAddressModalPhoneInputField.isDisplayed();}
    public boolean isAddNewAddressModalCountrySubtextDisplayed() {return addNewAddressModalCountrySubtext.isDisplayed();}
    public boolean isAddNewAddressModalCountryDropdownMenuDisplayed() {return addNewAddressModalCountryDropdownMenu.isDisplayed();}
    //checkbox elements
    public boolean isAddNewAddressModalAddCompanyDetailsSubtextDisplayed() {return addNewAddressModalAddCompanyDetailsSubtext.isDisplayed();}
    public boolean isAddNewAddressModalAddCompanyDetailsCheckboxDisplayed() {return addNewAddressModalAddCompanyDetailsCheckbox.isDisplayed();}
    public boolean isAddNewAddressModalDefaultBillAddressSubtextDisplayed() {return addNewAddressModalDefaultBillAddressSubtext.isDisplayed();}
    public boolean isAddNewAddressModalDefaultBillAddressCheckboxDisplayed() {return addNewAddressModalDefaultBillAddressCheckbox.isDisplayed();}
    public boolean isAddNewAddressModalDefaultShipAddressSubtextDisplayed() {return addNewAddressModalDefaultShipAddressSubtext.isDisplayed();}
    public boolean isAddNewAddressModalDefaultShipAddressCheckboxDisplayed() {return addNewAddressModalDefaultShipAddressCheckbox.isDisplayed();}
    public boolean isAddNewAddressModalAddAddressButtonDisplayed() {return addNewAddressModalAddAddressButton.isDisplayed();}

}
