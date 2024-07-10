package ResponseValidation;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class ValidateHeader 
{
	@Test
	public void getValidateHeader()
	{
		given()
		.get("http://localhost:8084/projects")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.assertThat().header("Content-Type", "application/json")
		.assertThat().header("Transfer-Encoding", "chunked");
	}
}
