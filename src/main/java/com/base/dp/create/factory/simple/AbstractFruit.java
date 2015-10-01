package com.base.dp.create.factory.simple;
/**
 * 退化的简单工厂
 * @author Administrator
 *
 */
public abstract class AbstractFruit {
	
	public abstract void grow();
	
	public abstract void havest();
	
	public abstract void plant();
	
	public static AbstractFruit getInstance(String fruit){
		/*if(fruit.equals("apple")){
			return new Apple();//继承AbstractFruit的子类
		}else if(fruit.equals("grape")){
			return new Grape();
		}else{
			return null;
		}*/
		return null;
	} 
	 
}
