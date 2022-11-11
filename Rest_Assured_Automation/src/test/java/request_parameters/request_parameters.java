package request_parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class request_parameters {
  @Test
  public void handling_query_param() {
	  given()
	        .baseUri("http://restcountries.com/v3.1")
	        .queryParam("fullText", "false")
	        .queryParam("mode","xml").
	  when()
	        .get("/name/India").
	  then()
	        .log().all()
	        .statusCode(200);
	        
  }
  
  @Test
  public void handling_multiple_params() {
	 
	  HashMap<String, Object> map=new HashMap<String, Object>();
	  map.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
	  map.put("Symbols", "USD");
	  
	  given()
	        .baseUri("https://api.apilayer.com/fixer")
	        //.queryParam("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa")
	        //.queryParam("Symbols","USD").
	        .queryParams(map).
	  when()
	        .get("/latest").
	  then()
	        .log().all()
	        .statusCode(200);        
  }
  @Test
  public void handling_multiplevalues_parameter() {
	  given()
	        .baseUri("https://restcountries.com/v3.1")
	        .queryParam("codes","col,no,ee,in").
	  when()
	        .get("/alpha").
	  then()
	        .log().all()
	        .statusCode(200);	        
  }
  
  @Test
  public void handling_path_parameter() {
	  given()
	        .baseUri("http://restcountries.com/v3.1")
	        .pathParam("currency1","USD").
	  when()
	        .get("/currency/{currency1}").
	  then()
	        .log().all()
	        .statusCode(200);
	        
  }
  @Test
  public void handling_form_data()
  {
	  given()
	        .baseUri("https://postman-echo.com")
	        .contentType("application/x-www-form-urlencoded;charset=UTF-8")
	        .formParam("FirstName","Sameer")
	        .formParam("LastName","Yalla")
	        .formParam("Age","35").
	   when()
	        .post("/post").
	   then().log().all().statusCode(200);
	        
  }
  
}
