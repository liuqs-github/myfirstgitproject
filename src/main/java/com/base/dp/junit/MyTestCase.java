package com.base.dp.junit;

public class MyTestCase extends TestCase{

	public void testSave(){
		System.out.println("save");
	}
	
	public void testUpdate(){
		System.out.println("update");
	}
	public static void main(String[] args) {
		TestCase tc = new MyTestCase();
		tc.test();
	}
}
