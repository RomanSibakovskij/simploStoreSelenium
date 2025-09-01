package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AccountInformationPageTest extends TestMethods{

    //valid edit user account information tests

    //Test 003 -> valid edit user account information (with login email) test
    @Test
    @DisplayName("Valid Edit User Account Information (With Login Email) Test")
    @Tag("Valid_Edit_User_Account_Info_Email")
    void validEditUserAccountDataLoginEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid edit user account information (with login email) test
        validEditUserAccountInfoLoginEmailTest();
    }

    //Test 003a -> valid edit user account password test
    @Test
    @DisplayName("Valid Edit User Account (With Login Password) Test")
    @Tag("Valid_Edit_User_Account_Password")
    void validEditUserAccountPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid edit user account password test
        validEditUserAccountLoginPasswordTest();
    }

    //invalid edit user account information tests

    //no singular input

    //Test 003b -> invalid edit user account information test - no edited first name (the error doesn't get triggered)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - No Edited First Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("No_Singular_Input")
    void invalidEditUserAccountDataNoEditFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - no edited first name
        invalidEditUserAccountInfoNoEditedFirstNameTest();
    }

}
