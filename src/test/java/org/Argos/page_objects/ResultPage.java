package org.Argos.page_objects;

import org.Argos.driver.DriverFactory;
import org.Argos.utils.NumberGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverFactory { //previously I was extending Hooks class for cucumber I am using DriverFactory
    public String selectAProduct() {
        List<WebElement> products = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int numOfProducts = products.size();
        System.out.println("Total products on current page:" + numOfProducts);
        int randomProduct = new NumberGenerator().randomNumber(numOfProducts);
        WebElement clickRandomProduct = products.get(randomProduct);
        System.out.println(randomProduct);
        String expected = clickRandomProduct.getText();
        clickRandomProduct.click();
        return expected;

        //System.out.println(expected);
        // Random randomNo = new Random();
       /* int selectRandom = randomNo.nextInt(numOfProducts - 1);
        System.out.println("random product:" + selectRandom);
        WebElement selectRandomProduct = products.get(selectRandom);
        selectRandomProduct.click();*/
    }
    public void continueShopping(){
        driver.findElement(By.cssSelector("button[data-test='component-att-button-continue']")).click();
    }
  //do not make changes from github
    public void selectRating(String myChoiceRating) {
        List<WebElement> ratingWebElements = driver.findElements(By.cssSelector("div[data-test='rating-facet-content'] .GzCpT"));
        //System.out.println(ratingWebElements.size());//to print size of the rating
        for (WebElement ratingElement : ratingWebElements) {
            String rating = ratingElement.getText();
            if (rating.equalsIgnoreCase(myChoiceRating)) {
                ratingElement.click();
                break;
            }
            sleep(6000);
        }
    }

    public List<Double> collectAllRatings() {
        List<Double> ratingList = new ArrayList<>();
        List<WebElement> ratingElements = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        //System.out.println(ratingElements);
        for (WebElement ratingElement : ratingElements) {
            String ratingInString = ratingElement.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInString);
            ratingList.add(ratingInDouble);
            //System.out.println(ratingInDouble);

        }
        return ratingList;
    }

    public void selectPrice(String myChoicePrice) {
        driver.findElement(By.cssSelector("button[data-test='price-facet-button-show-more']")).click();
        List<WebElement> priceElements = driver.findElements(By.cssSelector("div[data-test='price-facet-content'] .jSeGPx"));
        System.out.println(priceElements.size());
        for (WebElement priceElement : priceElements) {
            String priceList = priceElement.getText().replace("£", "");
            if (priceList.equalsIgnoreCase(myChoicePrice)) {
                System.out.println(priceList);
                priceElement.click();
                break;
            }
            //sleep(3000);
        }

    }

    public List<Double> collectPrice() {
        List<Double> currentPagePrice = new ArrayList<>();
        List<WebElement> prices = driver.findElements(By.cssSelector("div[data-test='component-product-card-price']"));
        for (WebElement price : prices) {
            String priceInString = price.getText().replace("£", "");
            double priceInDouble = Double.parseDouble(priceInString);
            currentPagePrice.add(priceInDouble);
        }
        return currentPagePrice;
    }
}
