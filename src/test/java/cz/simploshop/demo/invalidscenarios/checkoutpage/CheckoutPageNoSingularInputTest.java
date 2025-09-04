package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageNoSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //no singular input

    //Test 022 -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing email
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Email")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoEmailTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing email
        invalidProductCheckoutConfirmationGuestNoEmailTest();
    }

    //Test 022a -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing first name (the first name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing First Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoFirstNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing first name
        invalidProductCheckoutConfirmationGuestNoFirstNameTest();
    }

    //Test 022b -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing last name (the last name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Last Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoLastNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing last name
        invalidProductCheckoutConfirmationGuestNoLastNameTest();
    }

}
