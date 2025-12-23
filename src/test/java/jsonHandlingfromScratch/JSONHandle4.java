package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle4 {

	public static void main(String[] args) {
		
		// Handle Nested + Arrays
		
		String json = "{\r\n"
				+ "  \"orderId\": 5001,\r\n"
				+ "  \"customer\": {\r\n"
				+ "    \"name\": \"Rahul\",\r\n"
				+ "    \"addresses\": [\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"home\",\r\n"
				+ "        \"city\": \"Mumbai\",\r\n"
				+ "        \"pincode\": 400001\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"office\",\r\n"
				+ "        \"city\": \"Pune\",\r\n"
				+ "        \"pincode\": 411001\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		System.out.println(js.getString("orderId"));
		
		System.out.println(js.getString("customer.name"));
		
		System.out.println(js.getString("customer.addresses[0].type"));
		
		System.out.println(js.getString("customer.addresses[1].pincode"));
		
		

	}

}
