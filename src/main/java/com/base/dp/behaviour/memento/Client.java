package com.base.dp.behaviour.memento;

public class Client{

	 public static void main(String[] args) {
		Caretaker c = new Caretaker();
		Originator o = new Originator();
		o.setState("on");
		c.savetMemento(o.createMemento());
		System.out.println(o.getState());
		o.setState("off");
		System.out.println(o.getState());
		o.restoreMemento(c.retriveMemento());
		System.out.println(o.getState());
		
	}

}
