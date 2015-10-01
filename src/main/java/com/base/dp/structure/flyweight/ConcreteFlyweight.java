package com.base.dp.structure.flyweight;

public class ConcreteFlyweight extends Flyweight{

	private Character ch;
	
	public ConcreteFlyweight(Character ch){
		this.ch = ch;
		System.out.println("create new ConcreteFlyweight !");
	}
	@Override
	public void doSomething(String name) {
		System.out.println(ch+"---"+name);
		
	}

}
