package com.testingshastra.stepdefinations;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.Given.Givens;

public class SecondstepDefination {
	int x,y,c;
	@Given("User has entered two number")
	public void m1() {
		System.out.println("entered two number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}

	@When("we add those numbers")
	public void m2() {
		//System.out.println("addition");
		c=x+y;
	}

	@Then("user can see addition result")
	public void m3() {
		System.out.println("Addition result is:"+c);

	}
}
