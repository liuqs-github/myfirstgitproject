package com.base.dp.create.builder;

public class Host implements Component{

	private String name;
	
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Host(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void execute(){
		System.out.println("host is running");
	}
}
