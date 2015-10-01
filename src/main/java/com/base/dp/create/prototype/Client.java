package com.base.dp.create.prototype;

public class Client {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(12);
		p.setName("tomcat");
		p.setSex(true);
		p.display();
		
		Person pp = (Person)p.clone();
		pp.display();
		
		Person ppp = (Person)p.deepClone();
		ppp.display();
	}
}
