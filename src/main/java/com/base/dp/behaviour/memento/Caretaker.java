package com.base.dp.behaviour.memento;

public class Caretaker {

	private MementoIF memento;

	public MementoIF retriveMemento() {
		return memento;
	}

	public void savetMemento(MementoIF memento) {
		this.memento = memento;
	}
	
}
