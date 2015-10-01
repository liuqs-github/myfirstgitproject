package com.base.dp.behaviour.strategy;

/**
 * 环境中定义了一个计算器，可根据设定的不同计算对象
 * 实现不同的操作，由AWT中的Layout,设置不同的布局对象
 * 对控件使用不同的布局
 * 策略模式只适用客户端只会使用（也可为动态使用）具体某一种策略的情况，
 * 当客户端同时需要多种策略时并不适合
 * @author Administrator
 *
 */
public class Context {
	
	private Calculater calculater;

	public Context(){}
	
	public Context(Calculater calculater){
		this.calculater = calculater;
	}
	public Calculater getCalculater() {
		return calculater;
	}

	public void setCalculater(Calculater calculater) {
		this.calculater = calculater;
	}
	
	public void doOperate(){
		int result = calculater.calc(12, 23);
		System.out.println("result is "+result);
	}
	
	///.....
	public void doOtherthings(){
		
	}
	
}
