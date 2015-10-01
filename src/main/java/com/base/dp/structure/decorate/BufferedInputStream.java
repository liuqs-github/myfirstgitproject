package com.base.dp.structure.decorate;

public class BufferedInputStream implements InputStream{

	private InputStream inputStream;
	
	public BufferedInputStream(InputStream inputStream){
		this.inputStream = inputStream;
	}
	
	@Override
	public int read() {
		int i = inputStream.read();
		System.out.println("BufferedInputStream Read int ");
		return i;
	}

	@Override
	public int read(int[] buf) {
		int i = inputStream.read(buf);
		System.out.println("BufferedInputStream Read int buf");
		return i;
	}

	@Override
	public int read(int buf, int start, int len) {
		int i = inputStream.read(buf,start,len);
		System.out.println("BufferedInputStream Read int buf for size");
		return i;
	}

}
