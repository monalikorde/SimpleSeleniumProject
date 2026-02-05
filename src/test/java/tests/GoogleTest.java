package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Selenium 4 automatically manages ChromeDriver
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

