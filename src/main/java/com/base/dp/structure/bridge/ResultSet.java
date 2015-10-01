package com.base.dp.structure.bridge;

public interface ResultSet {

	public boolean hasNext();
	
	public String getString(String name);
	
	public int getInt(String name);
	
	public void close();
}
