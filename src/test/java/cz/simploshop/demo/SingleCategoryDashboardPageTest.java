package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleCategoryDashboardPageTest extends TestMethods{

    //single category dashboard page product(s) add to cart tests

    //Test 010 -> add single category single product ("Manželská postel") to cart test - as a guest
    @Test
    @DisplayName("Add Single Category Single Product To Cart Test (as a guest)")
    @Tag("Add_Single_Category_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleCategoryProductToCartGuestTest() {
        addSetSingleCategoryProductToCartGuestTest();
    }

    //Test 010a -> add single category single product ("Odkládací stolek") to cart test - as a registered user
    @Test
    @DisplayName("Add Single Category Product To Cart Test (as a registered user)")
    @Tag("Add_Single_Chosen_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void addSingleCategoryProductToCartRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single category single product ("Odkládací stolek") to cart test - as a registered user
        addSetSingleCategoryProductToCartRegUserTest();
    }

    //Test 010b -> add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to cart test - as a guest
    @Test
    @DisplayName("Add Single Category Multiple Products To Cart Test (as a guest)")
    @Tag("Add_Single_Category_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleCategoryProductsToCartGuestTest() {
        addSetSingleCategoryMultipleProductsToCartGuestTest();
    }

    //Test 010c -> add single category multiple products ("Dětská postýlka", "Polštář") to cart test - as a registered user
    @Test
    @DisplayName("Add Single Category Multiple Products To Cart Test (as a registered user)")
    @Tag("Add_Single_Category_Products_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void addSingleCategoryProductsToCartRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single category multiple products ("Dětská postýlka", "Polštář") to cart test - as a registered user
        addSetSingleCategoryMultipleProductsToCartRegUserTest();
    }

}
