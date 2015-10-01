package com.base.dp.behaviour.state;

public class ValidateState implements AccountState{

	private Context context;
	
	private int type;
	
	public int getType(){
		return type;
	}
	public ValidateState(Context context){
		this.context = context;
		type = 0;
	}
	@Override
	public void doOperate(String test) {
		System.out.println("This is validing right !");
		if(test.equals("admin")){
			//此时由各个状态判断下个状态是什么，也可由context对象判断，但灵活性不高
			context.changeState(new QueryState(context));// 此处可以使用享元模式代替,其他地方也
		}else{
			System.out.println("Invalid User");
		}
	}

}
