package com.base.dp.create.factory.simple;

public class Grape implements Fruit{

	private boolean seedness;
	
	public boolean isSeedness() {
		return seedness;
	}

	public void setSeedness(boolean seedness) {
		this.seedness = seedness;
	}

	@Override
	public void grow() {
		System.out.println("Grape grow ");
	}

	@Override
	public void havest() {
		System.out.println("Grape havest ");
	}

	@Override
	public void plant() {
		System.out.println("Grape plant");
	}

}
