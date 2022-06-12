package restassuredTest;

import static io.restassured.RestAssured.given;

public class RestRest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get method
	//	given()
	//       .when()
	//       .get("https://dummy.restapiexample.com/api/v1/employees")
	//       .then()
	//      .log()
//	        .all();
		
		 given()
         .header("Content-Type","application/json")
       //  .header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
         .body("{" +
                 "    \"name\": \"Shraddha Wagh\"," +
                 "    \"gender\": \"Female\"," +
                 "    \"age\": \"21\"," +
                 "    \"status\": \"active\"" +
                 "}")
         .log()
         .all()
         .when()
         .post("https://dummy.restapiexample.com/api/v1/create")
         .then()
         .log()
         .all();
			
	}

}
