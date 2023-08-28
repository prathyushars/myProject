package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imageurls {
    ChromeDriver driver;
    public Imageurls(){
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

    public void imageurls(){
        String url;
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        List<WebElement> images = driver.findElements(By .xpath("//div[@class='style__WidgetContainerBody-sc-lnhrs7-4 YeNog']/div"));
        for(int i=0; i<images.size(); i++){
            url = images.get(i).getText();
            System.out.println(url);
        }
    }
}
