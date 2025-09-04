package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //chosen product(s) add to checkout tests

    //Test 014 -> add single chosen product ("Polštář Furniture") to check out test - as a guest
    @Test
    @DisplayName("Add Single Chosen Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Chosen_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addSingleChosenProductToCheckoutGuestTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 014a -> add single chosen product ("Polštář Furniture") to check out test - as a registered user
    @Test
    @DisplayName("Add Single Chosen Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Chosen_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addSingleChosenProductToCheckoutRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single chosen product ("Polštář Furniture") test to cart - as a registered user
        addSingleChosenProductToCartRegUserTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a registered user
        addProductToCheckoutTest();
    }

}
