package com.base.dp.create.factory.method;

public class SimpleButton implements Button{

	public SimpleButton(){
		System.out.println("create SimpleButton");
	}

	@Override
	public void click() {
		System.out.println("SimpleButton click");
	}
}
