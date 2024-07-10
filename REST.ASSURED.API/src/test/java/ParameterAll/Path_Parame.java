package ParameterAll;
import static  io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Path_Parame {

	@Test
	public void getRepoTest()
	{
	given()
	.auth().basic("rmgyantra", "rmgy@9999")
	.when()
	.get("https://api.github.com/repos/MadhuSonnad/FrameworkSDET")
	.then()
	.log().all();
}
}