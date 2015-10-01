package com.base.dp.behaviour.observer;

public abstract class Client {
	 public static void main(String[] args) {
		 MySubject as = new MySubject();
		 as.attach(new StateObserver());
		 as.attach(new MsgObserver());
		 as.execute("notepad");
	}
}
