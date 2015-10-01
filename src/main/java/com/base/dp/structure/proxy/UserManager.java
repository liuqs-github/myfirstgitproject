package com.base.dp.structure.proxy;

public class UserManager implements UserOperation{

	@Override
	public void add() {
		System.out.println("add user");
	}

	@Override
	public void update() {
		System.out.println("update user");
	}

	@Override
	public void delete() {
		System.out.println("delete user");
	}

	@Override
	public void query() {
		System.out.println("query user");
	}

}
