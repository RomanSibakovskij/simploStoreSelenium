package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartModal extends BasePage {

    //shopping cart modal web elements
    @FindBy(xpath = "//div[@class='sim-side-drawer__header']//h2")
    private WebElement shoppingCartModalTitle;
    @FindBy(xpath = "//div[@class='sim-side-drawer__header']//button")
    private WebElement shoppingCartCloseModalButton;
    @FindBy(xpath = "//div[@class='sim-text-large flex flex-col gap-3 text-balance text-center py-6']/span")
    private WebElement shoppingCartModalFreeShippingText;
    @FindBy(xpath = "//div[@class='sim-text-large flex flex-col gap-3 text-balance text-center py-6']/progress")
    private WebElement shoppingCartModalFreeShippingBar;
    //product table (list elements
    @FindBy(xpath = "//div[@class='sim-cart-item-card__img-box']/img")
    private List<WebElement> shoppingCartModalProductImgElements;
    @FindBy(xpath = "//div[@class='sim-cart-item-card__name-box']/a")
    private List<WebElement> shoppingCartModalProductNameLinkElements;
    @FindBy(xpath = "//div[@class='sim-cart-item-card__name-box']/div")
    private List<WebElement> shoppingCartModalProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200 mr-auto']/button[1]")
    private List<WebElement> shoppingCartModalProductQtyDecreaseButtonElements;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200 mr-auto']/input")
    private List<WebElement> shoppingCartModalProductQtyInputFieldElements;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200 mr-auto']/button[2]")
    private List<WebElement> shoppingCartModalProductQtyIncreaseButtonElements;
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-medium sim-btn--v-plain sim-menu-btn']")
    private List<WebElement> shoppingCartModalProductRemoveButtonElements;
    //summary section
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[1]/span[1]")
    private WebElement shoppingCartModalTotalSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[1]/span[2]")
    private WebElement shoppingCartModalWithoutShippingSubtext;
    @FindBy(xpath = "//div[@class='sim-cart-total__total']/div[2]")
    private WebElement shoppingCartModalTotalPrice;
    @FindBy(xpath = "//a[@class='inline-block sim-btn sim-btn--c-primary sim-btn--s-giant sim-btn--v-solid mb-24 mt-6 w-full']")
    private WebElement shoppingCartModalProceedToCartButton;
    //popup element
    @FindBy(xpath = "//p[@class='sim-h5 mx-auto my-20 max-w-sm text-center']")
    private WebElement shoppingCartModalNoProductsWarning;

    public ShoppingCartModal(WebDriver driver) {super(driver);}

    //click "Proceed to cart" button method
    public void clickProceedToCartButton() {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartModalProceedToCartButton).click().perform();
    }

    //shopping cart modal product data getters
    public List<String> getShoppingCartModalProductName() {return shoppingCartModalProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartModalProductUnitPrice() {return shoppingCartModalProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartModalProductQty(){return shoppingCartModalProductQtyInputFieldElements.stream().map(el -> el.getAttribute("value")).collect(Collectors.toList());}
    public String getShoppingCartModalTotalPrice() {return shoppingCartModalTotalPrice.getText();}

    //shopping cart modal text element getters

    public String getShoppingCartModalTitle() {
        String fullText = shoppingCartModalTitle.getText().trim();
        return fullText.replaceAll("\\d+$", "").trim();
    }

    //summary section
    public String getShoppingCartModalTotalSubtext() {return shoppingCartModalTotalSubtext.getText();}
    public String getShoppingCartModalWithoutShippingSubtext() {return shoppingCartModalWithoutShippingSubtext.getText();}

    //no products in cart warning message getter
    public String getShoppingCartModalNoProductWarning() {return shoppingCartModalNoProductsWarning.getText();}

    //shopping cart modal web element assert methods
    public boolean isShoppingCartModalTitleDisplayed() {return shoppingCartModalTitle.isDisplayed();}
    public boolean isShoppingCartCloseModalButtonDisplayed() {return shoppingCartCloseModalButton.isDisplayed();}
    public boolean isShoppingCartModalFreeShippingTextDisplayed() {return shoppingCartModalFreeShippingText.isDisplayed();}
    public boolean isShoppingCartModalFreeShippingBarDisplayed() {return shoppingCartModalFreeShippingBar.isDisplayed();}
    //product table

    public boolean isShoppingCartModalProductImgDisplayed() {
        return shoppingCartModalProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductNameDisplayed() {
        return shoppingCartModalProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductUnitPriceDisplayed() {
        return shoppingCartModalProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductQtyDecreaseButtonDisplayed() {
        return shoppingCartModalProductQtyDecreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductQtyInputFieldDisplayed() {
        return shoppingCartModalProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductQtyIncreaseButtonDisplayed() {
        return shoppingCartModalProductQtyIncreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartModalProductRemoveButtonDisplayed() {
        return shoppingCartModalProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //summary section
    public boolean isShoppingCartModalTotalSubtextDisplayed() {return shoppingCartModalTotalSubtext.isDisplayed();}
    public boolean isShoppingCartModalWithoutShippingSubtextDisplayed() {return shoppingCartModalWithoutShippingSubtext.isDisplayed();}
    public boolean isShoppingCartModalTotalPriceDisplayed() {return shoppingCartModalTotalPrice.isDisplayed();}
    public boolean isShoppingCartModalProceedToCartButtonDisplayed() {return shoppingCartModalProceedToCartButton.isDisplayed();}

}
