package com.base.dp.create.singleton;


public class RegSingletonChild extends RegSingleton{
	 
	public  RegSingletonChild(){}
	
	public  static RegSingletonChild getInstance(){
		RegSingletonChild item = (RegSingletonChild)RegSingleton.getInstance("com.base.dp.create.singleton.RegSingletonChild");
		return item;
	}
	
	public void test(){
		System.out.println("child hello");
	}
}
