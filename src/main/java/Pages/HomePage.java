package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public pages.LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new pages.LoginPage(driver);
    }
}
