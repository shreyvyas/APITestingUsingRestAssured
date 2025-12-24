package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle9 {

	public static void main(String[] args) {
		
		//size(), count(), min(), max()
		
		String json = "{\r\n"
				+ "  \"store\": {\r\n"
				+ "    \"books\": [\r\n"
				+ "      { \"title\": \"Java Guide\", \"price\": 500, \"author\": \"Rahul\" },\r\n"
				+ "      { \"title\": \"API Testing\", \"price\": 700, \"author\": \"Shrey\" },\r\n"
				+ "      { \"title\": \"DevOps Handbook\", \"price\": 900, \"author\": \"Amit\" }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		//Count / Size of Array
		int count = js.getInt("store.books.size()");
		System.out.println(count);
		
		//count of books price > 600
		
		int greater600 = js.getInt("store.books.findAll{it.price>600}.size()");
		System.out.println(greater600);
		
		//max
		Object mx = js.get("store.books.max{it.price}");
		System.out.println(mx);
		
		//min
		Object mn = js.get("store.books.min{it.price}");
		System.out.println(mn);

	}

}
