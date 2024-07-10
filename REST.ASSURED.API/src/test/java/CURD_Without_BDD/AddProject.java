package CURD_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject {

	@Test
	public void addproject()
	{
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "MadhuSudhan");
		obj.put("projectName", "Tata-Steel");
		obj.put("status", "created");
		obj.put("teamsize", 5);
		
		//step-1 pre condition
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		//step-2 action
		Response respon = req.post("http://localhost:8084/addProject");
		
		//step-3 validation
		respon.then().log().all();
	}
}
