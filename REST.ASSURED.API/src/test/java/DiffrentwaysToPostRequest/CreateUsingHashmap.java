package DiffrentwaysToPostRequest;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class CreateUsingHashmap {
	@Test
	public void createProjectTest() {
		
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("projectId", "Madu");
		map.put("projectName", "Telicoo");
		map.put("status", "created");
		map.put("teamSize", 10);
		
given().contentType(ContentType.JSON).body(map)
.when().post("http://localhost:8084/addProject")
.then().log().all();
}
}

//given().given(ContentType.JSON)
//.body(map).
//when().post("http://localhost:8084/addProject").
//then().log().all();

