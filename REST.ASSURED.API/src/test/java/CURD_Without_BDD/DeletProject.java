package CURD_Without_BDD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletProject {

	@Test
	public void deletproject()
	{
	/*	JSONObject obj = new JSONObject();
		obj.put("createdBy", "MadhuSudhan");
		obj.put("projectName", "Tata-Steel");
		obj.put("status", "created");
		obj.put("teamsize", 5);
		
		//step-1 pre condition
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);*/
		
		//step-2 action
		Response respon = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_002");
		
		//step-3 validation
		respon.then().log().all();
		int ststus = respon.getStatusCode();
	assertEquals(ststus, 204);
		
}
}
