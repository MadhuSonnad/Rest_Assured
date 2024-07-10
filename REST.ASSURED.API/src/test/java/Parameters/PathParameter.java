package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PathParameter {
@Test 

public void pathparameter()
{
	//pre-request
	 baseURI = "http://localhost";
	 port = 8084;
	
	//Actions
	given().pathParam("pid", "TY_PROJ__1802")
	
	//validation
	.when().get("/projects/{pid}");
}
}