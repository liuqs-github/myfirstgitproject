package com.base.dp.structure.decorate;

public class DefaultInputStream implements InputStream{

	@Override
	public int read() {
		System.out.println("DefaultInputStream Read int ");
		return 0;
	}

	@Override
	public int read(int[] buf) {
		System.out.println("DefaultInputStream Read int buf ");
		return 0;
	}

	@Override
	public int read(int buf, int start, int len) {
		System.out.println("DefaultInputStream Read int buf from " + start +",size is "+len);
		return 0;
	}

}
