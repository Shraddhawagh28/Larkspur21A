package restassuredTest;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Rest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given()
		.contentType(ContentType.JSON)
	       .when()
	       .get("http://216.10.245.166/Library/GetBook.php?AuthorName=Kalam")
	       .then()
	      .log()
	        .all();
	}

}
