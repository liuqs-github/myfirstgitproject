package com.base.dp.structure.composite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Composite implements Component{

	private String name;
	
	private Set<Component> components = new HashSet<Component>();
	
	public Composite(String name){
		this.name = name;
	}
	@Override
	public Component getComponent() {
		return this;
	}

	@Override
	public void testSomething() {
		System.out.println(" this composite " + name);
		Iterator<Component> it = components.iterator();
		while(it.hasNext()){
			it.next().testSomething();
		}
	}

	public void addComponent(Component cmp){
		components.add(cmp);
	}
	
	public void removeComponent(Component cmp){
		components.remove(cmp);
	}
	
	public Set<Component> getChildren(){
		return components;
	}
}
