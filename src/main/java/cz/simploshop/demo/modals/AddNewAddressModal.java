package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
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

    public AddNewAddressModal(WebDriver driver) {super(driver);}

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
