package org.Argos.page_objects;

//import org.Argos.Hooks;
import org.Argos.driver.DriverFactory;
import org.openqa.selenium.By;

public class ProductDescPage extends DriverFactory { //previously I was extending Hooks class for cucumber I am using DriverFactory
    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        sleep(3000);
    }

    public void goToTrolley() {
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
    }
}
