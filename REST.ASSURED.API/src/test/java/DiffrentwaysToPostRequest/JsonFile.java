package DiffrentwaysToPostRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class JsonFile 
{
	@Test
	public void createjsonObject()
	{
		File file =new File("./jsondata.json");
		
		given().contentType(ContentType.JSON).body(file)
		.when().post("http://localhost:8084/addProject")
		.then().log().all();
	}
}

