package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SauceDemoLoginTestSteps
{
    WebDriver driver=null;
    @Given("User opens Browser")
    public void user_opens_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User is on login page")
    public void user_is_on_login_page()
    {
        if(driver.getTitle().equals("Swag Labs"))
        {
            System.out.println("User is on login page");
        }
        else
        {
            System.out.println("Failed to open login page");
        }
    }
    @Then("^User enter will (.*) & (.*)$")
    public void user_enter_will_username_password(String username, String password)
    {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("User click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User will navigates to the homepage")
    public void user_will_navigates_to_the_homepage()
    {
        String productPage=driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
        if(productPage.equals("PRODUCTS"))
        {
            System.out.println("Test passed "+productPage);
            driver.close();
        }
        else
        {
            System.out.println("Test fails "+productPage);
            driver.close();
        }
    }
}
