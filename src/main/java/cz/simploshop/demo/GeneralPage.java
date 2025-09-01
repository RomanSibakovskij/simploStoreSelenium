package cz.simploshop.demo;

import cz.simploshop.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class GeneralPage extends BasePage {

    //general page web elements (elements all pages share)
    //header(upper)
    @FindBy(xpath = "//div[@class='sim-navbar__search-area']/a")
    private WebElement upperHeaderHomePageLogoLink;
    @FindBy(xpath = "//div[@class='sim-navbar__search-wrapper']//input")
    private WebElement upperHeaderSearchBarInputField;
    @FindBy(xpath = "//div[@class='sim-customer-login']/button[1]")
    private WebElement upperHeaderLoginButton;
    @FindBy(xpath = "//div[@class='sim-customer-shortcuts']/a")
    private WebElement upperHeaderWishlistLink;
    @FindBy(xpath = "//div[@class='sim-customer-login']/button[2]")
    private WebElement upperHeaderRegisterButton;
    //account dropdown option elements
    @FindBy(xpath = "//div[@class='sim-customer-login']//li")
    private List<WebElement> upperHeaderAccountOptionElements;
    @FindBy(xpath = "//ul[@class='sim-popup-card__list']/div[1]/li[2]")
    private WebElement upperHeaderAccountInformationOption;
    @FindBy(xpath = "//ul[@class='sim-popup-card__list']/div[1]/li[3]")
    private WebElement upperHeaderAccountAddressesOption;
    @FindBy(xpath = "//ul[@class='sim-popup-card__list']/div[2]/li")
    private WebElement upperHeaderAccountLogoutOption;
    //singular elements
    @FindBy(xpath = "//div[@class='sim-customer-shortcuts']/button")
    private WebElement upperHeaderShoppingCartButton;
    @FindBy(xpath = "//div[@class='sim-lang-switcher hidden lg:block']/button")
    private WebElement upperHeaderLanguageDropdownMenu;
    //user name element
    @FindBy(xpath = "//span[@class='hidden truncate lg:block']")
    private WebElement upperHeaderUsername;
    //header(lower) -> list elements
    @FindBy(xpath = "//nav[@class='sim-navbar__nav-el']/ul/li[@class='sim-navbar__menu-item']/a")
    private List <WebElement> lowerHeaderNavBarDropdownLinkElements;
    //footer
    //newsletter section
    @FindBy(xpath = "//h2[@class='sim-newsletter__heading']")
    private WebElement footerNewsletterSubtext;
    @FindBy(xpath = "//div[@class='sim-newsletter__subheading']")
    private WebElement footerNewsletterBackgroundText;
    @FindBy(xpath = "//div[@class='sim-el-group']//input")
    private WebElement footerNewsletterSubInputField;
    @FindBy(xpath = "//div[@class='sim-el-group']/button")
    private WebElement footerNewsletterSubscribeButton;
    //lower footer
    @FindBy(xpath = "//div[@class='sim-footer__logo-area']/a[1]")
    private WebElement footerHomePageLogoLink;
    @FindBy(xpath = "//div[@class='sim-footer__logo-area']/p")
    private WebElement footerSimploShopPlatformSubtext;
    @FindBy(xpath = "//div[@class='sim-footer__logo-area']/a[2]")
    private WebElement footerSimploShopPlatformLink;
    //categories section
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[1]//span[@class='sim-c-btn__content']")
    private WebElement footerCategoriesSectionTitle;
    @FindBy(xpath = "//div[@id='v-0-2-0']/ul/li/a")
    private List <WebElement> footerCategoriesLinkElements;
    //rooms section
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[2]//span[@class='sim-c-btn__content']")
    private WebElement footerRoomsSectionTitle;
    @FindBy(xpath = "//div[@id='v-0-2-1']//a")
    private List <WebElement> footerRoomsLinkElements;
    //contact us section
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[3]/span")
    private WebElement footerContactUsSectionTitle;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[3]/div[1]//span")
    private WebElement footerPhoneSubtext;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[3]/div[1]//a")
    private WebElement footerPhoneLink;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[3]/div[2]//span")
    private WebElement footerEmailSubtext;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[3]/div[2]//a")
    private WebElement footerEmailLink;
    //follow us section
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[4]/span")
    private WebElement footerFollowUsSectionTitle;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[4]//a[1]")
    private WebElement footerFacebookIcon;
    @FindBy(xpath = "//div[@class='sim-footer__cols']/div[4]//a[2]")
    private WebElement footerInstagramIcon;
    //created by section
    @FindBy(xpath = "//section[@class='sim-footer__signature']//a")
    private WebElement footerCreatedBySimploLink;
    @FindBy(xpath = "//section[@class='sim-footer__signature']//div[@class='md:justify-end']")
    private WebElement footerCopyrightText;
    //warning box elements
    @FindBy(xpath = "//div[@class='flex flex-col gap-1']/strong")
    private WebElement warningBoxTitle;
    @FindBy(xpath = "//button[@class='sim-close-btn sim-menu-btn sim-close-btn--dark sim-ghost-btn-hover--dark']")
    private WebElement warningBoxCloseButton;
    @FindBy(xpath = "//div[@class='flex flex-col gap-1']/p")
    private WebElement warningBoxText;
    @FindBy(xpath = "//div[@class='mt-4 flex gap-4 max-sm:flex-col sm:flex-wrap']/a[1]")
    private WebElement warningBoxAdminInterfaceButton;
    @FindBy(xpath = "//div[@class='mt-4 flex gap-4 max-sm:flex-col sm:flex-wrap']/a[2]")
    private WebElement warningBoxMoreAboutEShopSolutionButton;

    public GeneralPage(WebDriver driver) {super(driver);}

    //wait for elements to load method
    public void waitForElementsToLoad(long timeoutInMillis) {

        //wait for the document to be fully loaded (Thread.sleep seems to be the only way the wait is working for this particular webpage)

        try {
            //hard wait for the specified time
            Thread.sleep(timeoutInMillis);

            //after sleep, optionally verify DOM is in a usable state
            String readyState = (String) ((JavascriptExecutor) driver)
                    .executeScript("return document.readyState");

            if (!"complete".equals(readyState)) {
                System.out.println("Warning: document.readyState is still '" + readyState + "' after " + timeoutInMillis + "ms");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted while waiting", e);
        }

    }

    //click 'Close' warning button method
    public void clickCloseWarningBoxButton() {
        Actions action = new Actions(driver);
        action.moveToElement(warningBoxCloseButton).click().perform();
    }

    //click upper header 'Register' button method
    public void clickRegisterButton() {
        Actions action = new Actions(driver);
        action.moveToElement(upperHeaderRegisterButton).click().perform();
    }

    //general page text element getter methods
    //warning box
    public String getWarningBoxTitle() {return warningBoxTitle.getText();}
    public String getWarningBoxText() {return warningBoxText.getText();}
    //lower header
    public List <String> getLowerHeaderNavBarDropdownLinkText() {return lowerHeaderNavBarDropdownLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //footer
    public String getFooterNewsletterSubtext() {return footerNewsletterSubtext.getText();}
    public String getFooterNewsletterBackgroundText() {return footerNewsletterBackgroundText.getText();}
    //lower footer
    public String getFooterSimploShopPlatformSubtext() {return footerSimploShopPlatformSubtext.getText();}
    public String getFooterSimploShopPlatformLinkText() {return footerSimploShopPlatformLink.getText();}
    //categories section
    public String getFooterCategoriesSectionTitle() {return footerCategoriesSectionTitle.getText();}
    public List <String> getFooterCategoriesLinkText() {return footerCategoriesLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //rooms section
    public String getFooterRoomsSectionTitle() {return footerRoomsSectionTitle.getText();}
    public List <String> getFooterRoomsLinkText() {return footerRoomsLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //contact us section
    public String getFooterContactUsSectionTitle() {return footerContactUsSectionTitle.getText();}
    public String getFooterPhoneSubtext(){return footerPhoneSubtext.getText();}
    public String getFooterPhoneNumber(){return footerPhoneLink.getText();}
    public String getFooterEmailSubtext(){return footerEmailSubtext.getText();}
    public String getFooterEmailLink(){return footerEmailLink.getText();}
    //follow us section
    public String getFooterFollowUsSectionTitle() {return footerFollowUsSectionTitle.getText();}
    //created by section
    public String getFooterCreatedBySimploLinkText() {return footerCreatedBySimploLink.getText();}
    public String getFooterCopyrightText() {return footerCopyrightText.getText();}

    //username getter (due to unstable backend / network issues, wait time is extended)
    public String getUpperHeaderUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(6500));
        wait.until(ExpectedConditions.visibilityOf(upperHeaderUsername));
        return upperHeaderUsername.getText();
    }

    //general page web element assert methods
    //warning box
    public boolean isWarningBoxTitleDisplayed() {return warningBoxTitle.isDisplayed();}
    public boolean isWarningBoxCloseButtonDisplayed() {return warningBoxCloseButton.isDisplayed();}
    public boolean isWarningBoxTextDisplayed() {return warningBoxText.isDisplayed();}
    public boolean isWarningBoxAdminInterfaceButtonDisplayed() {return warningBoxAdminInterfaceButton.isDisplayed();}
    public boolean isWarningBoxMoreAboutEShopSolutionButtonDisplayed() {return warningBoxMoreAboutEShopSolutionButton.isDisplayed();}
    //upper header
    public boolean isUpperHeaderHomePageLogoLinkDisplayed() {return upperHeaderHomePageLogoLink.isDisplayed();}
    public boolean isUpperHeaderSearchBarInputDisplayed() {return upperHeaderSearchBarInputField.isDisplayed();}
    public boolean isUpperHeaderShoppingCartButtonDisplayed() {return upperHeaderShoppingCartButton.isDisplayed();}
    public boolean isUpperHeaderLanguageDropdownMenuDisplayed() {return upperHeaderLanguageDropdownMenu.isDisplayed();}
    //lower header
    public boolean isLowerHeaderNavBarDropdownLinkDisplayed() {
        return lowerHeaderNavBarDropdownLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //footer
    public boolean isFooterNewsletterSubtextDisplayed() {return footerNewsletterSubtext.isDisplayed();}
    public boolean isFooterNewsletterBackgroundTextDisplayed() {return footerNewsletterBackgroundText.isDisplayed();}
    public boolean isFooterNewsletterSubInputFieldDisplayed() {return footerNewsletterSubInputField.isDisplayed();}
    public boolean isFooterNewsletterSubscribeButtonDisplayed() {return footerNewsletterSubscribeButton.isDisplayed();}
    //lower footer
    public boolean isFooterHomePageLogoLinkDisplayed() {return footerHomePageLogoLink.isDisplayed();}
    public boolean isFooterSimploShopPlatformSubtextDisplayed() {return footerSimploShopPlatformSubtext.isDisplayed();}
    public boolean isFooterSimploShopPlatformLinkDisplayed() {return footerSimploShopPlatformLink.isDisplayed();}
    //categories section
    public boolean isFooterCategoriesSectionTitleDisplayed() {return footerCategoriesSectionTitle.isDisplayed();}

    public boolean isFooterCategoriesLinkDisplayed() {
        return footerCategoriesLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //rooms section
    public boolean isFooterRoomsSectionTitleDisplayed() {return footerRoomsSectionTitle.isDisplayed();}

    public boolean isFooterRoomsLinkDisplayed() {
        return footerRoomsLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //contact us section
    public boolean isFooterContactUsSectionTitleDisplayed() {return footerContactUsSectionTitle.isDisplayed();}
    public boolean isFooterPhoneSubtextDisplayed() {return footerPhoneSubtext.isDisplayed();}
    public boolean isFooterPhoneDisplayed(){return footerPhoneLink.isDisplayed();}
    public boolean isFooterEmailSubtextDisplayed() {return footerEmailSubtext.isDisplayed();}
    public boolean isFooterEmailDisplayed(){return footerEmailLink.isDisplayed();}
    //follow us section
    public boolean isFooterFollowUsSectionTitleDisplayed() {return footerFollowUsSectionTitle.isDisplayed();}
    public boolean isFooterFacebookIconDisplayed() {return footerFacebookIcon.isDisplayed();}
    public boolean isFooterInstagramIconDisplayed() {return footerInstagramIcon.isDisplayed();}
    //created by section
    public boolean isFooterCreatedBySimploLinkDisplayed() {return footerCreatedBySimploLink.isDisplayed();}
    public boolean isFooterCopyrightTextDisplayed() {return footerCopyrightText.isDisplayed();}

}
