package org.Argos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https:www.argos.co.uk");
        driver.manage().window().maximize();
        driver.findElement(By.id("consent_prompt_submit")).click();
    }
   // @After
    public void tearDown(){

        driver.quit();
    }
    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}*/
