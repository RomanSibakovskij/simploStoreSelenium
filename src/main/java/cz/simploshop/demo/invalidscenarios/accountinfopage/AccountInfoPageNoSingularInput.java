package cz.simploshop.demo.invalidscenarios.accountinfopage;

import cz.simploshop.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountInfoPageNoSingularInput extends BasePage {

    //relevant web elements
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-1']")
    private WebElement accountInfoPageFirstNameInputField;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-7']")
    private WebElement accountInfoPageLastNameInputField;
    @FindBy(xpath = "//main//section[2]//input[@id='v-0-4-0-0-13']")
    private WebElement accountInfoPageEmailInputField;
    //password section
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-25']")
    private WebElement accountInfoPagePasswordInputField;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-31']")
    private WebElement accountInfoPageNewPasswordInputField;
    @FindBy(xpath = "//main//section[3]//input[@id='v-0-4-0-0-37']")
    private WebElement accountInfoPageConfirmNewPasswordInputField;

    public AccountInfoPageNoSingularInput(WebDriver driver) {super(driver);}


}
