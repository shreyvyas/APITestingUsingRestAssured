package Advanced;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import testData.AddBookData;

public class Add_Get_Book {
	
	static String bookID;
	
	@Test(description="This test method will add the book", priority=1)
	public void addBook() {
		
		RestAssured.baseURI = "http://216.10.245.166";
		RestAssured.basePath = "/Library/Addbook.php";
		
		Response response = given().body(AddBookData.addBookData()).when().post().then().extract().response();
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		JsonPath js = response.jsonPath();
		String msg = js.getString("Msg");
		Assert.assertEquals(msg, "successfully added");
		
		bookID = js.getString("ID");
		System.out.println("Book ID: " +bookID);
		
	}
	
	@Test(description="This test method will get the book", priority=2)
	public void getBook() {
		
		RestAssured.baseURI = "http://216.10.245.166";
		RestAssured.basePath = "/Library/GetBook.php";
		
		Response response = given().queryParam("ID", bookID).when().get().then().extract().response();
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		JsonPath js = response.jsonPath();
		System.out.println(js.getString("isbn"));
		Assert.assertEquals(js.getString("isbn"), bookID);
		
	}

}
