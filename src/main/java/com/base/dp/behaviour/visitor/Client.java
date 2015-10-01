package com.base.dp.behaviour.visitor;

public class Client {
	public static void main(String[] args) {
		StructObject so = new StructObject();
		
		so.add(new StringNode("jack"));
		so.add(new StringNode("tomcat"));
		so.add(new StringNode("fuck"));
		so.add(new IntegerNode(123));
		so.add(new IntegerNode(67));
		so.add(new IntegerNode(32));
		so.add(new StringNode("apache"));
		so.add(new StringNode("websphere"));
		so.action(new StringVisitor());
	}
}
