package com.base.dp.create.factory.abst;

public class LinuxText implements Text{

	public LinuxText(){
		System.out.println("linux text init");
	}
	@Override
	public void show(String name) {
		System.out.println("linux text show " + name);
		
	}

}
