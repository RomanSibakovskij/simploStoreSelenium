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

    //Test 013a -> add review for a single searched product ("Rohová pohovka") test - as a registered user (due to network / laggy backend issues, test can fail)
    @Test
    @DisplayName("Add Review For A Single Searched Product Test (as a registered user)")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Test_As_A_Reg_User")
    void addReviewForASingleSearchedProductRegUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add review for a single searched product ("Rohová pohovka") test - as a registered user
        addReviewForSingleSearchedProductRegUserTest();
    }

    //invalid add product review for a set searched product(s) add to cart tests

    //no singular input

    //Test 013b -> invalid add review for a single searched product ("Rohová pohovka") test - no review stars
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - No Review Stars")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductNoReviewStarsTest() {
        invalidAddReviewForSingleSearchedProductNoReviewStarsTest();
    }

    //Test 013c -> invalid add review for a single searched product ("Rohová pohovka") test - no review author
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - No Review Author")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductNoReviewAuthorTest() {
        invalidAddReviewForSingleSearchedProductNoReviewAuthorTest();
    }

    //Test 013d -> invalid add review for a single searched product ("Rohová pohovka") test - no review
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - No Review")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductNoReviewTest() {
        invalidAddReviewForSingleSearchedProductNoReviewTest();
    }

    //too short singular input

    //Test 013e -> invalid add review for a single searched product ("Rohová pohovka") test - too short review author (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - Too Short Review Author")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductTooShortReviewAuthorTest() {
        invalidAddReviewForSingleSearchedProductTooShortReviewAuthorTest();
    }

    //Test 013f -> invalid add review for a single searched product ("Rohová pohovka") test - too short review (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Add Review For A Single Searched Product Test - Too Short Review")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductTooShortReviewTest() {
        invalidAddReviewForSingleSearchedProductTooShortReviewTest();
    }

    //too long singular input

    //Test 013g -> invalid add review for a single searched product ("Rohová pohovka") test - too long review author (101 chars)
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - Too Long Review Author")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductTooLongReviewAuthorTest() {
        invalidAddReviewForSingleSearchedProductTooLongReviewAuthorTest();
    }

    //Test 013h -> invalid add review for a single searched product ("Rohová pohovka") test - too long review (10001 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - Too Long Review")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductTooLongReviewTest() {
        invalidAddReviewForSingleSearchedProductTooLongReviewTest();
    }

    //invalid singular input

    //Test 013i -> invalid add review for a single searched product ("Rohová pohovka") test - invalid review author format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add Review For A Single Searched Product Test - Invalid Review Author Format")
    @Tag("Add_Review_For_A_Single_Searched_Product")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidAddReviewForASingleSearchedProductInvalidReviewAuthorFormatTest() {
        invalidAddReviewForSingleSearchedProductInvalidReviewAuthorNameTest();
    }

}
