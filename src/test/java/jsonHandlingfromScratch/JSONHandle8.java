package jsonHandlingfromScratch;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JSONHandle8 {

	public static void main(String[] args) {
		
		// Conditions
		
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
		
		//AND: price>600 and author=='shrey'
		
		List<Object> list1 = js.getList("store.books.findAll{it.price>600 && it.author=='Shrey'}");
		System.out.println(list1);
		
		//OR: price 500 or 900
		List<Object> list2 = js.getList("store.books.findAll{it.price>500 || it.price==900}");
		System.out.println(list2);
		
		//
		List<Object> list3 = js.getList("store.books.findAll{it.price>600 && it.author=='Amit'}");
		System.out.println(list3);
		
		//
		List<Object> list4 = js.getList("store.books.findAll{it.price==500 || it.price==700}");
		System.out.println(list4);
		
		//
		String list5 = js.getString("store.books.find{it.price>600}.title");
		System.out.println(list5);

	}

}
