package cz.simploshop.demo.web.element.asserts;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;

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
        //assertTrue(homePage.isHomePageChosenProductAddToWishlistButtonDisplayed(), "The home page chosen product add to wishlist buttons aren't displayed");
        //assert home page chosen product add to cart buttons are displayed (as a list)
        //assertTrue(homePage.isHomePageChosenProductAddToCartButtonDisplayed(), "The home page chosen product add to cart buttons aren't displayed");
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

    //register account modal web element assert test method
    default void isRegisterAccountModalWebElementDisplayed(RegisterAccountModal registerAccountModal) {
        //assert register account modal title is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalTitleDisplayed(), "The register account modal title isn't displayed");
        //input form
        //assert register account modal first name subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalFirstNameSubtextDisplayed(), "The register account modal first name subtext isn't displayed");
        //assert register account modal first name input field is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalFirstNameInputFieldDisplayed(), "The register account modal first name input field isn't displayed");
        //assert register account modal last name subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalLastNameSubtextDisplayed(), "The register account modal last name subtext isn't displayed");
        //assert register account modal last name input field is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalLastNameInputFieldDisplayed(), "The register account modal last name input field isn't displayed");
        //assert register account modal email subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalEmailSubtextDisplayed(), "The register account modal email subtext isn't displayed");
        //assert register account modal email input field is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalEmailInputFieldDisplayed(), "The register account modal email input field isn't displayed");
        //assert register account modal password subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPasswordSubtextDisplayed(), "The register account modal password subtext isn't displayed");
        //assert register account modal view password button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalViewPasswordButtonDisplayed(), "The register account modal view password button isn't displayed");
        //assert register account modal password input field is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPasswordInputFieldDisplayed(), "The register account modal password input field isn't displayed");
        //assert register account modal confirm password subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalConfirmPasswordSubtextDisplayed(), "The register account modal confirm password subtext isn't displayed");
        //assert register account modal view confirm password button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalViewConfirmPasswordButtonDisplayed(), "The register account modal view confirm password button isn't displayed");
        //assert register account modal confirm password input field is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalConfirmPasswordInputFieldDisplayed(), "The register account modal confirm password input field isn't displayed");
        //assert register account modal password strength meter is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPasswordStrengthMeterDisplayed(), "The register account modal password strength meter isn't displayed");
        //assert register account modal password strength dropdown button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPasswordStrengthLevelDropdownButtonDisplayed(), "The register account modal password strength level dropdown button isn't displayed");
        //assert register account modal password strength level text is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPasswordStrengthLevelTextDisplayed(), "The register account modal password strength level text isn't displayed");
        //assert register account modal sub to newsletter subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalSubToNewsletterSubtextDisplayed(), "The register account modal sub to newsletter subtext isn't displayed");
        //assert register account modal sub to newsletter checkbox is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalSubToNewsletterCheckboxDisplayed(), "The register account modal sub to newsletter checkbox isn't displayed");
        //assert register account modal register button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalRegisterButtonDisplayed(), "The register account modal register button isn't displayed");
        //alternatives section
        //assert register account modal or choice subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalOrChoiceSubtextDisplayed(), "The register account modal or choice subtext isn't displayed");
        //assert register account modal continue with subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalContinueWithSubtextDisplayed(), "The register account modal continue with subtext isn't displayed");
        //assert register account modal first name subtext is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalFirstNameSubtextDisplayed(), "The register account modal first name subtext isn't displayed");
        //assert register account modal google button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalGoogleButtonDisplayed(), "The register account modal google button isn't displayed");
        //assert register account modal seznam cz portal button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalSeznamCzPortalButtonDisplayed(), "The register account modal seznam cz portal button isn't displayed");
        //assert register account modal privacy policy and terms agreement text is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPrivacyPolicyAndTermsAgreementTextDisplayed(), "The register account modal privacy policy and terms agreement text isn't displayed");
        //assert register account modal privacy policy link is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalPrivacyPolicyLinkDisplayed(), "The register account modal privacy policy link isn't displayed");
        //assert register account modal terms link is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalTermsLinkDisplayed(), "The register account modal terms link isn't displayed");
        //register benefits section
        //assert register account modal register benefits section title is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalRegisterBenefitsSectionTitleDisplayed(), "The register account modal register benefits section title isn't displayed");
        //assert register account modal close button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalCloseButtonDisplayed(), "The register account modal close button isn't displayed");
        //assert register account modal register benefits login subtitle is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalRegisterBenefitsLoginSubtitleDisplayed(), "The register account register benefits login subtitle isn't displayed");
        //assert register account modal register benefits login button is displayed
        assertTrue(registerAccountModal.isRegisterAccountModalRegisterBenefitsLoginButtonDisplayed(), "The register account modal register benefits login button isn't displayed");
        //assert register account modal register benefits are displayed (as a list)
        assertTrue(registerAccountModal.isRegisterAccountModalRegisterBenefitElementsDisplayed(), "The register account modal register benefits aren't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //account information page breadcrumb web element assert test method
    default void isAccountInfoPageBreadcrumbWebElementDisplayed(AccountInformationPage accountInformationPage) {
        //assert account information page breadcrumb is displayed
        assertTrue(accountInformationPage.isAccountInfoPageBreadcrumbDisplayed(), "The account information page breadcrumb isn't displayed");
    }

    //account information page my user section web element assert test method (some other pages may have it0
    default void isAccountInfoPageMyUserSectionWebElementDisplayed(AccountInformationPage accountInformationPage) {
        //assert account information page my user section title is displayed
        assertTrue(accountInformationPage.isAccountInfoPageMyUserSectionTitleDisplayed(), "The account information page my user section title isn't displayed");
        //assert account information page my user section menu options are displayed (as a list)
        assertTrue(accountInformationPage.isAccountInfoPageMyUserMenuOptionsDisplayed(), "The account information page my user section menu options aren't displayed");
    }

    //account information page breadcrumb web element assert test method
    default void isAccountInfoBreadcrumbWebElementDisplayed(AccountInformationPage accountInformationPage) {
        //assert account information page breadcrumb is displayed
        assertTrue(accountInformationPage.isAccountInfoPageBreadcrumbDisplayed(), "The account information page breadcrumb isn't displayed");
    }

    //account information page web element assert method
    default void isAccountInfoPageWebElementDisplayed(AccountInformationPage accountInformationPage) {
        //assert account information page title is displayed
        assertTrue(accountInformationPage.isAccountInfoPageTitleDisplayed(), "The account information page title isn't displayed");
        //contact info section title
        //assert account information page contact info section title is displayed
        assertTrue(accountInformationPage.isAccountInfoPageContactInfoSectionDisplayed(), "The account information page contact info section title isn't displayed");
        //assert account information page contact info section first name subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageFirstNameSubtextDisplayed(), "The account information page contact info section first name subtext isn't displayed");
        //assert account information page contact info section first name input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPageFirstNameInputFieldDisplayed(), "The account information page contact info section first name input field isn't displayed");
        //assert account information page contact info section last name subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageLastNameSubtextDisplayed(), "The account information page contact info section last name subtext isn't displayed");
        //assert account information page contact info section last name input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPageLastNameInputFieldDisplayed(), "The account information page contact info section last name input field isn't displayed");
        //assert account information page contact info section email subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageEmailSubtextDisplayed(), "The account information page contact info section email subtext isn't displayed");
        //assert account information page contact info section email input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPageEmailInputFieldDisplayed(), "The account information page contact info section email input field isn't displayed");
        //assert account information page contact info sub to newsletter subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageSubNewsletterSubtextDisplayed(), "The account information page contact info section sub to newsletter subtext isn't displayed");
        //assert account information page contact info sub to newsletter checkbox is displayed
        assertTrue(accountInformationPage.isAccountInfoPageSubNewsletterCheckboxDisplayed(), "The account information page contact info sub to newsletter checkbox isn't displayed");
        //assert account information page contact info section apply changes button is displayed
        assertTrue(accountInformationPage.isAccountInfoPageApplyChangesButtonDisplayed(), "The account information page contact info section apply changes button isn't displayed");
        //password section
        //assert account information page password section title is displayed
        assertTrue(accountInformationPage.isAccountInfoPagePasswordSectionTitleDisplayed(), "The account information page password section title isn't displayed");
        //assert account information page password section password input field subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPagePasswordSubtextDisplayed(), "The account information page password section password input field subtext isn't displayed");
        //assert account information page password section password input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPagePasswordInputFieldDisplayed(), "The account information page password section password input field isn't displayed");
        //assert account information page password section new password subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageNewPasswordSubtextDisplayed(), "The account information page password section new password subtext isn't displayed");
        //assert account information page password section new password input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPageNewPasswordInputFieldDisplayed(), "The account information page password section new password input field isn't displayed");
        //assert account information page password section confirm  new password subtext is displayed
        assertTrue(accountInformationPage.isAccountInfoPageConfirmNewPasswordSubtextDisplayed(), "The account information page password section confirm new password subtext isn't displayed");
        //assert account information page password section confirm new password input field is displayed
        assertTrue(accountInformationPage.isAccountInfoPageConfirmNewPasswordInputFieldDisplayed(), "The account information page password section confirm new password input field isn't displayed");
        //assert account information page password section change password button is displayed
        assertTrue(accountInformationPage.isAccountInfoPageChangePasswordButtonDisplayed(), "The account information page password section change password button  isn't displayed");
        //assert account information page delete user button is displayed
        assertTrue(accountInformationPage.isAccountInfoPageDeleteUserButtonDisplayed(), "The account information page delete user button isn't displayed");
    }

    //account information page account removal modal web element assert method
    default void isAccountRemovalModalWebElementDisplayed(AccountInformationPage accountInformationPage) {
        //assert account removal modal title is displayed
        assertTrue(accountInformationPage.isUserAccountRemovalModalTitleDisplayed(), "The account removal modal title isn't displayed");
        //assert account removal modal close button is displayed
        assertTrue(accountInformationPage.isUserAccountRemovalModalCloseButtonDisplayed(), "The account removal modal close button isn't displayed");
        //assert account removal modal text is displayed
        assertTrue(accountInformationPage.isUserAccountRemovalModalTextDisplayed(), "The account removal modal close text isn't displayed");
        //assert account removal modal cancel button is displayed
        assertTrue(accountInformationPage.isUserAccountRemovalModalCancelButtonDisplayed(), "The account removal modal cancel button isn't displayed");
        //assert account removal modal delete button is displayed
        assertTrue(accountInformationPage.isUserAccountRemovalModalDeleteButtonDisplayed(), "The account removal modal delete button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //addresses dashboard page web element assert method
    default void isAddressesDashPageWebElementDisplayed(AddressesDashboardPage addressesDashboardPage) {
        //assert addresses dashboard page title is displayed
        assertTrue(addressesDashboardPage.isAddressesDashboardPageTitleDisplayed(), "The addresses dashboard page title isn't displayed");
        //assert addresses dashboard page add address button is displayed
        assertTrue(addressesDashboardPage.isAddressesDashboardPageAddAddressButtonDisplayed(), "The addresses dashboard page add address button isn't displayed");
        //assert addresses dashboard page shipping address section title is displayed
        assertTrue(addressesDashboardPage.isAddressesDashboardPageShippingAddressSectionTitleDisplayed(), "The addresses dashboard page shipping address title isn't displayed");
        //assert addresses dashboard page billing address section title is displayed
        assertTrue(addressesDashboardPage.isAddressesDashboardPageBillingAddressSectionTitleDisplayed(), "The addresses dashboard page billing address title isn't displayed");
    }

    //add new address modal web element assert test method
    default void isAddNewAddressModalWebElementDisplayed(AddNewAddressModal addNewAddressModal) {
        //assert add new address modal title is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalTitleDisplayed(), "The add new address modal title isn't displayed");
        //assert add new address modal close button is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCloseButtonDisplayed(), "The add new address modal close button isn't displayed");
        //input form
        //assert add new address modal first name subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalFirstNameSubtextDisplayed(), "The add new address modal first name subtext isn't displayed");
        //assert add new address modal first name input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalFirstNameInputFieldDisplayed(), "The add new address modal first name input field isn't displayed");
        //assert add new address modal last name subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalLastNameSubtextDisplayed(), "The add new address modal last name subtext isn't displayed");
        //assert add new address modal last name input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalLastNameInputFieldDisplayed(), "The add new address modal last name input field isn't displayed");
        //assert add new address modal street subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalStreetSubtextDisplayed(), "The add new address modal street subtext isn't displayed");
        //assert add new address modal street input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalStreetInputFieldDisplayed(), "The add new address modal street input field isn't displayed");
        //assert add new address modal zip code subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalZipCodeSubtextDisplayed(), "The add new address modal zip code subtext isn't displayed");
        //assert add new address modal zip code input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalZipCodeInputFieldDisplayed(), "The add new address modal zip code input field isn't displayed");
        //assert add new address modal city subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCitySubtextDisplayed(), "The add new address modal city subtext isn't displayed");
        //assert add new address modal city input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCityInputFieldDisplayed(), "The add new address modal city input field isn't displayed");
        //assert add new address modal country code subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCountryCodeSubtextDisplayed(), "The add new address modal country code subtext isn't displayed");
        //assert add new address modal country code dropdown menu is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCountryCodeDropdownMenuDisplayed(), "The add new address modal country code dropdown menu isn't displayed");
        //assert add new address modal phone subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalPhoneSubtextDisplayed(), "The add new address modal phone subtext isn't displayed");
        //assert add new address modal phone input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalPhoneInputFieldDisplayed(), "The add new address modal phone input field isn't displayed");
        //assert add new address modal country subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCountrySubtextDisplayed(), "The add new address modal country subtext isn't displayed");
        //assert add new address modal country input field is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalCountryDropdownMenuDisplayed(), "The add new address modal country input field isn't displayed");
        //checkbox elements
        //assert add new address modal add company details subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalAddCompanyDetailsSubtextDisplayed(), "The add new address modal add company details subtext isn't displayed");
        //assert add new address modal add company details checkbox is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalAddCompanyDetailsCheckboxDisplayed(), "The add new address modal add company details checkbox isn't displayed");
        //assert add new address modal default billing address subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalDefaultBillAddressSubtextDisplayed(), "The add new address modal default billing address subtext isn't displayed");
        //assert add new address modal default billing address checkbox is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalDefaultBillAddressCheckboxDisplayed(), "The add new address modal default billing address checkbox isn't displayed");
        //assert add new address modal default shipping address subtext is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalDefaultShipAddressSubtextDisplayed(), "The add new address modal default shipping address subtext isn't displayed");
        //assert add new address modal default shipping address checkbox is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalDefaultShipAddressCheckboxDisplayed(), "The add new address modal default shipping address checkbox isn't displayed");
        //assert add new address modal add address button is displayed
        assertTrue(addNewAddressModal.isAddNewAddressModalAddAddressButtonDisplayed(), "The add new address modal add address button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login account modal web element assert test method
    default void isLoginAccountModalWebElementDisplayed(LoginAccountModal loginAccountModal) {
        //assert login account modal title is displayed
        assertTrue(loginAccountModal.isLoginAccountModalTitleDisplayed(), "The login account modal title isn't displayed");
        //login section
        //input form
        //assert login account modal email subtext is displayed
        assertTrue(loginAccountModal.isLoginAccountModalEmailSubtextDisplayed(), "The login account modal email subtext isn't displayed");
        //assert login account modal email input field is displayed
        assertTrue(loginAccountModal.isLoginAccountModalEmailInputFieldDisplayed(), "The login account modal email input field isn't displayed");
        //assert login account modal password subtext is displayed
        assertTrue(loginAccountModal.isLoginAccountModalPasswordSubtextDisplayed(), "The login account modal password subtext isn't displayed");
        //assert login account modal password input field is displayed
        assertTrue(loginAccountModal.isLoginAccountModalPasswordInputFieldDisplayed(), "The login account modal password input field isn't displayed");
        //assert login account modal login button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalLoginButtonDisplayed(), "The login account modal login button isn't displayed");
        //alternatives section
        //assert login account modal or subtext is displayed
        assertTrue(loginAccountModal.isLoginAccountModalOrSubtextDisplayed(), "The login account modal or subtext isn't displayed");
        //assert login account modal continue with subtext is displayed
        assertTrue(loginAccountModal.isLoginAccountModalContinueWithSubtextDisplayed(), "The login account modal continue with subtext isn't displayed");
        //assert login account modal google button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalGoogleButtonDisplayed(), "The login account modal google button isn't displayed");
        //assert login account modal seznam cz portal button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalSeznamCzPortalButtonDisplayed(), "The login account modal seznam cz portal button isn't displayed");
        //register section
        //assert login account modal register section register subtitle is displayed
        assertTrue(loginAccountModal.isLoginAccountModalRegisterSubtitleDisplayed(), "The login account modal register section register subtitle isn't displayed");
        //assert login account modal close button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalCloseButtonDisplayed(), "The login account modal close button isn't displayed");
        //assert login account modal register section register button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalRegisterButtonDisplayed(), "The login account modal register section register button isn't displayed");
        //assert login account modal register section forgot password subtitle is displayed
        assertTrue(loginAccountModal.isLoginAccountModalForgotPasswordSubtitleDisplayed(), "The login account modal register section forgot password subtitle isn't displayed");
        //assert login account modal register section forgot password button is displayed
        assertTrue(loginAccountModal.isLoginAccountModalForgotPasswordButtonDisplayed(), "The login account modal register section forgot password button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
