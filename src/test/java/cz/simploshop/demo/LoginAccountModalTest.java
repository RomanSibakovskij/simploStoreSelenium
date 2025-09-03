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

    //Test 007b -> valid user login test - edited login password
    @Test
    @DisplayName("Valid User Login Test - Edited Login Password")
    @Tag("Valid_User_Login")
    @Tag("Edited_Login_Password")
    void validUserAccountLoginEditedPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid edit user account password test
        validEditUserAccountLoginPasswordTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test - edited login password
        validUserLoginEditedPasswordTest();
    }

    //invalid user login tests

    //no singular input

    //Test 007c -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login email
        invalidUserLoginNoEmailTest();
    }

    //Test 007d -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login password
        invalidUserLoginNoPasswordTest();
    }

    //invalid singular input

    //Test 007e -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginInvalidEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidEmailTest();
    }

    //Test 007f -> invalid user login test - invalid login email format (missing '@')
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email Format")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    @Tag("Invalid_Singular_Input_Format")
    void invalidUserAccountLoginInvalidEmailFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user logout test
        userLogoutTest();
        //invalid login email format (missing '@')
        invalidUserLoginInvalidEmailFormatTest();
    }

}
