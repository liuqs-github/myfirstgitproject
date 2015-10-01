package com.base.dp.create.factory.method;

public class Client {
	public static void main(String[] args) {
		Creator c = new SimpleButtonCreator();
		c.factory().click();
		c = new MutilButtonCreator();
		c.factory().click();
		
	}
}
