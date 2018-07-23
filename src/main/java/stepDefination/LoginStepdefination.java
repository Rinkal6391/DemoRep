package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepdefination {

	WebDriver driver;
	
	@Given("^user is present in login page$")
	public void user_is_present_in_login_page() {
	    driver=new FirefoxDriver();
	    driver.get("https://www.freecrm.com/index.html");
	  
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
	   String Title=driver.getTitle();
	   System.out.println(Title);
	   Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", Title);
	}

	@Then("^user enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	  driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	}
	
	@Then("^user is on home page$")
	public void user_on_home_page() {
		String HomePAgeTitle=driver.getTitle();
		System.out.println(HomePAgeTitle);
		Assert.assertEquals("CRMPRO",HomePAgeTitle );
	}
	

@Then("^user move to new contact page$")
public void user_move_to_new_contact_page()  {

	
}

@Then("^user enter contact \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void user_enter_and_and(String arg1, String arg2, String arg3)  {



}  

@Then("^close the browser$")
public void close_the_browser()  {
    
}

	
	
}
