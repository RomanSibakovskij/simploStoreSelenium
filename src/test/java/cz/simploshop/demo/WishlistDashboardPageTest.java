package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class WishlistDashboardPageTest extends TestMethods{

    //add product(s) to wishlist tests (only registered users have this feature)

    //Test 012 -> add set category product ("Manželská postel") to wishlist test - as a registered user (the product failed to be added to wishlist, test has failed)
    @Test
    @DisplayName("Add Single Set Category Product To Wishlist Test (as a registered user)")
    @Tag("Add_Set_Category_Product_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void addSingleSetCategoryProductToWishlistTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add set category product ("Manželská postel") to wishlist test - as a registered user
        addSetCategoryProductToWishlistTest();
    }

    //Test 012a -> add set category products ("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka") to wishlist test - as a registered user (sometimes the product fails to be added to wishlist)
    @Test
    @DisplayName("Add Single Set Category Products To Wishlist Test (as a registered user)")
    @Tag("Add_Set_Category_Products_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void addSingleSetCategoryProductsToWishlistTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add set category products ("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka") to wishlist test - as a registered user
        addSetCategoryProductsToWishlistTest();
    }

    //Test 012b -> add set category products ("Manželská postel", "Knihovna - 10 polic" ) to cart from wishlist test - as a registered user
    @Test
    @DisplayName("Add Set Category Products To Cart From Wishlist Test (as a registered user)")
    @Tag("Add_Set_Category_Products_To_Cart_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void addSingleSetCategoryProductsToCartFromWishlistTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add set category products ("Manželská postel", "Knihovna - 10 polic") to cart from wishlist test - as a registered user
        addSetCategoryProductsToCartFromWishlistTest();
    }


}
