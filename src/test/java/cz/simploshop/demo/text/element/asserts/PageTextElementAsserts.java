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


}
