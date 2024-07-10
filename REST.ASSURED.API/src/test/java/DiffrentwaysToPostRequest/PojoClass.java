package DiffrentwaysToPostRequest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojoClass;
import io.restassured.http.ContentType;

public class PojoClass {
	@Test
	public void createPojo()
	{
		String baseURI = "http://localhost";
		int port = 8084;
		
		CreateProjectWithPojoClass obj =new CreateProjectWithPojoClass("Madhu12", "tyspjf", "created", 1);
	given().body(obj).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).log().all();
	
	}
}
