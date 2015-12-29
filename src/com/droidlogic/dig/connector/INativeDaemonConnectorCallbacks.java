package com.droidlogic.dig.connector;

interface INativeDaemonConnectorCallbacks {
	void onDaemonConnected();
	boolean onCheckHoldWakeLock(int code);
	boolean onEvent(int code, String raw, String[] cooked);
}
