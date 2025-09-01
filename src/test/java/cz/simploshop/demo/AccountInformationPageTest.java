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

    //Test 003c -> invalid edit user account information test - no edited last name (the error doesn't get triggered)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - No Edited Last Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("No_Singular_Input")
    void invalidEditUserAccountDataNoEditLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - no edited last name
        invalidEditUserAccountInfoNoEditedLastNameTest();
    }

    //Test 003d -> invalid edit user account information test - no edited email (the error doesn't get triggered)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - No Edited Email")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("No_Singular_Input")
    void invalidEditUserAccountDataNoEditEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - no edited email
        invalidEditUserAccountInfoNoEditedEmailTest();
    }

    //Test 003e -> invalid edit user account information test - no user password (the error doesn't get triggered)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - No User Password")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("No_Singular_Input")
    void invalidEditUserAccountDataNoUserPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - no user password
        invalidEditUserAccountNoUserPasswordTest();
    }

    //too short singular input

    //Test 003f -> invalid edit user account information test - too short edited first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Short Edited First Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Short_Singular_Input")
    void invalidEditUserAccountDataTooShortEditFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too short edited first name (1 char)
        invalidEditUserAccountInfoTooShortEditedFirstNameTest();
    }

    //Test 003g -> invalid edit user account information test - too short edited last name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Short Edited Last Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Short_Singular_Input")
    void invalidEditUserAccountDataTooShortEditLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too short edited last name (1 char)
        invalidEditUserAccountInfoTooShortEditedLastNameTest();
    }

    //Test 003h -> invalid edit user account information test - too short edited email (1 char -> name, domain) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Short Edited Email")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Short_Singular_Input")
    void invalidEditUserAccountDataTooShortEditEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too short edited email (1 char -> name, domain)
        invalidEditUserAccountInfoTooShortEditedEmailTest();
    }

    //Test 003i -> invalid edit user account information test - too short new password/confirm password (7 chars)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Short New Password And Confirm Password")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Short_Singular_Input")
    void invalidEditUserAccountDataTooShortNewPasswordConfirmTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too short new password/confirm password (7 chars)
        invalidEditUserAccountTooShortNewPasswordConfirmTest();
    }

}
