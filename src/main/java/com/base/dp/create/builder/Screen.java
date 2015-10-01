package com.base.dp.create.builder;

public class Screen implements Component{

	private String name;

	private int size;
	
	public Screen(String name){
		this.name = name;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("screen is displaying");
	}
	
	
}
