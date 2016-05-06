package edu.unc.cs.dispatcherServer;


public class AGraderServerDescription implements GraderServerDescription {

	String assignment = "*", type = "*", course = "*", section = "*";

	public String getAssignment() {
		return assignment;
	}
	
	public AGraderServerDescription() {
		super();
	}

	public AGraderServerDescription(String assignment, String type,
			String course, String section) {
		super();
		this.assignment = assignment;
		this.type = type;
		this.course = course;
		this.section = section;
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
