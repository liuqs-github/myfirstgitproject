package com.base.dp.create.factory.method;

public class MutilButton implements Button{

	public MutilButton(){
		System.out.println("create MutilButton");
	}

	@Override
	public void click() {
		System.out.println("MutilButton click");
	}
}
