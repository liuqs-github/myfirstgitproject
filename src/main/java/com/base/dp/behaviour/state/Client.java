package com.base.dp.behaviour.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.changeState(new ValidateState(context));
		context.doit("admin");
		context.doit("admin");
		context.doit("admin");
		context.doit("tset");
		context.doit("admin");
		context.doit("admin");
		context.doit("admin");
	}
}
