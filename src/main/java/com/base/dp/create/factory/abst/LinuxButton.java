package com.base.dp.create.factory.abst;

public class LinuxButton implements Button{
	
	public LinuxButton(){
		System.out.println("Linux button init");
	}

	@Override
	public void click() {
		System.out.println("linux button click");
	}
}
