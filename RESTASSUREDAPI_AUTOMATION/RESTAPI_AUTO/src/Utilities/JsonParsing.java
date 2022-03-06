package Utilities;

import io.restassured.path.json.JsonPath;

public class JsonParsing {
	
	public static String jsonparse(String json, String key)
	{
		 JsonPath js=new JsonPath(json);
		 return js.getString(key);
	}

}
