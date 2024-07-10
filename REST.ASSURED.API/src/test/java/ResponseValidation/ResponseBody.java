package ResponseValidation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
public class ResponseBody 
{
@Test
public void validateHearder()
{
	given()
	.get("http://localhost:8084/projects")
	.then()
	.log().all()
	.and().body("[2].projectName", Matchers.equalTo("Telicoo"))
	.and().body("[2].projectId", Matchers.containsString("TY"));
	//.and().body("projectName", Matchers.hasItems("paytm","null","Tata"));
}
}
