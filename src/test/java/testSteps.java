package test.java;

import main.java.Ride;
import main.java.RideBLL;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class testSteps extends TestCase {
	Ride ride=new Ride();
	@Given("^user enters \"([^\"]*)\" in phone$")
	public void user_enters_in_phone(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		ride.setPhone(arg1);
	}
 
	@Given("^user enters \"([^\"]*)\" in password$")
	public void user_enters_in_password(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setPassword(arg1);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Then("^login page displays \"([^\"]*)\"$")
	public void login_page_displays(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		
		RideBLL ridebll =new RideBLL();
	}

	@Then("^it redirects to user home.$")
	public void it_redirects_to_user_home() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		
	}

	  

}
