package com.base.dp.behaviour.state;

public class Context {

	private AccountState state;
	
	public void changeState(AccountState state){
		this.state = state;
	}
	
	public void doit(String name){
		state.doOperate(name);
	}
	
	public AccountState getState(){
		return state;
	}
}
