package cz.simploshop.demo.text.element.asserts;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public interface PageTextElementAsserts {

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page warning box text element assert test method
    default void isGeneralPageWarningBoxTextElementAsExpected(GeneralPage generalPage){
        //assert general page warning box title is as expected
        assertEquals("UPOZORNĚNÍ", generalPage.getWarningBoxTitle(),"The general page warning box title doesn't match expectations");
        //assert general page warning box text is as expected
        assertEquals("Prohlížíte si demo šablonu e-shopové platformy simploSHOP®. Tento e-shop slouží pouze pro prezentační účely, takže všechna data jsou testovací a případná objednávka nebude vyřízena.", generalPage.getWarningBoxText(),"The general page warning box text doesn't match expectations");
    }

    //general page header section text element assert test method
    default void isGeneralPageHeaderSectionTextElementAsExpected(GeneralPage generalPage) {
        //lower header
        //assert lower header navbar dropdown link texts are as expected (as a list)
        List<String> expectedNavbarLinkTexts = Arrays.asList("Nábytek", "Matrace a rošty", "Bytové doplňky", "Místnosti");
        List<String> actualNavbarLinkTexts = generalPage.getLowerHeaderNavBarDropdownLinkText();
        assertEquals(expectedNavbarLinkTexts, actualNavbarLinkTexts, "The general page navbar dropdown link texts don't match expectations.");
    }

    //general page footer section text element assert test method
    default void isGeneralPageFooterSectionTextElementAsExpected(GeneralPage generalPage){
        //footer
        //assert general page footer newsletter subtext is as expected (not all pages have this)
        //assertEquals("PŘIHLASTE SE PRO AKTUÁLNÍ NABÍDKY", generalPage.getFooterNewsletterSubtext(),"The general page footer newsletter subtext doesn't match expectations");
        //assert general page footer newsletter background text is as expected (not all pages have this)
        //assertEquals("Newsletter", generalPage.getFooterNewsletterBackgroundText(),"The general page footer newsletter background text doesn't match expectations");
        //lower footer
        //assert general page footer simplo shop platform subtext is as expected
        assertEquals("Jedna e-shop platforma pro všechny vaše potřeby. Stavíme pokročilé headless e-shopy na míru a rozšiřujeme je o libovolné aplikace, které pomáhají plnit vaše byznysové cíle.", generalPage.getFooterSimploShopPlatformSubtext(),"The general page footer simplo shop platform subtext doesn't match expectations");
        //assert general page footer simplo shop platform link text is as expected
        assertEquals("Více o platformě simploSHOP", generalPage.getFooterSimploShopPlatformLinkText(),"The general page footer simplo shop platform link text doesn't match expectations");
        //categories section
        //assert general page footer categories section title is as expected
        assertEquals("KATEGORIE", generalPage.getFooterCategoriesSectionTitle(),"The general page footer categories section title doesn't match expectations");
        //assert lower header navbar dropdown link texts are as expected (as a list)
        List<String> expectedFooterCategoryLinkTexts = Arrays.asList("Nábytek", "Matrace a rošty", "Bytové doplňky");
        List<String> actualFooterCategoryLinkTexts = generalPage.getFooterCategoriesLinkText();
        assertEquals(expectedFooterCategoryLinkTexts, actualFooterCategoryLinkTexts, "The general page footer category section link texts don't match expectations.");
        //rooms section
        //assert general page footer rooms section title is as expected
        assertEquals("MÍSTNOSTI", generalPage.getFooterRoomsSectionTitle(),"The general page footer rooms section title doesn't match expectations");
        //assert lower header navbar dropdown link texts are as expected (as a list)
        List<String> expectedRoomsCategoryLinkTexts = Arrays.asList("Předsíň", "Obývací pokoj", "Koupelna", "Pracovna", "Kuchyně", "Jídelna", "Všechny místnosti");
        List<String> actualRoomsCategoryLinkTexts = generalPage.getFooterRoomsLinkText();
        assertEquals(expectedRoomsCategoryLinkTexts, actualRoomsCategoryLinkTexts, "The general page footer rooms section link texts don't match expectations.");
        //contact us section
        //assert general page footer contact us section title is as expected
        assertEquals("KONTAKTUJTE NÁS", generalPage.getFooterContactUsSectionTitle(),"The general page footer contact us section title doesn't match expectations");
        //assert general page footer contact us section phone subtext is as expected
        assertEquals("Telefon", generalPage.getFooterPhoneSubtext(),"The general page footer contact us section phone subtext doesn't match expectations");
        //assert general page footer contact us section phone number is as expected
        assertEquals("+420 607 732 244", generalPage.getFooterPhoneNumber(),"The general page footer contact us section phone number doesn't match expectations");
        //assert general page footer contact us section email subtext is as expected
        assertEquals("Email", generalPage.getFooterEmailSubtext(),"The general page footer contact us section email subtext doesn't match expectations");
        //assert general page footer contact us section email number is as expected
        assertEquals("info@simplo.cz", generalPage.getFooterEmailLink(),"The general page footer contact us section email doesn't match expectations");
        //follow us section
        //assert general page footer follow us section title is as expected
        assertEquals("SLEDUJTE NÁS", generalPage.getFooterFollowUsSectionTitle(),"The general page footer follow us section title doesn't match expectations");
        //created by section
        //assert general page footer created by simplo link text is as expected
        assertEquals("Created by", generalPage.getFooterCreatedBySimploLinkText(),"The general page footer created by simplo link text doesn't match expectations");
        //assert general page footer copyright text is as expected
        assertEquals("Copyright © 2025. All Rights Reserved.", generalPage.getFooterCopyrightText(),"The general page footer copyright text doesn't match expectations");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page text element assert test method
    default void isHomePageTextElementIsAsExpected(HomePage homePage){
        //buy for room category section
        //assert home page room category section title is as expected
        assertEquals("Nakupujte podle\n" + "místností", homePage.getHomePageRoomCategorySectionTitle(),"The home page room category section title doesn't match expectations");
        //assert home page room category name link texts are as expected (as a list)
        List<String> expectedRoomsCategoryNameLinkTexts = Arrays.asList("Předsíň", "Obývací pokoj", "Koupelna", "Pracovna", "Kuchyně", "Jídelna", "Ložnice", "Dětský pokoj", "Zahrada");
        List<String> actualRoomsCategoryNameLinkTexts = homePage.getHomePageRoomCategoryNameLinkText();
        assertEquals(expectedRoomsCategoryNameLinkTexts, actualRoomsCategoryNameLinkTexts,"The home page room category link texts don't match expectations");
        //chosen products category section
        //assert home page room chosen products section title is as expected
        assertEquals("Vybrané produkty", homePage.getHomePageChosenProductsSectionTitle(),"The home page room chosen products section title doesn't match expectations");
        //garden furniture section
        //assert home page room garden furniture section title is as expected
        assertEquals("Vylaďte si terasu s novým zahradním nábytkem", homePage.getHomePageGardenFurnitureTitle(),"The home page room garden furniture section title doesn't match expectations");
        //latest articles section
        //assert home page room latest articles section title is as expected
        assertEquals("Poslední články", homePage.getHomePageLatestArticleSectionTitle(),"The home page room latest articles section title doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //register account modal text element assert test method
    default void isRegisterAccountModalTextElementAsExpected(RegisterAccountModal registerAccountModal){
        //assert register account modal title is as expected
        assertEquals("Registrace", registerAccountModal.getRegisterAccountModalTitle(),"The register account modal title doesn't match expectations");
        //input form
        //assert register account modal first name subtext is as expected
        assertEquals("Jméno *", registerAccountModal.getRegisterAccountModalFirstNameSubtext(),"The register account modal first name subtext doesn't match expectations");
        //assert register account modal last name subtext is as expected
        assertEquals("Příjmení *", registerAccountModal.getRegisterAccountModalLastNameSubtext(),"The register account modal last name subtext doesn't match expectations");
        //assert register account modal email subtext is as expected
        assertEquals("Email *", registerAccountModal.getRegisterAccountModalEmailSubtext(),"The register account modal email subtext doesn't match expectations");
        //assert register account modal password subtext is as expected
        assertEquals("Heslo *", registerAccountModal.getRegisterAccountModalPasswordSubtext(),"The register account modal password subtext doesn't match expectations");
        //assert register account modal confirm password subtext is as expected
        assertEquals("Heslo znovu *", registerAccountModal.getRegisterAccountModalConfirmPasswordSubtext(),"The register account modal confirm password subtext doesn't match expectations");
        //assert register account modal password strength level text is as expected
        assertEquals("Velmi silné heslo by mělo obsahovat minimálně 8 znaků, malá i velká písmena, číslice a znaky.", registerAccountModal.getRegisterAccountModalPasswordStrengthLevelText(),"The register account modal password strength level text doesn't match expectations");
        //assert register account modal sub to newsletter subtext is as expected
        assertEquals("Chci dostávat novinky ohledně e-shopové platformy", registerAccountModal.getRegisterAccountModalSubToNewsletterSubtext(),"The register account modal sub to newsletter subtext doesn't match expectations");
        //alternatives section
        //assert register account modal or choice subtext is as expected
        assertEquals("nebo", registerAccountModal.getRegisterAccountModalOrChoiceSubtext(),"The register account modal or choice subtext doesn't match expectations");
        //assert register account modal continue with subtext is as expected
        assertEquals("Pokračovat přes", registerAccountModal.getRegisterAccountModalContinueWithSubtext(),"The register account modal continue with subtext doesn't match expectations");
        //assert register account modal privacy policy and terms agreement text is as expected
        assertEquals("Kliknutím na Zaregistrovat se nebo Pokračovat přes Google, Facebook nebo Apple souhlasím se Zásadami zpracování osobních údajů i s Podmínkami užití.", registerAccountModal.getRegisterAccountModalPrivacyPolicyAndTermsAgreementText(),"The register account modal privacy policy and terms agreement text doesn't match expectations");
        //register benefits section
        //assert register account modal register benefits section title is as expected
        assertEquals("Jaké výhody registrací získáte?", registerAccountModal.getRegisterAccountModalRegisterBenefitsSectionTitle(),"The register account modal register benefits section title doesn't match expectations");
        //assert register account modal register benefits login subtitle is as expected
        assertEquals("JIŽ U NÁS MÁTE ÚČET?", registerAccountModal.getRegisterAccountModalRegisterBenefitsLoginSubtitle(),"The register account modal register benefits section login subtitle doesn't match expectations");
        //assert register account modal register benefits are as expected (as a list)
        List<String> expectedRegisterBenefitsList = Arrays.asList("Přehled stavů svých objednávek", "Správa adres a informací, které umožní rychlejší objednávání", "Snadnější vrácení zboží", "Zasílání novinek e-mailem", "Hlídací pes");
        List<String> actualRegisterBenefitsList = registerAccountModal.getRegisterAccountModalRegisterBenefits();
        assertEquals(expectedRegisterBenefitsList, actualRegisterBenefitsList,"The register account modal register benefits list doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //account information my user section text element assert
    default void isAccountInfoPageMyUserSectionTextElementAsExpected(AccountInformationPage accountInformationPage){
        //assert account information page my user section title is as expected
        assertEquals("Můj účet", accountInformationPage.getAccountInfoPageMyUserSectionTitle(),"The account information page my user section title doesn't match expectations");
        //assert account information page my list menu link names are as expected (as a list)
        List<String> expectedMyUserMenuLinkNames = Arrays.asList("Dashboard", "Informace o účtu", "Adresář", "Moje objednávky", "Oblíbené produkty");
        List<String> actualMyUserMenuLinkNames = accountInformationPage.getAccountInfoPageMyUserMenuOptionNames();
        assertEquals(expectedMyUserMenuLinkNames, actualMyUserMenuLinkNames,"The account information page my user menu link names don't match expectations");
    }

    //account information page text element assert test method
    default void isAccountInfoPageTextElementAsExpected(AccountInformationPage accountInformationPage){
        //assert account information page title is as expected
        assertEquals("Informace o účtu", accountInformationPage.getAccountInfoPageTitle(),"The account information page title doesn't match expectations");
        //contact info section
        //assert account information page contact info section title is as expected
        assertEquals("Kontaktní údaje", accountInformationPage.getAccountInfoPageContactInfoSectionTitle(),"The account information page contact info section title doesn't match expectations");
        //assert account information page contact info section first name subtext is as expected
        assertEquals("Jméno *", accountInformationPage.getAccountInfoPageFirstNameSubtext(),"The account information page contact info section first name subtext doesn't match expectations");
        //assert account information page contact info section last name subtext is as expected
        assertEquals("Příjmení *", accountInformationPage.getAccountInfoPageLastNameSubtext(),"The account information page contact info section last name subtext doesn't match expectations");
        //assert account information page contact info section email subtext is as expected
        assertEquals("Email *", accountInformationPage.getAccountInfoPageEmailSubtext(),"The account information page contact info section email subtext doesn't match expectations");
        //assert account information page contact info section sub to newsletter subtext is as expected
        assertEquals("Chci dostávat novinky ohledně e-shopové platformy", accountInformationPage.getAccountInfoPageSubToNewsletterSubtext(),"The account information page contact info section sub to newsletter subtext doesn't match expectations");
        //password section
        //assert account information page password section title is as expected
        assertEquals("Heslo", accountInformationPage.getAccountInfoPagePasswordSectionTitle(),"The account information page password section title doesn't match expectations");
        //assert account information page password section password input field subtext is as expected
        assertEquals("Současné heslo *", accountInformationPage.getAccountInfoPagePasswordSubtext(),"The account information page password section password input field subtext doesn't match expectations");
        //assert account information page password section new password subtext is as expected
        assertEquals("Nové heslo *", accountInformationPage.getAccountInfoPageNewPasswordSubtext(),"The account information page password section new password subtext doesn't match expectations");
        //assert account information page password section confirm password subtext is as expected
        assertEquals("Nové heslo znovu *", accountInformationPage.getAccountInfoPageConfirmNewPasswordSubtext(),"The account information page password section confirm password subtext doesn't match expectations");
    }

    //account information page account removal modal text element assert test method
    default void isAccountRemovalModalTextElementAsExpected(AccountInformationPage accountInformationPage){
        //assert account removal modal title is as expected
        assertEquals("Smazat účet", accountInformationPage.getUserAccountRemovalModalTitle(),"The account removal modal title doesn't match expectations");
        //assert account removal modal text is as expected
        assertEquals("Opravdu si přejete smazat svůj účet? Tato operace je nevratná.", accountInformationPage.getUserAccountRemovalModalText(),"The account removal modal text doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //addresses dashboard page text element assert test methods
    default void isAddressesDashPageTextElementAsExpected(AddressesDashboardPage addressesDashboardPage){
        //assert addresses dashboard page title is as expected
        assertEquals("Adresář", addressesDashboardPage.getAddressesDashPageTitle(),"The addresses dashboard page title doesn't match expectations");
        //assert addresses dashboard page shipping address section title is as expected
        assertEquals("Výchozí fakturační adresa", addressesDashboardPage.getAddressesDashPageShippingAddressSectionTitle(),"The addresses dashboard page shipping address section title doesn't match expectations");
        //assert addresses dashboard page billing address section title is as expected
        assertEquals("Výchozí dodací adresa", addressesDashboardPage.getAddressesDashPageBillingAddressSectionTitle(),"The addresses dashboard page billing address section title doesn't match expectations");
    }

    //add new address modal text element assert test method
    default void isAddNewAddressModalTextElementAsExpected(AddNewAddressModal addNewAddressModal){
        //assert add new address modal title is as expected
        assertEquals("Přidat adresu", addNewAddressModal.getAddNewAddressModalTitle(),"The add new address modal title doesn't match expectations");
        //input form
        //assert add new address modal first name subtext is as expected
        assertEquals("Jméno *", addNewAddressModal.getAddNewAddressModalFirstNameSubtext(),"The add new address modal first name subtext doesn't match expectations");
        //assert add new address modal last name subtext is as expected
        assertEquals("Příjmení *", addNewAddressModal.getAddNewAddressModalLastNameSubtext(),"The add new address modal last name subtext doesn't match expectations");
        //assert add new address modal street subtext is as expected
        assertEquals("Ulice a číslo popisné *", addNewAddressModal.getAddNewAddressModalStreetSubtext(),"The add new address modal street subtext doesn't match expectations");
        //assert add new address modal zip code subtext is as expected
        assertEquals("PSČ *", addNewAddressModal.getAddNewAddressModalZipCodeSubtext(),"The add new address modal zip code subtext doesn't match expectations");
        //assert add new address modal city subtext is as expected
        assertEquals("Město *", addNewAddressModal.getAddNewAddressModalCitySubtext(),"The add new address modal city subtext doesn't match expectations");
        //assert add new address modal country code subtext is as expected
        assertEquals("Předčíslí *", addNewAddressModal.getAddNewAddressModalCountryCodeSubtext(),"The add new address modal country code subtext doesn't match expectations");
        //assert add new address modal phone subtext is as expected
        assertEquals("Telefonní číslo *", addNewAddressModal.getAddNewAddressModalPhoneSubtext(),"The add new address modal phone subtext doesn't match expectations");
        //assert add new address modal country subtext is as expected
        assertEquals("Země *", addNewAddressModal.getAddNewAddressModalCountrySubtext(),"The add new address modal country subtext doesn't match expectations");
        //checkbox elements
        //assert add new address modal add company details subtext is as expected
        assertEquals("Chci doplnit údaje o firmě", addNewAddressModal.getAddNewAddressModalAddCompanyDetailsSubtext(),"The add new address modal add company details subtext doesn't match expectations");
        //assert add new address modal default billing address subtext is as expected
        assertEquals("Výchozí fakturační adresa", addNewAddressModal.getAddNewAddressModalDefaultBillAddressSubtext(),"The add new address modal default billing address subtext doesn't match expectations");
        //assert add new address modal default shipping address subtext is as expected
        assertEquals("Výchozí dodací adresa", addNewAddressModal.getAddNewAddressModalDefaultShipAddressSubtext(),"The add new address modal default shipping address subtext doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login account modal text element assert test method
    default void isLoginAccountModalTextElementAsExpected(LoginAccountModal loginAccountModal){
        //assert login account modal title is as expected
        assertEquals("Přihlášení", loginAccountModal.getLoginAccountModalTitle(),"The login account modal title doesn't match expectations");
        //login section
        //input form
        //assert login account modal email subtext is as expected
        assertEquals("Email *", loginAccountModal.getLoginAccountModalEmailSubtext(),"The login account modal email subtext doesn't match expectations");
        //assert login account modal password subtext is as expected
        assertEquals("Heslo *", loginAccountModal.getLoginAccountModalPasswordSubtext(),"The login account modal password subtext doesn't match expectations");
        //alternatives section
        //assert login account modal or subtext is as expected
        assertEquals("nebo", loginAccountModal.getLoginAccountModalOrSubtext(),"The login account modal or subtext doesn't match expectations");
        //assert login account modal continue with subtext is as expected
        assertEquals("Pokračovat přes", loginAccountModal.getLoginAccountModalContinueWithSubtext(),"The login account modal continue with subtext doesn't match expectations");
        //register section
        //assert login account modal register section register subtitle is as expected
        assertEquals("Ještě u nás nemáte účet?", loginAccountModal.getLoginAccountModalRegisterSubtitle(),"The login account modal register section register subtitle doesn't match expectations");
        //assert login account modal register section forgot password subtitle is as expected
        assertEquals("ZAPOMNĚLI JSTE HESLO?", loginAccountModal.getLoginAccountModalForgotPasswordSubtitle(),"The login account modal register section forgot password subtitle doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal text element assert test method
    default void isShoppingCartModalTextElementAsExpected(ShoppingCartModal shoppingCartModal){
        //assert shopping cart modal title is as expected
        assertEquals("Nákupní košík", shoppingCartModal.getShoppingCartModalTitle(),"The shopping cart modal title doesn't match expectations");
        //summary section
        //assert shopping cart modal total subtext is as expected
        assertEquals("Celkem", shoppingCartModal.getShoppingCartModalTotalSubtext(),"The shopping cart modal total (price) subtext doesn't match expectations");
        //assert shopping cart modal without shipping subtext is as expected
        assertEquals("vč. DPH", shoppingCartModal.getShoppingCartModalWithoutShippingSubtext(),"The shopping cart modal without shipping (price) subtext doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//single category dashboard page aside section in stock text element assert test method (not all categories have this block)
default void isSingleCategoryDashPageAsideInStockTextElementAsExpected(SingleCategoryDashboardPage singleCategoryDashboardPage){
    //assert single category dashboard page aside section in stock subtitle is as expected
    assertEquals("SKLADEM", singleCategoryDashboardPage.getSingleCategoryDashPageAsideInStockSubtitle(),"The single category dashboard page aside section in stock subtitle doesn't match expectations");
}

    //single category dashboard page furniture aside section text element assert test method (not all categories have this structure)
    default void isSingleCategoryDashPageFurnitureAsideTextElementAsExpected(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //brand
        //assert single category dashboard page aside section brand subtitle is as expected
        assertEquals("ZNAČKA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideBrandSubtitle(),"The single category dashboard page aside section brand subtitle doesn't match expectations");
        //price
        //assert single category dashboard page aside section price subtitle is as expected
        assertEquals("CENA", singleCategoryDashboardPage.getSingleCategoryDashPageAsidePriceSubtitle(),"The single category dashboard page aside section price subtitle doesn't match expectations");
        //height
        //assert single category dashboard page aside section height subtitle is as expected
        assertEquals("VÝŠKA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideHeightSubtitle(),"The single category dashboard page aside section height subtitle doesn't match expectations");
        //color
        //assert single category dashboard page aside section color subtitle is as expected
        assertEquals("BARVA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideColorSubtitle(),"The single category dashboard page aside section color subtitle doesn't match expectations");
    }

    //single category dashboard page aside section text element assert test method
    default void isSingleCategoryDashPageAsideTextElementAsExpected(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //brand
        //assert single category dashboard page aside section brand subtitle is as expected
        assertEquals("ZNAČKA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideInStockSubtitle(),"The single category dashboard page aside section brand subtitle doesn't match expectations");
        //price
        //assert single category dashboard page aside section price subtitle is as expected
        assertEquals("CENA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideBrandSubtitle(),"The single category dashboard page aside section price subtitle doesn't match expectations");
        //height
        //assert single category dashboard page aside section height subtitle is as expected
        assertEquals("VÝŠKA", singleCategoryDashboardPage.getSingleCategoryDashPageAsidePriceSubtitle(),"The single category dashboard page aside section height subtitle doesn't match expectations");
        //color
        //assert single category dashboard page aside section color subtitle is as expected
        assertEquals("BARVA", singleCategoryDashboardPage.getSingleCategoryDashPageAsideHeightSubtitle(),"The single category dashboard page aside section color subtitle doesn't match expectations");
    }

    //single category dashboard page furniture category text element assert test method
    default void isSingleCategoryDashPageFurnitureCategoryTextElementAsExpected(SingleCategoryDashboardPage singleCategoryDashboardPage){
        //assert single category dashboard page (furniture category) title is as expected
        assertEquals("Nábytek", singleCategoryDashboardPage.getSingleCategoryDashPageTitle(),"The single category dashboard page (furniture category) title doesn't match expectations");
        //assert single category dashboard page furniture category subtitle is as expected
        assertEquals("Široký výběr stylového a kvalitního nábytku pro každý interiér. Od pohodlných sedacích souprav a elegantních jídelních stolů po praktické úložné prostory a designové doplňky – u nás najdete vše pro váš domov. Naše produkty kombinují moderní design s funkčností, aby splnily všechny vaše potřeby a očekávání. Objevte nábytek, který dodá vašemu domovu osobitý styl a maximální pohodlí.", singleCategoryDashboardPage.getSingleCategoryDashPageSubtitle(),"The single category dashboard page furniture category subtitle doesn't match expectations");
        //assert single category dashboard page furniture subcategories are as expected (as a list)
        List<String> expectedSubcategories = Arrays.asList("Sedací soupravy", "Postele", "Křesla a sezení", "Úložné prostory", "Stoly a stolky", "Zahrada", "Skříně a komody", "Židle");
        List<String> actualSubcategories = singleCategoryDashboardPage.getSingleCategoryDashPageSubcategory();
        assertEquals(expectedSubcategories, actualSubcategories,"The single category dashboard page furniture subcategories aren't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //search product modal text element assert test method
    default void isSearchProductModalTextElementAsExpected(SearchProductModal searchProductModal){
        //assert search product modal top phrases subtext is as expected
        assertEquals("TOP FRÁZE", searchProductModal.getSearchProductModalTopPhrasesSubtext(),"The search product modal top phrases subtext doesn't match expectations");
        //category section
        //assert search product modal category subtext is as expected
        assertEquals("KATEGORIE", searchProductModal.getSearchProductModalCategorySubtext(),"The search product modal category subtext doesn't match expectations");
        //assert search product modal category text is as expected
        assertEquals("Nebyly nalezeny žádné kategorie", searchProductModal.getSearchProductModalCategoryText(),"The search product modal category text doesn't match expectations");
        //brands section
        //assert search product modal brands subtext is as expected
        assertEquals("ZNAČKY", searchProductModal.getSearchProductModalBrandsSubtext(),"The search product modal brands subtext doesn't match expectations");
        //assert search product modal brands text is as expected
        assertEquals("Nebyly nalezny žádné značky", searchProductModal.getSearchProductModalBrandsText(),"The search product modal brands text doesn't match expectations");
        //articles section
        //assert search product modal articles subtext is as expected
        assertEquals("ČLÁNKY", searchProductModal.getSearchProductModalArticlesSubtext(),"The search product modal articles subtext doesn't match expectations");
        //assert search product modal articles text is as expected
        assertEquals("Nebyly nalezeny žádné články", searchProductModal.getSearchProductModalArticlesText(),"The search product modal articles text doesn't match expectations");
        //products section
        //assert search product modal products subtext is as expected
        assertEquals("PRODUKTY", searchProductModal.getSearchProductModalProductsSubtext(),"The search product modal products subtext doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page text element assert test method
    default void isSingleProductPageTextElementAsExpected(SingleProductPage singleProductPage){
        //assert single product page product description parameters subtitle is as expected
        assertEquals("Parametry produktu", singleProductPage.getSingleProductPageProductParamsSubtitle(),"The single product page product description parameters subtitle doesn't match expectations");
    }

    //single product page reviews section (when no reviews are displayed) text element assert test method
    default void isSingleProductPageNoReviewsSectionTextElementAsExpected(SingleProductPage singleProductPage){
        //assert single product page product reviews section no reviews title is as expected
        assertEquals("Tento produkt prozatím nebyl hodnocen", singleProductPage.getSingleProductPageNoReviewsDisplayedTitle(),"The single product page product reviews section no reviews title doesn't match expectations");
        //assert single product page product reviews section no reviews description is as expected
        assertEquals("Ohodnoťte tento produkt a buďte prvním, kdo pomůže ostatním v rozhodování", singleProductPage.getSingleProductPageNoReviewsDisplayedDesc(),"The single product page product reviews section no reviews description doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //wishlist dashboard page text element assert text method
    default void isWishlistDashboardPageTextElementAsExpected(WishlistDashboardPage wishlistDashboardPage){
        //assert wishlist dashboard page title is as expected
        assertEquals("Oblíbené produkty", wishlistDashboardPage.getWishlistDashboardPageTitle(),"The wishlist dashboard page title doesn't match expectations");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//add product review modal text element test assert method
default void isAddProductReviewModalTextElementAsExpected(AddProductReviewModal addProductReviewModal){
    //assert add product review modal title is as expected
    assertEquals("Vložit hodnocení", addProductReviewModal.getAddProductReviewModalTitle(),"The add product review modal title doesn't match expectations");
    //assert add product review modal description is as expected
    assertEquals("Prosím zadejte hodnocení pro tento produkt .", addProductReviewModal.getAddProductReviewModalDescription(),"The add product review modal title doesn't match expectations");
    //assert add product review modal review stars subtext is as expected
    assertEquals("Celkové hodnocení *", addProductReviewModal.getAddProductReviewModalReviewStarsSubtext(),"The add product review modal review stars subtext doesn't match expectations");
    //assert add product review modal review stars subtext is as expected
    assertEquals("Recenze *", addProductReviewModal.getAddProductReviewModalReviewSubtext(),"The add product review modal review subtext doesn't match expectations");
}

    //add product review modal additional text element test assert method
    default void isAddProductReviewModalAdditionalTextElementAsExpected(AddProductReviewModal addProductReviewModal){
        //assert add product review modal author name subtext is as expected
        assertEquals("Jméno *", addProductReviewModal.getAddProductReviewModalAuthorNameSubtext(),"The add product review modal author name subtext doesn't match expectations");
        //assert add product review modal parameter review subtext is as expected
        assertEquals("Hodnocení parametrů", addProductReviewModal.getAddProductReviewModalParameterReviewSubtext(),"The add product review modal parameter review subtext doesn't match expectations");
        //assert add product review modal looks subtext is as expected
        assertEquals("Vzhled", addProductReviewModal.getAddProductReviewModalLooksSubtext(),"The add product review modal looks subtext doesn't match expectations");
        //assert add product review modal comfort subtext is as expected
        assertEquals("Komfort", addProductReviewModal.getAddProductReviewModalComfortSubtext(),"The add product review modal comfort subtext doesn't match expectations");
        //assert add product review modal price subtext is as expected
        assertEquals("Cena", addProductReviewModal.getAddProductReviewModalPriceSubtext(),"The add product review modal price subtext doesn't match expectations");
        //assert add product review modal assembly ease subtext is as expected
        assertEquals("Jednoduchost sestavení", addProductReviewModal.getAddProductReviewModalAssemblyEaseSubtext(),"The add product review modal assembly ease subtext doesn't match expectations");

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
