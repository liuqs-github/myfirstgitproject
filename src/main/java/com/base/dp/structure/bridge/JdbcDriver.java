package com.base.dp.structure.bridge;

public abstract class JdbcDriver {

	public abstract Connection buildConnection(String url);
	
}
