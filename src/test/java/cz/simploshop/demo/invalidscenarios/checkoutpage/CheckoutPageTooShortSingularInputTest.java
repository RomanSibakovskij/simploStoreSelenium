package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTooShortSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //too short singular input

    //Test 022q -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing email (1 char -> name, domain) (too short email error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing Email")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortEmailTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing email (1 char -> name, domain)
        invalidProductCheckoutConfirmationGuestTooShortEmailTest();
    }

    //Test 022r -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing first name (1 char) (too short first name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing First Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortFirstNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing first name (1 char)
        invalidProductCheckoutConfirmationGuestTooShortFirstNameTest();
    }

    //Test 022s -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing last name (1 char) (too short last name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing Last Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortLastNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing last name (1 char)
        invalidProductCheckoutConfirmationGuestTooShortLastNameTest();
    }

    //Test 022t -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing street (3 chars) (too short street error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing Street")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortStreetTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing street (3 chars)
        invalidProductCheckoutConfirmationGuestTooShortStreetTest();
    }

    //Test 022u -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing city (2 chars) (too short city error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing City")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortCityTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing city (2 chars)
        invalidProductCheckoutConfirmationGuestTooShortCityTest();
    }

    //Test 022v -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing zip code (4 digits) (too short zip code error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Short Billing Zip Code")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooShortZipCodeTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too short billing zip code (4 digits)
        invalidProductCheckoutConfirmationGuestTooShortZipCodeTest();
    }

}
