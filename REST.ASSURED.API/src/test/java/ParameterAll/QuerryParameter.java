package ParameterAll;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class QuerryParameter{
	@Test
	public void getQurreyParameter()
	{
	given()
	.auth().basic("rmgyantra","rmgy@9999")
	
//	.queryParam("users","3")
//	.queryParam("users","6")     we can use 2 types like this type or below one type also
//  .get("http://reqres.in/api/users")
	
	.when()
	.get("http://reqres.in/api/users?page=6")
	.then()
	.log().all();
}
}

