package auth;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Auth {
  @Test
  public void digest_authentication() {
	  given()
	        .baseUri("https://postman-echo.com")
	        .auth().digest("postman", "password").
	  when()
	      .get("/digest-auth").
	  then().log().all()
	  .statusCode(200);
	      
  }
  
  @Test
  public void basic_authentication() {
	  given()
	        .baseUri("https://postman-echo.com")
	        .auth().basic("postman", "password").
	  when()
	      .get("/basic-auth").
	  then().log().all()
	  .statusCode(200);
	      
  }
  
  //oAuth validation using twitter
  @Test
  public void post_a_tweet()
  {
	String tweet="tweet from rest assured api";
	given()
	      .baseUri("https://api.twitter.com/1.1")
	      .auth().oauth(
	    		  "consumerKey", 
	    		  "consumerSecret", 
	    		  "accessToken", 
	    		  "secretToken")
	      .param("status",tweet).
	 when()
	     .post("/statuses/update.json").
	 then().log().all()
	 .statusCode(200);    
	      
  }
  //oAuth2.0 validation
  @Test
  public void paypal_test()
  {
	  //to get the token
	 String paypal_accesstoken=""; 
	 paypal_accesstoken=given()
	        .baseUri("https://api-m.sandbox.paypal.com/v1")
	        .contentType("application/x-www-form-urlencoded;UTF-8")
	        .header("Accept-Language","en_US")
	        .param("grant_type", "client_credentials")
	        .auth().preemptive().basic("AQsXYLPfZhZX1MEAmdotVBoi-YAOTgJOIf5V559G8B2C53Zhg9CMZb2Tdl_OcgO1ypJKDXRfzzkGD9Gt",
	        		"EBF9Thx8XPaVw42VLdJes3EPeTiDWJnmz3lbn0bvKRerLZ6xsRrP8D17kxctYWgQUPA7LZKzcVb8ynsC").
	  when()
	       .post("/oauth2/token").
	  then()
	       .log().all()
	       .statusCode(200)
	       .extract().path("access_token");
	 //using above token to generate the invoice
	 given()
	       .baseUri("https://api-m.sandbox.paypal.com/v2")
	       .contentType("application/json;UTF-8")
	        .auth().oauth2(paypal_accesstoken).
	  when()
	       .post("/invoicing/generate-next-invoice-number").
	  then()
	       .log().all()
	       .statusCode(200);
  }
  
  
}
