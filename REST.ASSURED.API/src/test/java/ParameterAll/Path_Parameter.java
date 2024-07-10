package ParameterAll;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class Path_Parameter {
	@Test
	public void getRepoTest()
	{
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("createdBy", "MadhuSonnad");
		jsonobject.put("createdOn", "Sepetember");
		jsonobject.put("ProjectName", "TataSteel");
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonobject.toJSONString())
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_203")
		.then()
		.log().all();
		

	}
}
