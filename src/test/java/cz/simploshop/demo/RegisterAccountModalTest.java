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


}
