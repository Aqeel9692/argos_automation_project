package org.Argos.page_objects;

import org.Argos.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TrolleyPage extends DriverFactory { //previously I was extending Hooks class for cucumber I am using DriverFactory
    public double getProductPriceFromBasket() {
        String price = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']")).getText().replace("£", "");
        double stringToDouble = Double.parseDouble(price);
        //System.out.println(stringToDouble);
        return stringToDouble;
    }

    public void increaseQuantityInTrolley(int selectMore) {
        WebElement add = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select addMore = new Select(add);
        addMore.selectByVisibleText(String.valueOf(selectMore));
        sleep(5000);
    }

    public List<String> getAllProductsInTrolley() {
        List<String> actualList = new ArrayList<>();
        List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[data-e2e='product-name']"));
        for (WebElement productWebElement : productWebElements) {
            String productName = productWebElement.getText();
            if (!productName.isEmpty()) {
                System.out.println("product" + productName);
                actualList.add(productName);
            }

        }
        return actualList;
    }

    public String removeProduct() {
        WebElement removeElement = driver.findElement(By.cssSelector("button[data-test='basket-removeproduct']"));
        removeElement.click();
        sleep(3000);
        WebElement emptyElement = driver.findElement(By.cssSelector("h3[data-e2e='basket-emptytitle']"));
        String expected = emptyElement.getText();
        System.out.println(expected);
        return expected;
    }
    public void returnToHomePage(){
        driver.findElement(By.className("class=_3lCcj")).click();
    }

}
