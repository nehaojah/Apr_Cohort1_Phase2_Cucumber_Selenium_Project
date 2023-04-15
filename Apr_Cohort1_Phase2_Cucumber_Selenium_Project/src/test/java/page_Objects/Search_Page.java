package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	 public WebDriver ldriver;

	    public Search_Page(WebDriver rdriver){
	    ldriver=rdriver;
	    PageFactory.initElements(rdriver, this);
	    }

	    @FindBy(id="twotabsearchtextbox")
	    WebElement txtpname;


	    @FindBy(xpath="//*[@type='submit']")
	    WebElement btnSearch;
	    
	    public void setProduct(String productname){
	    	txtpname.clear();
	    	txtpname.sendKeys(productname);
		    }
	    

	    public void clickSearch(){
	    	btnSearch.click();
	    }
	    
	    public void closeBrowser(){
			   ldriver.quit();
			    }
		    
}
