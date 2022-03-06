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
}
