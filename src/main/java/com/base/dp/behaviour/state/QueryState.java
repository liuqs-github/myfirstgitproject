package com.base.dp.behaviour.state;

public class QueryState implements AccountState {

	private  Context context;
	
	private int type ;
	
	public QueryState(Context context){
		this.context = context;
		this.type = 1;
	}
	
	public int getType(){
		return type;
	}
	
	@Override
	public void doOperate(String test) {
		if(context.getState().getType() == 1){
			System.out.println("this is query account ");
			context.changeState(new AccessState(context));
		}else{
			context.changeState(new ValidateState(context));
		}
		
	}

}
