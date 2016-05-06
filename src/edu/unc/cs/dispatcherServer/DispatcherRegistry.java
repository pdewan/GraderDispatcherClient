package edu.unc.cs.dispatcherServer;

import gradingTools.server.RemoteGraderServer;

import java.rmi.Remote;

public interface DispatcherRegistry extends Remote{

	void registerDriverServer (RemoteGraderServer aServerObject, GraderServerDescription aDispatcherDescription);
}
