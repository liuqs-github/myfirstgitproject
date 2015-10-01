package com.base.dp.create.builder;

public class Client {
	public static void main(String[] args) {
		Director d = new Director();
		d.setProductBuilder(new ComputerBuilder());
		d.produce();
	}
}
