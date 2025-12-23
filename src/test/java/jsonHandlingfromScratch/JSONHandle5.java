package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle5 {

	public static void main(String[] args) {
		
		// Nested Array Handling
		
		String json = "{\r\n"
				+ "  \"store\": {\r\n"
				+ "    \"books\": [\r\n"
				+ "      {\r\n"
				+ "        \"title\": \"Java Guide\",\r\n"
				+ "        \"price\": 500\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"title\": \"API Testing\",\r\n"
				+ "        \"price\": 700\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		System.out.println(js.getString("store.books[0].title"));
		
		System.out.println(js.getString("store.books[1].price"));
		
		System.out.println(js.getString("store.books[0]"));

	}

}
