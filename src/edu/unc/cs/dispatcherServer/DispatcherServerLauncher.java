package edu.unc.cs.dispatcherServer;


public interface DispatcherServerLauncher {
	public static String DISPATCHER_SERVER_NAME = "dispatcher server";
	public static final String DISPATCHER_SERVER_ID = "31452";
	public static final Class DISPATCHER_SERVER_CLASS = DispatcherRegistry.class;
	String getCommand(String aClientName);
	


}