package com.base.dp.structure.proxy;

public class Client {
	public static void main(String[] args) {
		UserOperation uo = new UserManagerProxy();
		//UserOperation uo = new DynamicUserManagerProxy();
		uo.add();
		uo.update();
		uo.delete();
		uo.query();
	}
}
