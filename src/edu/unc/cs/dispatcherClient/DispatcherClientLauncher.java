package edu.unc.cs.dispatcherClient;

import edu.unc.cs.dispatcherServer.DispatcherRegistry;
import inputport.InputPort;
import port.PortLauncher;
import gradingTools.server.DriverServerObject;

public interface DispatcherClientLauncher extends PortLauncher {
	public static final String CLIENT_NAME =  "Dispatcher Client";
	DispatcherRegistry getDispatcherRegistry();
	SynchronizingConnectionListener getSynchronizingConnectionListener();
	InputPort getMainPort();


}
