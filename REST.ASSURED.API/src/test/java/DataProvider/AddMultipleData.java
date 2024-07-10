package DataProvider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Java_Library.JavaRandom;
import PojoClass.CreateProjectWithPojoClass;
import io.restassured.http.ContentType;

public class AddMultipleData 
{
	@Test(dataProvider="getData")
	public void data(String projectName,String createdBy,String status,int teamSize)
	{
		  JavaRandom jbl = new JavaRandom();
		CreateProjectWithPojoClass obj =new CreateProjectWithPojoClass(projectName,createdBy+jbl.randomNum(),status,teamSize);

		baseURI = "http://localhost";
		port = 8084;
		
		given().body(obj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
	}
	
	@DataProvider(name="getData")
	public Object[][] data()
	{
		Object[][] data=new Object[3][4];

		data[0][0]="Madhu";
		data[0][1]="Sony1";
		data[0][2]="created";
		data[0][3]=5;

		data[1][0]="AKhaya";
		data[1][1]="HP1";
		data[1][2]="created";
		data[1][3]=7;

		data[2][0]="Raj";
		data[2][1]="Dell1";
		data[2][2]="created";
		data[2][3]=3;

		return data;
	}
}
