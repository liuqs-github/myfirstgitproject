package com.base.dp.behaviour.state;

public class AccessState implements AccountState {

	private Context context;
	
	private int type ;
	
	public AccessState(Context context){
		this.context = context;
		type = 2;
	}
	
	public int getType(){
		return type;
	}
	@Override
	public void doOperate(String test) {
		if(context.getState().getType() == 2){
			System.out.println("this is accessing money...");
		}else{
			context.changeState(new QueryState(context));
		}
	}

}
