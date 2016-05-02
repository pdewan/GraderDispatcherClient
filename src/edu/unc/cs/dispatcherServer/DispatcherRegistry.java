package edu.unc.cs.dispatcherServer;

import gradingTools.server.DriverServerObject;

import java.rmi.Remote;

public interface DispatcherRegistry extends Remote{

	void registerDriverServer (DriverServerObject aServerObject);
}
