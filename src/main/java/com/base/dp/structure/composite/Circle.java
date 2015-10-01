package com.base.dp.structure.composite;

import java.util.Iterator;
import java.util.Set;

public class Circle extends Shape{

	private String name;
	
	public Circle(String name){
		this.name = name;
	}
	@Override
	public void draw() {
		System.out.println(name + " is circle draw !");
		Iterator<Shape> it = this.children.iterator();
		while(it.hasNext()){
			it.next().draw();
		}
	}

	@Override
	public void addComponent(Shape shape) {
		this.children.add(shape);
		
	}

	@Override
	public void remove(Shape shape) {
		this.children.remove(shape);
		
	}

	@Override
	public Set<Shape> getChildren() {
		return children;
	}

}
