package com.base.dp.structure.composite;

public class Leaf implements Component{

	private String name;
	
	public Leaf(String name){
		this.name = name;
	}
	@Override
	public Component getComponent() {
		return null;
	}

	@Override
	public void testSomething() {
		System.out.println("this leaf "+name);
	}

}
