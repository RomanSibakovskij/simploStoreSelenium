package cz.simploshop.demo;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddressesDashboardPage extends BasePage {

    //addresses dashboard page web elements
    @FindBy(xpath = "//main//section[1]//h1")
    private WebElement addressesDashboardPageTitle;
    @FindBy(xpath = "//main//button[@class='sim-btn sim-btn--c-primary sim-btn--s-large sim-btn--v-solid mt-8']")
    private WebElement addressesDashPageAddAddressButton;
    //default shipping address section
    @FindBy(xpath = "//div[@class='sim-card sim-card--lg flex justify-between gap-7 max-xl:flex-col']/div[1]/h2")
    private WebElement addressesDashPageShippingAddressSectionTitle;
    //default billing address section
    @FindBy(xpath = "//div[@class='sim-card sim-card--lg flex justify-between gap-7 max-xl:flex-col']/div[2]/h2")
    private WebElement addressesDashPageBillingAddressSectionTitle;
    //address addition success message (it's not preset in DOM, used for error throwing purpose)
    @FindBy(xpath = "//div[@role='success']")
    private WebElement addressesDashPageAddAddressSuccessMessage;

    public AddressesDashboardPage(WebDriver driver) {super(driver);}

    //click "Add new address" button method
    public void clickAddNewAddressButton() {
        Actions action = new Actions(driver);
        action.moveToElement(addressesDashPageAddAddressButton).click().perform();
    }

    //addresses dashboard page web element assert methods
    public String getAddressesDashPageTitle() {return addressesDashboardPageTitle.getText();}
    public String getAddressesDashPageShippingAddressSectionTitle() {return addressesDashPageShippingAddressSectionTitle.getText();}
    public String getAddressesDashPageBillingAddressSectionTitle() {return addressesDashPageBillingAddressSectionTitle.getText();}

    //addresses dashboard page address addition success message getter
    public String getAddressesDashPageAddAddressSuccessMsg() {return addressesDashPageAddAddressSuccessMessage.getText();}

    //addresses dashboard page web element assert methods
    public boolean isAddressesDashboardPageTitleDisplayed() {return addressesDashboardPageTitle.isDisplayed();}
    public boolean isAddressesDashboardPageAddAddressButtonDisplayed() {return addressesDashPageAddAddressButton.isDisplayed();}
    //default shipping address section
    public boolean isAddressesDashboardPageShippingAddressSectionTitleDisplayed() {return addressesDashPageShippingAddressSectionTitle.isDisplayed();}
    //default billing address section
    public boolean isAddressesDashboardPageBillingAddressSectionTitleDisplayed() {return addressesDashPageBillingAddressSectionTitle.isDisplayed();}

}
