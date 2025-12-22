package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle3 {

	public static void main(String[] args) {
		
		String json = "{\r\n"
				+ "  \"order\": {\r\n"
				+ "    \"id\": 501,\r\n"
				+ "    \"customer\": {\r\n"
				+ "      \"name\": \"Rahul\",\r\n"
				+ "      \"contact\": {\r\n"
				+ "        \"email\": \"rahul@test.com\",\r\n"
				+ "        \"phone\": \"9999999999\"\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		System.out.println(js.getString("order.id"));
		
		System.out.println(js.getString("order.customer.name"));
		
		System.out.println(js.getString("order.customer.contact.phone"));

	}

}
