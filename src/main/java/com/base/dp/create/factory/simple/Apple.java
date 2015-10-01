package com.base.dp.create.factory.simple;

public class Apple implements Fruit{

	private int treeAge = 1;
	
	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	@Override
	public void grow() {
		System.out.println("Apple Growing");
	}

	@Override
	public void havest() {
		System.out.println("Apple Havest");
	}

	@Override
	public void plant() {
		System.out.println("Apple Plant");
	}

}
