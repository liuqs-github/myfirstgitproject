package com.base.dp.create.factory.simple;

public class FruitGardener {

	public static Fruit factory (String fruit){
		if(fruit.equals("apple")){
			return new Apple();
		}else if(fruit.equals("grape")){
			return new Grape();
		}else{
			return null;
		}
	}
	
	//也可以如下
	//start
	public static Fruit appleFactory(){
		return new Apple();
	}
	
	public static Fruit grapeFactory(){
		return new Grape();
	}
	//end
	
	//也可以用集聚对象，存储具体产品，而不必每次创建一个新的
	/**
	*public static Fruit factory(String name){
	*	fruitList.get(name);
	*}
	 */
	//退化的工厂，即由Fruit类提供工厂方法(此时Fruit类为具体的类)，
}
