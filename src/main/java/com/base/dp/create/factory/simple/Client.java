package com.base.dp.create.factory.simple;

public class Client {
	public static void main(String[] args) {
		Fruit fruit = FruitGardener.factory("apple");
		fruit.grow();
		//another
		Fruit fruits = FruitGardener.appleFactory();
		fruits.havest();
		
	}
}
