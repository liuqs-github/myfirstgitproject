package com.base.dp.structure.decorate;

public class DataInputStream implements InputStream{

	private InputStream inputStream;
	
	public  DataInputStream(InputStream inputStream){
		this.inputStream = inputStream;
	}
	
	@Override
	public int read() {
		int i = inputStream.read();
		System.out.println("DataInputStream Read int ");
		return i;
	}

	@Override
	public int read(int[] buf) {
		int i = inputStream.read(buf);
		System.out.println("DataInputStream Read int buf");
		return i;
	}

	@Override
	public int read(int buf, int start, int len) {
		int i = inputStream.read(buf,start,len);
		System.out.println("DataInputStream Read int buf for size");
		return i;
	}

}
