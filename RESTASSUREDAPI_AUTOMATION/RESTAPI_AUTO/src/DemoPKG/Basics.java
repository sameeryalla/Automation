package DemoPKG;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class Basics {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Validate if add place API is working as expected.
		
		//given--> All input details
		//when--> Submit the API(resource and http will go here)
		//then--> Validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payload.AddPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		         .header("server", "Apache/2.4.18 (Ubuntu)"); 
		}

}
