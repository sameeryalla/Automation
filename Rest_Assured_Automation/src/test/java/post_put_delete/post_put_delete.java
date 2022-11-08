package post_put_delete;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.File;

public class post_put_delete {
  @Test
  public void post_request() {
	  
	  File file=new File("resources\\Create_Employee.json");
	  
	  int id=given()
	        .baseUri("https://dummy.restapiexample.com/api/v1")
	        .contentType(ContentType.JSON)
	       .body(file).
	        
	  when()
	       .post("/create").
	  then().log().all()
	       .statusCode(200)
	       .body("data.name",equalTo("SAMEER13"),
	    		   "data.age",equalTo("36")
	    		   )
	       .extract().path("data.id");
	  System.out.println("Newly create employee id:" +id);	  
  }
  
  @Test
  public void post_request_using_jsonobj() {
	  
	  JSONObject body=new JSONObject();
	  body.put("name", "SAMEER15");
	  body.put("salary", "200k");
	  body.put("age", "37");
	  int id=given()
	        .baseUri("https://dummy.restapiexample.com/api/v1")
	        .contentType(ContentType.JSON)
	       .body(body.toString()).
	        
	  when()
	       .post("/create").
	  then().log().all()
	       .statusCode(200)
	       .body("data.name",equalTo("SAMEER15"),
	    		   "data.age",equalTo("37")
	    		   )
	       .extract().path("data.id");
	  System.out.println("Newly create employee id:" +id);	  
  }
  
  @Test
  public void put_request_using_jsonobj() {
	  
	  JSONObject body=new JSONObject();
	  body.put("name", "SACHIN2");
	  body.put("salary", "200M");
	  body.put("age", "49");
	  given()
	        .baseUri("https://dummy.restapiexample.com/api/v1")
	        .contentType(ContentType.JSON)
	       .body(body.toString()).
	        
	  when()
	       .put("/update/24").
	  then().log().all()
	       .statusCode(200)
	       .body("data.name",equalTo("SACHIN2"),
	    		   "data.age",equalTo("49")
	    		   );
  
  }
  
  
  @Test
  public void delete_request() {
	  
	 
	 String msg= given()
	        .baseUri("https://dummy.restapiexample.com/api/v1")
	        .contentType(ContentType.JSON).	        
	  when()
	       .delete("/delete/23").
	  then().log().all()
	       .statusCode(200).extract().path("message");
	 Assert.assertEquals("Successfully! Record has been deleted", msg);
  
  }
  
}
