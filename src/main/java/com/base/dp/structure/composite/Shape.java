package com.base.dp.structure.composite;

import java.util.HashSet;
import java.util.Set;
/**
 * 这里只储存了子节点，也可以存储父节点，聚合一个Shape类型的变量parent
 * @author Administrator
 *
 */
public abstract class Shape {

	protected Set<Shape> children = new HashSet<Shape>();
	
	public abstract void draw();
	
	public abstract void addComponent(Shape shape);
	
	public abstract void remove(Shape shape);
	
	public abstract Set<Shape> getChildren();
}
