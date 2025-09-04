package cz.simploshop.demo.utilities;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen"); //for browser run
        //options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); //this is necessary for CI run, disable once run in IDE and re-enable commented out options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); //-> enable this with browser run
        driver.get("https://demo.simploshop.cz/");
    }

    @AfterEach
    public void close() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
    }
}