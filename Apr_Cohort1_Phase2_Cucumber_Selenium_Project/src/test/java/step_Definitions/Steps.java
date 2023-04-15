package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_Objects.Login_Page;

public class Steps {
	public WebDriver driver;
    public Login_Page lp;

    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser(){
   	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   	  driver=new ChromeDriver();

    lp=new Login_Page(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_URL(String url){
    	
    driver.get(url);
    driver.manage().window().maximize();
    }
    
    @And("User enters Username as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String password){
    lp.setUserName(email);
    lp.setPassword(password);
    }
    
    @And("Click on Signin")
    public void click_on_Signin(){
    lp.clickSignin();
    
   // lp.login_check();
    
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String title){

   	 String act=driver.getTitle();
  	
   	 Assert.assertEquals(title, act);
    }
    
    @When("User click on Logout link")
    public void User_click_on_logout_link(){
    lp.clickLogout();
    
    }
    @Then("Logout Page Title should be {string}")
    public void Logout_page_Title_should_be(String title){

   	 String act=driver.getTitle();
   	 Assert.assertEquals(title, act);
    }
    
    @When("close browser")
    public void close_browser(){
    lp.closeBrowser();
    
    }
    
    @Then("Browser is closed")
    public void Browser_is_closed(){
    
        
        }
    
}
