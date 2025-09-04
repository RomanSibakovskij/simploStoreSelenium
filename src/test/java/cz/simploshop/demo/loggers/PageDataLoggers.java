package cz.simploshop.demo.loggers;

import cz.simploshop.demo.*;
import cz.simploshop.demo.modals.*;

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

    //shopping cart modal product data logger method
    default void logShoppingCartModalProductData(ShoppingCartModal shoppingCartModal){
        System.out.println("Displayed shopping cart modal product data: " + "\n");

        logger.info("Shopping cart modal product name(s): " + shoppingCartModal.getShoppingCartModalProductName());
        logger.info("Shopping cart modal product unit price(s): " + shoppingCartModal.getShoppingCartModalProductUnitPrice());
        logger.info("Shopping cart modal product quantity(ies): " + shoppingCartModal.getShoppingCartModalProductQty());
        logger.info("Shopping cart modal product total price: " + shoppingCartModal.getShoppingCartModalTotalPrice());

        System.out.println("\n");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//furniture category product options data logger method
default void logFurnitureCategoryProductOptions(SingleCategoryDashboardPage singleCategoryDashboardPage){
    System.out.println("Displayed furniture category options data: " + "\n");

    logger.info("Displayed furniture aside in stock option data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsideInStockSubtext());
    logger.info("Displayed furniture aside brand option data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsideBrandSubtext());
    logger.info("Displayed furniture aside height option data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsideHeightSubtext());
    logger.info("Displayed furniture aside price from data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsidePriceFrom());
    logger.info("Displayed furniture aside price to data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsidePriceTo());

    System.out.println("\n");
}

    //category product options data data logger method
    default void logCategoryProductOptions(SingleCategoryDashboardPage singleCategoryDashboardPage){
        System.out.println("Displayed category options data: " + "\n");

        logger.info("Displayed aside brand option data: " + singleCategoryDashboardPage.getSingleCategoryDashPageOtherAsideBrandSubtext());
        logger.info("Displayed aside height option data: " + singleCategoryDashboardPage.getSingleCategoryDashPageAsideBrandSubtext());
        logger.info("Displayed aside price from data: " + singleCategoryDashboardPage.getSingleCategoryDashPageOtherAsidePriceFrom());
        logger.info("Displayed aside price to data: " + singleCategoryDashboardPage.getSingleCategoryDashPageOtherAsidePriceTo());

        System.out.println("\n");
    }

    //single category dashboard page product data logger method
    default void logSingleCategoryDashboardProductData(SingleCategoryDashboardPage singleCategoryDashboardPage){
        System.out.println("Displayed single category dashboard product data: " + "\n");

        logger.info("Displayed single category dashboard page product count: " + singleCategoryDashboardPage.getSingleCategoryDashProductViewCount());
        logger.info("Displayed single category dashboard page product name(s): " + singleCategoryDashboardPage.getSingleCategoryDashProductName());
        logger.info("Displayed single category dashboard page product unit price(s): " + singleCategoryDashboardPage.getSingleCategoryDashProductUnitPrice());

        System.out.println("\n");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //search product modal product data logger method
    default void logSearchProductModalProductData(SearchProductModal searchProductModal){
        System.out.println("Displayed searched product modal product data: " + "\n");

        logger.info("Displayed searched product modal product count: " + searchProductModal.getSearchedProductModalProductCount());
        logger.info("Displayed searched product modal product brand(s): " + searchProductModal.getSearchedProductModalProductBrand());
        logger.info("Displayed searched product modal product name(s): " + searchProductModal.getSearchedProductModalProductName());
        logger.info("Displayed searched product modal product unit price(s): " + searchProductModal.getSearchedProductModalProductUnitPrice());

        System.out.println("\n");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
