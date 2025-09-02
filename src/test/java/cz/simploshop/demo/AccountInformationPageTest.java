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

    //too long singular input

    //Test 003j -> invalid edit user account information test - too long edited first name (51 chars)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Long Edited First Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Long_Singular_Input")
    void invalidEditUserAccountDataTooLongEditFirstNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too long edited first name (51 chars)
        invalidEditUserAccountInfoTooLongEditedFirstNameTest();
    }

    //Test 003k -> invalid edit user account information test - too long edited last name (51 chars)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Long Edited Last Name")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Long_Singular_Input")
    void invalidEditUserAccountDataTooLongEditLastNameTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too long edited last name (51 chars)
        invalidEditUserAccountInfoTooLongEditedLastNameTest();
    }

    //Test 003l -> invalid edit user account information test - too long edited email (75 chars -> name, domain)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Long Edited Email")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Long_Singular_Input")
    void invalidEditUserAccountDataTooLongEditEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too long edited email (75 chars -> name, domain)
        invalidEditUserAccountInfoTooLongEditedEmailTest();
    }

    //Test 003m -> invalid edit user account information test - too long user password/confirm password (75 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Too Long User Password And Confirm Password")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Too_Long_Singular_Input")
    void invalidEditUserAccountDataTooLongUserPasswordConfirmTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - too long user password/confirm password (75 chars)
        invalidEditUserAccountTooLongUserPasswordConfirmTest();
    }

    //invalid singular input format

    //Test 003n -> invalid edit user account information test - invalid edited first name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Invalid Edited First Name Format")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataInvalidEditFirstNameFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - invalid edited first name format (special symbols only)
        invalidEditUserAccountInfoInvalidEditedFirstNameFormatTest();
    }

    //Test 003o -> invalid edit user account information test - invalid edited last name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Invalid Edited Last Name Format")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataInvalidEditLastNameFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - invalid edited last name format (special symbols only)
        invalidEditUserAccountInfoInvalidEditedLastNameFormatTest();
    }

    //Test 003p -> invalid edit user account information test - invalid edited email format (missing '@')
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Invalid Edited Email Format")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataInvalidEditEmailFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - invalid edited email format (missing '@')
        invalidEditUserAccountInfoInvalidEditedEmailFormatTest();
    }

    //Test 003q -> invalid edit user account information test - existing edited email (used beforehand in manual testing) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Existing Edited Email")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Existing_Input")
    void invalidEditUserAccountDataExistingEmailTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - existing edited email (used beforehand in manual testing)
        invalidEditUserAccountInfoExistingEditedEmailTest();
    }

    //Test 003r -> invalid edit user account information test - invalid user password
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Invalid User Password")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataInvalidUserPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - invalid user password
        invalidEditUserAccountInvalidUserPasswordTest();
    }

    //Test 003s -> invalid edit user account information test - invalid user password/confirm password format (lowercase only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Invalid User Password And Confirm Password Format")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataInvalidUserPasswordConfirmFormatTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - invalid user password/confirm password format (lowercase only)
        invalidEditUserAccountInvalidUserPasswordConfirmFormatTest();
    }

    //Test 003t -> invalid edit user account information test - mismatching confirm password
    @Test
    @DisplayName("Invalid Edit User Account Information Test - Mismatching Confirm Password")
    @Tag("Invalid_Edit_User_Account_Info")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditUserAccountDataMismatchConfirmPasswordTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //invalid edit user account information test - mismatching confirm password
        invalidEditUserAccountMismatchingConfirmPasswordTest();
    }

    //user account removal test

    //Test 004 -> valid user account removal test (no confirmation message appears, test has failed)
    @Test
    @DisplayName("Valid User Account Removal Test")
    @Tag("Valid_User_Account_Removal")
    void validAccountRemovalTest() {
        //user navigation to register modal test
        navigateToRegisterAccountModalTest();
        //valid user account creation
        validRegisterAccountModalTest();
        //valid user account removal test
        validUserAccountRemovalTest();
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

}
