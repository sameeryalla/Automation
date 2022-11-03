package getting_started;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;


public class basic_get_request {
	
  @Test
  public void simple_get_requests() {
	  
	  given()
	       .baseUri("https://restcountries.com/v3.1").
	  when()
	       .get("/all").
	  then().log().all()
	       .statusCode(200);
  }
  
  
  public void simple_get_requests_jsonvalidation() {
	  
	  given()
	       .baseUri("https://restcountries.com/v3.1").
	  when()
	       .get("/alpha/USA").
	  then().log().all()
	       .statusCode(200)
	       .body(
	 			  "name.common", Matchers.equalTo("United States"),
	 			  "capital", Matchers.equalTo("Washington, D.C."),
	 			  "altSpellings", hasItem("United States of America"),
	 			  "currencies.USD.name", Matchers.equalTo("United States dollar"),
	 			  "languages.eng", Matchers.equalTo("English")
	 			  )
	       ;
  }
  
  @Test
  public void simple_get_requests_jsonvalidation2() {
	  
	  given()
	       .baseUri("https://dummy.restapiexample.com/api/v1").
	  when()
	       .get("/employee/1").
	  then().log().all()
	       .statusCode(200)
	       .body(
	 			  "status", Matchers.equalTo("success"),
	 			  "data.employee_name", Matchers.equalTo("Tiger Nixon")
	 			  );
  }
  
  @Test
  public void sample_get_request_XMLvalidation()
  {
	  given()
	        .baseUri("https://api.openweathermap.org/data/2.5")
	        .queryParam("q","Delhi")
	        .queryParam("APPID", "f71eea6de1eac7b9b0cb5e6ac9d1f2a1")
	        .queryParam("mode", "xml").
	  when()
	       .get("/weather").
	 then().log().all()
	      .statusCode(200)
	      .body(
	    		  "current.city.@name",equalTo("Delhi"),
	    		  "current.city.country",equalTo("IN"),
	    		  "current.city.timezone",equalTo("19800")

	    		  );
  }
  
  @Test
  public void extract_response_data()
  {
	RestAssured.baseURI="";
	
	Response res=     given()
         .baseUri("https://restcountries.com/v3.1").
    when()
         .get("/alpha/USA").
    then()
         .log().all().extract().response();
	System.out.println(res.asString());
	
	
  }
  
  @Test
  public void extract_single_data()
  {
	  String temp=given()
	        .baseUri("https://api.openweathermap.org/data/2.5")
	        .queryParam("q","Delhi")
	        .queryParam("APPID", "f71eea6de1eac7b9b0cb5e6ac9d1f2a1")
	        .queryParam("mode", "xml").
	  when()
	       .get("/weather").
	 then().log().all().statusCode(200)
     .body(
   		  "current.city.@name",equalTo("Delhi"),
   		  "current.city.country",equalTo("IN"),
   		  "current.city.timezone",equalTo("19800")

   		  )
	      .extract().path("current.temperature.@value");
	  
	  System.out.println("Temperature in Delhi: "+temp);
	  
  }
  
  @Test
  public void validate_status_line()
  {
	RestAssured.baseURI="";
	
	Response res=     given()
         .baseUri("https://api.printful.com").
    when()
         .get("/variant/1").
    then()
         .log().all().statusLine("HTTP/1.1 404 Not Found")
         .extract().response();
	System.out.println(res.asString());
	
	
  }
  
  
}
