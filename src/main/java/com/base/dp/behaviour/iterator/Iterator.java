package com.base.dp.behaviour.iterator;

public interface Iterator<T> {

	public boolean hasNext();
	
	public T next();
	
	public boolean isEmpty();
	
	public int size();
	
}
