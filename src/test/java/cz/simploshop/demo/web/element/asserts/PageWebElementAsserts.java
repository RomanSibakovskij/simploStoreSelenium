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

    //shopping cart modal web element assert test method
    default void isShoppingCartModalWebElementDisplayed(ShoppingCartModal shoppingCartModal){
        //assert shopping cart modal title is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalTitleDisplayed(), "The shopping cart modal title isn't displayed");
        //assert shopping cart close modal button is displayed
        assertTrue(shoppingCartModal.isShoppingCartCloseModalButtonDisplayed(), "The shopping cart close modal button isn't displayed");
        //assert shopping cart modal free shipping text is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalFreeShippingTextDisplayed(), "The shopping cart modal free shipping text isn't displayed");
        //assert shopping cart modal free shipping bar is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalFreeShippingBarDisplayed(), "The shopping cart modal free shipping bar isn't displayed");
        //product table
        //assert shopping cart modal product images are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductImgDisplayed(), "The shopping cart modal product images aren't displayed");
        //assert shopping cart modal product name links are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductNameDisplayed(), "The shopping cart modal product name links aren't displayed");
        //assert shopping cart modal product unit prices are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductUnitPriceDisplayed(), "The shopping cart modal product unit prices aren't displayed");
        //assert shopping cart modal product quantity decrease buttons are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductQtyDecreaseButtonDisplayed(), "The shopping cart modal product quantity decrease buttons aren't displayed");
        //assert shopping cart modal product quantity input fields are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductQtyInputFieldDisplayed(), "The shopping cart modal product quantity input fields aren't displayed");
        //assert shopping cart modal product quantity increase buttons are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductQtyIncreaseButtonDisplayed(), "The shopping cart modal product quantity increase buttons aren't displayed");
        //assert shopping cart modal product remove buttons are displayed (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductRemoveButtonDisplayed(), "The shopping cart modal product remove buttons aren't displayed");
        //summary section
        //assert shopping cart modal total subtext is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalTotalSubtextDisplayed(), "The shopping cart modal total subtext isn't displayed");
        //assert shopping cart modal without shipping subtext is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalWithoutShippingSubtextDisplayed(), "The shopping cart modal without shipping subtext isn't displayed");
        //assert shopping cart modal total price is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalTotalPriceDisplayed(), "The shopping cart modal total price isn't displayed");
        //assert shopping cart modal proceed to cart button is displayed
        assertTrue(shoppingCartModal.isShoppingCartModalProceedToCartButtonDisplayed(), "The shopping cart modal proceed to cart button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//single category dashboard page aside section in stock web element assert test method (not all categories have this block)
default void isSingleCategoryDashPageAsideInStockWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
    //assert single category dashboard page aside section in stock subtitle is displayed
    assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockSubtitleDisplayed(), "The single category dashboard page aside section in stock subtitle isn't displayed");
    //assert single category dashboard page aside section in stock subtext is displayed
    assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockSubtextDisplayed(), "The single category dashboard page aside section in stock subtext isn't displayed");
    //assert single category dashboard page aside section in stock checkbox is displayed
    assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockCheckboxDisplayed(), "The single category dashboard page aside section in stock checkbox isn't displayed");
}

    //single category dashboard page aside section web element assert test method (not all categories have this element0
    default void isSingleCategoryDashPageFurnitureAsideWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //brand
        //assert single category dashboard page aside section brand subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideBrandSubtitleDisplayed(), "The single category dashboard page aside section brand subtitle isn't displayed");
        //assert single category dashboard page aside section brand subtexts are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideBrandSubtextDisplayed(), "The single category dashboard page aside section brand subtexts aren't displayed");
        //assert single category dashboard page aside section brand checkboxes are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideBrandCheckboxDisplayed(), "The single category dashboard page aside section brand checkboxes aren't displayed");
        //price
        //assert single category dashboard page aside section price subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsidePriceSubtitleDisplayed(), "The single category dashboard page aside section price subtitle isn't displayed");
        //assert single category dashboard page aside section price slider left button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsidePriceSliderButtonLeftDisplayed(), "The single category dashboard page aside section price slider left button isn't displayed");
        //assert single category dashboard page aside section price slider right button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsidePriceSliderButtonRightDisplayed(), "The single category dashboard page aside section price slider right button isn't displayed");
        //assert single category dashboard page aside section price from input field is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsidePriceFromInputFieldDisplayed(), "The single category dashboard page aside section price from input field isn't displayed");
        //assert single category dashboard page aside section price to input field is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsidePriceToInputFieldDisplayed(), "The single category dashboard page aside section price to input field isn't displayed");
        //height
        //assert single category dashboard page aside section height subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightSubtitleDisplayed(), "The single category dashboard page aside section height subtitle isn't displayed");
        //assert single category dashboard page aside section height subtexts are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightSubtextDisplayed(), "The single category dashboard page aside section height subtexts aren't displayed");
        //assert single category dashboard page aside section height checkboxes are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightCheckboxDisplayed(), "The single category dashboard page aside section height checkboxes aren't displayed");
        //color
        //assert single category dashboard page aside section color subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideColorSubtitleDisplayed(), "The single category dashboard page aside section color subtitle isn't displayed");
        //assert single category dashboard page aside section color buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideColorButtonDisplayed(), "The single category dashboard page aside section color buttons aren't displayed");
    }

    //single category dashboard page aside section web element assert test method (div gets shifted up)
    default void isSingleCategoryDashPageAsideWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //brand
        //assert single category dashboard page aside section brand subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockSubtitleDisplayed(), "The single category dashboard page aside section brand subtitle isn't displayed");
        //assert single category dashboard page aside section brand subtexts are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockSubtextDisplayed(), "The single category dashboard page aside section brand subtexts aren't displayed");
        //assert single category dashboard page aside section brand checkboxes are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideInStockCheckboxDisplayed(), "The single category dashboard page aside section brand checkboxes aren't displayed");
        //price
        //assert single category dashboard page aside section price subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherAsidePriceSubtitleDisplayed(), "The single category dashboard page aside section price subtitle isn't displayed");
        //assert single category dashboard page aside section price slider left button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherPriceSliderButtonLeftDisplayed(), "The single category dashboard page aside section price slider left button isn't displayed");
        //assert single category dashboard page aside section price slider right button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherPriceSliderButtonRightDisplayed(), "The single category dashboard page aside section price slider right button isn't displayed");
        //assert single category dashboard page aside section price from input field is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherPriceFromInputFieldDisplayed(), "The single category dashboard page aside section price from input field isn't displayed");
        //assert single category dashboard page aside section price to input field is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherPriceToInputFieldDisplayed(), "The single category dashboard page aside section price to input field isn't displayed");
        //height
        //assert single category dashboard page aside section height subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightSubtitleDisplayed(), "The single category dashboard page aside section height subtitle isn't displayed");
        //assert single category dashboard page aside section height subtexts are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightSubtextDisplayed(), "The single category dashboard page aside section height subtexts aren't displayed");
        //assert single category dashboard page aside section height checkboxes are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageAsideHeightCheckboxDisplayed(), "The single category dashboard page aside section height checkboxes aren't displayed");
        //color
        //assert single category dashboard page aside section color subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherAsideColorSubtitleDisplayed(), "The single category dashboard page aside section color subtitle isn't displayed");
        //assert single category dashboard page aside section color buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageOtherAsideColorButtonDisplayed(), "The single category dashboard page aside section color buttons aren't displayed");
    }

    //single category dashboard page main section subcategory web element assert test method (not all categories have this block)
    default void isSingleCategoryDashPageSubcategoryWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //assert single category dashboard page subtitle is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSubtitleDisplayed(), "The single category dashboard page subtitle isn't displayed");
        //assert single category dashboard page subcategories are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSubcategoryDisplayed(), "The single category dashboard page subcategories aren't displayed");
        //assert single category dashboard page subcategory images are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSubcategoryImgDisplayed(), "The single category dashboard page subcategory images aren't displayed");
        //assert single category dashboard page subcategory names are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSubcategoryNameDisplayed(), "The single category dashboard page subcategory names aren't displayed");
        //assert single category dashboard page collapse text button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageCollapseTextButtonDisplayed(), "The single category dashboard page collapse text button isn't displayed");
    }

    //single category dashboard page main section web element assert test method
    default void isSingleCategoryDashPageWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //assert single category dashboard page title is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageTitleDisplayed(), "The single category dashboard page title isn't displayed");
        //assert single category dashboard page product view count is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductViewCountDisplayed(), "The single category dashboard page product view count isn't displayed");
        //assert single category dashboard page sort by subtext is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSortBySubtextDisplayed(), "The single category dashboard page sort by subtext isn't displayed");
        //assert single category dashboard page sort by dropdown menu is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageSortByDropdownMenuDisplayed(), "The single category dashboard page product sort by dropdown menu isn't displayed");
        //product table
        //assert single category dashboard page product add to wishlist buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductAddToWishlistButtonDisplayed(), "The single category dashboard page product add to wishlist buttons aren't displayed");
        //assert single category dashboard page product images are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductImgDisplayed(), "The single category dashboard page product images aren't displayed");
        //assert single category dashboard page product names are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductNameDisplayed(), "The single category dashboard page product names aren't displayed");
        //assert single category dashboard page product unit prices are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductUnitPriceDisplayed(), "The single category dashboard page product unit prices aren't displayed");
        //assert single category dashboard page product add to cart buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductAddToCartButtonDisplayed(), "The single category dashboard page product add to cart buttons aren't displayed");
        //assert single category dashboard page product details buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageProductDetailsButtonDisplayed(), "The single category dashboard page product details buttons aren't displayed");
    }

    //single category dashboard page main section pagination web element assert test method (not all categories have this block)
    default void isSingleCategoryDashPagePaginationWebElementDisplayed(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //assert single category dashboard page pagination buttons are displayed (as a list)
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPagePaginationButtonDisplayed(), "The single category dashboard page pagination buttons aren't displayed");
        //assert single category dashboard page view more products button is displayed
        assertTrue(singleCategoryDashboardPage.isSingleCategoryDashPageViewMoreButtonDisplayed(), "The single category dashboard page view more products button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //search product modal web element assert test method
    default void isSearchProductModalWebElementDisplayed(SearchProductModal searchProductModal){
        //assert search product modal top phrases subtext is displayed
        assertTrue(searchProductModal.isSearchProductModalTopPhrasesSubtextDisplayed(), "The search product modal top phrases subtext isn't displayed");
        //assert search product modal products subtext is displayed
        assertTrue(searchProductModal.isSearchProductModalProductsSubtextDisplayed(), "The search product modal products subtext isn't displayed");
        //assert search product modal products count is displayed
        assertTrue(searchProductModal.isSearchProductModalProductsCountDisplayed(), "The search product modal products count isn't displayed");
        //category section
        //assert search product modal category section subtext is displayed
        assertTrue(searchProductModal.isSearchProductModalCategorySubtextDisplayed(), "The search product modal category section subtext isn't displayed");
        //assert search product modal category section text is displayed
        assertTrue(searchProductModal.isSearchProductModalCategoryTextDisplayed(), "The search product modal category section ext isn't displayed");
        //brands section
        //assert search product modal brands section subtext is displayed
        assertTrue(searchProductModal.isSearchProductModalBrandsSubtextDisplayed(), "The search product modal brands section subtext isn't displayed");
        //assert search product modal brands section text is displayed
        assertTrue(searchProductModal.isSearchProductModalBrandsTextDisplayed(), "The search product modal brands section text isn't displayed");
        //articles section
        //assert search product modal articles section subtext is displayed
        assertTrue(searchProductModal.isSearchProductModalArticlesSubtextDisplayed(), "The search product modal articles section subtext isn't displayed");
        //assert search product modal articles section text is displayed
        assertTrue(searchProductModal.isSearchProductModalArticlesTextDisplayed(), "The search product modal articles section text isn't displayed");
        //products section
        //assert search product modal top phrases buttons are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalTopPhrasesButtonDisplayed(), "The search product modal top phrases buttons aren't displayed");
        //assert search product modal product images are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalProductImgDisplayed(), "The search product modal product images aren't displayed");
        //assert search product modal product brands are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalProductBrandDisplayed(), "The search product modal product brands aren't displayed");
        //assert search product modal product names are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalProductNameDisplayed(), "The search product modal product names aren't displayed");
        //assert search product modal product unit prices are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalProductUnitPriceDisplayed(), "The search product modal product unit prices aren't displayed");
        //assert search product modal product in stock tags are displayed (as a list)
        assertTrue(searchProductModal.isSearchProductModalProductInStockTagDisplayed(), "The search product modal product in stock tags aren't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//single product page web element assert test method
default void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage){
    //assert single product page additional images are displayed (as a list)
    assertTrue(singleProductPage.isSingleProductPageProductAdditionalImgDisplayed(), "The single product page additional images aren't displayed");
    //assert single product page main image is displayed
    assertTrue(singleProductPage.isSingleProductPageProductMainImageDisplayed(), "The single product page main image isn't displayed");
    //assert single product page add to wishlist button is displayed
    assertTrue(singleProductPage.isSingleProductPageProductAddToWishlistButtonDisplayed(), "The single product page add to wishlist button isn't displayed");
    //assert single product page product brand is displayed
    assertTrue(singleProductPage.isSingleProductPageProductBrandDisplayed(), "The single product page product brand isn't displayed");
    //assert single product page product name is displayed
    assertTrue(singleProductPage.isSingleProductPageProductNameDisplayed(), "The single product page product name isn't displayed");
    //assert single product page product description is displayed
    assertTrue(singleProductPage.isSingleProductPageProductDescriptionDisplayed(), "The single product page product description isn't displayed");
    //assert single product page view more link is displayed
    assertTrue(singleProductPage.isSingleProductPageProductViewMoreLinkDisplayed(), "The single product page view more link isn't displayed");
    //assert single product page product in stock count is displayed
    assertTrue(singleProductPage.isSingleProductPageProductInStockCountDisplayed(), "The single product page product in stock count isn't displayed");
    //assert single product page product unit price is displayed
    assertTrue(singleProductPage.isSingleProductPageProductUnitPriceDisplayed(), "The single product page product unit price isn't displayed");
    //assert single product page product quantity decrease button is displayed
    assertTrue(singleProductPage.isSingleProductPageProductQtyDecreaseButtonDisplayed(), "The single product page product quantity decrease button isn't displayed");
    //assert single product page product quantity input field is displayed
    assertTrue(singleProductPage.isSingleProductPageProductQtyInputFieldDisplayed(), "The single product page product quantity input field isn't displayed");
    //assert single product page product quantity increase button is displayed
    assertTrue(singleProductPage.isSingleProductPageProductQtyIncreaseButtonDisplayed(), "The single product page product quantity increase button isn't displayed");
    //assert single product page product add to cart button is displayed
    assertTrue(singleProductPage.isSingleProductPageProductAddToCartButtonDisplayed(), "The single product page product add to cart button isn't displayed");
    //assert single product page product shipping delivery estimate is displayed
    assertTrue(singleProductPage.isSingleProductPageProductShipDeliveryEstimateDisplayed(), "The single product page product shipping delivery estimate isn't displayed");
    //assert single product page product code is displayed
    assertTrue(singleProductPage.isSingleProductPageProductCodeDisplayed(), "The single product page product code isn't displayed");
    //product description section
    //assert single product page product description section button is displayed
    assertTrue(singleProductPage.isSingleProductPageProductDescSectionButtonDisplayed(), "The single product page product description section button isn't displayed");
    //assert single product page product description (in-section) is displayed
    assertTrue(singleProductPage.isSingleProductPageProductDescDisplayed(), "The single product page product description (in-section) isn't displayed");
    //assert single product page product description parameters subtitle is displayed
    assertTrue(singleProductPage.isSingleProductPageProductParamsSubtitleDisplayed(), "The single product page product description parameter subtitle isn't displayed");
    //assert single product page product description parameters data is displayed
    assertTrue(singleProductPage.isSingleProductPageProductParamsDataDisplayed(), "The single product page product description parameter data isn't displayed");
}

    //single product page reviews section web element assert test method
    default void isSingleProductPageReviewSectionWebElementDisplayed(SingleProductPage singleProductPage){
        //reviews section
        //assert single product page product reviews section button is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsSectionButtonDisplayed(), "The single product page product reviews section button isn't displayed");
        //assert single product page product add review button is displayed
        assertTrue(singleProductPage.isSingleProductPageAddProductReviewButtonDisplayed(), "The single product page product add review button isn't displayed");
        //assert single product page product reviews section is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsSectionButtonDisplayed(), "The single product page product reviews section isn't displayed");
        //assert single product page product review average score is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewAvgScoreDisplayed(), "The single product page product review average score isn't displayed");
        //assert single product page product review stars is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewStarsDisplayed(), "The single product page product review stars isn't displayed");
        //assert single product page product review count is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewCountDisplayed(), "The single product page product review count isn't displayed");
        //assert single product page product appearance subtext is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAppearanceSubtextDisplayed(), "The single product page product appearance subtext isn't displayed");
        //assert single product page product appearance bar is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAppearanceBarDisplayed(), "The single product page product appearance bar isn't displayed");
        //assert single product page product comfort subtext is displayed
        assertTrue(singleProductPage.isSingleProductPageProductComfortSubtextDisplayed(), "The single product page product comfort subtext isn't displayed");
        //assert single product page product comfort bar is displayed
        assertTrue(singleProductPage.isSingleProductPageProductComfortBarDisplayed(), "The single product page product comfort bar isn't displayed");
        //assert single product page product price subtext is displayed
        assertTrue(singleProductPage.isSingleProductPageProductPriceSubtextDisplayed(), "The single product page product price subtext isn't displayed");
        //assert single product page product price bar is displayed
        assertTrue(singleProductPage.isSingleProductPageProductPriceBarDisplayed(), "The single product page product price bar isn't displayed");
        //assert single product page product assembly ease subtext is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAssemblyEaseSubtextDisplayed(), "The single product page product assembly ease subtext isn't displayed");
        //assert single product page product assembly ease bar is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAssemblyEaseBarDisplayed(), "The single product page product assembly ease bar isn't displayed");
        //assert single product page product reviews display count is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsDisplayCountDisplayed(), "The single product page product reviews display count isn't displayed");
        //list elements
        //assert single product page product given review stars are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductGivenReviewStarsDisplayed(), "The single product page product given review stars aren't displayed");
        //assert single product page product review authors are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewAuthorDisplayed(), "The single product page product review authors aren't displayed");
        //assert single product page product review dates are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewDateDisplayed(), "The single product page product review dates aren't displayed");
        //assert single product page product review texts are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewTextDisplayed(), "The single product page product review texts aren't displayed");
        //assert single product page product review pagination buttons are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewPaginationButtonDisplayed(), "The single product page product review pagination buttons aren't displayed");
    }

    //single product page reviews section (no appearance) web element assert test method
    default void isSingleProductPageReviewSectionNoAppearanceWebElementDisplayed(SingleProductPage singleProductPage){
        //reviews section
        //assert single product page product reviews section button is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsSectionButtonDisplayed(), "The single product page product reviews section button isn't displayed");
        //assert single product page product add review button is displayed
        assertTrue(singleProductPage.isSingleProductPageAddProductReviewButtonDisplayed(), "The single product page product add review button isn't displayed");
        //assert single product page product reviews section is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsSectionButtonDisplayed(), "The single product page product reviews section isn't displayed");
        //assert single product page product review average score is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewAvgScoreDisplayed(), "The single product page product review average score isn't displayed");
        //assert single product page product review stars is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewStarsDisplayed(), "The single product page product review stars isn't displayed");
        //assert single product page product review count is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewCountDisplayed(), "The single product page product review count isn't displayed");
        //assert single product page product reviews display count is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsDisplayCountDisplayed(), "The single product page product reviews display count isn't displayed");
        //list elements
        //assert single product page product given review stars are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductGivenReviewStarsDisplayed(), "The single product page product given review stars aren't displayed");
        //assert single product page product review authors are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewAuthorDisplayed(), "The single product page product review authors aren't displayed");
        //assert single product page product review dates are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewDateDisplayed(), "The single product page product review dates aren't displayed");
        //assert single product page product review texts are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewTextDisplayed(), "The single product page product review texts aren't displayed");
        //assert single product page product review pagination buttons are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewPaginationButtonDisplayed(), "The single product page product review pagination buttons aren't displayed");
    }

    //single product page reviews section (when no reviews are displayed) web element assert test method
    default void isSingleProductPageNoReviewsSectionWebElementDisplayed(SingleProductPage singleProductPage){
        //reviews section
        //assert single product page product reviews section no reviews title is displayed
        assertTrue(singleProductPage.isSingleProductPageProductNoReviewsDisplayedTitleDisplayed(), "The single product page product reviews section no reviews title isn't displayed");
        //assert single product page product reviews section no reviews description is displayed
        assertTrue(singleProductPage.isSingleProductPageProductNoReviewsDisplayedDescDisplayed(), "The single product page product reviews section no reviews description isn't displayed");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //wishlist dashboard page web element assert test method
    default void isWishlistDashboardPageWebElementDisplayed(WishlistDashboardPage wishlistDashboardPage){
        //assert wishlist dashboard page title is displayed
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageTitleDisplayed(), "The wishlist dashboard page title isn't displayed");
        //list elements
        //assert wishlist dashboard page product cards are displayed (as a list)
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageCardDisplayed(), "The wishlist dashboard page product cards aren't displayed");
        //assert wishlist dashboard page product add to wishlist buttons are displayed (as a list)
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageAddToWishlistButtonDisplayed(), "The wishlist dashboard page product add to wishlist buttons aren't displayed");
        //assert wishlist dashboard page product images are displayed (as a list)
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageImgDisplayed(), "The wishlist dashboard page product images aren't displayed");
        //assert wishlist dashboard page product names are displayed (as a list)
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageNameDisplayed(), "The wishlist dashboard page product names aren't displayed");
        //assert wishlist dashboard page product unit prices are displayed (as a list)
        assertTrue(wishlistDashboardPage.isWishlistDashboardPageUnitPriceDisplayed(), "The wishlist dashboard page product unit prices aren't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add product review modal web element assert test method
    default void isAddProductReviewModalWebElementDisplayed(AddProductReviewModal addProductReviewModal){
        //assert add product review modal title is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalTitleDisplayed(), "The add product modal title isn't displayed");
        //assert add product review modal description is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalDescriptionDisplayed(), "The add product modal description isn't displayed");
        //assert add product review close modal button is displayed
        assertTrue(addProductReviewModal.isAddProductReviewCloseModalButtonDisplayed(), "The add product close modal button isn't displayed");
        //assert add product review modal review stars subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalReviewStarsSubtextDisplayed(), "The add product modal review stars subtext isn't displayed");
        //list elements
        //assert add product review modal review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalReviewStarDisplayed(), "The add product modal review stars aren't displayed");
        //singular elements
        //assert add product review modal review subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalReviewSubtextDisplayed(), "The add product modal review subtext isn't displayed");
        //assert add product review modal review input field is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalReviewInputFieldDisplayed(), "The add product modal review input field isn't displayed");
        //assert add product review modal send review button is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalSendReviewButtonDisplayed(), "The add product modal send review button isn't displayed");
    }

    //add product review modal additional web element assert test method (guest)
    default void isAddProductReviewModalGuestAdditionalWebElementDisplayed(AddProductReviewModal addProductReviewModal){
        //assert add product review modal author name subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalAuthorNameSubtextDisplayed(), "The add product modal author name subtext isn't displayed");
        //assert add product review modal author name input field is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalAuthorNameInputFieldDisplayed(), "The add product modal author name input field isn't displayed");
        //assert add product review modal parameter review subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalParameterReviewSubtextDisplayed(), "The add product modal author parameter review subtext isn't displayed");
        //assert add product review modal looks subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalLooksSubtextDisplayed(), "The add product modal author looks review subtext isn't displayed");
        //assert add product review modal comfort subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalComfortSubtextDisplayed(), "The add product modal author comfort review subtext isn't displayed");
        //assert add product review modal price subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalPriceSubtextDisplayed(), "The add product modal author price review subtext isn't displayed");
        //assert add product review modal assembly ease subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalAssemblyEaseSubtextDisplayed(), "The add product modal assembly ease review subtext isn't displayed");
        //list elements
        //assert add product review modal looks review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalLooksReviewStarDisplayed(), "The add product modal looks review stars aren't displayed");
        //assert add product review modal comfort review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalComfortReviewStarDisplayed(), "The add product modal comfort review stars aren't displayed");
        //assert add product review modal price review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalPriceReviewStarDisplayed(), "The add product modal price review stars aren't displayed");
        //assert add product review modal assembly ease view stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalAssemblyEaseReviewStarDisplayed(), "The add product modal assembly ease review stars aren't displayed");
    }

    //add product review modal additional web element assert test method (guest)
    default void isAddProductReviewModalAdditionalWebElementDisplayed(AddProductReviewModal addProductReviewModal){
        //assert add product review modal parameter review subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalParameterReviewSubtextDisplayed(), "The add product modal author parameter review subtext isn't displayed");
        //assert add product review modal looks subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalLooksSubtextDisplayed(), "The add product modal author looks review subtext isn't displayed");
        //assert add product review modal comfort subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalComfortSubtextDisplayed(), "The add product modal author comfort review subtext isn't displayed");
        //assert add product review modal price subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalPriceSubtextDisplayed(), "The add product modal author price review subtext isn't displayed");
        //assert add product review modal assembly ease subtext is displayed
        assertTrue(addProductReviewModal.isAddProductReviewModalAssemblyEaseSubtextDisplayed(), "The add product modal assembly ease review subtext isn't displayed");
        //list elements
        //assert add product review modal looks review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalLooksReviewStarDisplayed(), "The add product modal looks review stars aren't displayed");
        //assert add product review modal comfort review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalComfortReviewStarDisplayed(), "The add product modal comfort review stars aren't displayed");
        //assert add product review modal price review stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalPriceReviewStarDisplayed(), "The add product modal price review stars aren't displayed");
        //assert add product review modal assembly ease view stars are displayed (as a list)
        assertTrue(addProductReviewModal.isAddProductReviewModalAssemblyEaseReviewStarDisplayed(), "The add product modal assembly ease review stars aren't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
