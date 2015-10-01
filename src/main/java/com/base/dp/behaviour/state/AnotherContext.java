package com.base.dp.behaviour.state;

public class AnotherContext extends Context{
	
	private AccountState state;
	
	public void changeState(AccountState state){
		this.state = state;
	}
	
	public void doit(String name){
		//示意性代码如果使用此种方式不必如此方式
		//Context方式状态操作完成后更改了下一种应该是什么
		if(state.getType() == 1){
			state = new QueryState(this);
		}else if(state.getType() == 2){
			state = new AccessState(this);
		}
		state.doOperate(name);
	}
	
	public AccountState getState(){
		return state;
	}
}
