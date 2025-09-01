package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class RegisterAccountModalTest extends TestMethods{

    //valid user account creation test

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validUserAccountRegisterTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
    }

    //invalid user account creation tests

    //no singular input

    //Test 002a -> invalid user account creation test - no first name (the error wasn't triggered)
    @Test
    @DisplayName("Invalid User Account Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegisterNoFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - no first name
        invalidRegisterAccountModalNoFirstNameTest();
    }

}
