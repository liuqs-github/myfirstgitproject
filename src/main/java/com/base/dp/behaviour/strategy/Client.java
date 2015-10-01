package com.base.dp.behaviour.strategy;

public class Client {
	public static void main(String[] args) {
		Context ctx = new Context(new PlusCalculater());
		ctx.doOperate();
	}
}
