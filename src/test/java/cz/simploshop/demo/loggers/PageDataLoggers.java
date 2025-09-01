package cz.simploshop.demo.loggers;

import cz.simploshop.demo.*;

import org.slf4j.*;

public interface PageDataLoggers {

    static final Logger logger = LoggerFactory.getLogger(PageDataLoggers.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page product data logger method
    default void logHomePageProductData(HomePage homePage){
        System.out.println("Displayed home page chosen products data: " + "\n");

        logger.info("Home page chosen product name(s): " + homePage.getHomePageChosenProductName());
        logger.info("Home page chosen product unit price(s): " + homePage.getHomePageChosenProductUnitPrice());

        System.out.println("\n");
    }

    //home page latest articles data logger method
    default void logHomePageLatestArticleData(HomePage homePage){
        System.out.println("Displayed home page latest articles data: " + "\n");

        logger.info("Home page latest article title(s): " + homePage.getHomePageLatestArticleTitle());
        logger.info("Home page latest article text(s): " + homePage.getHomePageLatestArticleText());
        logger.info("Home page latest article username(s): " + homePage.getHomePageLatestArticleUsername());
        logger.info("Home page latest article time posted stamp(s): " + homePage.getHomePageLatestArticleTimePosted());

        System.out.println("\n");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
