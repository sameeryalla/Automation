package Utilities;

import files.payload;
import io.restassured.path.json.JsonPath;

public class JsonParsing {
	
	static JsonPath js;
	
	public static String jsonparse(String json, String key)
	{
		 js=new JsonPath(json);
		 return js.getString(key);
	}
	
	
	public static void ComplexJsonParse()
	{
		js=new JsonPath(payload.CoursePrice());
		
		//count the courses
		int coursecount=js.getInt("courses.size()");
		
	}

}
