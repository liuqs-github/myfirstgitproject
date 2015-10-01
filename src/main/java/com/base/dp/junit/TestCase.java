package com.base.dp.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase {

	public final void test(){
		
		Method[] ms = this.getClass().getMethods();
		
		for (int i = 0; i < ms.length; i++) {
			String name = ms[i].getName();
			if(!name.equals("test") && name.startsWith("test")){
				try {
					ms[i].invoke(this);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
