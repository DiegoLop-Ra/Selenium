package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ejercicio1 {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement ShiftLink = driver.findElement(By.linkText("Shifting Content"));
        ShiftLink.click();
        WebElement ExampleLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        ExampleLink.click();
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());
        System.out.println(driver.getTitle());
        driver.quit();


    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
