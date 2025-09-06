package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTooLongSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //too long singular input

    //Test 022ad -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing email (75 chars -> name, domain)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Long Billing Email")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooLongEmailTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too long billing email (75 chars -> name, domain)
        invalidProductCheckoutConfirmationGuestTooLongEmailTest();
    }

    //Test 022ae -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing first name (51 chars)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Long Billing First Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooLongFirstNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too long billing first name (51 chars)
        invalidProductCheckoutConfirmationGuestTooLongFirstNameTest();
    }

    //Test 022af -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing last name (51 chars)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Long Billing Last Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooLongLastNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too long billing last name (51 chars)
        invalidProductCheckoutConfirmationGuestTooLongLastNameTest();
    }

    //Test 022ag -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing street (101 chars)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Long Billing Street")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooLongStreetTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too long billing street (101 chars)
        invalidProductCheckoutConfirmationGuestTooLongStreetTest();
    }

    //Test 022ah -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing city (51 chars)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - Too Long Billing City")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestTooLongCityTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - too long billing city (51 chars)
        invalidProductCheckoutConfirmationGuestTooLongCityTest();
    }

}
