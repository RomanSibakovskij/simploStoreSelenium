package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SearchProductModalTest extends TestMethods{

    //searched product(s) add to cart tests

    //Test 011 -> add single searched product ("Rohová pohovka") to cart test - as a guest
    @Test
    @DisplayName("Add Single Searched Product To Cart Test (as a guest)")
    @Tag("Add_Single_Searched_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleSearchedProductToCartGuestTest() {
        addSingleSearchedProductToCartTest();
    }

    //Test 011a -> add single searched product ("Knihovna - 3 police") to cart test - as a registered user
    @Test
    @DisplayName("Add Single Searched Product To Cart Test (as a registered user)")
    @Tag("Add_Single_Searched_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void addSingleSearchedProductToCartUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single searched product ("Knihovna - 3 police") to cart test - as a registered user
        addSingleSearchedProductToCartRegUserTest();
    }

    //Test 011b -> add multiple searched products ("Rohová pohovka") to cart test - as a guest
    @Test
    @DisplayName("Add Multiple Searched Products To Cart Test (as a guest)")
    @Tag("Add_Multiple_Searched_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addMultipleSearchedProductToCartGuestTest() {
        addMultipleSearchedProductsToCartTest();
    }

    //Test 011c -> add multiple searched products ("Knihovna - 3 police") to cart test - as a registered user
    @Test
    @DisplayName("Add Multiple Searched Products To Cart Test (as a registered user)")
    @Tag("Add_Multiple_Searched_Products_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void addMultipleSearchedProductsToCartUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add multiple searched products ("Knihovna - 3 police") to cart test - as a registered user
        addMultipleSearchedProductsToCartRegUserTest();
    }


}
