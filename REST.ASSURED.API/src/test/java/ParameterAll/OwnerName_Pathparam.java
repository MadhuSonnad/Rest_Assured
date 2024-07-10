package ParameterAll;
import static  io.restassured.RestAssured.*;
import org.testng.annotations.Test;


public class OwnerName_Pathparam {
		@Test
		public void getRepoParameter()
		{
		given()
		.auth().basic("rmgyantra","rmgy@9999")
		.pathParam("ownerName","MadhuSonnad")
		.pathParam("repoName","FrameworkSDET")
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		.then()
		.log().all();
	}
	}
