package com.testingshastra.stepdefinations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterStepDefination {
	int x, y, result = 0;
	String fname, lname, fullName;
	ArrayList<Integer>al=new ArrayList<Integer>();

	@Given("I have {int} and {int}")
	public void acceptTwoNumber(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@When("I add them")
	public void addnumbers() {
		result = x + y;

	}

	@Then("verify that addition is even")
	public void isAdditionisEven() {
		Assert.assertTrue(result % 2 == 0, "addition result is not Even" + result);
	}

	@Given("I have first name as {string}")
	public void acceptfirstName(String fname) {
		this.fname = fname;

	}

	@When("I append last name as {string}")
	public void appendNames(String lname) {
		String name = fname.concat(" " + lname);
		fullName = name;
	}

	@Then("I can see full name")
	public void DisplayFullName() {
		System.out.println("full name is:" + fullName);
	}

	@Given("I have following number:")
	public void acceptListOfElements(DataTable dt) {
		List<List<Integer>>table=dt.asLists(Integer.class);
		for(List<Integer> row:table) {
			for(Integer ele:row) {
				System.out.println(ele+" ");
			}
			System.out.println();
			
		}
	
	//Map<Integer,Integer>m=dt.asMap(Integer.class,Integer.class);
		//List<Map<Integer, Integer>>rows=dt.asMaps(Integer.class,Integer.class);
		//Set<Entry<Integer,Integer>>entries=map.entrySet();
		//Iterator<Entry<Integer, Integer>>itr=entries.iterator();
		//while(itr.hasNext()) {
		//	Entry entry=itr.next();
		//	System.out.println(entry.getKey()+"\t"+entry.getValue());
		//}
		
	}

	@When("I add all element of list")
	public void addEementsOfList() {
		for (Integer element : al)
			result = result + element;
	}

}
