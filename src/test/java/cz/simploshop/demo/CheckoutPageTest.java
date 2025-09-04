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

    //Test 019a -> single chosen product ("Polštář Furniture") checkout confirmation test - as a registered user (the country code dropdown menu is empty, test has failed)
    @Test
    @DisplayName("Single Chosen Product Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Chosen_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleChosenProductCheckoutRegUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single chosen product ("Polštář Furniture") test to cart - as a registered user
        addSingleChosenProductToCartRegUserTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a registered user
        addProductToCheckoutTest();
        //single chosen product ("Polštář Furniture") checkout confirmation test - as a registered user
        productCheckoutConfirmationTest();
    }

    //Test 019b -> multiple chosen products ("Polštář Furniture") check out confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
    @Test
    @DisplayName("Multiple Chosen Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Chosen_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleChosenProductsCheckoutGuestTest() {
        //add multiple chosen products ("Polštář Furniture") to cart test - as a guest
        addMultipleChosenProductToCartTest();
        //add multiple chosen products ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //multiple chosen products ("Polštář Furniture") check out confirmation test - as a guest
        productCheckoutConfirmationGuestTest();
    }

    //Test 019c -> multiple chosen products ("Polštář Furniture") check out confirmation test - as a registered user
    @Test
    @DisplayName("Multiple Chosen Products Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Chosen_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleChosenProductsCheckoutRegUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add multiple chosen product ("Polštář Furniture") to cart test - as a registered user
        addMultipleChosenProductToCartRegUserTest();
        //add multiple chosen products ("Polštář Furniture") to check out test - as a registered user
        addProductToCheckoutTest();
        //multiple chosen products ("Polštář Furniture") check out confirmation test - as a registered user
        productCheckoutConfirmationTest();
    }

}
