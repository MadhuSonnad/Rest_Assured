package CURD_With_BDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeletProject {
	@Test
	public void deletProject()
	{
		//Step-1 Pre Conditions
		/*JSONObject obj = new JSONObject();
		obj.put("createdBy", "Madhan");
		obj.put("projectName", "Mahindra");
		obj.put("status", "created");
		obj.put("teamSize", 4);
		
		given().body(obj).contentType(ContentType.JSON)
		*/
		//Step-2 action
		when().delete("http://localhost:8084/projects/TY_PROJ_1203")
		
		//Step-3 Validations
	.then().assertThat().statusCode(204).log().all();
		
	}

	
}
