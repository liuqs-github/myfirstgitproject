package com.base.dp.behaviour.state;

/**
 * 也可以用一个抽象对象实现，此时可以存储当前状态对象(一个抽象父类引用)，子类状态
 * 对象初始化无需传入Context对象，可以在当前子类状态对象里直接
 * 设置当前对象
 * @author Administrator
 *
 */
public interface AccountState {
	
	public void doOperate(String test);
	
	public int getType();
	
	//public void setCurrentState(AccountState as); //抽象类时可用此方法
}
