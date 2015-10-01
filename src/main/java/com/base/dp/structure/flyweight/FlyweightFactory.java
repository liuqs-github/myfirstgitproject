package com.base.dp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<Character,Flyweight> flyweights = new HashMap<Character,Flyweight>();
	
	public Flyweight factory(Character ch){
		Flyweight f = flyweights.get(ch);
		if(f == null){
			flyweights.put(ch,new ConcreteFlyweight(ch));
			return flyweights.get(ch);
		}else{
			return f;
		}
		
	}
}
