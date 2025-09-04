package cz.simploshop.demo.modals.invalid.scenarios.addproductreviewmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewModalInvalidScenarios extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//form/div[2]//input")
    private WebElement addProductReviewModalAuthorNameInputField;
    @FindBy(xpath = "//form/div[3]//textarea")
    private WebElement addProductReviewModalReviewInputField;

    //invalid review input data - no singular input
    private String noGuestName = "";
    private String noProductReview = "";

    //invalid review input data - too short singular input
    private String tooShortGuestName = "S"; //1 char

    //valid review input data - for remaining inputs
    private String validGuestName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
    private String validProductReview = TestDataGenerator.getRandomProductReview();

    public AddProductReviewModalInvalidScenarios(WebDriver driver) {super(driver);}

    //invalid input data methods - no singular input
    public void inputNoGuestAuthorNameIntoAuthorNameInputField(){addProductReviewModalAuthorNameInputField.sendKeys(noGuestName);}
    public void inputNoProductReviewIntoReviewInputField(){addProductReviewModalReviewInputField.sendKeys(noProductReview);}

    //invalid input data methods - too short singular input
    public void inputTooShortGuestAuthorNameIntoAuthorNameInputField(){addProductReviewModalAuthorNameInputField.sendKeys(tooShortGuestName);}

    //valid input data methods - for remaining inputs
    public void inputProductReviewIntoReviewInputField(){addProductReviewModalReviewInputField.sendKeys(validProductReview);}
    public void inputGuestAuthorNameIntoAuthorNameInputField(){addProductReviewModalAuthorNameInputField.sendKeys(validGuestName);}

}
