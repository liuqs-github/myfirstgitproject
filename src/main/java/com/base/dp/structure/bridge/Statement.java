package com.base.dp.structure.bridge;

public interface Statement {

	public ResultSet execute(String sql);
	
	public int executeUpdate(String sql);
	
	public void close();
	
}
