package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class MyFirstSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setUPBrowser(){

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        //Ustawienie domyslnego timeout-u
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void automationExerciseLanuchTest(){

        Assert.assertTrue(driver.findElement(By.id("header")).isDisplayed(), "Header section was not displayed");
    }

    @Test
    public void automationExerciseLanuchTestFindElements(){

        List<WebElement> headerList = driver.findElements(By.id("header1"));
        Assert.assertNotEquals(headerList.size(),0, "Header section was not displayed");

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
