package com.base.dp.behaviour.iterator;

public class ArrayIterator<T> implements Iterator<T>{

	private int size;
	
	private int current;
	
	private Object[] data;
	
	public ArrayIterator(int size,Object [] data){
		this.size = size;
		this.data = data;
		current = 0;
	}
	
	@Override
	public boolean hasNext() {
		return current <= size-1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		Object obj = data[current++];
		return (T)obj;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public int size() {
		return size;
	}

}
