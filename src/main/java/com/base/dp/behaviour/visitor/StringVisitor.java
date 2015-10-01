package com.base.dp.behaviour.visitor;

/**
 * 统一在节点后加String字符串
 * @author Administrator
 *
 */
public class StringVisitor implements Visitor{

	@Override
	public void visit(StringNode node) {
		String value = node.getString();
		System.out.println("String value is "+value+" String");
	}

	@Override
	public void visit(IntegerNode node) {
		int value = node.getInt();
		System.out.println("String value is "+value+" String");
	}

}
