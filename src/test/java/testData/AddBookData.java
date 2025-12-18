package testData;

import java.util.UUID;

public class AddBookData {
	
	private static String uuid = UUID.randomUUID().toString();
	private static String isbn = "book" + "_" + uuid;
	
	public static String addBookData() {
		
		return "{\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\"" + isbn + "\",\n" +
                "\"aisle\":\"227\",\n" +
                "\"author\":\"Shrey Vyas\"\n" +
                "}";
		
	}

}
