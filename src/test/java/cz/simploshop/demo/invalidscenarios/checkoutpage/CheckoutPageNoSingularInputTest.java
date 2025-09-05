package cz.simploshop.demo.invalidscenarios.checkoutpage;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageNoSingularInputTest extends TestMethods{

    //invalid chosen product checkout confirmation tests

    //no singular input

    //Test 022 -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing email
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Email")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoEmailTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing email
        invalidProductCheckoutConfirmationGuestNoEmailTest();
    }

    //Test 022a -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing first name (the first name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing First Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoFirstNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing first name
        invalidProductCheckoutConfirmationGuestNoFirstNameTest();
    }

    //Test 022b -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing last name (the last name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Last Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoLastNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing last name
        invalidProductCheckoutConfirmationGuestNoLastNameTest();
    }

    //Test 022c -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing street (the street error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Street")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoStreetTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing street
        invalidProductCheckoutConfirmationGuestNoStreetTest();
    }

    //Test 022d -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing city (the city error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing City")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoCityTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing city
        invalidProductCheckoutConfirmationGuestNoCityTest();
    }

    //Test 022e -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing country (the country error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Country")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoCountryTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing country
        invalidProductCheckoutConfirmationGuestNoCountryTest();
    }

    //Test 022f -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing zip code (the zip code error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Zip Code")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoZipCodeTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing zip code
        invalidProductCheckoutConfirmationGuestNoZipCodeTest();
    }

    //Test 022g -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing country code (the country code error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Country Code")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoCountryCodeTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing country code
        invalidProductCheckoutConfirmationGuestNoCountryCodeTest();
    }

    //Test 022h -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing phone (the phone error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Billing Phone")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoPhoneTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no billing phone
        invalidProductCheckoutConfirmationGuestNoPhoneTest();
    }

    //Test 022i -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping first name (the shipping first name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping First Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipFirstNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping first name
        invalidProductCheckoutConfirmationGuestNoShipFirstNameTest();
    }

    //Test 022j -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping last name (the shipping last name error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Last Name")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipLastNameTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping last name
        invalidProductCheckoutConfirmationGuestNoShipLastNameTest();
    }

    //Test 022k -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping street (the shipping street error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Street")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipStreetTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping street
        invalidProductCheckoutConfirmationGuestNoShipStreetTest();
    }

    //Test 022l -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping city (the shipping city error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping City")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipCityTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping city
        invalidProductCheckoutConfirmationGuestNoShipCityTest();
    }

    //Test 022m -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country (the shipping country error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Country")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipCountryTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country
        invalidProductCheckoutConfirmationGuestNoShipCountryTest();
    }

    //Test 022n -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping zip code (the shipping zip code error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Zip Code")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipZipCodeTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping zip code
        invalidProductCheckoutConfirmationGuestNoShipZipCodeTest();
    }

    //Test 022o -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country code (the shipping country code error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Country Code")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipCountryCodeTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country code
        invalidProductCheckoutConfirmationGuestNoShipCountryCodeTest();
    }

    //Test 022p -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping phone (the shipping phone error doesn't get triggered)
    @Test
    @DisplayName("Invalid Single Product Checkout Confirmation Test (as a guest) - No Shipping Phone")
    @Tag("Invalid_Single_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleProductCheckoutGuestNoShipPhoneTest() {
        //add single chosen product ("Polštář Furniture") to cart test - as a guest
        addSingleChosenProductToCartTest();
        //add single chosen product ("Polštář Furniture") to check out test - as a guest
        addProductToCheckoutTest();
        //invalid single product ("Polštář Furniture") checkout confirmation test - no shipping phone
        invalidProductCheckoutConfirmationGuestNoShipPhoneTest();
    }

}
