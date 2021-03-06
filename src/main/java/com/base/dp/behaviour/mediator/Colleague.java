package com.base.dp.behaviour.mediator;

public abstract class Colleague {

	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void action();
	
	public void change(){
		mediator.changeColleague(this);
	}
	
}
