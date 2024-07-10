package CURD_With_BDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetProject {
	@Test
	public void getProject()
	{
		//Step-1 Pre Conditions
		/*JSONObject obj = new JSONObject();
		obj.put("createdBy", "Madhan");
		obj.put("projectName", "Mahindra");
		obj.put("status", "created");
		obj.put("teamSize", 4);
		
		given().body(obj).contentType(ContentType.JSON)*/
		
		//Step-2 action
		when().get("http://localhost:8084/projects/TY_PROJ_1203")
		
		//Step-3 Validations
	.then().assertThat().statusCode(200).log().all();	
	
}
}
