package jsonHandling;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class DataFromJsonFile {
	
	File file = new File("C:/Users/admin/eclipse-workspace/restassuredtesting/resources/addBook.json");
	RequestSpecification  request = given().baseUri("http://216.10.245.166").basePath("/Library").header("Content-Type", "application/json")
			.body(file);
	
	@Test(description="Test Data from Json File")
	public void addBook() {
		
		Response response = given().spec(request).when().post("/Addbook.php").then().extract().response();
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.asPrettyString());
		
		JsonPath js = response.jsonPath();
		System.out.println(js.getString("Msg"));
		System.out.println(js.getString("ID"));
		
	}
	

}
