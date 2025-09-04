package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SearchProductModalTest extends TestMethods{

    //searched product(s) add to cart tests

    //Test 011 -> add single searched product ("Rohová pohovka") to cart test - as a guest (sometimes the product fails to be added to cart after add to cart button click)
    @Test
    @DisplayName("Add Single Searched Product To Cart Test (as a guest)")
    @Tag("Add_Single_Searched_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleSearchedProductToCartGuestTest() {
        addSingleSearchedProductToCartTest();
    }

}
