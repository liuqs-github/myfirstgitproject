package com.base.dp.behaviour.memento;

/**
 * 此处实现的为一个状态的保存，
 * 可也进行多个状态的保存，增加一个集合成员变量，存储
 * 每个状态，mementoList和index变量
 * 
 * j2ee Session应用
 *
 * @author Administrator
 *
 */
public class Originator{

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	 
	public MementoIF createMemento(){
		return new Memento(state);
	}

	public void restoreMemento(MementoIF memento){
		Memento m = (Memento)memento;
		this.setState(m.getState());
	}
	
	protected class Memento implements MementoIF{
		
		private String state;

		public Memento(String state){
			this.state = state;
		}
		private String getState() {
			return state;
		}
	}
}
