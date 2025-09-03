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

}
