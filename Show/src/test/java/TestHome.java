import Base.CommonApi;
import Search.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestHome extends SearchPage {


   @Test
   public void Test1() {
       searchMenu();
       // driver.findElement(By.cssSelector("body")).sendKeys("Den of Thieves");
   }




}