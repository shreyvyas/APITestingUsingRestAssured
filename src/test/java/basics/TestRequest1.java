package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class TestRequest1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://content-qtripdynamic-qa-backend.azurewebsites.net";
		
		given().log().all().body("{\r\n"
				+ "   \"email\":\"s@gmail.com\",\r\n"
				+ "   \"password\":\"s@gmail.com\",\r\n"
				+ "   \"confirmpassword\":\"s@gmail.com\"\r\n"
				+ "}\r\n"
				+ "").when().put("/api/v1/register").then().log().all().assertThat().statusCode(403);

	}

}
