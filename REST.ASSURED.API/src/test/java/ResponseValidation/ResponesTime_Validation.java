package ResponseValidation;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class ResponesTime_Validation 
{@Test
	public void time()
{
		when().get("http://localhost:8084/projects")
		.then().assertThat().time(Matchers.lessThan(150L),TimeUnit.MILLISECONDS).log().all();
	}
}
