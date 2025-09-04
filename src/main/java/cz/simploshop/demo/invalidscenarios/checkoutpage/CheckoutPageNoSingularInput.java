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

    public CheckoutPageNoSingularInput(WebDriver driver) {super(driver);}


}
