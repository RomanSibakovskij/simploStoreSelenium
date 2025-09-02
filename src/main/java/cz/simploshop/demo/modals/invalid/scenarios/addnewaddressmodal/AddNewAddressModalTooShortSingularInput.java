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

    public AddNewAddressModalTooShortSingularInput(WebDriver driver) {super(driver);}


}
