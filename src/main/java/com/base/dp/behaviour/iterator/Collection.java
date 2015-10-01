package com.base.dp.behaviour.iterator;

public interface Collection<T> {

	public void add(T t);
	
	public int size();
	
	public boolean isEmpty();
	
	public void remove(T t);
	
	public Iterator<T> iterator();
	
}
