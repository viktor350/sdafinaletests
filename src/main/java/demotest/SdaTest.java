package demotest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\velik\\Desktop\\Nový priečinok (2)\\SdaFinalTests\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void sdaTest(){
        //toto mi najde stranku Tutorial point
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        driver.manage().window().setSize(new Dimension(1936, 1048));
        //toto mi najde na stranke prvek a vypiše meno
        driver.findElement(By.id("name")).sendKeys("Viktor");

        driver.findElement(By.id("email")).sendKeys("veliky.viktor@gmail.com");










    }








}
