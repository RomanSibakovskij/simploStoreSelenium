package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageInvalidSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //invalid singular input

    //Test 022aq -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing email format (missing '@')
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing Email Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidEmailFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing email format (missing '@')
        invalidProductCheckoutConfirmationGuestInvalidEmailFormatTest();
    }

    //Test 022ar -> invalid single product ("Polštář Furniture") checkout confirmation test - existing email (used beforehand in manual testing) (the existing email input error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Existing Email")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestExistingEmailTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - existing email (used beforehand in manual testing)
        invalidProductCheckoutConfirmationGuestExistingEmailTest();
    }

    //Test 022as -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing first name format (special symbols only) (the invalid first name input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing First Name Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidFirstNameFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing first name format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidFirstNameFormatTest();
    }

    //Test 022at -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing last name format (special symbols only) (the invalid last name input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing Last Name Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidLastNameFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing last name format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidLastNameFormatTest();
    }

    //Test 022au -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing street format (special symbols only) (the invalid street input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing Street Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidStreetFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing street format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidStreetFormatTest();
    }

    //Test 022av -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing city format (special symbols only) (the invalid city input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing City Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidCityFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing city format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidCityFormatTest();
    }

    //Test 022aw -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing zip code format (special symbols only) (the invalid zip code input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing Zip Code Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidZipCodeFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing zip code format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidZipCodeFormatTest();
    }

    //Test 022ax -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing phone format (special symbols only)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Billing Phone Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidPhoneFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing phone format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidPhoneFormatTest();
    }

    //Test 022ay -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping first name format (special symbols only) (the invalid shipping first name input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Shipping First Name Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidShipFirstNameFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping first name format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidShipFirstNameFormatTest();
    }

    //Test 022az -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping last name format (special symbols only) (the invalid shipping last name input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Shipping Last Name Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidShipLastNameFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping last name format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidShipLastNameFormatTest();
    }

    //Test 022aaa -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping street format (special symbols only) (the invalid shipping street input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Shipping Street Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidShipStreetFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping street format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidShipStreetFormatTest();
    }

    //Test 022aab -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping city format (special symbols only) (the invalid shipping city input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Shipping City Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidShipCityFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping city format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidShipCityFormatTest();
    }

    //Test 022aac -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping zip code format (special symbols only) (the invalid shipping zip code input format error wasn't triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Invalid Shipping Zip Code Format")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestInvalidShipZipCodeFormatTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping zip code format (special symbols only)
        invalidProductCheckoutConfirmationGuestInvalidShipZipCodeFormatTest();
    }

}
