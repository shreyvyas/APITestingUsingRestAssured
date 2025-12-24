package jsonHandlingfromScratch;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JSONHandle11 {

	public static void main(String[] args) {
		
		//real world JSON example
		
		String json = "{\r\n"
				+ "  \"orders\": [\r\n"
				+ "    {\"id\": 1, \"status\": \"delivered\", \"amount\": 5000},\r\n"
				+ "    {\"id\": 2, \"status\": \"pending\", \"amount\": 2000},\r\n"
				+ "    {\"id\": 3, \"status\": \"delivered\", \"amount\": 8000}\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(json);
		
		//count of delivered orders
		int dlCount = js.getInt("orders.findAll{it.status=='delivered'}.size()");
		System.out.println(dlCount);
		
		//delivered order id
		List<Object> dlOrderId = js.getList("orders.findAll{it.status=='delivered'}.id");
		System.out.println(dlOrderId);
		
		//max order amount
		String maxAmount = js.getString("orders.max{it.amount}");
		System.out.println(maxAmount);
		
		//same for min above code
		
		

	}

}
