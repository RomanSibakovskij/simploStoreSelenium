package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartModalTest extends TestMethods{

    //update product count in shopping cart modal test

    //Test 009 -> update product count in shopping cart modal test
    @Test
    @DisplayName("Update Product Count In Shopping Cart Modal Test")
    @Tag("Update_Product_Qty_In_Shop_Cart_Modal")
    void updateProductQtyInShopCartTest() {
        updateProductQuantityShopCartModalTest();
    }

}
