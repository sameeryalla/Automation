package misc_operations;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.XmlConfig;

public class Misc {
	
	//before class
	@BeforeClass
	public static void setup()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8081;
		
	}
	
   //specifying request port
	@Test
	public void specify_port()
	{
		given()
		      .baseUri("http://localhost")
		      .port(8081).
		when()
		     .get("/whatsaup").
		then()
		     .log().all()
		     .statusCode(200);
	}
	
	@Test
	public void connect_whatsaup()
	{
		when()
		     .get("/whatsaup").
		then()
		     .log().all()
		     .statusCode(200);
	}
	
	
	@Test
	public void validate_response_time()
	{
		when()
		     .get("/whatsaup").
		then()
		     .log().all()
		     .statusCode(200)
		     .time(lessThan(1300L), TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void validate_xml_Namespace()
	{
		XmlConfig xmlc=XmlConfig.xmlConfig().declareNamespace("perctg","https://dezlearn.com/calculate-percentage");
		
		given()
		     .config(RestAssured.config().xmlConfig(xmlc)).
		 when()
		      .get("/student/963/score").
		 then()
		      .log().all()
		      .body("student.score[0]",equalTo("369"))
		      .body("student.grouping[1]", equalTo("99.66%"));
		      
		
	}
	
}
