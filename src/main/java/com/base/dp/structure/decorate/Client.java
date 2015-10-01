package com.base.dp.structure.decorate;

public class Client {
	public static void main(String[] args) {
		DefaultInputStream dis = new DefaultInputStream();
		BufferedInputStream bis = new BufferedInputStream(dis);
		DataInputStream is = new DataInputStream(bis);
		is.read();
	}
}
