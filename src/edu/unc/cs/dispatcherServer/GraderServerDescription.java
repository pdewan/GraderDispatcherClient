package edu.unc.cs.dispatcherServer;

import java.io.Serializable;

public interface GraderServerDescription extends Serializable {
	String getCourse();
	String getSection();
	String getType();
	String getAssignment();
	String getClientName();

}
