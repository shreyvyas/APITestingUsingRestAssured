package jsonHandlingfromScratch;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JSONHandle12 {

	public static void main(String[] args) {
		
		//contains, startswith, endswith
		
		String json = "{\r\n"
				+ "  \"store\": {\r\n"
				+ "    \"books\": [\r\n"
				+ "      { \"title\": \"Java Guide\", \"price\": 500, \"author\": \"Rahul\" },\r\n"
				+ "      { \"title\": \"API Testing Mastery\", \"price\": 700, \"author\": \"Shrey\" },\r\n"
				+ "      { \"title\": \"DevOps Handbook\", \"price\": 900, \"author\": \"Amit\" }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		String titleContains = js.getString("store.books.find{it.title.contains('Testing')}");
		System.out.println(titleContains);
		
		List<Object> getList1 = js.getList("store.books.findAll{it.title.startsWith('A')}");
		System.out.println(getList1);
		
		List<Object> getList2 = js.getList("store.books.findAll{it.title.endsWith('k')}");
		System.out.println(getList2);
		

	}

}
