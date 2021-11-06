package org.Argos.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver driver;
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void navigateTo(String url){
        driver.get(url);
    }
    public void cookies(){
        driver.findElement(By.id("consent_prompt_submit")).click();
    }
    public void closeBrowser(){
        driver.quit();
    }
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
