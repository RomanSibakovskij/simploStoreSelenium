package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //valid chosen product(s) checkout confirmation tests

    //Test 019 -> single chosen product ("Polštář Furniture") checkout confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
    @Test
    @DisplayName("Single Chosen Product Checkout Confirmation Test (as a guest)")
    @Tag("Single_Chosen_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleChosenProductCheckoutGuestTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //single chosen product ("Polštář Furniture") checkout confirmation test - as a guest
        productCheckoutConfirmationGuestTest();
    }

}
