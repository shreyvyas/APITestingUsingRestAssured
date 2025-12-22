package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle2 {

	public static void main(String[] args) {
		
		String json = "{\r\n"
				+ "  \"employee\": {\r\n"
				+ "    \"name\": \"Shrey\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"city\": \"Mumbai\",\r\n"
				+ "      \"pincode\": 400001\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		System.out.println(js.getString("employee.address.city"));
		
		System.out.println(js.getString("employee"));
		
		System.out.println(js.getString("employee.name"));
		
		System.out.println(js.getString("employee.address"));

	}

}
