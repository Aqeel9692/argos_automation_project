package org.Argos;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.Argos.driver.DriverFactory;

public class Hooks1 {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
    driverFactory.openBrowser();
    driverFactory.navigateTo("https:www.argos.co.uk");
    driverFactory.maxBrowser();
    driverFactory.cookies();
    }
  //  @After
   // public void tearDown(){
     //   driverFactory.closeBrowser();
    //}
}
