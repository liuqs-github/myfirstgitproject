package com.base.dp.structure.decorate;

public interface InputStream {

	public int read();
	
	public int read(int buf[]);
	
	public int read(int buf,int start,int len);
	
}
