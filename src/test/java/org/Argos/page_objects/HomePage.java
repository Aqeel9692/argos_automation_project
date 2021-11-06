package org.Argos.page_objects;

//import org.Argos.Hooks;
import org.Argos.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverFactory { //previously I was extending Hooks class for cucumber I am using DriverFactory
    public void search(String product) {
        //driver.findElement(By.id("searchTerm")).sendKeys("nike");//to find search bar and type product name
        //driver.findElement(By.className("_1gqeQ")).click();//to click on search instead of Enter
        WebElement searchTxtBox = driver.findElement(By.id("searchTerm"));
        searchTxtBox.sendKeys(product);
        searchTxtBox.sendKeys(Keys.ENTER);

    }
}
