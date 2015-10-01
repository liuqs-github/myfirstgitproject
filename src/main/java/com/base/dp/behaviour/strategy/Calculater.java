package com.base.dp.behaviour.strategy;

public abstract class Calculater {

	public boolean validate(int a ,int b){
		if(b == 0 || a == 0){
			return false;
		}
		return true;
	}
	
	public abstract int calc(int a,int b);
}
