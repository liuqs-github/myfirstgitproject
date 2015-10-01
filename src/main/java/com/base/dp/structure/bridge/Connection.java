package com.base.dp.structure.bridge;

public interface Connection {

	public Statement createStatement();
	
	public void close();
	
}
