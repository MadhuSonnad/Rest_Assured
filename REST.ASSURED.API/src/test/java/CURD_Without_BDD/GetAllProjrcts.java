package CURD_Without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjrcts {
	
	@Test
	public void getproject()
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
		Response respon = RestAssured.get("http://localhost:8084/projects");
		
		//step-3 validation
		respon.then().log().all();
}
}

