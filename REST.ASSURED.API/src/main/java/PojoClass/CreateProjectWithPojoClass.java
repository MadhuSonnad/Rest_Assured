package PojoClass;

import org.json.simple.JSONObject;

public class CreateProjectWithPojoClass{	
	
	String Projectname;
	String createdBY;
	String status;
	int teamsize;
	
	public CreateProjectWithPojoClass(String projectname, String createdBY, String status, int teamsize) {
		super();
		Projectname = projectname;
		this.createdBY = createdBY;
		this.status = status;
		this.teamsize = teamsize;
	}

	public String getProjectname() {
		return Projectname;
	}

	public String getCreatedBY() {
		return createdBY;
	}

	public String getStatus() {
		return status;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setProjectname(String projectname) {
		Projectname = projectname;
	}

	public void setCreatedBY(String createdBY) {
		this.createdBY = createdBY;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
}

