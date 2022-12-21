package selenium.basic;

import framework.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MyFirstSeleniumTest  extends TestBase {
    @Test
    public void automationExerciseLanuchTest(){
        Assert.assertTrue(driver.findElement(By.id("header")).isDisplayed(), "Header section was not displayed");
    }
    @Test
    public void automationExerciseLanuchTestFindElements(){
        List<WebElement> headerList = driver.findElements(By.id("header"));
        Assert.assertNotEquals(headerList.size(),0, "Header section was not displayed");
    }

}
