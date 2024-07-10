package ResponseValidation;
import static io.restassured.RestAssured.*;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicValidation 
{@Test
public void dynamicvali(){
	
	String expData="TY_PROJ_1803";
	 baseURI = "http://localhost";
	 port = 8084;
	
	Response resp=when().get("/projects");
	
	boolean flag = false;
	List<String> pIDs = resp.jsonPath().get("projectId");
	
	for (String projectId : pIDs) 
	{
		if(projectId.equalsIgnoreCase(expData))
		{
			flag=true;
		}
	}
	Assert.assertTrue(flag);
	System.out.println("Data Verfied");
	resp.then().log().all();
}
}
