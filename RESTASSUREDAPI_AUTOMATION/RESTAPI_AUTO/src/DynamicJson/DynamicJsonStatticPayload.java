package DynamicJson;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReusableMethod;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJsonStatticPayload {

	@Test
	public void addUserwithStaticPayload() throws IOException
	{
		RestAssured.baseURI="https://reqres.in";
		String response=given().header("Content-Type","application/json")
				        .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\RESTASSUREDAPI_AUTOMATION\\RESTAPI_AUTO\\TestData\\UserData.json"))))
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
