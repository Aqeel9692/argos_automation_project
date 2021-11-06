package org.Argos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
/*
public class Practice extends Hooks {
    @Test
    public void basket() throws InterruptedException {
        driver.findElement(By.id("consent_prompt_submit")).click(); //to accept cookies
        WebElement searchTxtBox = driver.findElement(By.id("searchTerm")); //to find search bar
        searchTxtBox.sendKeys("nike"); //to type product in search bar
        searchTxtBox.sendKeys(Keys.ENTER); // to enter in product
        //to store elements in one variable
        List<WebElement> products = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int NumOfProducts = products.size();//to count the no.of products available on the page
        System.out.println("No of Nike Products=" + NumOfProducts); //to print no.of products
        Random ran = new Random();//method for random no.
        int i = ran.nextInt(NumOfProducts - 1);//to select random no.
        System.out.println("this is random no from Nike product=" + i);//to print random no.
        WebElement selectRandomElement = products.get(i);
        selectRandomElement.click();
        WebElement add = driver.findElement(By.id("add-to-trolley-quantity"));
        Select addMore = new Select(add);
        addMore.selectByVisibleText("2");
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();

    }

}*/
