package com.base.dp.structure.bridge;

/**
 * 可以有自己的抽象化修正类，这里没有给出
 * @author Administrator
 *
 */
public abstract class DriverManager {

	private static JdbcDriver jdbcDriver;

	public static JdbcDriver getJdbcDriver() {
		return jdbcDriver;
	}

	public static void setJdbcDriver(JdbcDriver jdbcDriver) {
		DriverManager.jdbcDriver = jdbcDriver;
	}
	
	public static Connection getConnection(String url){
		return jdbcDriver.buildConnection(url);
	}
	 
}
