package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddProductReviewModalTest extends TestMethods{

    //add product review for a set searched product(s) add to cart tests

    //Test 013 -> add review for a single searched product ("Rohová pohovka") test - as a guest
    @Test
    @DisplayName("Add Review For A Single Searched Product Test (as a guest)")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Test_As_A_Guest")
    void addReviewForASingleSearchedProductGuestTest() {
        addReviewForSingleSearchedProductTest();
    }

}
