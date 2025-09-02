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

}
