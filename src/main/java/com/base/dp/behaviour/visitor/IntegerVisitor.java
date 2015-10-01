package com.base.dp.behaviour.visitor;

/**
 * 不同的访问者可对数据进行不同的操作，如下
 * 将节点数据的后面统一加上“--i”
 * @author Administrator
 *
 */
public class IntegerVisitor implements Visitor{

	@Override
	public void visit(StringNode node) {
		System.out.println("this is integer visitor ");
		String value = node.getString();
		System.out.println("String value is "+value+"--i");
	}

	@Override
	public void visit(IntegerNode node) {
		System.out.println("this is integer visitor ");
		int value = node.getInt();
		System.out.println("String value is "+value+"--i");
	}

}
