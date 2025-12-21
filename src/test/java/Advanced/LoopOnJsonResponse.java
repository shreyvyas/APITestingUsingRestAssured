package Advanced;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoopOnJsonResponse {
	
	RequestSpecification request = given().baseUri("https://dummy.restapiexample.com").basePath("/api");
	
	@Test
	public void getAllBooks() {
		
		Response response = given().spec(request).when().get("/v1/employees").then().extract().response();
		
		//System.out.println(response.asPrettyString());
		
		JsonPath js = response.jsonPath();
		System.out.println(js.getString("status"));
		
		System.out.println(js.getString("data[0].employee_name"));
		
		for(int i=0; i<js.getList("data").size(); i++) {
			
			if(js.getInt("data["+ i +"].employee_age")>40) {
				
				System.out.println(js.getString("data["+ i +"].employee_name"));
				
				
			}
			
		}
		
	}

}
