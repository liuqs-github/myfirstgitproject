package com.base.dp.structure.flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		Flyweight hello = ff.factory('c');
		Flyweight hi = ff.factory('c');
		Flyweight hb = ff.factory('b');
		hello.doSomething("hello c");
		hi.doSomething("hi c");
		hb.doSomething("hello b");
		
	}
}
