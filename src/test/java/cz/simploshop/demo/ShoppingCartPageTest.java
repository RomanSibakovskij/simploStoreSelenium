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

    //Test 014b -> add multiple chosen products ("Polštář Furniture") to check out test - as a guest
    @Test
    @DisplayName("Add Multiple Chosen Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Chosen_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addMultipleChosenProductToCheckoutGuestTest() {
        //add multiple chosen products ("Polštář Furniture") to cart test - as a guest
        addMultipleChosenProductToCartTest();
        //add multiple chosen products ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 014c -> add multiple chosen products ("Polštář Furniture") to check out test - as a registered user
    @Test
    @DisplayName("Add Multiple Chosen Products To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Chosen_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addMultipleChosenProductToCheckoutRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add multiple chosen product ("Polštář Furniture") to cart test - as a registered user
        addMultipleChosenProductToCartRegUserTest();
        //add multiple chosen products ("Polštář Furniture") to check out test - as a registered user
        addProductToCheckoutTest();
    }

    //single category dashboard page product(s) add to check out tests

    //Test 015 -> add single category single product ("Manželská postel") to check out test - as a guest
    @Test
    @DisplayName("Add Single Category Single Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Category_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addSingleCategoryProductToCheckoutGuestTest() {
        //add single category single product ("Manželská postel") to cart test - as a guest
        addSetSingleCategoryProductToCartGuestTest();
        //add single category single product ("Manželská postel") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 015a -> add single category single product ("Odkládací stolek") to check out test - as a registered user
    @Test
    @DisplayName("Add Single Category Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Chosen_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addSingleCategoryProductToCheckoutRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single category single product ("Odkládací stolek") to cart test - as a registered user
        addSetSingleCategoryProductToCartRegUserTest();
        //add single category single product ("Odkládací stolek") to check out test - as a registered user
        addProductToCheckoutTest();
    }

    //Test 015b -> add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to check out test - as a guest
    @Test
    @DisplayName("Add Single Category Multiple Products To Checkout Test (as a guest)")
    @Tag("Add_Single_Category_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addSingleCategoryProductsToCheckoutGuestTest() {
        //add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to cart test - as a guest
        addSetSingleCategoryMultipleProductsToCartGuestTest();
        //add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 015c -> add single category multiple products ("Dětská postýlka", "Polštář") to check out test - as a registered user
    @Test
    @DisplayName("Add Single Category Multiple Products To Checkout Test (as a registered user)")
    @Tag("Add_Single_Category_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addSingleCategoryProductsToCheckoutRegisteredUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single category multiple products ("Dětská postýlka", "Polštář") to cart test - as a registered user
        addSetSingleCategoryMultipleProductsToCartRegUserTest();
        //add single category multiple products ("Dětská postýlka", "Polštář") to check out test - as a registered user
        addProductToCheckoutTest();
    }

    //searched product(s) add to check out tests

    //Test 016 -> add single searched product ("Rohová pohovka") to check out test - as a guest (sometimes the product fails to be added to cart after add to cart button click)
    @Test
    @DisplayName("Add Single Searched Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Searched_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addSingleSearchedProductToCheckoutGuestTest() {
        //add single searched product ("Rohová pohovka") to cart test - as a guest
        addSingleSearchedProductToCartTest();
        //add single searched product ("Rohová pohovka") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 016a -> add single searched product ("Knihovna - 3 police") to check out test - as a registered user
    @Test
    @DisplayName("Add Single Searched Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Searched_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addSingleSearchedProductToCheckoutUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add single searched products ("Knihovna - 3 police") to cart test - as a registered user
        addSingleSearchedProductToCartRegUserTest();
        //add single searched products ("Knihovna - 3 police") to check out test - as a registered user
        addProductToCheckoutTest();
    }

}
