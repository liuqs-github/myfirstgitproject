package com.base.dp.behaviour.visitor;

public class StringNode implements Node{

	private String value;
	
	public StringNode(String value){
		this.value =  value;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

	public String getString(){
		return value;
	}
}
