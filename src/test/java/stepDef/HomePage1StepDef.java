package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage1StepDef {
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("1");
	}

	@When("User navigate to ShopPage")
	public void user_navigate_to_shop_page() {
		 System.out.println("2");
	}

	@When("User navigate to HomePage")
	public void user_navigate_to_home_page() {
		 System.out.println("3");
	}

	@Then("the homePage should has only three sliders")
	public void the_home_page_should_has_only_three_sliders() {
	   
	}

	@Then("the homePage has only three sliders")
	public void the_home_page_has_only_three_sliders() {
	   
	}


}
