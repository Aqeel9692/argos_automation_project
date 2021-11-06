/*

package org.Argos.page_objects;

import org.Argos.Hooks;
import org.Argos.utils.NumberGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Locators extends Hooks {
    public void search(String product) {
        //driver.findElement(By.id("searchTerm")).sendKeys("nike");//to find search bar and type product name
        //driver.findElement(By.className("_1gqeQ")).click();//to click on search instead of Enter
        WebElement searchTxtBox = driver.findElement(By.id("searchTerm"));
        searchTxtBox.sendKeys(product);
        searchTxtBox.sendKeys(Keys.ENTER);

    }

    public void selectAProduct() {
        List<WebElement> products = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int numOfProducts = products.size();
        System.out.println("Total products on current page:" + numOfProducts);
        int randomProduct = new NumberGenerator().randomNumber(numOfProducts);
        WebElement clickRandomProduct = products.get(randomProduct);
        System.out.println(randomProduct);
        String expected = clickRandomProduct.getText();
        clickRandomProduct.click();

        //System.out.println(expected);
        // Random randomNo = new Random();

*/
/* int selectRandom = randomNo.nextInt(numOfProducts - 1);
        System.out.println("random product:" + selectRandom);
        WebElement selectRandomProduct = products.get(selectRandom);
        selectRandomProduct.click();*//*


    }

    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        sleep(2500);
    }

    public void goToTrolley() {
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
    }

    public double getProductPriceFromBasket() {
        String price = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']")).getText().replace("£", "");
        double stringToDouble = Double.parseDouble(price);
        //System.out.println(stringToDouble);
        return stringToDouble;
    }

    public void selectQuantity(String selectMore) {
        WebElement add = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select addMore = new Select(add);
        addMore.selectByVisibleText(selectMore);
        sleep(5000);
    }

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
            sleep(1000);
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
*/
