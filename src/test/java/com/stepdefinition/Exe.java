package com.stepdefinition;

import com.app.pageexe.Exe_cucu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exe extends Exe_cucu{

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
		browserlaunch();
	}
	@When("Enter firstname {string}")
	public void enter_firstname(String name) {
		firstname(name);
	    }
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}


}
