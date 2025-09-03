package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class LoginAccountModalTest extends TestMethods{

    //valid user logout test

    //Test 006 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout")
    void validLogoutTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
    }

    //valid user login tests

    //Test 007 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login")
    void validUserAccountLoginTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test
        validUserLoginTest();
    }

    //Test 007a -> valid user login test - edited login email
    @Test
    @DisplayName("Valid User Login Test - Edited Login Email")
    @Tag("Valid_User_Login")
    @Tag("Edited_Login_Email")
    void validUserAccountLoginEditedEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid edit user account information (with login email) test
        validEditUserAccountInfoLoginEmailTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test - edited login email
        validUserLoginEditedEmailTest();
    }

}
