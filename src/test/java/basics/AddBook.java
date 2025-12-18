package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import testData.AddBookData;

public class AddBook {
	
	@Test
	public void addBook() {
		
		RestAssured.baseURI = "http://216.10.245.166";
		RestAssured.basePath = "/Library/Addbook.php";
		
		Response response = given().log().all().body(AddBookData.addBookData()).when().post().then().log().all().extract().response();
		
		System.out.println(response.getStatusCode());
		
		JsonPath js = response.jsonPath();
		
		System.out.println(js.getString("Msg"));
		
		Assert.assertEquals(js.getString("Msg"), "successfully added");
		
		System.out.println(js.getString("ID"));
		
	}

}
