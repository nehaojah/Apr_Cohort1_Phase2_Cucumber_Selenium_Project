package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_Objects.Login_Page;
import page_Objects.Search_Page;


public class Steps_Search {
	public WebDriver driver;
    public Search_Page Sp;

    @Given("User Launch a Chrome Browser")
    public void user_launch_a_chrome_browser(){
   	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   	  driver=new ChromeDriver();

    Sp=new Search_Page(driver);
    }

    @When("User opens an URL {string}")
    public void user_opens_an_URL(String url){
    	
    driver.get(url);
    driver.manage().window().maximize();
    }
    
    @And("User enters Product as {string}")
    public void user_enters_Product_as(String pname){
   
    Sp.setProduct(pname);
    }
    
    @And("Click on the Search button")
    public void click_on_the_Search_button(){
    Sp.clickSearch();
    
   // lp.login_check();
    
    }
    
    @Then("the Page Title should be {string}")
    public void the_page_Title_should_be(String title){

   	 String act=driver.getTitle();
  	
   	 Assert.assertEquals(title, act);
    }
    
    @When("user closes browser")
    public void close_browser(){
    Sp.closeBrowser();
    
    }
    
    @Then("the Browser is closed")
    public void the_Browser_is_closed(){
    
        
        }
}
