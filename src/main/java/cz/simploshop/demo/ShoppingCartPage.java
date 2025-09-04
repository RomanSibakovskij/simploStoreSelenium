package cz.simploshop.demo;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    //breadcrumb
    @FindBy(xpath = "//div[@class='sim-cart-phase-progress']//a")
    private List<WebElement> pageBreadcrumbStepElements;
    //main
    @FindBy(xpath = "//div[@class='sim-text-large flex flex-col gap-3 text-balance text-center mt-8 sm:mt-24']/span")
    private WebElement shoppingCartPageFreeShippingText;
    @FindBy(xpath = "//div[@class='sim-text-large flex flex-col gap-3 text-balance text-center mt-8 sm:mt-24']/progress")
    private WebElement shoppingCartPageFreeShippingBar;
    //product table
    @FindBy(xpath = "//div[@class='sim-cart-list__head']/div[1]")
    private WebElement shoppingCartPageProductTableProductSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-list__head']/div[3]")
    private WebElement shoppingCartPageProductTableAvailabilitySubtext;
    @FindBy(xpath = "//div[@class='sim-cart-list__head']/div[4]")
    private WebElement shoppingCartPageProductTableUnitPriceSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-list__head']/div[5]")
    private WebElement shoppingCartPageProductTableQuantitySubtext;
    @FindBy(xpath = "//div[@class='sim-cart-list__head']/div[6]")
    private WebElement shoppingCartPageProductTableTotalPriceSubtext;
    //list elements
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//img")
    private List<WebElement> shoppingCartPageProductTableProductImgElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//a")
    private List<WebElement> shoppingCartPageProductTableProductNameLinkElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//div[@class='sim-cart-list-item__availability text-success-600']")
    private List<WebElement> shoppingCartPageProductTableProductCountElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//div[@class='sim-cart-list-item__price']")
    private List<WebElement> shoppingCartPageProductTableProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//button[1]")
    private List<WebElement> shoppingCartPageProductTableProductQtyDecreaseBtnElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//input")
    private List<WebElement> shoppingCartPageProductTableProductQtyInputFieldElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//button[2]")
    private List<WebElement> shoppingCartPageProductTableProductQtyIncreaseBtnElements;
    @FindBy(xpath = "//div[@class='sim-cart-list__body']//div[@class='sim-cart-list-item__total']")
    private List<WebElement> shoppingCartPageProductTableProductTotalPriceElements;
    //singular elements
    @FindBy(xpath = "//div[@class='sim-cart-list-footer']//button[@class='sim-btn sim-btn--c-primary sim-btn--s-medium sim-btn--v-outlined whitespace-nowrap']")
    private WebElement shoppingCartPageInputDiscountCodeButton;
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[1]")
    private WebElement shoppingCartPageProductTableTotalOrderPriceSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[2]")
    private WebElement shoppingCartPageProductTableTotalOrderPrice;
    @FindBy(xpath = "//a[@class='inline-block sim-btn sim-btn--c-primary sim-btn--s-large sim-btn--v-solid w-full']")
    private WebElement shoppingCartPageShipAndPaymentButton;

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //input set product quantity in shopping cart method
    public void inputSetProductQty(int index, int quantity){
        WebElement targetQtyInputField = shoppingCartPageProductTableProductQtyInputFieldElements.get(index);
        targetQtyInputField.clear();
        targetQtyInputField.sendKeys(String.valueOf(quantity));
    }

    //click "Shipping and payment" button method
    public void clickShipAndPaymentButton() {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartPageShipAndPaymentButton).click().perform();
    }

    //shopping cart product data getters
    public List<String> getShoppingCartPageProductTableProductName(){return shoppingCartPageProductTableProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductTableProductCount(){return shoppingCartPageProductTableProductCountElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductTableProductQuantity(){return shoppingCartPageProductTableProductQtyInputFieldElements.stream().map(el -> el.getAttribute("value")).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductTableProductTotalPrice(){return shoppingCartPageProductTableProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public String getShoppingCartPageProductTableTotalOrderPrice(){return shoppingCartPageProductTableTotalOrderPrice.getText();}

    //shopping cart text element getters
    public String getShoppingCartPageFreeShippingText(){return shoppingCartPageFreeShippingText.getText();}
    //product table
    public String getShoppingCartPageProductTableProductSubtext(){return shoppingCartPageProductTableProductSubtext.getText();}
    public String getShoppingCartPageProductTableAvailabilitySubtext(){return shoppingCartPageProductTableAvailabilitySubtext.getText();}
    public String getShoppingCartPageProductTableUnitPriceSubtext(){return shoppingCartPageProductTableUnitPriceSubtext.getText();}
    public String getShoppingCartPageProductTableQuantitySubtext(){return shoppingCartPageProductTableQuantitySubtext.getText();}
    public String getShoppingCartPageProductTableTotalPriceSubtext(){return shoppingCartPageProductTableTotalPriceSubtext.getText();}
    public String getShoppingCartPageProductTableTotalOrderPriceSubtext(){return shoppingCartPageProductTableTotalOrderPriceSubtext.getText();}

    //shopping cart page web element assert methods
    //breadcrumb
    public boolean isPageBreadcrumbStepDisplayed(){
        return pageBreadcrumbStepElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //main
    public boolean isShoppingCartPageFreeShippingTextDisplayed(){return shoppingCartPageFreeShippingText.isDisplayed();}
    public boolean isShoppingCartPageFreeShippingBarDisplayed(){return shoppingCartPageFreeShippingBar.isDisplayed();}
    //product table
    public boolean isShoppingCartPageProductTableProductSubtextDisplayed(){return shoppingCartPageProductTableProductSubtext.isDisplayed();}
    public boolean isShoppingCartPageProductTableAvailabilitySubtextDisplayed(){return shoppingCartPageProductTableAvailabilitySubtext.isDisplayed();}
    public boolean isShoppingCartPageProductTableUnitPriceSubtextDisplayed(){return shoppingCartPageProductTableUnitPriceSubtext.isDisplayed();}
    public boolean isShoppingCartPageProductTableQuantitySubtextDisplayed(){return shoppingCartPageProductTableQuantitySubtext.isDisplayed();}
    public boolean isShoppingCartPageProductTableTotalPriceSubtextDisplayed(){return shoppingCartPageProductTableTotalPriceSubtext.isDisplayed();}

    //list elements
    public boolean isShoppingCartPageProductTableProductImgDisplayed(){
        return shoppingCartPageProductTableProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductNameLinkDisplayed(){
        return shoppingCartPageProductTableProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductCountDisplayed(){
        return shoppingCartPageProductTableProductCountElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductUnitPriceDisplayed(){
        return shoppingCartPageProductTableProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductQtyDecreaseBtnDisplayed(){
        return shoppingCartPageProductTableProductQtyDecreaseBtnElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductQtyInputFieldDisplayed(){
        return shoppingCartPageProductTableProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductQtyIncreaseButtonDisplayed(){
        return shoppingCartPageProductTableProductQtyIncreaseBtnElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTableProductTotalPriceDisplayed(){
        return shoppingCartPageProductTableProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //singular elements
    public boolean isShoppingCartPageInputDiscountCodeButtonDisplayed(){return shoppingCartPageInputDiscountCodeButton.isDisplayed();}
    public boolean isShoppingCartPageProductTableTotalOrderPriceSubtextDisplayed(){return shoppingCartPageProductTableTotalOrderPriceSubtext.isDisplayed();}
    public boolean isShoppingCartPageProductTableTotalOrderPriceDisplayed(){return shoppingCartPageProductTableTotalOrderPrice.isDisplayed();}
    public boolean isShoppingCartPageShipAndPaymentButtonDisplayed(){return shoppingCartPageShipAndPaymentButton.isDisplayed();}

}
