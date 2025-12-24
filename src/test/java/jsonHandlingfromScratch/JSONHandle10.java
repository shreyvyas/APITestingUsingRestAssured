package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle10 {

	public static void main(String[] args) {
		
		//count/size, min, max, startsWith, endsWith, contains
		
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
		
		//size of an array
		int totalBooks = js.getInt("store.books.size()");
		System.out.println(totalBooks);
		
		//count of books price > 600
		int greater600 = js.getInt("store.books.findAll{it.price>600}.size()");
		System.out.println(greater600);
		
		//max price of book
		String maxPrice = js.getString("store.books.max{it.price}");
		System.out.println(maxPrice);
		
		//maxPrice title
		String maxPriceTitle = js.getString("store.books.max{it.price}.title");
		System.out.println(maxPriceTitle);
		
		//min price of book
		String minPrice = js.getString("store.books.min{it.price}");
		System.out.println(minPrice);
		
		//min price author
		//min price of book
		String minPriceAuthor = js.getString("store.books.min{it.price}.author");
		System.out.println(minPriceAuthor);

	}

}
