package com.base.dp.create.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例
 * @author Administrator
 *
 */
public class RegSingleton {
	
	private static Map<String,RegSingleton> singlemap = new HashMap<String,RegSingleton>();
	
	static{
		RegSingleton item = new RegSingleton();
		singlemap.put(item.getClass().getName(), item);
	}
	protected RegSingleton(){}
	
	public static RegSingleton getInstance(String name){
		if(name == null){
			name = "com.base.dp.create.singleton.RegSingleton";
		}
		RegSingleton instance = singlemap.get(name);
		if(instance == null){
			try {
				singlemap.put(name, (RegSingleton)Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return  singlemap.get(name);
	}
	
	public void test(){
		System.out.println("hello");
	}
}
