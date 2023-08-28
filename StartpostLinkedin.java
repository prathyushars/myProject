package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartpostLinkedin {
    ChromeDriver driver;
    public StartpostLinkedin(){
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

    public  void postLinkedin(){
        driver.get("https://in.linkedin.com/");
        driver.findElement(By .xpath("//input[@id='session_key']")).sendKeys("meenuvinu2994@gmail.com");
        driver.findElement(By .xpath("//input[@id='session_password']")).sendKeys("Meenu@2994");
        driver.findElement(By .xpath("//button[contains(text(),'Sign in')]")).click();
    }
}
