package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps
{
    WebDriver driver=null;
    @Given("Browser is open")
    public void browser_is_open()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();



    }
    @When("User is on google search page")
    public void user_is_on_google_search_page()
    {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("on google search page");
    }
    @And("User enter search text in search textbox")
    public void user_enter_search_text_in_search_textbox()
    {
        WebElement searchTextBox=driver.findElement(By.name("q"));
        searchTextBox.sendKeys("Whats the weather today");
    }
    @And("User click on search button")
    public void user_click_on_search_button()
    {
        WebElement searchButton=driver.findElement(By.name("btnK"));
        searchButton.click();
    }
    @Then("User navigates to search result")
    public void user_navigates_to_search_result()
    {
        driver.close();
    }
}
