package com.droidlogic.dig.connector;

/**
 * An exception that indicates there was a timeout with a
 * {@link NativeDaemonConnector} operation.
 */
@SuppressWarnings("serial")
public class NativeDaemonTimeoutException extends NativeDaemonConnectorException {
	public NativeDaemonTimeoutException(String command, NativeDaemonEvent event) {
		super(command, event);
	}
}
