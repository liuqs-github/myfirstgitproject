package com.base.dp.behaviour.visitor;

/**
 * 现在定义了访问两个节点类型的情况，
 * 如果节点为统一类型可以省略一个方法(此时更改不同的访问者可对数据进行不同的处理操作)
 * @author Administrator
 *
 */
public interface Visitor {

	public void visit(StringNode node);
	
	public void visit(IntegerNode node);
	
}
