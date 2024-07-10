package CURD_With_BDD;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.assertion.BodyMatcher;
import io.restassured.http.ContentType;

public class AddProject {
@Test
public void addProject()
{
	//Step-1 Pre Conditions
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Madha");
	obj.put("projectName", "Mahindras");
	obj.put("status", "created");
	obj.put("teamSize", 4);
	
	given().body(obj).contentType(ContentType.JSON)
	
	//Step-2 action
	.when().post("http://localhost:8084/addProject")
	
	//Step-3 Validations
	
.then().assertThat().statusCode(201).log().all();
	
}
}

