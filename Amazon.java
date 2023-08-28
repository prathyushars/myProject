package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
    
    ChromeDriver driver;
    public Amazon(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public  void searchAmazon(){
        //Navigate to url  https://www.google.com/
        driver.get("https://www.google.com");
        //Enter 'amazon' in searchbox field Using Locator .name("q") | sendKeys("amazon")
        driver.findElement(By .name("q")).clear();
        driver.findElement(By .name("q")).sendKeys("amazon");
        //Press 'Enter'  .name("q") | sendKeys(Keys.RETURN)
        driver.findElement(By .name("q")).sendKeys(Keys.RETURN);
        //See if 'amazon.in' or 'amazon.com' is displayed in the webpage Using Locator "XPath" //textarea[@type='search'] | sendKeys(Keys.RETURN)
        boolean result = driver.findElement(By .xpath("//span[text()='Amazon.in' or text()='Amazon.com']")).isDisplayed();
        System.out.println("Is Amazon displayed in results? :" + result);
    }
    
}
