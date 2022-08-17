package JIRA_API;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import files.ReusableMethod;

public class JiraTest {

	@Test
	public void validateissuecreation() throws IOException
	{
		RestAssured.baseURI="http://localhost:8080";
		//login session filter
		SessionFilter session=new SessionFilter();
		
		//login to app
		String response1=given().log().all().header("Content-Type","application/json").body(files.payload.Login("sameeryalla", "ramu2127"))
		        .filter(session)          
				.when().post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1=ReusableMethod.rawToJson(response1);
		String sessionID=js1.get("session.value");
		System.out.println("Session id is "+sessionID);
		
		//creating issue
		String response2=given().header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\RESTASSUREDAPI_AUTOMATION\\RESTAPI_AUTO\\TestData\\Jira_CreateIssue.json"))))
				.filter(session)
				.when().post("/rest/api/2/issue")
				.then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath js2=ReusableMethod.rawToJson(response2);
		String ID=js2.get("id");
		System.out.println("Newly created issue id is "+ID);
		
		//post comment for above created issue
		String cmtresp=given().pathParam("key",ID).log().all().header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\RESTASSUREDAPI_AUTOMATION\\RESTAPI_AUTO\\TestData\\Posting_Comment.json"))))
		.filter(session)
		.when().post("/rest/api/2/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath js4=new JsonPath(cmtresp);
		String cmtid=js4.getString("id");
		//add attachment
		given().log().all().header("X-Atlassian-Token","no-check").filter(session).pathParam("key",ID)
		
		.header("Content-Type","multipart/form-data")
		.multiPart("file", new File("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\RESTASSUREDAPI_AUTOMATION\\RESTAPI_AUTO\\TestData\\Attachment_Issue.jpg"))
		.when().post("/rest/api/2/issue/{key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		
		
		
		
		//get issue
		String response3=given().log().all().filter(session).pathParam("key",ID)
				.queryParams("fields","comment")
		.when().get("/rest/api/2/issue/{key}").then().log().all().assertThat().statusCode(200).extract().response().asString();

		JsonPath js3=new JsonPath(response3);
		int commentscount=js3.getInt("fields.comment.comments.size()");
		for (int i=0;i<commentscount;i++)
		{
			String commentid=js3.getString("fields.comment.comments["+i+"].id");
		    if(commentid.equalsIgnoreCase(cmtid))
		    {
		    	String message=js3.getString("fields.comment.comments["+i+"].body").toString();
		    	System.out.println(message);
		    }
		}
		
	}

}
