package com.base.dp.behaviour.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractSubject {
	
	protected Set<Observer> observers = new HashSet<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObserver(){
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()){
			it.next().update();
		}
	}
}
