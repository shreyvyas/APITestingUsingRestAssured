package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestRequest3 {
	
	@Test
	public void getRequest() {
		
		RestAssured.baseURI = "http://216.10.245.166";
		RestAssured.basePath = "/Library/GetBook.php";
		
		Response response = given().log().all().queryParam("ID", 3389).when().get().then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 404);
		
		System.out.println(response.getBody().asPrettyString());
		
		JsonPath js = response.jsonPath();
		String message = js.getString("msg");
		
		System.out.println(message);
		
	}

}
