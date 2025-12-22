package jsonHandling;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class CreateUserUsingPOJO {
	
	@Test(description="Test Data Using POJO")
	public void newUser() {
		
		CreateUserRequest cur = new CreateUserRequest();
		cur.setName("Anagh");
		cur.setJob("student");
		
		Response response = given().baseUri("https://reqres.in/api")
				.header("Content-Type", "application/json")
				.body(cur)
				.when()
				.post("/users")
				.then()
				.extract().response();
		
		System.out.println(response.asPrettyString());
		
	}

}
