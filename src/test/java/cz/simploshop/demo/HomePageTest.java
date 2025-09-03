package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //user navigation to register modal test

    //Test 001 -> user navigation to register modal test
    @Test
    @DisplayName("User Navigation To Register Modal Test")
    @Tag("Navigate_To_Register_Modal")
    void userNavigationToRegisterModalTest() {
        navigateToRegisterAccountModalTest();
    }

    //valid chosen product(s) add to cart tests

    //Test 008 -> add single chosen product ("Polštář Furniture") to cart test - as a guest
    @Test
    @DisplayName("Add Single Chosen Product To Cart Test (as a guest)")
    @Tag("Add_Single_Chosen_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleChosenProductToCartGuestTest() {
        addSingleChosenProductToCartTest();
    }

    //Test 008a -> add single chosen product ("Polštář Furniture") to cart test - as a registered user
    @Test
    @DisplayName("Add Single Chosen Product To Cart Test (as a registered user)")
    @Tag("Add_Single_Chosen_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void addSingleChosenProductToCartRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single chosen product ("Polštář Furniture") test - as a registered user
        addSingleChosenProductToCartRegUserTest();
    }


}
