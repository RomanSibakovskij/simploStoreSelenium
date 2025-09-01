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

    //too short singular input

    //Test 002e -> invalid user account creation test - too short first name (1 char) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountRegisterTooShortFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too short first name (1 char)
        invalidRegisterAccountModalTooShortFirstNameTest();
    }

    //Test 002f -> invalid user account creation test - too short last name (1 char) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountRegisterTooShortLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too short last name (1 char)
        invalidRegisterAccountModalTooShortLastNameTest();
    }

    //Test 002g -> invalid user account creation test - too short email (1 char -> name, domain) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountRegisterTooShortEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too short email (1 char -> name, domain)
        invalidRegisterAccountModalTooShortEmailTest();
    }

    //Test 002h -> invalid user account creation test - too short password/confirm password (7 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Password And Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountRegisterTooShortPasswordConfirmTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too short password/confirm password (7 chars)
        invalidRegisterAccountModalTooShortPasswordConfirmTest();
    }

    //too long singular input

    //Test 002i -> invalid user account creation test - too long first name (51 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegisterTooLongFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too long first name (100 chars)
        invalidRegisterAccountModalTooLongFirstNameTest();
    }

    //Test 002j -> invalid user account creation test - too long last name (100 chars)
    @Test
    @DisplayName("Invalid User Account Register Test - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegisterTooLongLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too long last name (100 chars)
        invalidRegisterAccountModalTooLongLastNameTest();
    }

    //Test 002k -> invalid user account creation test - too long email (75 chars -> name, domain)
    @Test
    @DisplayName("Invalid User Account Register Test - Too Long Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegisterTooLongEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too long email (75 chars -> name, domain)
        invalidRegisterAccountModalTooLongEmailTest();
    }

    //Test 002l -> invalid user account creation test - too long password/confirm password (75 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Register Test - Too Long Password And Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegisterTooLongPasswordConfirmTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //invalid user account creation - too long password/confirm password (75 chars)
        invalidRegisterAccountModalTooLongPasswordConfirmTest();
    }

}
