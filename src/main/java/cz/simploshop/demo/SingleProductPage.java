package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class SingleProductPage extends BasePage {

    //single product page web elements
    @FindBy(xpath = "//div[@class='sim-swiper-horizontal sim-swiper-vertical--xxl swiper swiper-initialized swiper-backface-hidden swiper-thumbs swiper-horizontal']//img")
    private List<WebElement> singleProductPageProductImgElements;
    @FindBy(xpath = "//div[@class='sim-card sim-card--lg sim-product-detail-gallery__main']//img")
    private WebElement singleProductPageProductMainImage;
    @FindBy(xpath = "//div[@class='sim-gallery__info']/button")
    private WebElement singleProductPageProductAddToWishlistButton;
    @FindBy(xpath = "//div[@class='flex flex-col items-start sim-product__controls-name']//span[@class='sim-font-bold']")
    private WebElement singleProductPageProductBrand;
    @FindBy(xpath = "//h1")
    private WebElement singleProductPageProductName;
    @FindBy(xpath = "//p[@class='sim-wysiwyg-text mb-5 hidden lg:block']")
    private WebElement singleProductPageProductDescription;
    @FindBy(xpath = "//p[@class='sim-wysiwyg-text mb-5 hidden lg:block']/a")
    private WebElement singleProductPageProductViewMoreLink;
    @FindBy(xpath = "//span[@class='flex gap-1 text-success-500']") // during manual testing, this element has a different class
    private WebElement singleProductPageProductInStockCount;
    @FindBy(xpath = "//div[@class='sim-product-price__price']")
    private WebElement singleProductPageProductUnitPrice;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200']/button[1]")
    private WebElement singleProductPageProductQtyDecreaseButton;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200']/input")
    private WebElement singleProductPageProductQtyInputField;
    @FindBy(xpath = "//div[@class='sim-counter bg-primary-200']/button[2]")
    private WebElement singleProductPageProductQtyIncreaseButton;
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-giant sim-btn--v-solid flex-1 whitespace-nowrap']")
    private WebElement singleProductPageProductAddToCartButton;
    @FindBy(xpath = "//div[@class='mt-2 flex flex-col gap-4']/span[1]")
    private WebElement singleProductPageProductShipDeliveryEstimate;
    @FindBy(xpath = "//div[@class='mt-2 flex flex-col gap-4']/span[2]")
    private WebElement singleProductPageProductCode;
    //product description section
    @FindBy(xpath = "//div[@class='sim-tab-switcher mt-6 justify-center']/button[1]")
    private WebElement singleProductPageProductDescSectionButton;
    @FindBy(xpath = "//div[@class='sim-wysiwyg-text']")
    private WebElement singleProductPageProductDesc;
    @FindBy(xpath = "//div[@class='max-w-sm']/h2")
    private WebElement singleProductPageProductParamsSubtitle;
    //list elements
    @FindBy(xpath = "//div[@class='max-w-sm']/div")
    private List<WebElement> singleProductPageProductParamsData;
    //reviews section
    @FindBy(xpath = "//div[@class='sim-tab-switcher mt-6 justify-center']/button[2]")
    private WebElement singleProductPageProductReviewSectionButton;
    @FindBy(xpath = "//div[@class='flex flex-col items-center justify-between gap-4 md:flex-row md:gap-8']/button")
    private WebElement singleProductPageAddProductReviewButton;
    @FindBy(xpath = "//div[@class='flex flex-col items-center justify-between gap-4 md:flex-row md:gap-8']/div/span")
    private WebElement singleProductPageProductReviewAvgScore;
    @FindBy(xpath = "//div[@class='flex gap-3']/div")
    private WebElement singleProductPageProductReviewStars;
    @FindBy(xpath = "//div[@class='flex gap-3']/span")
    private WebElement singleProductPageProductReviewCount;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[1]/div")
    private WebElement singleProductPageProductAppearanceSubtext;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[1]/progress")
    private WebElement singleProductPageProductAppearanceBar;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[2]/div")
    private WebElement singleProductPageProductComfortSubtext;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[2]/progress")
    private WebElement singleProductPageProductComfortBar;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[3]/div")
    private WebElement singleProductPageProductPriceSubtext;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[3]/progress")
    private WebElement singleProductPageProductPriceBar;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[4]/div")
    private WebElement singleProductPageProductAssemblyEaseSubtext;
    @FindBy(xpath = "//div[@class='mb-4 grid grid-cols-1 gap-4 md:grid-cols-2']/div[4]/progress")
    private WebElement singleProductPageProductAssemblyEaseBar;
    //reviews
    @FindBy(xpath = "//div[@class='flex scroll-mt-40 items-center justify-between gap-8']")
    private WebElement singleProductPageProductReviewsDisplayCount;
    //list elements
    @FindBy(xpath = "//div[@class='xxl:gap-44 my-8 flex flex-col gap-4 sm:flex-row sm:gap-24']/div[1]/div")
    private List<WebElement> singleProductPageProductReviewStarElements;
    @FindBy(xpath = "//div[@class='xxl:gap-44 my-8 flex flex-col gap-4 sm:flex-row sm:gap-24']/div[1]/span[1]")
    private List<WebElement> singleProductPageProductReviewAuthorElements;
    @FindBy(xpath = "//div[@class='xxl:gap-44 my-8 flex flex-col gap-4 sm:flex-row sm:gap-24']/div[1]/span[2]")
    private List<WebElement> singleProductPageProductReviewDateElements;
    @FindBy(xpath = "//div[@class='xxl:gap-44 my-8 flex flex-col gap-4 sm:flex-row sm:gap-24']/span")
    private List<WebElement> singleProductPageProductReviewTextElements;
    @FindBy(xpath = "//ul[@class='sim-pagination__wrapper']/li/button")
    private List<WebElement> singleProductPageProductReviewPaginationElements;
    //reviews section elements (when no review is posted)
    @FindBy(xpath = "//div[@class='mx-auto max-w-4xl']/h2")
    private WebElement singleProductPageProductNoReviewsDisplayedTitle;
    @FindBy(xpath = "//div[@class='mx-auto max-w-4xl']/p")
    private WebElement singleProductPageProductNoReviewsDisplayedDesc;

    public SingleProductPage(WebDriver driver) {super(driver);}

    //click "Product reviews" section button method
    public void clickProductReviewsSectionButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductPageProductReviewSectionButton).click().perform();
    }

    //click "Add to cart" button method
    public void clickAddToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductPageProductAddToCartButton).click().perform();
    }

    //input set product quantity into product qty input field method
    public void inputSetProductQuantityIntoProductQtyInputField(int quantity){
        singleProductPageProductQtyInputField.clear();
        singleProductPageProductQtyInputField.sendKeys(String.valueOf(quantity));
    }

    //click "Add product review" button method
    public void clickProductReviewButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductPageAddProductReviewButton).click().perform();
    }

    //single product page text element getters
    //product data
    public String getSingleProductPageProductBrand(){return singleProductPageProductBrand.getText();}
    public String getSingleProductPageProductName(){return singleProductPageProductName.getText();}
    public String getSingleProductPageProductDescription(){return singleProductPageProductDescription.getText();}
    public String getSingleProductPageProductInStockCount(){return singleProductPageProductInStockCount.getText();}
    public String getSingleProductPageProductUnitPrice(){return singleProductPageProductUnitPrice.getText();}
    public String getSingleProductPageProductShipDeliveryEstimate(){return singleProductPageProductShipDeliveryEstimate.getText();}
    public String getSingleProductPageProductCode(){return singleProductPageProductCode.getText();}
    //product description
    public String getSingleProductPageProductDesc(){return singleProductPageProductDesc.getText();}
    public String getSingleProductPageProductParamsSubtitle(){return singleProductPageProductParamsSubtitle.getText();}
    public List<String> getSingleProductPageProductParamsData(){return singleProductPageProductParamsData.stream().map(WebElement::getText).collect(Collectors.toList());}
    //reviews section
    public String getSingleProductPageReviewAvgScore(){return singleProductPageProductReviewAvgScore.getText();}
    public List<String> getSingleProductPageReviewAuthor(){return singleProductPageProductReviewAuthorElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleProductPageReviewDate(){return singleProductPageProductReviewDateElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleProductPageReviewText(){return singleProductPageProductReviewTextElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //no reviews displayed elements
    public String getSingleProductPageNoReviewsDisplayedTitle(){return singleProductPageProductNoReviewsDisplayedTitle.getText();}
    public String getSingleProductPageNoReviewsDisplayedDesc(){return singleProductPageProductNoReviewsDisplayedDesc.getText();}

    //single product page web element assert methods

    public boolean isSingleProductPageProductAdditionalImgDisplayed(){
        return singleProductPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    public boolean isSingleProductPageProductMainImageDisplayed(){return singleProductPageProductMainImage.isDisplayed();}
    public boolean isSingleProductPageProductAddToWishlistButtonDisplayed(){return singleProductPageProductAddToWishlistButton.isDisplayed();}
    public boolean isSingleProductPageProductBrandDisplayed(){return singleProductPageProductBrand.isDisplayed();}
    public boolean isSingleProductPageProductNameDisplayed(){return singleProductPageProductName.isDisplayed();}
    public boolean isSingleProductPageProductDescriptionDisplayed(){return singleProductPageProductDescription.isDisplayed();}
    public boolean isSingleProductPageProductViewMoreLinkDisplayed(){return singleProductPageProductViewMoreLink.isDisplayed();}
    public boolean isSingleProductPageProductInStockCountDisplayed(){return singleProductPageProductInStockCount.isDisplayed();}
    public boolean isSingleProductPageProductUnitPriceDisplayed(){return singleProductPageProductUnitPrice.isDisplayed();}
    public boolean isSingleProductPageProductQtyDecreaseButtonDisplayed(){return singleProductPageProductQtyDecreaseButton.isDisplayed();}
    public boolean isSingleProductPageProductQtyInputFieldDisplayed(){return singleProductPageProductQtyInputField.isDisplayed();}
    public boolean isSingleProductPageProductQtyIncreaseButtonDisplayed(){return singleProductPageProductQtyIncreaseButton.isDisplayed();}
    public boolean isSingleProductPageProductAddToCartButtonDisplayed(){return singleProductPageProductAddToCartButton.isDisplayed();}
    public boolean isSingleProductPageProductShipDeliveryEstimateDisplayed(){return singleProductPageProductShipDeliveryEstimate.isDisplayed();}
    public boolean isSingleProductPageProductCodeDisplayed(){return singleProductPageProductCode.isDisplayed();}
    //product description section
    public boolean isSingleProductPageProductDescSectionButtonDisplayed(){return singleProductPageProductDescSectionButton.isDisplayed();}
    public boolean isSingleProductPageProductDescDisplayed(){return singleProductPageProductDesc.isDisplayed();}
    public boolean isSingleProductPageProductParamsSubtitleDisplayed(){return singleProductPageProductParamsSubtitle.isDisplayed();}

    public boolean isSingleProductPageProductParamsDataDisplayed(){
        return singleProductPageProductParamsData.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //reviews section
    public boolean isSingleProductPageProductReviewsSectionButtonDisplayed(){return singleProductPageProductReviewSectionButton.isDisplayed();}
    public boolean isSingleProductPageAddProductReviewButtonDisplayed(){return singleProductPageAddProductReviewButton.isDisplayed();}
    public boolean isSingleProductPageProductReviewAvgScoreDisplayed(){return singleProductPageProductReviewAvgScore.isDisplayed();}
    public boolean isSingleProductPageProductReviewStarsDisplayed(){return singleProductPageProductReviewStars.isDisplayed();}
    public boolean isSingleProductPageProductReviewCountDisplayed(){return singleProductPageProductReviewCount.isDisplayed();}
    public boolean isSingleProductPageProductAppearanceSubtextDisplayed(){return singleProductPageProductAppearanceSubtext.isDisplayed();}
    public boolean isSingleProductPageProductAppearanceBarDisplayed(){return singleProductPageProductAppearanceBar.isDisplayed();}
    public boolean isSingleProductPageProductComfortSubtextDisplayed(){return singleProductPageProductComfortSubtext.isDisplayed();}
    public boolean isSingleProductPageProductComfortBarDisplayed(){return singleProductPageProductComfortBar.isDisplayed();}
    public boolean isSingleProductPageProductPriceSubtextDisplayed(){return singleProductPageProductPriceSubtext.isDisplayed();}
    public boolean isSingleProductPageProductPriceBarDisplayed(){return singleProductPageProductPriceBar.isDisplayed();}
    public boolean isSingleProductPageProductAssemblyEaseSubtextDisplayed(){return singleProductPageProductAssemblyEaseSubtext.isDisplayed();}
    public boolean isSingleProductPageProductAssemblyEaseBarDisplayed(){return singleProductPageProductAssemblyEaseBar.isDisplayed();}
    public boolean isSingleProductPageProductReviewsDisplayCountDisplayed(){return singleProductPageProductReviewsDisplayCount.isDisplayed();}
    //no reviews displayed elements
    public boolean isSingleProductPageProductNoReviewsDisplayedTitleDisplayed(){return singleProductPageProductNoReviewsDisplayedTitle.isDisplayed();}
    public boolean isSingleProductPageProductNoReviewsDisplayedDescDisplayed(){return singleProductPageProductNoReviewsDisplayedDesc.isDisplayed();}

    public boolean isSingleProductPageProductGivenReviewStarsDisplayed(){
        return singleProductPageProductReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductReviewAuthorDisplayed(){
        return singleProductPageProductReviewAuthorElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductReviewDateDisplayed(){
        return singleProductPageProductReviewDateElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductReviewTextDisplayed(){
        return singleProductPageProductReviewTextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductReviewPaginationButtonDisplayed(){
        return singleProductPageProductReviewPaginationElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
