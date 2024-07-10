package ResponseValidation;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class ValidateResponseBoddyByJsonPath 
{
	@Test
	public void responseBody()
	{
		Response resp = given()
				.get("http://localhost:8084/projects");
		ArrayList<Object> arry1 = resp.jsonPath().get("projectId");
		ArrayList<Object> arry2 = resp.jsonPath().get("projectName");

		for(int i=0; i<arry1.size();i++)
		{
			System.out.println(arry1.get(i)+"===>"+arry2.get(i));
		}
	}
}
