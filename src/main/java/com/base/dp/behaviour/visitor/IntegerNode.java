package com.base.dp.behaviour.visitor;

public class IntegerNode implements Node{

	private int value;
	
	public IntegerNode(Integer value){
		this.value = value;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public Integer getInt(){
		return value;
	}
	

}
