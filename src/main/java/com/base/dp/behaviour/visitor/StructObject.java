package com.base.dp.behaviour.visitor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StructObject {

	private Set<Node> sets = new HashSet<Node>();
	
	public void action (Visitor v){
		Iterator<Node> it = sets.iterator();
		while(it.hasNext()){
			it.next().accept(v);
		}
		
	}
	public void add(Node node){
		sets.add(node);
	}
}
