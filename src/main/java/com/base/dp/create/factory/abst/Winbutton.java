package com.base.dp.create.factory.abst;

public class Winbutton implements Button{
	
	public Winbutton(){
		System.out.println("windows button init");
	}

	@Override
	public void click() {
		System.out.println("window button click");
	}
}
