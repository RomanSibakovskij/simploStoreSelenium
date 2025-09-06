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

}
