package edu.unc.cs.dispatcherServer;


public class AGraderServerDescription implements GraderServerDescription {

	String assignment = "*", type = "*", course = "*", section = "*";
	String clientName;

	public String getAssignment() {
		return assignment;
	}
	
	public AGraderServerDescription(String aClientName) {
		clientName = aClientName;
	}

	public AGraderServerDescription(String aClientName, String assignment, String type,
			String course, String section) {
		clientName = aClientName;
		this.assignment = assignment;
		this.type = type;
		this.course = course;
		this.section = section;
	}
	@Override
	public String getClientName() {
		return clientName;
	}

	public String getType() {
		return type;
	}

	public String getCourse() {
		return course;
	}

	public String getSection() {
		return section;
	}
	

}
