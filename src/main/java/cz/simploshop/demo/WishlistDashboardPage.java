package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class WishlistDashboardPage extends BasePage {

    //wishlist dashboard page web elements
    @FindBy(xpath = "//h1")
    private WebElement wishlistDashboardPageTitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-product-list']//a[@class='sim-product-card__content']")
    private List<WebElement> wishlistDashboardPageProductCardElements;
    @FindBy(xpath = "//div[@class='sim-product-list']//img")
    private List<WebElement> wishlistDashboardPageProductImgElements;
    @FindBy(xpath = "//div[@class='sim-product-list']//span[@class='sim-product-card__title']")
    private List<WebElement> wishlistDashboardPageProductNameElements;
    @FindBy(xpath = "//div[@class='sim-product-list']//div[@class='sim-product-price__price']")
    private List<WebElement> wishlistDashboardPageProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='sim-product-list']//button[@class='sim-btn sim-btn--c-primary sim-btn--s-large sim-btn--v-outlined sim-btn--dense h-11 w-full']")
    private List<WebElement> wishlistDashboardPageProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@class='sim-product-list']//button[@class='sim-btn sim-btn--c-basic--dark sim-btn--s-small sim-btn--v-plain sim-btn--square text-simplo']")
    private List<WebElement> wishlistDashboardPageProductAddToWishlistButtonElements;
    @FindBy(xpath = "//div[@class='sim-product-card__actions']/a")
    private List<WebElement> wishlistDashboardPageProductDetailsButtonElements;

    public WishlistDashboardPage(WebDriver driver) {super(driver);}

    //click set products "Add to cart" button method
    public void clickSetProductsAddToCartButton(int index) {
        WebElement setProductAddToCartButton = wishlistDashboardPageProductAddToCartButtonElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setProductAddToCartButton).click().perform();
    }

    //wishlist dashboard page data getters
    public List<String> getWishlistDashboardProductName(){return wishlistDashboardPageProductNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistDashboardProductUnitPrice(){return wishlistDashboardPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //wishlist dashboard page text getter
    public String getWishlistDashboardPageTitle() {return wishlistDashboardPageTitle.getText();}

    //wishlist dashboard page web element assert methods
    public boolean isWishlistDashboardPageTitleDisplayed() {return wishlistDashboardPageTitle.isDisplayed();}

    public boolean isWishlistDashboardPageCardDisplayed() {
        return wishlistDashboardPageProductCardElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistDashboardPageImgDisplayed() {
        return wishlistDashboardPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistDashboardPageNameDisplayed() {
        return wishlistDashboardPageProductNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistDashboardPageUnitPriceDisplayed() {
        return wishlistDashboardPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistDashboardPageAddToWishlistButtonDisplayed() {
        return wishlistDashboardPageProductAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
