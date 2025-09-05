package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTooShortSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //too short singular input

    //Test 022q -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing email (1 char -> name, domain)
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

}
