package Logging_scenarios;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

public class Rest_Logging {
  @Test
  public void log_all_details() {
	       given()
                 .baseUri("https://restcountries.com/v3.1").
           when()
                 .get("/alpha/US").
           
                 //then().log().all();
	       then().log().everything();
  }
  @Test
  public void log_body_header() {
	       given()
                 .baseUri("https://restcountries.com/v3.1").
           when()
                 .get("/alpha/US").
           //then().log().body().
           then().log().headers();

  }
  @Test
  public void log_cookies_or_status() {
	       given()
                 .baseUri("https://restcountries.com/v3.1").
           when()
                 .get("/alpha/US").
           then()
                 //.log().cookies();
	               .log().status();

  }
  @Test
  public void log_if_error() {
	       given()
                 .baseUri("https://restcountries.com/U3.1").
           when()
                 .get("/alpha/US").
           then()
	             .log()
	             .ifError();
	             //.ifStatusCodeIsEqualTo(404);
  }
  @Test
  public void log_if_validation_fails() {
	       given()
                 .baseUri("https://restcountries.com/U3.1").
           when()
                 .get("/alpha/US").
           then()
	             .log()
	             .ifValidationFails()
	             //.statusCode(200);
	             .statusCode(404);
  }
}
