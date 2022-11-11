package HeadersNCookies;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.File;


public class Headers_And_Cookies {
  @Test
  public void sending_request_headers() {
	  
	  HashMap<String, Object> map=new HashMap<String, Object>();
	  map.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
	  map.put("Symbols", "USD");
	  
	  given()
	        .baseUri("https://api.apilayer.com/fixer")
	        //.queryParam("access_key", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa")
	        //.queryParam("Symbols","USD").
	        .queryParams(map)
	        .header("If-None-Match","90ac11654be89d2475d3aee321177ef3")
	        .header("If-Modified-Since","Fri, 11 Nov 2022 02:48:58 GMT").
	  when()
	        .get("/latest").
	  then()
	        .log().all()
	        .statusCode(200);        
  }
  
  @Test
  public void sending_headers_object() {
	  
	  HashMap<String, Object> queryparam=new HashMap<String, Object>();
	  HashMap<String, Object> headers=new HashMap<String, Object>();
	  queryparam.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
	  queryparam.put("Symbols", "USD");
	  headers.put("If-None-Match","05027ec71774e50fdc6c72b1b78198bd");
	  headers.put("If-Modified-Since","Fri, 11 Nov 2022 02:48:58 GMT");
	 // headers.put("Accept-Encoding","gzip, deflate, br");
	  headers.put("Connection","keep-alive");
	 // headers.put("Content-Type","application/json");
	  
	  given()
	        .baseUri("https://api.apilayer.com/fixer")
	        //.queryParam("access_key", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa")
	        //.queryParam("Symbols","USD").
	        .queryParams(queryparam)
	        //.header("If-None-Match","90ac11654be89d2475d3aee321177ef3")
	        //.header("If-Modified-Since","Fri, 11 Nov 2022 02:48:58 GMT").
	        .headers(headers).
	  when()
	        .get("/latest").
	  then()
	        .log().all()
	        .statusCode(200);        
  }
  
  @Test
  public void sending_request_cookies() {
	  
	  HashMap<String, Object> map=new HashMap<String, Object>();
	  map.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
	  map.put("Symbols", "USD");
	  
	  given()
	        .baseUri("https://api.apilayer.com/fixer")
	        .queryParams(map)
	        .cookie("user","sameer","","").
	  when()
	        .get("/latest").
	  then()
	        .log().all()
	        .statusCode(200);        
  }

  @Test
  public void sending_request_cookies_builder() {
	  
	  Cookie cookie=new Cookie.Builder("usertype","int").setSecured(true).setComment("cookie testing").build();
	  HashMap<String, Object> map=new HashMap<String, Object>();
	  map.put("apikey", "ZCh2RwF9gI5k03c9LV8ZuxOth26WbrEa");
	  map.put("Symbols", "USD");
	  
	  given()
	        .baseUri("https://api.apilayer.com/fixer")
	        .queryParams(map)
	        .cookie(cookie).
	  when()
	        .get("/latest").
	  then()
	        .log().all()
	        .statusCode(200);        
  }
  
}
