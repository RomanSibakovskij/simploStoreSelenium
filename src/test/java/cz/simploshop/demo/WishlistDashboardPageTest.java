package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class WishlistDashboardPageTest extends TestMethods{

    //add product(s) to wishlist tests (only registered users have this feature) 

    //Test 012 -> add set category product ("Manželská postel") to wishlist test - as a registered user
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

}
