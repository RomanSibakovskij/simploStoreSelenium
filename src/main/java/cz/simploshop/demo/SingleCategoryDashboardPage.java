package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class SingleCategoryDashboardPage extends BasePage {

    //single category page web elements
    //aside section
    //in stock
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[1]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageAsideInStockSubtitle;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[1]//div[@class='sim-form-checkbox__container']//input")
    private WebElement singleCategoryDashPageAsideInStockSubtext;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[1]//div[@class='sim-form-checkbox__container']/label")
    private WebElement singleCategoryDashPageAsideInStockCheckbox;
    //brand
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageAsideBrandSubtitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='sim-form-checkbox__container']//input")
    private List<WebElement> singleCategoryDashPageAsideBrandSubtextElements;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[1]//div[@class='sim-form-checkbox__container']//input")
    private List<WebElement> singleCategoryDashPageOtherAsideBrandSubtextElements;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='sim-form-checkbox__container']/label")
    private List<WebElement> singleCategoryDashPageAsideBrandCheckboxElements;
    //singular elements
    //price
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[3]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageAsidePriceSubtitle;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[3]//div[@class='_sim-range_vad9s_60']/input[1]")
    private WebElement singleCategoryDashPageAsidePriceSliderButtonLeft;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[3]//div[@class='_sim-range_vad9s_60']/input[2]")
    private WebElement singleCategoryDashPageAsidePriceSliderButtonRight;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[3]//div[@class='mt-4 flex flex-row justify-between gap-4']/div[1]/input")
    private WebElement singleCategoryDashPageAsidePriceFromInputField;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[3]//div[@class='mt-4 flex flex-row justify-between gap-4']/div[2]/input")
    private WebElement singleCategoryDashPageAsidePriceToInputField;
    //other categories
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageOtherAsidePriceSubtitle;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='_sim-range_vad9s_60']/input[1]")
    private WebElement singleCategoryDashPageOtherAsidePriceSliderButtonLeft;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='_sim-range_vad9s_60']/input[2]")
    private WebElement singleCategoryDashPageOtherAsidePriceSliderButtonRight;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='mt-4 flex flex-row justify-between gap-4']/div[1]/input")
    private WebElement singleCategoryDashPageOtherAsidePriceFromInputField;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[2]//div[@class='mt-4 flex flex-row justify-between gap-4']/div[2]/input")
    private WebElement singleCategoryDashPageOtherAsidePriceToInputField;
    //height
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[4]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageAsideHeightSubtitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[4]//div[@class='sim-filter-block__content flex flex-col gap-3']//label")
    private List<WebElement> singleCategoryDashPageAsideHeightSubtextElements;
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[4]//div[@class='sim-filter-block__content flex flex-col gap-3']//input")
    private List<WebElement> singleCategoryDashPageAsideHeightCheckboxElements;
    //singular elements
    //color
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[5]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageAsideColorSubtitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[5]/div[@class='sim-filter-block']//fieldset/div")
    private List<WebElement> singleCategoryDashPageAsideColorButtonElements;
    //color
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[4]/div[@class='sim-filter-block']/button")
    private WebElement singleCategoryDashPageOtherAsideColorSubtitle;
    //list elements
    @FindBy(xpath = "//div[@class='sim-pc-detail__filters']/div[4]/div[@class='sim-filter-block']//fieldset/div")
    private List<WebElement> singleCategoryDashPageOtherColorButtonElements;
    //main section
    @FindBy(xpath = "//div[@class='sim-pc-detail__info']/h1")
    private WebElement singleCategoryDashPageTitle;
    @FindBy(xpath = "//div[@class='sim-collapse__text pb-8']")
    private WebElement singleCategoryDashPageSubtitle;
    @FindBy(xpath = "//div[@class='sim-collapse__text pb-8']//button")
    private WebElement singleCategoryDashPageCollapseTextButton;
    @FindBy(xpath = "//div[@class='sim-pagination-info']")
    private WebElement singleCategoryDashPageProductViewCount;
    @FindBy(xpath = "//div[@class='flex flex-wrap items-center justify-between gap-x-4 gap-y-8']/label")
    private WebElement singleCategoryDashPageProductSortBySubtext;
    @FindBy(xpath = "//div[@class='flex flex-wrap items-center justify-between gap-x-4 gap-y-8']//select")
    private WebElement singleCategoryDashPageProductSortByDropdownMenu;
    //list elements
    @FindBy(xpath = "//div[@class='flex flex-wrap items-center justify-between gap-x-4 gap-y-8']//select/option")
    private List<WebElement> singleCategoryDashPageSortByOptionElements;
    @FindBy(xpath = "//div[@class='sim-subcategories mt-8']/a")
    private List<WebElement> singleCategoryDashPageSubcategoryElements;
    @FindBy(xpath = "//div[@class='sim-subcategories mt-8']/a//img")
    private List<WebElement> singleCategoryDashPageSubcategoryImgElements;
    @FindBy(xpath = "//div[@class='sim-subcategories mt-8']/a//span")
    private List<WebElement> singleCategoryDashPageSubcategoryNameElements;
    //product table
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//div[@class='sim-product-card__info']/button")
    private List<WebElement> singleCategoryDashPageProductAddToWishlistButtonElements;
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//img")
    private List<WebElement> singleCategoryDashPageProductImgElements;
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//span[@class='sim-product-card__title']")
    private List<WebElement> singleCategoryDashPageProductNameElements;
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//div[@class='sim-product-price__price']")
    private List<WebElement> singleCategoryDashPageProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//div[@class='sim-product-card__actions']/a")
    private List<WebElement> singleCategoryDashPageProductDetailsButtonElements;
    @FindBy(xpath = "//div[@class='sim-product-card !w-full']//div[@class='sim-product-card__actions']/button")
    private List<WebElement> singleCategoryDashPageProductAddToCartButtonElements;
    @FindBy(xpath = "//ul[@class='sim-pagination__wrapper']/li")
    private List<WebElement> singleCategoryDashPagePaginationElements;
    //singular elements
    @FindBy(xpath = "//button[@class='sim-btn sim-btn--c-primary sim-btn--s-large sim-btn--v-solid']")
    private WebElement singleCategoryDashPageViewMoreButton;

    public SingleCategoryDashboardPage(WebDriver driver) {super(driver);}

    //click sort by dropdown menu method
    public void clickSortByDropdownMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashPageProductSortByDropdownMenu).click().perform();
    }

    //select set sort by option link method
    public void selectSortByOption(int index){singleCategoryDashPageSortByOptionElements.get(index).click();}

    //click set category product "Add to cart" button method
    public void clickSetCategoryProductAddToCartButton(int index) {
        WebElement targetAddToCartButton = singleCategoryDashPageProductAddToCartButtonElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(targetAddToCartButton).click().perform();
    }

    //single category dashboard page product data getters
    //aside section
    //price
    public String getSingleCategoryDashPageAsidePriceFrom(){return singleCategoryDashPageAsidePriceFromInputField.getAttribute("value");}
    public String getSingleCategoryDashPageAsidePriceTo(){return singleCategoryDashPageAsidePriceToInputField.getAttribute("value");}
    //other categories -> price
    public String getSingleCategoryDashPageOtherAsidePriceFrom(){return singleCategoryDashPageOtherAsidePriceFromInputField.getAttribute("value");}
    public String getSingleCategoryDashPageOtherAsidePriceTo(){return singleCategoryDashPageOtherAsidePriceToInputField.getAttribute("value");}
    //main section
    public String getSingleCategoryDashProductViewCount(){return singleCategoryDashPageProductViewCount.getText();}
    //product table
    public List<String> getSingleCategoryDashProductName(){return singleCategoryDashPageProductNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashProductUnitPrice(){return singleCategoryDashPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single category dashboard page text element getters
    //aside section
    //in stock
    public String getSingleCategoryDashPageAsideInStockSubtitle(){return singleCategoryDashPageAsideInStockSubtitle.getText();}
    public String getSingleCategoryDashPageAsideInStockSubtext(){return singleCategoryDashPageAsideInStockSubtext.getText();}
    //brand
    public String getSingleCategoryDashPageAsideBrandSubtitle(){return singleCategoryDashPageAsideBrandSubtitle.getText();}

    public List<String> getSingleCategoryDashPageOtherAsideBrandSubtext(){return singleCategoryDashPageOtherAsideBrandSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashPageAsideBrandSubtext(){return singleCategoryDashPageAsideBrandSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //price
    public String getSingleCategoryDashPageAsidePriceSubtitle(){return singleCategoryDashPageAsidePriceSubtitle.getText();}
    //height
    public String getSingleCategoryDashPageAsideHeightSubtitle(){return singleCategoryDashPageAsideHeightSubtitle.getText();}

    public List<String> getSingleCategoryDashPageAsideHeightSubtext(){return singleCategoryDashPageAsideHeightSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //color
    public String getSingleCategoryDashPageAsideColorSubtitle(){return singleCategoryDashPageAsideColorSubtitle.getText();}

    //main section
    public String getSingleCategoryDashPageTitle(){return singleCategoryDashPageTitle.getText();}

    public String getSingleCategoryDashPageSubtitle(){
        String fullText = singleCategoryDashPageSubtitle.getText().trim();

        //remove trailing all-uppercase line
        int lastNewline = fullText.lastIndexOf('\n');
        if (lastNewline != -1) {
            String lastLine = fullText.substring(lastNewline + 1).trim();
            if (lastLine.equals(lastLine.toUpperCase()) && lastLine.length() > 2) {
                return fullText.substring(0, lastNewline).trim();
            }
        }

        return fullText;
    }

    public List<String> getSingleCategoryDashPageSubcategory(){return singleCategoryDashPageSubcategoryElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single category dashboard page web element assert methods
    //aside section
    //in stock
    public boolean isSingleCategoryDashPageAsideInStockSubtitleDisplayed() {return singleCategoryDashPageAsideInStockSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashPageAsideInStockSubtextDisplayed() {return singleCategoryDashPageAsideInStockSubtext.isDisplayed();}
    public boolean isSingleCategoryDashPageAsideInStockCheckboxDisplayed() {return singleCategoryDashPageAsideInStockCheckbox.isDisplayed();}
    //brand
    public boolean isSingleCategoryDashPageAsideBrandSubtitleDisplayed() {return singleCategoryDashPageAsideBrandSubtitle.isDisplayed();}

    public boolean isSingleCategoryDashPageAsideBrandSubtextDisplayed() {
        return singleCategoryDashPageAsideBrandSubtextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageAsideBrandCheckboxDisplayed() {
        return singleCategoryDashPageAsideBrandCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //price
    public boolean isSingleCategoryDashPageAsidePriceSubtitleDisplayed() {return singleCategoryDashPageAsidePriceSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashPageAsidePriceSliderButtonLeftDisplayed() {return singleCategoryDashPageAsidePriceSliderButtonLeft.isDisplayed();}
    public boolean isSingleCategoryDashPageAsidePriceSliderButtonRightDisplayed() {return singleCategoryDashPageAsidePriceSliderButtonRight.isDisplayed();}
    public boolean isSingleCategoryDashPageAsidePriceFromInputFieldDisplayed() {return singleCategoryDashPageAsidePriceFromInputField.isDisplayed();}
    public boolean isSingleCategoryDashPageAsidePriceToInputFieldDisplayed() {return singleCategoryDashPageAsidePriceToInputField.isDisplayed();}
    //other categories -> price
    public boolean isSingleCategoryDashPageOtherAsidePriceSubtitleDisplayed() {return singleCategoryDashPageOtherAsidePriceSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashPageOtherPriceSliderButtonLeftDisplayed() {return singleCategoryDashPageOtherAsidePriceSliderButtonLeft.isDisplayed();}
    public boolean isSingleCategoryDashPageOtherPriceSliderButtonRightDisplayed() {return singleCategoryDashPageOtherAsidePriceSliderButtonRight.isDisplayed();}
    public boolean isSingleCategoryDashPageOtherPriceFromInputFieldDisplayed() {return singleCategoryDashPageOtherAsidePriceFromInputField.isDisplayed();}
    public boolean isSingleCategoryDashPageOtherPriceToInputFieldDisplayed() {return singleCategoryDashPageOtherAsidePriceToInputField.isDisplayed();}
    //height
    public boolean isSingleCategoryDashPageAsideHeightSubtitleDisplayed() {return singleCategoryDashPageAsideHeightSubtitle.isDisplayed();}

    public boolean isSingleCategoryDashPageAsideHeightSubtextDisplayed() {
        return singleCategoryDashPageAsideHeightSubtextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageAsideHeightCheckboxDisplayed() {
        return singleCategoryDashPageAsideHeightCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //color
    public boolean isSingleCategoryDashPageAsideColorSubtitleDisplayed() {return singleCategoryDashPageAsideColorSubtitle.isDisplayed();}

    public boolean isSingleCategoryDashPageAsideColorButtonDisplayed() {
        return singleCategoryDashPageAsideColorButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //other categories -> color
    public boolean isSingleCategoryDashPageOtherAsideColorSubtitleDisplayed() {return singleCategoryDashPageOtherAsideColorSubtitle.isDisplayed();}

    public boolean isSingleCategoryDashPageOtherAsideColorButtonDisplayed() {
        return singleCategoryDashPageOtherColorButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //main section
    public boolean isSingleCategoryDashPageTitleDisplayed() {return singleCategoryDashPageTitle.isDisplayed();}
    public boolean isSingleCategoryDashPageSubtitleDisplayed() {return singleCategoryDashPageSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashPageCollapseTextButtonDisplayed() {return singleCategoryDashPageCollapseTextButton.isDisplayed();}
    public boolean isSingleCategoryDashPageProductViewCountDisplayed() {return singleCategoryDashPageProductViewCount.isDisplayed();}
    public boolean isSingleCategoryDashPageSortBySubtextDisplayed() {return singleCategoryDashPageProductSortBySubtext.isDisplayed();}
    public boolean isSingleCategoryDashPageSortByDropdownMenuDisplayed() {return singleCategoryDashPageProductSortByDropdownMenu.isDisplayed();}
    public boolean isSingleCategoryDashPageViewMoreButtonDisplayed() {return singleCategoryDashPageViewMoreButton.isDisplayed();}

    public boolean isSingleCategoryDashPageSubcategoryDisplayed() {
        return singleCategoryDashPageSubcategoryElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageSubcategoryImgDisplayed() {
        return singleCategoryDashPageSubcategoryImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageSubcategoryNameDisplayed() {
        return singleCategoryDashPageSubcategoryNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //product table
    public boolean isSingleCategoryDashPageProductAddToWishlistButtonDisplayed() {
        return singleCategoryDashPageProductAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageProductImgDisplayed() {
        return singleCategoryDashPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageProductNameDisplayed() {
        return singleCategoryDashPageProductNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageProductUnitPriceDisplayed() {
        return singleCategoryDashPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageProductAddToCartButtonDisplayed() {
        return singleCategoryDashPageProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPageProductDetailsButtonDisplayed() {
        return singleCategoryDashPageProductDetailsButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashPagePaginationButtonDisplayed() {
        return singleCategoryDashPagePaginationElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
