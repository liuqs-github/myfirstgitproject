package com.base.dp.create.factory.abst;

public class WinText implements Text{

	public WinText(){
		System.out.println("window text init");
	}
	@Override
	public void show(String name) {
		System.out.println("window text show " + name);
		
	}

}
