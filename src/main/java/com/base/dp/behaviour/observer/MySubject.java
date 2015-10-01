package com.base.dp.behaviour.observer;

/**
 * 具体逻辑处理类
 * @author Administrator
 *
 */
public class MySubject extends AbstractSubject{

	public void execute(String cmd){
		System.out.println("exe " +cmd);
		this.notifyObserver();
	}
}
