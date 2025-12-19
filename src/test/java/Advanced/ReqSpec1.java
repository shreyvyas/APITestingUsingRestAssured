package Advanced;

import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ReqSpec1 {
	
//	https://dummy.restapiexample.com/api/v1/employees
	
	RequestSpecification request = given().baseUri("https://dummy.restapiexample.com").basePath("/api");
	
	@Test
	public void getAllBooks() {
		
		Response response = given().spec(request).when().get("/v1/employees").then().extract().response();
		
		System.out.println(response.asPrettyString());
		
		JsonPath js = response.jsonPath();
		System.out.println(js.getString("status"));
		
	}

}
