package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    //home page web elements
    //carousel section
    @FindBy(xpath = "//section[@class='relative']//div[@class='sim-banner__navigation']/button[1]")
    private WebElement homePageCarouselImgScrollLeftButton;
    @FindBy(xpath = "//section[@class='relative']//div[@class='sim-banner__navigation']/button[2]")
    private WebElement homePageCarouselImgScrollRightButton;
    //list elements
    @FindBy(xpath = "//section[@class='relative']//button[@class='sim-swiper__pagination-btn']")
    private List <WebElement> homePageCarouselPaginationButtonElements;
    @FindBy(xpath = "//section[@class='relative']//img")
    private List <WebElement> homePageCarouselImgElements;
    //buy for room category section
    @FindBy(xpath = "//div[@class='sim-cc cpt-normal cpr-normal cpb-normal cpl-normal cw-normal']/h2")
    private WebElement homePageRoomCategorySectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-cc cpt-normal cpr-normal cpb-normal cpl-normal cw-normal']//img")
    private List <WebElement> homePageRoomCategoryImgElements;
    @FindBy(xpath = "//div[@class='sim-cc cpt-normal cpr-normal cpb-normal cpl-normal cw-normal']//a")
    private List <WebElement> homePageRoomCategoryNameLinkElements;
    //chosen products section
    @FindBy(xpath = "//div[@class='sim-cc cpt-large cpr-normal cpb-normal cpl-normal cw-normal']/h2")
    private WebElement homePageChosenProductsSectionTitle;
    @FindBy(xpath = "//div[@class='sim-carousel__navigation']/button[1]")
    private WebElement homePageChosenProductsScrollLeftButton;
    @FindBy(xpath = "//div[@class='sim-carousel__navigation']/button[2]")
    private WebElement homePageChosenProductsScrollRightButton;
    //list elements
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//button[@aria-label='Přidat do oblíbených']")
    private List <WebElement> homePageRoomChosenProductAddToWishlistButtonElements;
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//img")
    private List <WebElement> homePageRoomChosenProductImgElements;
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//span[@class='sim-product-card__title']")
    private List <WebElement> homePageRoomChosenProductNameElements;
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//div[@class='sim-product-price__price']")
    private List <WebElement> homePageRoomChosenProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//div[@class='sim-product-card__actions']/button")
    private List <WebElement> homePageRoomChosenProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@class='sim-swiper sim-swiper--carousel']//div[@class='sim-product-card']//div[@class='sim-product-card__actions']/a")
    private List <WebElement> homePageRoomChosenProductDetailsButtonElements;
    //garden furniture section
    @FindBy(xpath = "//div[@class='sim-product-set-card']//img")
    private WebElement homePageGardenFurnitureImg;
    @FindBy(xpath = "//div[@class='sim-product-set-card']//h3")
    private WebElement homePageGardenFurnitureTitle;
    @FindBy(xpath = "//div[@class='sim-product-set-card']//a")
    private WebElement homePageGardenFurnitureButton;
    //latest articles section
    @FindBy(xpath = "//div[@class='sim-cc cpt-none cpr-normal cpb-normal cpl-normal cw-normal']/h2")
    private WebElement homePageLatestArticleSectionTitle;
    //list elements
    @FindBy(xpath = "//section[@class='sim-blog-grid']//img[@class='size-full']")
    private List <WebElement> homePageLatestArticleImgElements;
    @FindBy(xpath = "//section[@class='sim-blog-grid']//div[@class='sim-article-card__content']/h2")
    private List <WebElement> homePageLatestArticleTitleElements;
    @FindBy(xpath = "//section[@class='sim-blog-grid']//div[@class='sim-article-card__content']/div")
    private List <WebElement> homePageLatestArticleTextElements;
    @FindBy(xpath = "//section[@class='sim-blog-grid']//div[@class='sim-article-card__author']/img")
    private List <WebElement> homePageLatestArticleUserProfileImgElements;
    @FindBy(xpath = "//section[@class='sim-blog-grid']//div[@class='sim-article-card__author']")
    private List <WebElement> homePageLatestArticleUsernameElements;
    @FindBy(xpath = "//section[@class='sim-blog-grid']//span[@class='sim-article-card__time sim-eyebrow']")
    private List <WebElement> homePageLatestArticleTimePostedElements;

    public HomePage(WebDriver driver) {super(driver);}

    //click chosen products section scroll left button method
    public void clickChosenProductScrollLeftButton() {
        Actions action = new Actions(driver);
        action.moveToElement(homePageChosenProductsScrollLeftButton).click().perform();
    }

    //click set chosen product "Add to cart" button method
    public void clickSetChosenProductAddToCartButton(int index) {
        WebElement targetAddToCartButton = homePageRoomChosenProductAddToCartButtonElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(targetAddToCartButton).click().perform();
    }

    //click set room category link method
    public void clickSetRoomCategoryNameLink(int index) {
        WebElement targetRoomCategoryNameLink = homePageRoomCategoryNameLinkElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(targetRoomCategoryNameLink).click().perform();
    }

    //home page product text data getter methods
    //chosen products section
    public List<String> getHomePageChosenProductName(){return homePageRoomChosenProductNameElements.stream().map(WebElement::getText).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());}
    public List<String> getHomePageChosenProductUnitPrice(){return homePageRoomChosenProductUnitPriceElements.stream().map(WebElement::getText).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());}

    //article list elements
    public List<String> getHomePageLatestArticleTitle(){return homePageLatestArticleTitleElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageLatestArticleText(){return homePageLatestArticleTextElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageLatestArticleUsername(){return homePageLatestArticleUsernameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageLatestArticleTimePosted(){return homePageLatestArticleTimePostedElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //home page text element getter methods
    //buy for room category section
    public String getHomePageRoomCategorySectionTitle() {return homePageRoomCategorySectionTitle.getText();}

    public List<String> getHomePageRoomCategoryNameLinkText(){return homePageRoomCategoryNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //chosen products section
    public String getHomePageChosenProductsSectionTitle() {return homePageChosenProductsSectionTitle.getText();}

    //garden furniture section
    public String getHomePageGardenFurnitureTitle() {return homePageGardenFurnitureTitle.getText();}

    //latest articles section
    public String getHomePageLatestArticleSectionTitle() {return homePageLatestArticleSectionTitle.getText();}

    //home page web element assert methods
    //carousel section
    public boolean isHomePageCarouselImgScrollLeftButtonDisplayed() {return homePageCarouselImgScrollLeftButton.isDisplayed();}
    public boolean isHomePageCarouselImgScrollRightButtonDisplayed() {return homePageCarouselImgScrollRightButton.isDisplayed();}

    public boolean isHomePageCarouselPaginationButtonDisplayed(){
        return homePageCarouselPaginationButtonElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageCarouselImageDisplayed(){
        return homePageCarouselImgElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }

    //buy for room category section
    public boolean isHomePageRoomCategorySectionTitleDisplayed() {return homePageRoomCategorySectionTitle.isDisplayed();}

    public boolean isHomePageRoomCategoryImgDisplayed(){
        return homePageRoomCategoryImgElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageRoomCategoryNameLinkDisplayed(){
        return homePageRoomCategoryNameLinkElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }

    //chosen products section
    public boolean isHomePageChosenProductsSectionTitleDisplayed() {return homePageChosenProductsSectionTitle.isDisplayed();}
    public boolean isHomePageChosenProductsScrollLeftButtonDisplayed() {return homePageChosenProductsScrollLeftButton.isDisplayed();}
    public boolean isHomePageChosenProductsScrollRightButtonDisplayed() {return homePageChosenProductsScrollRightButton.isDisplayed();}

    public boolean isHomePageChosenProductAddToWishlistButtonDisplayed(){
        return homePageRoomChosenProductAddToWishlistButtonElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageChosenProductAddToCartButtonDisplayed(){
        return homePageRoomChosenProductAddToCartButtonElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageChosenProductImageDisplayed(){
        return homePageRoomChosenProductImgElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageChosenProductNameDisplayed(){
        return homePageRoomChosenProductNameElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageChosenProductUnitPriceDisplayed(){
        return homePageRoomChosenProductUnitPriceElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageChosenProductDetailsButtonDisplayed(){
        return homePageRoomChosenProductDetailsButtonElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }

    //garden furniture section
    public boolean isHomePageGardenFurnitureImgDisplayed(){return homePageGardenFurnitureImg.isDisplayed();}
    public boolean isHomePageGardenFurnitureTitleDisplayed(){return homePageGardenFurnitureTitle.isDisplayed();}
    public boolean isHomePageGardenFurnitureButtonDisplayed(){return homePageGardenFurnitureButton.isDisplayed();}
    //latest articles section
    public boolean isHomePageLatestArticleSectionTitleDisplayed(){return homePageLatestArticleSectionTitle.isDisplayed();}

    public boolean isHomePageLatestArticleImageDisplayed(){
        return homePageLatestArticleImgElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageLatestArticleTitleDisplayed(){
        return homePageLatestArticleTitleElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageLatestArticleTextDisplayed(){
        return homePageLatestArticleTextElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageLatestArticleUserProfileImgDisplayed(){
        return homePageLatestArticleUserProfileImgElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageLatestArticleUsernameDisplayed(){
        return homePageLatestArticleUsernameElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageLatestArticleTimePostedDisplayed(){
        return homePageLatestArticleTimePostedElements.stream()
                .anyMatch(WebElement::isDisplayed);
    }

}
