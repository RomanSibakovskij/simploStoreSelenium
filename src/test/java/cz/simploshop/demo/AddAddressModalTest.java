package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressModalTest extends TestMethods{

    //valid add user address test

    //Test 005 -> valid add user address test (address fails to be added due to inability to select country code, test has failed)
    @Test
    @DisplayName("Valid Add User Address Test")
    @Tag("Valid_Add_User_Address")
    void validAddAddressTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid add user address test
        validAddUserAddressTest();
    }

    //invalid add user address tests (due to absence of country code options in dropdown menu, all address addition attempts will fail)

    //no singular input

    //Test 005a -> invalid add user address test - no first name
    @Test
    @DisplayName("Invalid Add User Address Test - No First Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no first name
        invalidAddUserAddressNoFirstNameTest();
    }

    //Test 005b -> invalid add user address test - no last name
    @Test
    @DisplayName("Invalid Add User Address Test - No Last Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no last name
        invalidAddUserAddressNoLastNameTest();
    }

    //Test 005c -> invalid add user address test - no street
    @Test
    @DisplayName("Invalid Add User Address Test - No Street")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoStreetTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no street
        invalidAddUserAddressNoStreetTest();
    }

    //Test 005d -> invalid add user address test - no zip code
    @Test
    @DisplayName("Invalid Add User Address Test - No Zip Code")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoZipCodeTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no zip code
        invalidAddUserAddressNoZipCodeTest();
    }

    //Test 005e -> invalid add user address test - no city
    @Test
    @DisplayName("Invalid Add User Address Test - No City")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoCityTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no city
        invalidAddUserAddressNoCityTest();
    }

    //Test 005f -> invalid add user address test - no country code
    @Test
    @DisplayName("Invalid Add User Address Test - No Country Code")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoCountryCodeTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no country code
        invalidAddUserAddressNoCountryCodeTest();
    }

    //Test 005g -> invalid add user address test - no phone
    @Test
    @DisplayName("Invalid Add User Address Test - No Phone")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoPhoneTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no phone
        invalidAddUserAddressNoPhoneTest();
    }

    //Test 005h -> invalid add user address test - no country
    @Test
    @DisplayName("Invalid Add User Address Test - No Country")
    @Tag("Invalid_Add_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddAddressNoCountryTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - no country
        invalidAddUserAddressNoCountryTest();
    }

    //too short singular input

    //Test 005i -> invalid add user address test - too short first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short First Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short first name (1 char)
        invalidAddUserAddressTooShortFirstNameTest();
    }

    //Test 005j -> invalid add user address test - too short last name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short Last Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short last name (1 char)
        invalidAddUserAddressTooShortLastNameTest();
    }

    //Test 005k -> invalid add user address test - too short street (3 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short Street")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortStreetTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short street (3 chars)
        invalidAddUserAddressTooShortStreetTest();
    }

    //Test 005l -> invalid add user address test - too short zip code (4 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short Zip Code")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortZipCodeTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short zip code (4 digits)
        invalidAddUserAddressTooShortZipCodeTest();
    }

    //Test 005m -> invalid add user address test - too short city (2 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short City")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortCityTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short city (2 chars)
        invalidAddUserAddressTooShortCityTest();
    }

    //Test 005n -> invalid add user address test - too short phone (2 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Short Phone")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooShortPhoneTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too short phone (2 digits)
        invalidAddUserAddressTooShortPhoneTest();
    }

    //too long singular input

    //Test 005o -> invalid add user address test - too long first name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long First Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddAddressTooLongFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long first name (100 chars)
        invalidAddUserAddressTooLongFirstNameTest();
    }

    //Test 005p -> invalid add user address test - too long last name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long Last Name")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddAddressTooLongLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long last name (100 chars)
        invalidAddUserAddressTooLongLastNameTest();
    }

    //Test 005q -> invalid add user address test - too long street (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long Street")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddAddressTooLongStreetTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long street (100 chars)
        invalidAddUserAddressTooLongStreetTest();
    }

    //Test 005r -> invalid add user address test - too long zip code (6 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long Zip Code")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddAddressTooLongZipCodeTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long zip code (6 digits)
        invalidAddUserAddressTooLongZipCodeTest();
    }

    //Test 005s -> invalid add user address test - too long city (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long City")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddAddressTooLongCityTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long city (100 chars)
        invalidAddUserAddressTooLongCityTest();
    }

    //Test 005t -> invalid add user address test - too long phone (30 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Too Long Phone")
    @Tag("Invalid_Add_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddAddressTooLongPhoneTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - too long phone (30 digits)
        invalidAddUserAddressTooLongPhoneTest();
    }

    //invalid singular input format

    //Test 005u -> invalid add user address test - invalid first name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Invalid First Name Format")
    @Tag("Invalid_Add_User_Address")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddAddressInvalidFirstNameFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - invalid first name format (special symbols only)
        invalidAddUserAddressInvalidFirstNameFormatTest();
    }

    //Test 005v -> invalid add user address test - invalid last name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Add User Address Test - Invalid Last Name Format")
    @Tag("Invalid_Add_User_Address")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddAddressInvalidLastNameFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid add user address test - invalid last name format (special symbols only)
        invalidAddUserAddressInvalidLastNameFormatTest();
    }

}
