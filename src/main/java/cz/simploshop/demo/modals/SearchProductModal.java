package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class SearchProductModal extends BasePage {

    //search product modal web elements
    @FindBy(xpath = "//div[@class='sim-box-shadow sticky top-0 z-10 flex items-center gap-6 bg-white pl-6']/div[1]")
    private WebElement searchProductModalTopPhrasesSubtext;
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[2]//div[@class='sim-eyebrow mb-3.5']")
    private WebElement searchProductModalProductsSubtext;
    @FindBy(xpath = "//div[@class='flex flex-col p-6']//span[@class='sim-count-indicator-text c-simplo']")
    private WebElement searchProductModalProductCountSubtext;
    //category section
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[1]/div[@class='sim-eyebrow mb-3.5']")
    private WebElement searchProductModalCategorySubtext;
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[1]/p")
    private WebElement searchProductModalCategoryText;
    //brands section
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[2]/div[@class='sim-eyebrow mb-3.5']")
    private WebElement searchProductModalBrandsSubtext;
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[2]/p")
    private WebElement searchProductModalBrandsText;
    //articles section
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[3]/div[@class='sim-eyebrow mb-3.5']")
    private WebElement searchProductModalArticlesSubtext;
    @FindBy(xpath = "//div[@class='flex max-h-full max-md:flex-col md:overflow-hidden']/div[1]/div[3]/p")
    private WebElement searchProductModalArticlesText;
    //list elements
    @FindBy(xpath = "//div[@class='sim-box-shadow sticky top-0 z-10 flex items-center gap-6 bg-white pl-6']/div[2]/button")
    private List<WebElement> searchProductModalTopPhrasesButtonElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a")
    private List<WebElement> searchProductModalProductCardElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a//img")
    private List<WebElement> searchProductModalProductImgElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a//span[@class='sim-highlight sim-text-extra-small sim-font-medium text-[#8090A7]']")
    private List<WebElement> searchProductModalProductBrandElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a//span[@class='sim-highlight sim-text-large sim-font-bold']")
    private List<WebElement> searchProductModalProductNameElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a//div[@class='sim-product-price__price']")
    private List<WebElement> searchProductModalProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='-mx-6 flex flex-col']/a//span[@class='flex gap-1 text-success-500']")
    private List<WebElement> searchProductModalProductInStockTagElements;

    public SearchProductModal(WebDriver driver) {super(driver);}

    //click set searched product card method
    public void clickSetSearchProductCard(int index){searchProductModalProductCardElements.get(index).click();}

    //search product modal product data getters
    public String getSearchedProductModalProductCount(){return searchProductModalProductCountSubtext.getText();}
    public List<String> getSearchedProductModalProductBrand() {return searchProductModalProductBrandElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSearchedProductModalProductName() {return searchProductModalProductNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSearchedProductModalProductUnitPrice() {return searchProductModalProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //search product modal text element getters

    //category
    public String getSearchProductModalCategorySubtext() {
        String fullText = searchProductModalCategorySubtext.getText().trim();
        return fullText.replaceAll("\\s*\\d+×?$", "").trim();
    }
    public String getSearchProductModalCategoryText() {return searchProductModalCategoryText.getText();}

    //brands
    public String getSearchProductModalBrandsSubtext() {
        String fullText = searchProductModalBrandsSubtext.getText().trim();
        return fullText.replaceAll("\\s*\\d+×?$", "").trim();
    }
    public String getSearchProductModalBrandsText() {return searchProductModalBrandsText.getText();}

    //articles
    public String getSearchProductModalArticlesSubtext() {
        String fullText = searchProductModalArticlesSubtext.getText().trim();
        return fullText.replaceAll("\\s*\\d+×?$", "").trim();
    }
    public String getSearchProductModalArticlesText() {return searchProductModalArticlesText.getText();}

    //products
    public String getSearchProductModalTopPhrasesSubtext() {
        String fullText = searchProductModalTopPhrasesSubtext.getText().trim();
        return fullText.replaceAll("\\s*\\d+×?$", "").trim();
    }
    public String getSearchProductModalProductsSubtext() {
        String fullText = searchProductModalProductsSubtext.getText().trim();
        return fullText.replaceAll("\\s*\\d+×?$", "").trim();
    }

    //search product modal web element assert methods
    public boolean isSearchProductModalTopPhrasesSubtextDisplayed() {return searchProductModalTopPhrasesSubtext.isDisplayed();}
    public boolean isSearchProductModalProductsSubtextDisplayed() {return searchProductModalProductsSubtext.isDisplayed();}
    public boolean isSearchProductModalProductsCountDisplayed() {return searchProductModalProductCountSubtext.isDisplayed();}
    //category section
    public boolean isSearchProductModalCategorySubtextDisplayed() {return searchProductModalCategorySubtext.isDisplayed();}
    public boolean isSearchProductModalCategoryTextDisplayed() {return searchProductModalCategoryText.isDisplayed();}
    //brands section
    public boolean isSearchProductModalBrandsSubtextDisplayed() {return searchProductModalBrandsSubtext.isDisplayed();}
    public boolean isSearchProductModalBrandsTextDisplayed() {return searchProductModalBrandsText.isDisplayed();}
    //articles section
    public boolean isSearchProductModalArticlesSubtextDisplayed() {return searchProductModalArticlesSubtext.isDisplayed();}
    public boolean isSearchProductModalArticlesTextDisplayed() {return searchProductModalArticlesText.isDisplayed();}
    //products section
    public boolean isSearchProductModalTopPhrasesButtonDisplayed() {
        return searchProductModalTopPhrasesButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSearchProductModalProductImgDisplayed() {
        return searchProductModalProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSearchProductModalProductBrandDisplayed() {
        return searchProductModalProductBrandElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSearchProductModalProductNameDisplayed() {
        return searchProductModalProductNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSearchProductModalProductUnitPriceDisplayed() {
        return searchProductModalProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSearchProductModalProductInStockTagDisplayed() {
        return searchProductModalProductInStockTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
