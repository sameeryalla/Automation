package DemoPKG;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;
import Utilities.JsonParsing;

public class Addupdateplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//POST records and validate
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload.AddPlace())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		         .header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

		
		 //JsonPath js=new JsonPath(response);
		 //String placeID=js.getString("place_id");
		String placeID= JsonParsing.jsonparse(response, "place_id");
		
		
		System.out.println(placeID); 
		//System.out.println(payload.UpdatePlace(placeID));
		//update(PUT) records and validate
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload.UpdatePlace(placeID))
				.when().put("/maps/api/place/update/json")
				.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"))
				 .extract().response().asString();
		
		String response2=given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeID)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		 
		
			
		//JsonPath js2=new JsonPath(response2);
		//System.out.println(js2.getString("address")); 
		String address= JsonParsing.jsonparse(response2, "address");
		
		//Junit,Testng assertions
		Assert.assertTrue(!(response.contains(address)));
		System.out.println(address);
		 
	}

}
