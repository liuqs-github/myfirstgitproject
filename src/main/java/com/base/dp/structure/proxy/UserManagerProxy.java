package com.base.dp.structure.proxy;

public class UserManagerProxy implements UserOperation{

	private UserOperation userOperation =  new UserManager();
	
	@Override
	public void add() {
		System.out.println("log user add");
		userOperation.add();
	}

	@Override
	public void update() {
		System.out.println("log user update");
		userOperation.update();
	}

	@Override
	public void delete() {
		System.out.println("log user delete");
		userOperation.delete();
	}

	@Override
	public void query() {
		System.out.println("log user query");
		userOperation.query();
	}

}
