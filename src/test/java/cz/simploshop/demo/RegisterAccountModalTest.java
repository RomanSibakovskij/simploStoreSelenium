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

    //Test 002b -> invalid user account creation test - no last name (the error wasn't triggered)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegisterNoLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - no last name
        invalidRegisterAccountModalNoLastNameTest();
    }

    //Test 002c -> invalid user account creation test - no email (the error wasn't triggered)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegisterNoEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - no email
        invalidRegisterAccountModalNoEmailTest();
    }

    //Test 002d -> invalid user account creation test - no password/confirm password (the error wasn't triggered)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password And Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegisterNoPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - no password/confirm password
        invalidRegisterAccountModalNoPasswordConfirmTest();
    }

}
