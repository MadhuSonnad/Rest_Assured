package Jacson_serilization;

import static org.testng.Assert.fail;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Serilization {
@Test
	public  void serilaz() throws JsonGenerationException, JsonMappingException, IOException
			
	{
		Project obj=new Project( "Tata","TY_0010","sep","madhu","completed", 012);
		ObjectMapper maper=new ObjectMapper();
		maper.writeValue(new File("./ProjectInfo.json"), obj);

	}

}
