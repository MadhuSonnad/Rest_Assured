package ResponseValidation;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Static_Validation 
{
	@Test
	public void staticvali()
	{
		String expData="TY_PROJ_1803";
		 baseURI = "http://localhost/";
		 port = 8084;

		Response resp=when().get("/projects");

		 String actData = resp.jsonPath().get("[1].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data Verfied");
		resp.then().log().all();
	}
}
	