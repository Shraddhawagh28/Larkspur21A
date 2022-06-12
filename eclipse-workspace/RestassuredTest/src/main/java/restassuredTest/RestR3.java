package restassuredTest;
import static io.restassured.RestAssured.given;
public class RestR3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given()
		.header("Content-Type"," application/json")
		.body("{\n"+
		    "\"name\":\"Wings of fire\",\n" +
		    "\"isbn\":\"mmop56\",\n"+
		    "\"aisle\":\"lllhj00\",\n"+
		    "\"author\":\"Dr.Kalam\"\n"+
		"}")
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
		
              
				

	}

}
