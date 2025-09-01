package cz.simploshop.demo;

import cz.simploshop.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //user navigation to register modal test

    //Test 001 -> user navigation to register modal test
    @Test
    @DisplayName("User Navigation To Register Modal Test")
    @Tag("Navigate_To_Register_Modal")
    void userNavigationToRegisterModalTest() {
        navigateToRegisterAccountModalTest();
    }


}
