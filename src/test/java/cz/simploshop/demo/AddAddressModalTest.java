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

}
