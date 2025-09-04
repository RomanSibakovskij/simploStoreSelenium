package cz.simploshop.demo.modals.invalid.scenarios;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewModalInvalidScenarios extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//form/div[2]//input")
    private WebElement addProductReviewModalAuthorNameInputField;
    @FindBy(xpath = "//form/div[3]//textarea")
    private WebElement addProductReviewModalReviewInputField;

    public AddProductReviewModalInvalidScenarios(WebDriver driver) {super(driver);}


}
