package org.Argos;

import org.Argos.page_objects.HomePage;
//import org.Argos.page_objects.Locators;
import org.Argos.page_objects.ProductDescPage;
import org.Argos.page_objects.ResultPage;
import org.Argos.page_objects.TrolleyPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/*public class SmokeTest extends Hooks {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage=new ResultPage();
    private ProductDescPage productDescPage=new ProductDescPage();
    private TrolleyPage trolleyPage=new TrolleyPage();
    @Test
    public void searchTest() {
        homePage.search("nike");
    }

    @Test
    public void basket() {
        homePage.search("nike");
        resultPage.selectAProduct();
        productDescPage.addToTrolley();
    }

    @Test
    public void quantityTest() {
        homePage.search("nike");
        resultPage.selectAProduct();
        productDescPage.addToTrolley();
        productDescPage.goToTrolley();
        double priceOfOneProduct = trolleyPage.getProductPriceFromBasket();
        double expected = priceOfOneProduct * 2;
        trolleyPage.selectQuantity("2");
        double actual = trolleyPage.getProductPriceFromBasket();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void rating() {
        homePage.search("nike");
        resultPage.selectRating("4or more");
        List<Double> actual = resultPage.collectAllRatings();
        //actual.add(3.99);
        assertThat(actual, everyItem(is(greaterThanOrEqualTo(4.0))));

    }

    @Test
    public void price() {
        homePage.search("nike");
        resultPage.selectPrice("5-10");
        List<Double> actualPrice = resultPage.collectPrice();
        assertThat(actualPrice, everyItem(is(greaterThanOrEqualTo(5.0))));
        //assertThat(actualPrice, everyItem(is(lessThanOrEqualTo(10.0))));
    }
    @Test
    public void removeItem(){
        homePage.search("nike");
        resultPage.selectAProduct();
        productDescPage.addToTrolley();
        productDescPage.goToTrolley();
        trolleyPage.removeProduct();
    }

}*/
