package restassuredTest;
import static io.restassured.RestAssured.given;
public class RestPrac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     given()
     .header("Content-Type","application/json")
     .body("{[\r\n"
     		+ "    {\r\n"
     		+ "        \"id\": 11,\r\n"
     		+ "        \"name\": \"Krishanali Morre\",\r\n"
     		+ "        \"username\": \"Breeryrt\",\r\n"
     		+ "        \"email\": \"Sincerue@aprprril.biz\",\r\n"
     		+ "        \"address\": {\r\n"
     		+ "            \"street\": \"Kurrla\",\r\n"
     		+ "            \"suite\": \"Apt. 556\",\r\n"
     		+ "            \"city\": \"Goad\",\r\n"
     		+ "            \"zipcode\": \"411033\",\r\n"
     		+ "            \"geo\": {\r\n"
     		+ "                \"lat\": \"-37.3159\",\r\n"
     		+ "                \"lng\": \"81.1496\"\r\n"
     		+ "            }\r\n"
     		+ "        },\r\n"
     		+ "        \"phone\": \"1-770-736-8031 x56442\",\r\n"
     		+ "        \"website\": \"hildegard.org\",\r\n"
     		+ "        \"company\": {\r\n"
     		+ "            \"name\": \"Romaguera-Crona\",\r\n"
     		+ "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\r\n"
     		+ "            \"bs\": \"harness real-time e-markets\"\r\n"
     		+ "        }\r\n"
     		+ "    }\r\n"
     		+ "]}")
     .log()
     .all()
      .when()
     .post("https://jsonplaceholder.typicode.com/users")
     .then()
     .log()
     .all();
     
     
	}

}
