package files;

public class payload {

	
	public static String AddPlace()
	{
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Tulasi Nilayam\",\r\n" + 
				"  \"phone_number\": \"(+91) 9962654847\",\r\n" + 
				"  \"address\": \"2A Cross Road, Sai Baba Temple Road, XMunnekollal, XMarathahalli, Bengaluru\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"Community House\",\r\n" + 
				"    \"Home\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
	}
	
	public static String UpdatePlace(String placeId)
	{
		return "{\r\n" + 
				"\"place_id\": \""+placeId+"\"," + 
				"    \"phone_number\": \"(+91) 9980802239\",\r\n" + 
				"  \"address\": \"2A Cross Road, Sai Baba Temple Road, Munnekollal, Marathahalli, Bengaluru, 560037\",\r\n" + 
				"  \"key\":\"qaclick123\"\r\n" +
				"}\r\n" +
				"";
	}
	
	public static String CoursePrice()
	{
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseamount\":\"910\",\r\n" + 
				"    \"website\":\"rahulshettyacademy\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\":\"selenium python\",\r\n" + 
				"      \"price\":\"50\",\r\n" + 
				"      \"copies\":\"6\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\":\"cypress\",\r\n" + 
				"      \"price\":\"40\",\r\n" + 
				"      \"copies\":\"4\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\":\"RPA\",\r\n" + 
				"      \"price\":\"20\",\r\n" + 
				"      \"copies\":\"10\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\":\"Appium\",\r\n" + 
				"      \"price\":\"25\",\r\n" + 
				"      \"copies\":\"10\"\r\n" + 
				"    }\r\n" + 
				"    ]\r\n" + 
				"}";
	}
	
	public static String AddUser(String str1, String str2)
	{
		return "{\r\n" + 
				"    \"name\": \""+str1+"\",\r\n" + 
				"    \"job\": \""+str2+"\"\r\n" + 
				"}";
	}
	
	
	public static String Login(String str1, String str2)
	{
		return "{\r\n" + 
				"    \"username\": \""+str1+"\",\r\n" + 
				"    \"password\": \""+str2+"\"\r\n" + 
				"}";
	}
	
}
