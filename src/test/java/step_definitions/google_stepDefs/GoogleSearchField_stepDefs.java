package step_definitions.google_stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchField_stepDefs {

    @Given("user should be able go to the website")
    public void user_should_be_able_go_to_the_website() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.google.com");

    
}

@Given("user type in the search field the item what them need")
public void user_type_in_the_search_field_the_item_what_them_need() {
    
    WebElement searchField =  driver.findElement(By.xpath("//input[@name='q']"));
    searchField.sendKeys("WoodenSpoon" + Keys.ENTER);
    System.out.println(driver.getTitle());
}

@Then("user should be able see search result")
public void user_should_be_able_see_search_result() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
    
}
