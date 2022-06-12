package restassuredTest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestPrac6 {

	public static void main(String[] args) {
		
		String qParam="kalam";
		// TODO Auto-generated method stub
		given()
		.queryParam("AuthorName"," qParam")
		.contentType(ContentType.JSON)
		
	       .when()
	       .get("http://216.10.245.166/Library/GetBook.php")
	       .then()
	      .log()
	        .all();
	}

	
	}


