package stepdefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	
	@Given("^User is on Net Banking Landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
		System.out.println("User is on Landing page");     
    }

    @When("^User login with Username and Password$")
    public void user_login_with_username_and_password() throws Throwable {
    	System.out.println("User login with Username and Password");     
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	//System.out.println("Home page is displayed");    
    }
    
    @And("^All Cards are displayed$")
    public void all_cards_are_displayed() throws Throwable {
    	System.out.println("All cards are displayed");     
    }

    @When("^User login with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("The Username is:" + strArg1);
        System.out.println("The Password is:" + strArg2);
    }
    
    @Then("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
    if(arg1.equals("True")) {
    	System.out.println("Cards are displayed: " + arg1);
    }
    else if(arg1.equals("False")) {
    	System.out.println("Cards are NOT displayed: " + arg1);
    }
    else {
    	System.out.println("Error is cards Display.");
    } 	
    }
    
    @When("^User login to application with following details$")
    public void user_login_to_application_with_following_details(DataTable Data) throws Throwable {
    	
    	List<List<String>> obj = Data.raw();
    	
    	System.out.println("Frist Name: " + obj.get(0).get(0));
    	System.out.println("Last Name: " + obj.get(0).get(1));
    	System.out.println("Password: " + obj.get(0).get(2));
    	System.out.println("Email: " + obj.get(0).get(3));
    	System.out.println("Mobile Number: " + obj.get(0).get(4));
    	System.out.println("Address: " + obj.get(0).get(5));
    	System.out.println("Zip: " + obj.get(0).get(6));
    	System.out.println("District: " + obj.get(0).get(7));
    	System.out.println("State: " + obj.get(0).get(8));
    }
    
    @When("^User login with Username (.+) and Password (.+) Parameter$")
    public void user_login_with_username_and_password_parameter(String username, String password) throws Throwable {
    	 System.out.println("The Username is:" + username);
         System.out.println("The Password is:" + password);
    }
    
    @Given("^Select Browser \"([^\"]*)\" to open$")
    public void select_Browser_to_open(String arg1) throws Throwable {
    	 System.out.println("================Opening the " + arg1 + " Browser=================");
    }

    @When("^Maximise the Browser$")
    public void maximise_the_browser() throws Throwable {
    	System.out.println("================Maximising the Browser===================");
    }

    @Then("^Delete the Cookies$")
    public void delete_the_cookies() throws Throwable {
    	System.out.println("================Deleting the Cookies of the Browser================");      
    }
    
}
