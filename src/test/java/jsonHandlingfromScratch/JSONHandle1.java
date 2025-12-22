package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle1 {

	public static void main(String[] args) {
		
		String json = "{\r\n"
				+ "  \"products\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 101,\r\n"
				+ "      \"name\": \"Laptop\",\r\n"
				+ "      \"price\": 50000\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 102,\r\n"
				+ "      \"name\": \"Mobile\",\r\n"
				+ "      \"price\": 30000\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		//print first product name
		System.out.println(js.getString("products[0].name"));
		
		//second product price
		System.out.println(js.getString("products[1].price"));
		
		//first product id
		System.out.println(js.getString("products[0].id"));

	}

}
