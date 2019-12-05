package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class switchWindows2 {

    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = WebDriverFactory.getDriver("FirefoxDriver()");
    // set implicit time to 30 seconds
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    // navigate to the url
		driver.get("https://chercher.tech/python/windows-selenium-python.php");
    // get the Session id of the Parent
    String parentGUID = driver.getWindowHandle();
    // click the button to open new window
		driver.findElement(By.id("two-window")).click();
		Thread.sleep(5000);
    // get the All the session id of the browsers
    Set<String> allGUID = driver.getWindowHandles();

    // print the title of the page
		System.out.println("Page title before Switching : "+ driver.getTitle());
		System.out.println("Total Windows : "+allGUID.size());
    // iterate the values in the set
		for(String guid : allGUID){
        // one enter into if blobk if the GUID is not equal to parent window's GUID
        if(! guid.equals(parentGUID)){
            // switch to the guid
            driver.switchTo().window(guid);
            // break the loop
            break;
        }
    }
    // search on the google page
		driver.findElement(By.name("q")).sendKeys("success");
    // print the title after switching
		System.out.println("Page title after Switching to google : "+ driver.getTitle());
		Thread.sleep(5000);
    // close the browser
		driver.close();
    // switch back to the parent window
		driver.switchTo().window(parentGUID);
    // print the title
		System.out.println("Page title after switching back to Parent: "+ driver.getTitle());
}
}



