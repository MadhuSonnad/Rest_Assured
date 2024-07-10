package Jacson_serilization;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(
	value={
			"ProjectName",
			 "ProjectId",
			 "craetion",
			 "createdBy",
			 "Status",
			 "Teamsize"
			 
	}
)
public class Project {
	String  ProjectName;
	String  ProjectId;
	String  craetion;
	String  createdBy;
	String  Status;
	int     Teamsize;
	public Project(String projectName, String projectId, String craetion, String createdBy, String status, int teamsize) {
		super();
		ProjectName = projectName;
		ProjectId = projectId;
		this.craetion = craetion;
		this.createdBy = createdBy;
		Status = status;
		Teamsize = teamsize;
	}
	Project(){}
	
	public String getProjectName() {
		return ProjectName;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public String getCraetion() {
		return craetion;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public String getStatus() {
		return Status;
	}
	public int getTeamsize() {
		return Teamsize;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public void setCraetion(String craetion) {
		this.craetion = craetion;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public void setTeamsize(int teamsize) {
		Teamsize = teamsize;
	}





}
