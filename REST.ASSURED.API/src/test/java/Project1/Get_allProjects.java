package Project1;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_allProjects {
	@Test
	public void getAllProjects()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(resp.asString());
		resp.prettyPrint();
	}
}
