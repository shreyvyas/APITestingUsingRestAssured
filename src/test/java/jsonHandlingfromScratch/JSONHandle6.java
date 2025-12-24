package jsonHandlingfromScratch;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JSONHandle6 {

	public static void main(String[] args) {
		
		// filtering and searching
		
		String json = "{\r\n"
				+ "  \"store\": {\r\n"
				+ "    \"books\": [\r\n"
				+ "      {\r\n"
				+ "        \"title\": \"Java Guide\",\r\n"
				+ "        \"price\": 500,\r\n"
				+ "        \"author\": \"Rahul\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"title\": \"API Testing\",\r\n"
				+ "        \"price\": 700,\r\n"
				+ "        \"author\": \"Shrey\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"title\": \"DevOps Handbook\",\r\n"
				+ "        \"price\": 900,\r\n"
				+ "        \"author\": \"Amit\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "";
		
		JsonPath js = new JsonPath(json);
		
		//Get all books with price > 600
		List<Object> getBooks = js.getList("store.books.findAll{it.price > 600}");
		System.out.println(getBooks);
		
		//get title of books which price is greater than 600
		List<Object> greater600 = js.getList("store.books.findAll{it.price>600}.title");
		System.out.println(greater600);
		
		//Book where author = "Rahul" ka title
		List<Object> authorRahul = js.getList("store.books.findAll{it.author=='Rahul'}");
		System.out.println(authorRahul);
		
		

	}

}
