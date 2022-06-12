package restassuredTest;
import static io.restassured.RestAssured.given;
public class RestR6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/users")
		.then()
		.log()
		.all();
		

	}

}
