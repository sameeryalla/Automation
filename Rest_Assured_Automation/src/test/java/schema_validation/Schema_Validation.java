package schema_validation;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Cookie;

public class Schema_Validation {
	 @Test
	  public void extract_json_response() {
		  
		  Cookie cookie=new Cookie.Builder("usertype","int").setSecured(true).setComment("cookie testing").build();
		  HashMap<String, Object> map=new HashMap<String, Object>();
		  map.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
		  map.put("Symbols", "USD");
		  
		  File file=new File("resources\\currency_jsonSchema.json");
		  
		  given()
		        .baseUri("https://api.apilayer.com/fixer")
		        .queryParams(map)
		        .cookie(cookie).
		  when()
		        .get("/latest").
		  then()
		        .log().all()
		        .statusCode(200)
		        .body(matchesJsonSchema(file));
	  }
	 
	 
	 @Test
	  public void xml_dtd_schema_validation()
	  {
		 File file=new File("resources\\xmlschema.dtd");
		  given()
		        .baseUri("https://api.openweathermap.org/data/2.5")
		        .queryParam("q","Delhi")
		        .queryParam("APPID", "f71eea6de1eac7b9b0cb5e6ac9d1f2a1")
		        .queryParam("mode", "xml").
		  when()
		       .get("/weather").
		 then()
		      .log().all()
		      .statusCode(200)
		      .body(matchesDtd(file));
	  }
	 
	 @Test
	  public void xml_xsd_schema_validation()
	  {
		 File file=new File("resources\\xmlschema.xsd");
		  given()
		        .baseUri("https://api.openweathermap.org/data/2.5")
		        .queryParam("q","Delhi")
		        .queryParam("APPID", "f71eea6de1eac7b9b0cb5e6ac9d1f2a1")
		        .queryParam("mode", "xml").
		  when()
		       .get("/weather").
		 then()
		      .log().all()
		      .statusCode(200)
		      .body(matchesXsd(file));
	  }
}
