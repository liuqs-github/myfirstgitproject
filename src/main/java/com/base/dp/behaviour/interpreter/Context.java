package com.base.dp.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private Map<Expression,Boolean> map = new HashMap<Expression,Boolean>();
	
	public void assign(Variable var,boolean bool){
		map.put(var, bool);
	}
	public boolean lookup(Variable variable) {
		Boolean bool = map.get(variable);
		if(bool == null){
			throw new IllegalArgumentException("非法参数");
		}
		return bool.booleanValue();
	}

}
