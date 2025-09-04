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

    //Test 016b -> add multiple searched products ("Rohová pohovka") to cart test - as a guest
    @Test
    @DisplayName("Add Multiple Searched Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Searched_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addMultipleSearchedProductToCheckoutGuestTest() {
        //add multiple searched products ("Rohová pohovka") to cart test - as a guest
        addMultipleSearchedProductsToCartTest();
        //add multiple searched products ("Rohová pohovka") to check out test - as a guest
        addProductToCheckoutTest();
    }

    //Test 016c -> add multiple searched products ("Knihovna - 3 police") to check out test - as a registered user
    @Test
    @DisplayName("Add Multiple Searched Products To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addMultipleSearchedProductsToCheckoutUserTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add multiple searched products ("Knihovna - 3 police") to cart test - as a registered user
        addMultipleSearchedProductsToCartRegUserTest();
        //add multiple searched products ("Knihovna - 3 police") to check out test - as a registered user
        addProductToCheckoutTest();
    }

    //add product from wishlist to check out test

    //Test 017 -> add set category products ("Manželská postel", "Knihovna - 10 polic") to check out from wishlist test - as a registered user
    @Test
    @DisplayName("Add Single Set Category Products To Checkout From Wishlist Test (as a registered user)")
    @Tag("Add_Set_Category_Products_To_Checkout_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void addSingleSetCategoryProductsToCheckoutFromWishlistTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //add set category products ("Manželská postel", "Knihovna - 10 polic") to cart from wishlist test - as a registered user
        addSetCategoryProductsToCartFromWishlistTest();
        //add set category products ("Manželská postel", "Knihovna - 10 polic"") to check out from wishlist test - as a registered user
        addProductToCheckoutTest();
    }

    //update product quantity in shopping cart test (both guest and registered user have the same output, so guest branch is being tested to avoid redundancy)

    //Test 018 -> update product quantity in shopping cart page test
    @Test
    @DisplayName("Update Product Quantity In Shopping Cart Test (as a guest)")
    @Tag("Update_Product_Qty_Shop_Cart_Page")
    @Tag("Test_As_A_Guest")
    void updateProductQtyShopCartPageTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //update product quantity in shopping cart page test - as a guest
        updateProductQtyInShoppingCartPageTest();
    }

}
