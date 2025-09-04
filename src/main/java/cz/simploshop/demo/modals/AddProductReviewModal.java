package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class AddProductReviewModal extends BasePage{

    //add product review modal web elements
    @FindBy(xpath = "//div[@class='sim-modal__header']//h2")
    private WebElement addProductReviewModalTitle;
    @FindBy(xpath = "//div[@class='sim-modal__header']//button")
    private WebElement addProductReviewCloseModalButton;
    @FindBy(xpath = "//div[@class='mb-8']")
    private WebElement addProductReviewModalDescription;
    @FindBy(xpath = "//form/div[1]//div[@class='sim-label']")
    private WebElement addProductReviewModalReviewStarsSubtext;
    //list elements
    @FindBy(xpath = "//form//div[@class='sim-rating sim-rating--editable sim-rating--c-simplo']/div")
    private List<WebElement> addProductReviewModalReviewStarElements;
    //singular elements
    @FindBy(xpath = "//form/div[2]//label")
    private WebElement addProductReviewModalAuthorNameSubtext;
    @FindBy(xpath = "//form/div[2]//input")
    private WebElement addProductReviewModalAuthorNameInputField;
    @FindBy(xpath = "//form/div[3]//label")
    private WebElement addProductReviewModalReviewSubtext;
    @FindBy(xpath = "//form/div[3]//textarea")
    private WebElement addProductReviewModalReviewInputField;
    @FindBy(xpath = "//form//button")
    private WebElement addProductReviewModalSendReviewButton;
    //review star elements (parameters)
    @FindBy(xpath = "//form/div[4]/div[@class='sim-label']")
    private WebElement addProductReviewModalParameterReviewSubtext;
    @FindBy(xpath = "//form/div[4]/div[2]/div/div[@class='sim-label']")
    private WebElement addProductReviewModalLooksSubtext;
    @FindBy(xpath = "//form/div[4]/div[3]/div/div[@class='sim-label']")
    private WebElement addProductReviewModalComfortSubtext;
    @FindBy(xpath = "//form/div[4]/div[4]/div/div[@class='sim-label']")
    private WebElement addProductReviewModalPriceSubtext;
    @FindBy(xpath = "//form/div[4]/div[5]/div/div[@class='sim-label']")
    private WebElement addProductReviewModalAssemblyEaseSubtext;
    //list elements
    @FindBy(xpath = "//form/div[4]/div[2]/div/div[@class='sim-rating sim-rating--editable sim-rating--c-primary']/div")
    private List<WebElement> addProductReviewModalLooksReviewStarElements;
    @FindBy(xpath = "//form/div[4]/div[3]/div/div[@class='sim-rating sim-rating--editable sim-rating--c-primary']/div")
    private List<WebElement> addProductReviewModalComfortReviewStarElements;
    @FindBy(xpath = "//form/div[4]/div[4]/div/div[@class='sim-rating sim-rating--editable sim-rating--c-primary']/div")
    private List<WebElement> addProductReviewModalPriceReviewStarElements;
    @FindBy(xpath = "//form/div[4]/div[5]/div/div[@class='sim-rating sim-rating--editable sim-rating--c-primary']/div")
    private List<WebElement> addProductReviewModalAssemblyEaseReviewStarElements;

    public AddProductReviewModal(WebDriver driver) {super(driver);}

    //add product review modal text element getters
    public String getAddProductReviewModalTitle() {return addProductReviewModalTitle.getText();}

    public String getAddProductReviewModalDescription() {
        String fullText = addProductReviewModalDescription.getText().trim();
        return fullText.replaceAll("\"[^\"]*\"", "").trim();
    }

    public String getAddProductReviewModalReviewStarsSubtext() {return addProductReviewModalReviewStarsSubtext.getText();}
    public String getAddProductReviewModalReviewSubtext() {return addProductReviewModalReviewSubtext.getText();}
    public String getAddProductReviewModalAuthorNameSubtext() {return addProductReviewModalAuthorNameSubtext.getText();}
    public String getAddProductReviewModalParameterReviewSubtext() {return addProductReviewModalParameterReviewSubtext.getText();}
    public String getAddProductReviewModalLooksSubtext() {return addProductReviewModalLooksSubtext.getText();}
    public String getAddProductReviewModalComfortSubtext() {return addProductReviewModalComfortSubtext.getText();}
    public String getAddProductReviewModalPriceSubtext() {return addProductReviewModalPriceSubtext.getText();}
    public String getAddProductReviewModalAssemblyEaseSubtext() {return addProductReviewModalAssemblyEaseSubtext.getText();}

    //add product review modal web element assert methods
    public boolean isAddProductReviewModalTitleDisplayed() {return addProductReviewModalTitle.isDisplayed();}
    public boolean isAddProductReviewModalDescriptionDisplayed() {return addProductReviewModalDescription.isDisplayed();}
    public boolean isAddProductReviewCloseModalButtonDisplayed() {return addProductReviewCloseModalButton.isDisplayed();}
    public boolean isAddProductReviewModalReviewStarsSubtextDisplayed() {return addProductReviewModalReviewStarsSubtext.isDisplayed();}
    public boolean isAddProductReviewModalAuthorNameSubtextDisplayed() {return addProductReviewModalAuthorNameSubtext.isDisplayed();}
    public boolean isAddProductReviewModalAuthorNameInputFieldDisplayed() {return addProductReviewModalAuthorNameInputField.isDisplayed();}
    public boolean isAddProductReviewModalParameterReviewSubtextDisplayed() {return addProductReviewModalParameterReviewSubtext.isDisplayed();}
    public boolean isAddProductReviewModalLooksSubtextDisplayed() {return addProductReviewModalLooksSubtext.isDisplayed();}
    public boolean isAddProductReviewModalComfortSubtextDisplayed() {return addProductReviewModalComfortSubtext.isDisplayed();}
    public boolean isAddProductReviewModalPriceSubtextDisplayed() {return addProductReviewModalPriceSubtext.isDisplayed();}
    public boolean isAddProductReviewModalAssemblyEaseSubtextDisplayed() {return addProductReviewModalAssemblyEaseSubtext.isDisplayed();}

    //list elements
    public boolean isAddProductReviewModalReviewStarDisplayed(){
        return addProductReviewModalReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddProductReviewModalLooksReviewStarDisplayed(){
        return addProductReviewModalLooksReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddProductReviewModalComfortReviewStarDisplayed(){
        return addProductReviewModalComfortReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddProductReviewModalPriceReviewStarDisplayed(){
        return addProductReviewModalPriceReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddProductReviewModalAssemblyEaseReviewStarDisplayed(){
        return addProductReviewModalAssemblyEaseReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //singular elements
    public boolean isAddProductReviewModalReviewSubtextDisplayed() {return addProductReviewModalReviewSubtext.isDisplayed();}
    public boolean isAddProductReviewModalReviewInputFieldDisplayed() {return addProductReviewModalReviewInputField.isDisplayed();}
    public boolean isAddProductReviewModalSendReviewButtonDisplayed() {return addProductReviewModalSendReviewButton.isDisplayed();}

}
