package com.base.dp.create.singleton;

/**
 * 饿汉式更适合java，但不适合c++
 * @author Administrator
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
