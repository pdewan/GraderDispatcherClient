package edu.unc.cs.dispatcherClient;

import inputport.ConnectionListener;

public interface SynchronizingConnectionListener extends ConnectionListener {
	void waitForConnectionStatus();

}
