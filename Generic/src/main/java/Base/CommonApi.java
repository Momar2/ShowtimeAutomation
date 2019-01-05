package Base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CommonApi {


    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.sho.com/") String url){

        File file = new File("/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }

    public void typeOnElementNEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }}

        public void dropDown(){
        driver.findElement(By.name("url")).click();
        Select s = new Select(driver.findElement(By.xpath("//html/body/div[3]/nav/div[1]/div[4]/ul/li[2]/a")));
    }

    public void clickOnSearch(){
        driver.findElement(By.xpath("//html/body/div[3]/nav/div[1]/div[4]/ul/li[2]/a")).click();
    }

    public void navigateBack(){
        driver.navigate().back();

    }

        @AfterMethod
         public void Close() {
             driver.close();
          }


    }
