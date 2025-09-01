package cz.simploshop.demo.web.element.asserts;

import cz.simploshop.demo.*;

import static org.junit.jupiter.api.Assertions.*;

public interface PageWebElementAsserts {

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page warning box web element asset test method
    default void isGeneralPageWarningBoxWebElementDisplayed(GeneralPage generalPage){
        //assert general page warning box title is displayed
        assertTrue(generalPage.isWarningBoxTitleDisplayed(), "The general page warning box title isn't displayed");
        //assert general page warning box close button is displayed
        assertTrue(generalPage.isWarningBoxCloseButtonDisplayed(), "The general page warning box close button isn't displayed");
        //assert general page warning box text is displayed
        assertTrue(generalPage.isWarningBoxTextDisplayed(), "The general page warning box text isn't displayed");
        //assert general page warning box admin interface button is displayed
        assertTrue(generalPage.isWarningBoxAdminInterfaceButtonDisplayed(), "The general page warning box admin interface button isn't displayed");
        //assert general page warning box more about e-shop solution button is displayed
        assertTrue(generalPage.isWarningBoxMoreAboutEShopSolutionButtonDisplayed(), "The general page warning box more about e-shop solution button isn't displayed");
    }

    //general page header section web element assert test method
    default void isGeneralPageHeaderSectionWebElementDisplayed(GeneralPage generalPage){
        //upper header
        //assert general page upper header home page logo link is displayed
        assertTrue(generalPage.isUpperHeaderHomePageLogoLinkDisplayed(), "The general page upper header home page logo link isn't displayed");
        //assert general page upper header search bar is displayed
        assertTrue(generalPage.isUpperHeaderSearchBarInputDisplayed(), "The general page upper header search bar isn't displayed");
        //assert general page upper header shopping cart button is displayed
        assertTrue(generalPage.isUpperHeaderShoppingCartButtonDisplayed(), "The general page upper header shopping cart button isn't displayed");
        //assert general page upper header language dropdown menu is displayed
        assertTrue(generalPage.isUpperHeaderLanguageDropdownMenuDisplayed(), "The general page upper header language dropdown menu isn't displayed");
        //lower header (list elements)
        //assert general page lower header navbar dropdown links are displayed (as a list)
        assertTrue(generalPage.isLowerHeaderNavBarDropdownLinkDisplayed(), "The general page lower header navbar dropdown links aren't displayed");
    }

    //general page footer section web element assert test method
    default void isGeneralPageFooterSectionWebElementDisplayed(GeneralPage generalPage){
        //footer
        //assert general page footer newsletter subtext is displayed (some pages don't have this column)
        //assertTrue(generalPage.isFooterNewsletterSubtextDisplayed(), "The general page footer newsletter subtext isn't displayed");
        //assert general page footer newsletter image background text is displayed
        //assertTrue(generalPage.isFooterNewsletterBackgroundTextDisplayed(), "The general page footer newsletter image background text isn't displayed");
        //assert general page footer newsletter subscription input field is displayed
        //assertTrue(generalPage.isFooterNewsletterSubInputFieldDisplayed(), "The general page footer newsletter subscription input field isn't displayed");
        //assert general page footer newsletter subscribe button is displayed
        //assertTrue(generalPage.isFooterNewsletterSubscribeButtonDisplayed(), "The general page footer newsletter subscribe button isn't displayed");
        //lower footer
        //assert general page footer home page logo link is displayed
        assertTrue(generalPage.isFooterHomePageLogoLinkDisplayed(), "The general page footer home page logo link isn't displayed");
        //assert general page footer simplo shop platform subtext is displayed
        assertTrue(generalPage.isFooterSimploShopPlatformSubtextDisplayed(), "The general page footer simplo shop platform subtext isn't displayed");
        //assert general page footer simplo shop platform link is displayed
        assertTrue(generalPage.isFooterSimploShopPlatformLinkDisplayed(), "The general page footer newsletter simplo shop platform link isn't displayed");
        //categories section
        //assert general page footer categories section title is displayed
        assertTrue(generalPage.isFooterCategoriesSectionTitleDisplayed(), "The general page footer categories section title isn't displayed");
        //list elements
        //assert general page footer categories section links are displayed (as a list)
        assertTrue(generalPage.isFooterCategoriesLinkDisplayed(), "The general page footer categories section links aren't displayed");
        //rooms section
        //assert general page footer rooms section title is displayed
        assertTrue(generalPage.isFooterRoomsSectionTitleDisplayed(), "The general page footer rooms section title isn't displayed");
        //list elements
        //assert general page footer rooms section links are displayed (as a list)
        assertTrue(generalPage.isFooterRoomsLinkDisplayed(), "The general page footer rooms section links aren't displayed");
        //contact us section
        //assert general page footer contact us section title is displayed
        assertTrue(generalPage.isFooterContactUsSectionTitleDisplayed(), "The general page footer contact us section title isn't displayed");
        //assert general page footer contact us phone subtext is displayed
        assertTrue(generalPage.isFooterPhoneSubtextDisplayed(), "The general page footer contact us section phone subtext isn't displayed");
        //assert general page footer contact us phone is displayed
        assertTrue(generalPage.isFooterPhoneDisplayed(), "The general page footer contact us section phone isn't displayed");
        //assert general page footer contact us email subtext is displayed
        assertTrue(generalPage.isFooterEmailSubtextDisplayed(), "The general page footer contact us section email subtext isn't displayed");
        //assert general page footer contact us email is displayed
        assertTrue(generalPage.isFooterEmailDisplayed(), "The general page footer contact us section email isn't displayed");
        //follow us section
        //assert general page footer follow us section title is displayed
        assertTrue(generalPage.isFooterFollowUsSectionTitleDisplayed(), "The general page footer follow us section title isn't displayed");
        //assert general page footer follow us section facebook icon is displayed
        assertTrue(generalPage.isFooterFacebookIconDisplayed(), "The general page footer follow us facebook icon isn't displayed");
        //assert general page footer follow us section instagram icon is displayed
        assertTrue(generalPage.isFooterInstagramIconDisplayed(), "The general page footer follow us instagram icon isn't displayed");
        //created by section
        //assert general page footer created by simplo link is displayed
        assertTrue(generalPage.isFooterCreatedBySimploLinkDisplayed(), "The general page footer created by simplo link isn't displayed");
        //assert general page footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The general page footer copyright text isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page web element assert test method
    default void isHomePageWebElementDisplayed(HomePage homePage){
        //carousel section
        //assert home page carousel image scroll left button is displayed
        assertTrue(homePage.isHomePageCarouselImgScrollLeftButtonDisplayed(), "The home page carousel image scroll left button isn't displayed");
        //assert home page carousel image scroll right button is displayed
        assertTrue(homePage.isHomePageCarouselImgScrollRightButtonDisplayed(), "The home page carousel image scroll right button isn't displayed");
        //assert home page carousel pagination buttons are displayed (as a list)
        assertTrue(homePage.isHomePageCarouselPaginationButtonDisplayed(), "The home page carousel pagination buttons aren't displayed");
        //assert home page carousel images are displayed (as a list)
        assertTrue(homePage.isHomePageCarouselImageDisplayed(), "The home page carousel images aren't displayed");
        //buy for room category section
        //assert home page buy for room category section title is displayed
        assertTrue(homePage.isHomePageRoomCategorySectionTitleDisplayed(), "The home page buy for room category section title isn't displayed");
        //assert home page room category images are displayed (as a list)
        assertTrue(homePage.isHomePageRoomCategoryImgDisplayed(), "The home page room category images aren't displayed");
        //assert home page room category name links are displayed (as a list)
        assertTrue(homePage.isHomePageRoomCategoryNameLinkDisplayed(), "The home page room category name links aren't displayed");
        //chosen products section
        //assert home page chosen products section title is displayed
        assertTrue(homePage.isHomePageChosenProductsSectionTitleDisplayed(), "The home page chosen products section title isn't displayed");
        //assert home page chosen products scroll left button is displayed
        assertTrue(homePage.isHomePageChosenProductsScrollLeftButtonDisplayed(), "The home page chosen products scroll left button isn't displayed");
        //assert home page chosen products scroll right button is displayed
        assertTrue(homePage.isHomePageChosenProductsScrollRightButtonDisplayed(), "The home page chosen products scroll right button isn't displayed");
        //assert home page chosen product add to wishlist buttons are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductAddToWishlistButtonDisplayed(), "The home page chosen product add to wishlist buttons aren't displayed");
        //assert home page chosen product add to cart buttons are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductAddToCartButtonDisplayed(), "The home page chosen product add to cart buttons aren't displayed");
        //assert home page chosen product images are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductImageDisplayed(), "The home page chosen product images aren't displayed");
        //assert home page chosen product names are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductNameDisplayed(), "The home page chosen product names aren't displayed");
        //assert home page chosen product unit prices are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductUnitPriceDisplayed(), "The home page chosen product unit prices aren't displayed");
        //assert home page chosen product details buttons are displayed (as a list)
        assertTrue(homePage.isHomePageChosenProductDetailsButtonDisplayed(), "The home page chosen product details buttons aren't displayed");
        //garden furniture section
        //assert home page garden furniture image is displayed
        assertTrue(homePage.isHomePageGardenFurnitureImgDisplayed(), "The home page garden furniture image isn't displayed");
        //assert home page garden furniture title is displayed
        assertTrue(homePage.isHomePageGardenFurnitureTitleDisplayed(), "The home page garden furniture title isn't displayed");
        //assert home page garden furniture button is displayed
        assertTrue(homePage.isHomePageGardenFurnitureButtonDisplayed(), "The home page garden furniture button isn't displayed");
        //latest articles section
        //assert home page latest articles section title is displayed
        assertTrue(homePage.isHomePageLatestArticleSectionTitleDisplayed(), "The home page latest articles section title isn't displayed");
        //assert home page latest article images are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleImageDisplayed(), "The home page latest article images aren't displayed");
        //assert home page latest article titles are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleTitleDisplayed(), "The home page latest article titles aren't displayed");
        //assert home page latest article texts are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleTextDisplayed(), "The home page latest article texts aren't displayed");
        //assert home page latest article user profile images are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleUserProfileImgDisplayed(), "The home page latest article user profile images aren't displayed");
        //assert home page latest article usernames are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleUsernameDisplayed(), "The home page latest article usernames aren't displayed");
        //assert home page latest article time posted stamps are displayed (as a list)
        assertTrue(homePage.isHomePageLatestArticleTimePostedDisplayed(), "The home page latest article time posted stamps aren't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
