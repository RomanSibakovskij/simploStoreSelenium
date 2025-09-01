package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

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


}
