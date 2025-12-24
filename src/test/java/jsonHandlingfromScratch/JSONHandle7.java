package jsonHandlingfromScratch;

import io.restassured.path.json.JsonPath;

public class JSONHandle7 {

	public static void main(String[] args) {
		
		String json = "{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		JsonPath js = new JsonPath(json);
		
		System.out.println(js.getString("menu.popup.menuitem[0].value"));
		
		

	}

}
