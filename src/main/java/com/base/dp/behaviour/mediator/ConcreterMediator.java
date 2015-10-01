package com.base.dp.behaviour.mediator;

public class ConcreterMediator extends Mediator{

	private Colleague1 c1;
	
	private Colleague2 c2;
	
	public ConcreterMediator(){
		c1 = new Colleague1(this);
		c2 = new Colleague2(this);
	}
	
	@Override
	public void changeColleague(Colleague colleague) {
		 c1.action();
		 c2.action();
		
	}

}
