package cz.simploshop.demo.modals.invalid.scenarios.loginaccountmodal;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginAccountModalInvalidScenarios extends BasePage{

    //relevant web elements
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-38']")
    private WebElement loginAccountModalEmailInputField;
    @FindBy(xpath = "//div[@class='sim-auth-form__form']//form//input[@id='v-0-3-44']")
    private WebElement loginAccountModalPasswordInputField;

    public LoginAccountModalInvalidScenarios(WebDriver driver) {super(driver);}



}
