package restassuredTest;
import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class RestR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given()
       .when()
       .get("https://gorest.co.in/public/v2/users/2632")
       .then()
      .log()
        .all();
		
		
		 given()
         .header("Content-Type","application/json")
         .header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
         .body("{" +
                 "    \"name\": \"My First Test Thakur\"," +
                 "    \"gender\": \"male\"," +
                 "    \"email\": \"ThakurFromIndia09@xyz.com\"," +
                 "    \"status\": \"active\"" +
                 "}")
         .log()
         .all()
         .when()
         .post("https://gorest.co.in/public/v1/users/")
         .then()
         .log()
         .all();
	}

	}


