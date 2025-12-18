package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.response.Response;
import testData.RequestBody;

public class TestRequest2 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://content-qtripdynamic-qa-backend.azurewebsites.net";
		RestAssured.basePath = "/api/v1/register";
		
		Response response = given().body(RequestBody.testData()).when().post().then().extract().response();
		
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(response.getStatusCode(), 403);
		
		System.out.println(response.getBody().asPrettyString());
		
		
	}

}
