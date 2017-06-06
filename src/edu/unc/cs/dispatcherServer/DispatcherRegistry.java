package edu.unc.cs.dispatcherServer;

import gradingTools.server.RemoteGraderServer;

import java.rmi.Remote;
/**
 * This is the interface to be linked by users of the server.
 * The class is in project GraderDispatcherServer
 */
public interface DispatcherRegistry extends Remote{

	void registerDriverServer (RemoteGraderServer aServerObject, GraderServerDescription aDispatcherDescription);
}
