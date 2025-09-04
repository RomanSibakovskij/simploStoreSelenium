package cz.simploshop.demo.modals;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//textarea")
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
    //invalid singular input error message
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement addProductReviewModalInvalidSingularInputError;

    //valid review input data
    RegisterAccountModal registerAccountModal = new RegisterAccountModal(driver);
    private String validGuestName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
    private String validRegUserName = "Test Tester";
    private String validProductReview = TestDataGenerator.getRandomProductReview();

    public AddProductReviewModal(WebDriver driver) {super(driver);}

    //select set review stars methods
    public void selectSetReviewStars(int index){
        WebElement setReviewStarsCount = addProductReviewModalReviewStarElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setReviewStarsCount).click().perform();
    }

    //input random product review into review input field method
    public void inputProductReviewIntoReviewInputField(){addProductReviewModalReviewInputField.sendKeys(validProductReview);}

    //input author name (guest) into author name input field method
    public void inputGuestAuthorNameIntoAuthorNameInputField(){addProductReviewModalAuthorNameInputField.sendKeys(validGuestName);}

    //input author name (registered user) into author name input field method
    public void inputAuthorNameIntoAuthorNameInputField(){addProductReviewModalAuthorNameInputField.sendKeys(validRegUserName);}

    //select set looks review stars methods
    public void selectSetLooksReviewStars(int index){
        WebElement setLooksReviewStarsCount = addProductReviewModalLooksReviewStarElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setLooksReviewStarsCount).click().perform();
    }

    //select set comfort review stars methods
    public void selectSetComfortReviewStars(int index){
        WebElement setComfortReviewStarsCount = addProductReviewModalComfortReviewStarElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setComfortReviewStarsCount).click().perform();
    }

    //select set price review stars methods
    public void selectSetPriceReviewStars(int index){
        WebElement setPriceReviewStarsCount = addProductReviewModalPriceReviewStarElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setPriceReviewStarsCount).click().perform();
    }

    //select set assembly ease review stars methods
    public void selectSetAssemblyEaseReviewStars(int index){
        WebElement setAssemblyEaseReviewStarsCount = addProductReviewModalAssemblyEaseReviewStarElements.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(setAssemblyEaseReviewStarsCount).click().perform();
    }

    //click "Send Review" button method
    public void clickSendReviewButton(){
        Actions action = new Actions(driver);
        action.moveToElement(addProductReviewModalSendReviewButton).click().perform();
    }

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

    //add product review singular input error message getter
    public String getAddProductReviewModalSingularInputErrorMsg() {return addProductReviewModalInvalidSingularInputError.getText();}

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
