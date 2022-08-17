package DynamicJson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReusableMethod;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.Arrays;
import java.util.List;

public class DynamicJson {

	
	@Test(dataProvider="UserData")
	public void addUser(String key, String value)
	{
		RestAssured.baseURI="https://reqres.in";
		String response=given().header("Content-Type","application/json")
				        .body(payload.AddUser(key,value))
		                .when().post("/api/users")
		                .then().log().all().assertThat().statusCode(201)
		                .extract().response().asString();
		
		JsonPath js=ReusableMethod.rawToJson(response);
		String ID=js.get("id");
		System.out.println(ID);
	}
	@DataProvider(name="UserData")
	public Object[][] getData()
	{
		//array is a collection of elements, MultiD Array is collection of array
		Object[][] dataset= {{"Test08Mar2022A","Role101"},{"Test08Mar2022B","Role102"},{"Test08Mar2022C","Role103"},{"Test08Mar2022D","Role104"}};
		 return dataset;
	}
}
