package com.base.dp.structure.composite;

public class Client {
	public static void main(String[] args) {
		Composite cmp1 = new Composite("cmp1");
		cmp1.addComponent(new Leaf("leaf1"));
		cmp1.addComponent(new Leaf("leaf2"));
		cmp1.addComponent(new Leaf("leaf3"));
		cmp1.addComponent(new Leaf("leaf4"));
		cmp1.addComponent(new Leaf("leaf5"));
		
		Composite cmp2 = new Composite("cmp2");
		cmp2.addComponent(cmp1);
		cmp2.testSomething();
		
		Shape s = new Circle("jack");
		Shape s1 = new Circle("tomcat");
		Shape s2 = new Circle("jim");
		Shape s3 = new Circle("lucy");
		Shape s4 = new Circle("apache");
		s.addComponent(s1);
		s2.addComponent(s3);
		s3.addComponent(s4);
		s.addComponent(s2);
		s.draw();
	}
}
