package com.util.constants;

public interface Locator {
	public String homeScreen_closePopuPbtn = "XPATH##//button[contains(text(),'x')]";
	String homeScreen_TravelLink= "XPATH## //a[contains(@href,'travel/fli')]";
	String homeScreen_fromCity= "XPATH##//label[contains(text(),'From')]/Parent::div";
	String homeScreen_searchTxtBn="XPATH##input[placeholder='search for product,brands and more']";
	String homeScreen_fromCity_Bom="XPATH#label[contains(text(),\\\"Popular Cities\\\")]/parent::div/following-sibling::div[contains(text(),'BOM')]\")";

}
