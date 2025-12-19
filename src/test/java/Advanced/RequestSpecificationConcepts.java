package Advanced;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import testData.GetBookData;

public class RequestSpecificationConcepts {
	
	RequestSpecification request = given().baseUri("http://216.10.245.166").body(GetBookData.getBook());
	
	@Test(description="Request Specification")
	public void getBook() {
		
		Response response = given().spec(request).queryParam("ID", 3389).when().get("/Library/GetBook.php").then().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
		JsonPath js = response.jsonPath();
		String msg = js.getString("Msg");
		System.out.println(msg);
		
	}

}
