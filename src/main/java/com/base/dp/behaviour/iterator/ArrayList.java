package com.base.dp.behaviour.iterator;

public class ArrayList<T> implements Collection<T>{

	private Object data[];
	
	private int index;
	
	public int maxSize;
	
	public ArrayList(){
		this(20);
	}
	public ArrayList(int size){
		data = new Object[size];
		maxSize = size;
		index = 0;
	}
	@Override
	public void add(T t) {
		if(index<maxSize){
			data[index++] = t;
		}
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public void remove(T t) {
		for (int i = 0; i < index; i++) {
			if(data[i] == t){
				while(i+1<index){
					data[i] = data[i+1];
					i++;
				}
				break;
			}
		}
		index --;
		
	}
	@Override
	public Iterator<T> iterator() {
		 return new ArrayIterator<T>(index,data);
	}
	
}
