package page_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	  public WebDriver ldriver;

	    public Login_Page(WebDriver rdriver){
	    ldriver=rdriver;
	    PageFactory.initElements(rdriver, this);
	    }

	    @FindBy(id="login1")
	    WebElement txtusername;

	    @FindBy(id="password")
	    WebElement txtPassword;

	    @FindBy(xpath="//*[@type='submit']")
	    WebElement btnSignin;

	   // @FindBy(xpath="//div[contains (@id,'div_login_error')]")
	   // WebElement divtext;
	    
	    @FindBy(linkText="Logout")
	    WebElement lnkLogout;

	    public void setUserName(String uname) {
	    	ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   txtusername.clear();
	    txtusername.sendKeys(uname);
	    }

	    public void setPassword(String pwd){
	    txtPassword.clear();
	    txtPassword.sendKeys(pwd);
	    }

	    public void clickSignin(){
	    	btnSignin.click();
	    }

	    public void clickLogout(){
	    lnkLogout.click();
	    }
	    
	    public void closeBrowser(){
		   ldriver.quit();
		    }
	    
//	    public void login_check() {
//	    	if( (divtext.getAttribute("innerHTML")) == "Wrong username and password combination." ) {
//	    		 txtusername.clear();
//	    		txtPassword.clear();	
//	    		System.out.println("div text is"+ divtext.getAttribute("innerHTML"));
//	    	}
	    		
	//    }
}
